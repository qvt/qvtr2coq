/**
 */
package uml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>general Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.generalClass#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getgeneralClass()
 * @model extendedMetaData="name='generalClass_._type' kind='elementOnly'"
 * @generated
 */
public interface generalClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference.
	 * @see #setClass(class_)
	 * @see uml.UmlPackage#getgeneralClass_Class()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='class_' namespace='##targetNamespace'"
	 * @generated
	 */
	class_ getClass_();

	/**
	 * Sets the value of the '{@link uml.generalClass#getClass_ <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' containment reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(class_ value);

} // generalClass
