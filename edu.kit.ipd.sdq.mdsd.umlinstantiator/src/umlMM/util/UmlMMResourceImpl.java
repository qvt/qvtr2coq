/**
 */
package umlMM.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see umlMM.util.UmlMMResourceFactoryImpl
 * @generated
 */
public class UmlMMResourceImpl extends XMIResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public UmlMMResourceImpl(URI uri) {
		super(uri);
	}

	// Manually added code (plus setting Model > Resource Type = XMI in genmodel, and registering new resource factory!) follows.
	// See http://fredrikattebrant.blogspot.de/2012/10/enabling-uuids-in-emf-ecore-model.html
	
    /* (non-Javadoc)
     * @see org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl#useUUIDs()
     */
	@Override
    protected boolean useUUIDs() {
    	return true;
    }
	
} //UmlMMResourceImpl
