/**
 */
package umlMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>dummy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link umlMM.dummy#getContainsPackage <em>Contains Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see umlMM.UmlMMPackage#getdummy()
 * @model
 * @generated
 */
public interface dummy extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains Package</b></em>' containment reference list.
	 * The list contents are of type {@link umlMM.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Package</em>' containment reference list.
	 * @see umlMM.UmlMMPackage#getdummy_ContainsPackage()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<umlMM.Package> getContainsPackage();

} // dummy
