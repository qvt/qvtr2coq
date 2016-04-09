/**
 */
package umlMM_;

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
 *   <li>{@link umlMM_.dummy#getContainsPackage <em>Contains Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see umlMM_.UmlMMPackage#getdummy()
 * @model
 * @generated
 */
public interface dummy extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains Package</b></em>' containment reference list.
	 * The list contents are of type {@link umlMM_.Package}.
	 * It is bidirectional and its opposite is '{@link umlMM_.Package#getDummy <em>Dummy</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Package</em>' containment reference list.
	 * @see umlMM_.UmlMMPackage#getdummy_ContainsPackage()
	 * @see umlMM_.Package#getDummy
	 * @model opposite="dummy" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<umlMM_.Package> getContainsPackage();

} // dummy
