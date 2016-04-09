package transformation;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.utils.Reader;

/**
 * Identical to <code>org.eclipse.emf.mwe.utils.Reader</code> but is further able to read a list of resources
 * specified at <code>Uri</code>.
 *
 * If the URI is a directory it is recursively scanned for files, The directory .
 *
 * @author Andreas Rentschler
 */
public class BulkReader extends Reader {

	private final Log log = LogFactory.getLog(getClass());
	private String uriSuffix = null;
	private boolean firstElementOnly = true;
	private boolean ignoreMissingModel = false;
	private boolean makeEPackagesGlobal = true;
	
	@Override
	public void setIgnoreMissingModel(final boolean ignoreMissingModel) {
		this.ignoreMissingModel = ignoreMissingModel;
	}

	@Override
	public void setFirstElementOnly(final boolean firstElementOnly) {
		this.firstElementOnly = firstElementOnly;
	}

	@Override
	public void setMakeEPackagesGlobal(final boolean makeEPackagesGlobal) {
		this.makeEPackagesGlobal = makeEPackagesGlobal;
	}

	@Override
	public void invokeInternal(final WorkflowContext ctx,
			final ProgressMonitor monitor, final Issues issues) {
		if (uri.contains("*")) {
			String[] splitUri = uri.split("\\*");
			uri = splitUri[0];
			uriSuffix = splitUri[1];
		}
		
		File file = new File(uri);
		Object slotContent = null;
		if (!file.exists()) {
			log.error("File under : " + getUri() + " does not exist.");
			issues.addError("File under : " + getUri() + " does not exist.");
		} else if (file.isDirectory()) {
			List<URI> uris = traverseFolder(file);
			List<Object> list = new ArrayList<Object>();
			
			for (URI uri : uris) {
				list.add(load(resourceSet, uri.toString(), firstElementOnly, ignoreMissingModel));
			}
			slotContent = list; 
		} else if (file.isFile()) {
			URI uri = URI.createFileURI(file.getAbsolutePath());
			slotContent = load(resourceSet, uri.toString(), firstElementOnly, ignoreMissingModel);
		} else {
			throw new IllegalArgumentException("Unsupported path : " + file
					+ " (only folders and archives are supported).");
		}
		
		ctx.set(getModelSlot(), slotContent);
		
		if (makeEPackagesGlobal) {
			for (final String k : resourceSet.getPackageRegistry().keySet()) {
				EPackage.Registry.INSTANCE.put(k, resourceSet
						.getPackageRegistry().get(k));
			}
		}
	}
	
	protected List<URI> traverseFolder(File folder) {
		List<URI> result = new ArrayList<URI>();
		File[] files = folder.listFiles();
		if (files == null)
			return result;
		for (File file : files) {
			if (file.isDirectory()) {
				result.addAll(traverseFolder(file));
			} else {
				URI uri = URI.createFileURI(file.getAbsolutePath());
				if (uriSuffix == null || uri.toString().endsWith(uriSuffix)) {
					// uri.FileExtension() does not work if extension contains dots, like in ".rdbms.xml"
					result.add(uri);
				}
			}
		}
		return result;
	}
}
