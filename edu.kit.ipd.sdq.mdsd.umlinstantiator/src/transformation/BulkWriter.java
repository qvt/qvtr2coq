package transformation;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.WorkflowInterruptedException;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;
import org.eclipse.emf.mwe.utils.Writer;

/**
 * Identical to <code>org.eclipse.emf.mwe.utils.Writer</code> but is further able to write a list of resources
 * based on the existing resource's <code>Uri</code>.
 *
 * @author Andreas Rentschler
 */
public class BulkWriter extends Writer {

	private boolean OPTION_SCHEMA_LOCATION = true;

	public void setOPTION_SCHEMA_LOCATION(final boolean option_schema_location) {
		OPTION_SCHEMA_LOCATION = option_schema_location;
	}

	private boolean OPTION_SCHEMA_LOCATION_IMPLEMENTATION = true;

	private final String encoding = null;

	private boolean multipleResourcesInCaseOfList = false;

	private boolean cloneSlotContents = false;
	
	private boolean ignoreEmptySlot = false;
	
	String uriSuffix = null;

	public void setIgnoreEmptySlot(boolean ignoreEmptySlot) {
		this.ignoreEmptySlot = ignoreEmptySlot;
	}

	public void setMultipleResourcesInCaseOfList(final boolean b) {
		multipleResourcesInCaseOfList = b;
	}

