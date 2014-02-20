package edu.kit.ipd.sdq.mdsd.qvtrelation2coq;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EMOFResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.examples.domain.utilities.ProjectMap;
import org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain;
import org.eclipse.ocl.examples.pivot.library.StandardLibraryContribution;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.model.OCLstdlib;
import org.eclipse.ocl.examples.xtext.oclinecore.OCLinEcoreStandaloneSetup;
import org.eclipse.uml2.uml.profile.l2.L2Package;
import org.eclipse.uml2.uml.resource.UML302UMLResource;
import org.eclipse.uml2.uml.resource.UMLResource;

public class UmlResourceSet extends ResourceSetImpl {
	public UmlResourceSet() {
		super();
		
//		// hack to use UML2 in standalone applications
//		Map<URI, URI> uriMap = getURIConverter().getURIMap();  
//		URI uri = URI.createURI("platform:/plugin/org.eclipse.uml2.uml.resources/");
//		uriMap.put(URI.createURI(UMLResource.LIBRARIES_PATHMAP), uri.appendSegment("libraries").appendSegment(""));
//		uriMap.put(URI.createURI(UMLResource.METAMODELS_PATHMAP), uri.appendSegment("metamodels").appendSegment(""));
//		uriMap.put(URI.createURI(UMLResource.PROFILES_PATHMAP), uri.appendSegment("profiles").appendSegment(""));  
//
//		 // a hack to support the xtext reader of QVTr (http://www.eclipse.org/forums/index.php/m/794462/)
//		// needs to be invoked by standalone applications (like MWE workflows) to replicate the registration  
//		// that should appear as a standard_library plugin extension when running within Eclipse.
//		OCLinEcoreStandaloneSetup.doSetup();
//		OCLstdlib.install();

    	// setup UML
//		debugPrintln("-----Starting " + getClass().getSimpleName() + "." + getName() + "-----");
		EPackage.Registry.INSTANCE.put(UML302UMLResource.STANDARD_PROFILE_NS_URI, L2Package.eINSTANCE);

		// setup QVTcore
//		QVTcoreStandaloneSetup.doSetup();
		ProjectMap.initializeURIResourceMap(this);
		Map<URI, URI> uriMap = getURIConverter().getURIMap();
		uriMap.putAll(EcorePlugin.computePlatformURIMap());
//		for (Map.Entry<URI,URI> entry : uriMap.entrySet()) {
//			System.out.println(entry.getKey() + " => " + entry.getValue());
//		}
//		URI platformOCLstdlibURI = URI.createURI(StandardDocumentAttribution.OCLSTDLIB_URI);
//		URI projectURI = getProjectFileURI("dummy");
//		URI projectOCLstdlibURI = URI.createURI("oclstdlib.oclstdlib").resolve(projectURI);
//		uriMap.put(platformOCLstdlibURI, projectOCLstdlibURI);
		StandardLibraryContribution.REGISTRY.put(MetaModelManager.DEFAULT_OCL_STDLIB_URI, new OCLstdlib.Loader());
        OCLDelegateDomain.initialize(null);
		
		// setup from QVTd test cases
		configurePlatformResources();
		getResourceFactoryRegistry().getExtensionToFactoryMap().put("emof", new EMOFResourceFactoryImpl()); //$NON-NLS-1$
		getResourceFactoryRegistry().getExtensionToFactoryMap().put("pivot", new XMIResourceFactoryImpl()); //$NON-NLS-1$
		// FIXME: what about git plugins, here they are in git's subfolders {eclipse_home}/git/org.eclipse.[ocl|qvtd]/plugins/
//		EcorePlugin.getPlatformResourceMap().put(name, URI.createFileURI(file.toString() + "/"));
//		EcorePlugin.getPlatformResourceMap().put(name, URI.createFileURI(file.toString() + "/"));
		// TODO: tear down code to remove entries from metamodel manager. 
		
	}
	
	/**
	 * Install a platform:/resource/project... mapping for all folders in
	 * $WORKSPACE_LOC/* if defined, or $user.dir/../* otherwise.
	 */
	public static void configurePlatformResources() {
		if (!eclipseIsRunning()) {
			String urlString = System.getProperty("WORKSPACE_LOC");
			File workspaceLoc;
			if (urlString != null) {
				workspaceLoc = new File(urlString);
			}
			else {
				workspaceLoc = new File(System.getProperty("user.dir")).getParentFile();
			}
			File[] files = workspaceLoc.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					String name = file.getName();
					EcorePlugin.getPlatformResourceMap().put(name, URI.createFileURI(file.toString() + "/"));
				}
			}
		}
	}

	public static boolean eclipseIsRunning() {
		try {
			Class<?> platformClass = Class.forName("org.eclipse.core.runtime.Platform");
			Method isRunningMethod = platformClass.getDeclaredMethod("isRunning");
			return Boolean.TRUE.equals(isRunningMethod.invoke(null));
		} catch (Exception e) {
		}
		return false;
	}
	
	@Override
	public Resource getResource(URI uri, boolean loadOnDemand) {
		Resource r = super.getResource(uri, loadOnDemand);
		System.out.println(uri + " -> " + r.getURI());
		return r;
	}
}
