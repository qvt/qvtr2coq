package transformation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.mwe.core.ConfigurationException;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;


/**
 * @author Andreas Rentschler
 * 
 * CustomStandaloneSetup modifies 'registerGeneratedEPackage': registers missing URI (generated out as "" in rdbms.RdbmsPackage) back to null URI, else default behavior.
 * Does not work!?
 * 
 * Background: Model is registered by XMIFactory delegation, not by the directly queried PackageRegistry
 * Alternative suggestion by Ed Merks:
 * * http://www.eclipsezone.com/eclipse/forums/t58852.html => Metatag qualified=false => does not work as described, either 
 * * https://www.eclipse.org/forums/index.php/t/165608/
 * * https://www.eclipse.org/forums/index.php/t/236410/) 
 */
public class CustomStandaloneSetup extends org.eclipse.emf.mwe.utils.StandaloneSetup {

	private Log log = LogFactory.getLog(getClass());

	@Override
	public void addRegisterGeneratedEPackage(String interfacename) {
		Class<?> clazz = ResourceLoaderFactory.createResourceLoader().loadClass(interfacename);
		if (clazz == null)
			throw new ConfigurationException("Couldn't find an interface " + interfacename);
		try {
			EPackage pack = (EPackage) clazz.getDeclaredField("eINSTANCE").get(null);
			String uri = pack.getNsURI();
			
			// Fix compared to original implementation: EMF does not allow null URIs which are actually defined as empty strings
			if (uri.isEmpty()) {
				log.info("Generated EPackage '" + interfacename + "' defines an empty URI, which is registered as a null URI");
				uri = null;
			}
			// End of fix

			registry.put(uri, pack);
			log.info("Adding generated EPackage '" + interfacename + "'");

		} catch (Exception e) {
			throw new ConfigurationException("Couldn't register " + interfacename
					+ ". Is it the generated EPackage interface? : " + e.getMessage());
		}
	}

}