	public void setCloneSlotContents(final boolean b) {
		this.cloneSlotContents = b;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void invokeInternal(final WorkflowContext ctx, final ProgressMonitor monitor, final Issues issues) {
		// Difference to Writer
		if (uri.contains("*")) {
			String[] splitUri = uri.split("\\*");
			uri = splitUri[0];
			uriSuffix = splitUri[1];
		}
		// End of difference

		Object slotContent = ctx.get(getModelSlot());
		if (slotContent == null) {
			if (ignoreEmptySlot) {
				issues.addWarning(this, "slot '" + getModelSlot() + "' is empty. Not writing anything.");
			}
			else {
				issues.addError(this, "slot '" + getModelSlot() + "' is empty.");
			}
			return;
		}
		// Difference to Writer: accept Map<URI, StringBuffer> to write out a text file (a validation report for instance)
		if (!((slotContent instanceof Collection<?>) || (slotContent instanceof EObject) || (slotContent instanceof Map<?, ?>))) {
			issues.addError(this, "slot '" + getModelSlot() + "' neither contains an EList<EObject> nor an EObject, and not a Map<URI, StringBuffer>!",
					slotContent, null, null);
			return;
		}

		if (slotContent instanceof EObject) {
			final EObject sc = (EObject) slotContent;
			if (cloneSlotContents) {
				if (sc.eResource() == null) {
					issues.addWarning(this, "model in slot '" + getModelSlot()
							+ "' is not yet associated with a resource; cloning it is most likely an error!");
				}
				else {
					final EcoreUtil.Copier copier = new EcoreUtil.Copier();
					final EObject copy = copier.copy(sc);
					copier.copyReferences();
					slotContent = copy;
				}
			}
			else {
				// Difference to Writer: Information is deliberately there and used, warn when resource does NOT exist
				if (sc.eResource() == null) {
					issues.addWarning(this, "the element in slot '" + getModelSlot()
							+ "' is not contained in a resource, expected to transport information about the original name!");
				}
				// End of difference to Writer
			}
		}

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

		if (!multipleResourcesInCaseOfList) {
			// Difference to Writer
			//final Resource r = getResourceSet().createResource(URI.createURI(getUri()));
			// End of difference to Writer
			if (slotContent instanceof Collection<?>) {
				final Collection<EObject> coll = (Collection<EObject>) slotContent;
				
				// Difference to Writer
				// Take first element in a collection to compute the target name from the associated resource, if it is a list
				EObject obj = null;
				if (uriSuffix != null && !coll.isEmpty()) obj = ((Collection<EObject>) slotContent).iterator().next();
				final String uri = ((obj != null) ? createResourceName(obj) : getUri());
				final Resource r = getResourceSet().createResource(URI.createURI(uri));
				// End of difference to Writer

				r.getContents().addAll(coll);
				write(r);
			}
			else if (slotContent instanceof EObject) {
				// Difference to Writer
				final EObject obj = (EObject) slotContent;
				final String uri = ((obj != null) ? createResourceName(obj) : getUri());
				final Resource r = getResourceSet().createResource(URI.createURI(uri));
				// End of difference to Writer

				r.getContents().add(obj);
				write(r);
			}
			// Difference to Writer
			else if (slotContent instanceof Map<?, ?>) {
				final Map<URI, StringBuffer> map = (Map<URI, StringBuffer>) slotContent;
				final File f = new File(createResourceName(map.keySet().iterator().next()));
				if (f.exists()) f.delete();
				FileWriter writer = null;

				for (final Entry<URI, StringBuffer> entry : map.entrySet()) {
					try {
						if (writer == null) writer = new FileWriter(f);
						writer.append(entry.getValue());
						writer.close();
					} catch (IOException e) {
						throw new WorkflowInterruptedException("Problems writing txt file to " + getUri() + " : " + e.getMessage());
					}
				}
			}
			// End of difference to Writer
		}
		else {
			if (slotContent instanceof Collection<?>) {
				final Collection<?> coll = (Collection<?>) slotContent;
				final Collection<Resource> resources = new ArrayList<Resource>();
				for (final Object object : coll) {
					final EObject eo = (EObject) object;
					final Resource r = getResourceSet().createResource(URI.createURI(createResourceName(eo)));
					r.getContents().add(eo);
					resources.add(r);
				}
				for (final Resource r : resources) {
					write(r);
				}
			}
			else if (slotContent instanceof EObject) {
				final Resource r = getResourceSet().createResource(URI.createURI(getUri()));  
				r.getContents().add((EObject) slotContent);
				write(r);
			}
			// Difference to Writer
			else if (slotContent instanceof Map<?, ?>) {
				final Map<URI, StringBuffer> map = (Map<URI, StringBuffer>) slotContent;
				for (final Entry<URI, StringBuffer> entry : map.entrySet()) {
					final File f = new File(createResourceName(entry.getKey()));
					if (f.exists()) f.delete();
					FileWriter writer;
					try {
						writer = new FileWriter(f);
						writer.append(entry.getValue());
						writer.close();
					} catch (IOException e) {
						throw new WorkflowInterruptedException("Problems writing txt file to " + getUri() + " : " + e.getMessage());
					}
				}
			}
			// End of difference to Writer
		}
	}
	
	private String createResourceName(final EObject eo) {
		// Difference to Writer: If there is a custom suffix associated, use this suffix
		return getUri() + (getUri().endsWith("/") ? "" : "/") + getName(eo) + (uriSuffix != null ? uriSuffix : ".ecore");
		// End of difference to Writer
		//return getUri() + (getUri().endsWith("/") ? "" : "/") + getName(eo) + ".ecore";
	}

	private String getName(final EObject model) {
		// Difference to Writer: If there is an old URI associated reuse the old name 
		if (model.eResource() != null && model.eResource().getURI() != null) {
			URI oldUri = model.eResource().getURI();
			String fileNameWithoutEnding = oldUri.lastSegment().split("\\.")[0];
			return fileNameWithoutEnding;
		}
		// End of difference to Writer
		return (String) model.eGet(model.eClass().getEStructuralFeature("name"));
	}

	// Difference to Writer
	private String createResourceName(final URI uri) {
		return getUri() + (getUri().endsWith("/") ? "" : "/") + getName(uri) + (uriSuffix != null ? uriSuffix : ".ecore");
	}
	private String getName(final URI uri) {
		// Difference to Writer: If there is an old URI associated reuse the old name 
		if (uri != null) {
			String fileNameWithoutEnding = uri.lastSegment().split("\\.")[0];
			return fileNameWithoutEnding;
		}
		return "Report";
	}
	// End of difference to Writer

	private void write(final Resource r) {
		try {
			final Map<String, Object> options = new HashMap<String, Object>();
			if (OPTION_SCHEMA_LOCATION) {
				options.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
			}
			if (OPTION_SCHEMA_LOCATION_IMPLEMENTATION) {
				options.put(XMLResource.OPTION_SCHEMA_LOCATION_IMPLEMENTATION, Boolean.TRUE);
			}
			if (encoding != null) {
				options.put(XMLResource.OPTION_ENCODING, encoding);
			}
			r.save(options);
		}
		catch (final IOException e) {
			throw new WorkflowInterruptedException("Problems writing xmi file to " + getUri() + " : " + e.getMessage());
		}
	}
	
}
