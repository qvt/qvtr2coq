/**
 */
package uml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>owner Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ownerClassifier#getClass_ <em>Class</em>}</li>
 *   <li>{@link uml.ownerClassifier#getPrimitiveDataType <em>Primitive Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getownerClassifier()
 * @model extendedMetaData="name='ownerClassifier_._type' kind='elementOnly'"
 * @generated
 */
public interface ownerClassifier extends EObject {
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
	 * @see uml.UmlPackage#getownerClassifier_Class()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='class_' namespace='##targetNamespace'"
	 * @generated
	 */
	class_ getClass_();

	/**
	 * Sets the value of the '{@link uml.ownerClassifier#getClass_ <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' containment reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(class_ value);

	/**
	 * Returns the value of the '<em><b>Primitive Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Data Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Data Type</em>' containment reference.
	 * @see #setPrimitiveDataType(primitiveDataType)
	 * @see uml.UmlPackage#getownerClassifier_PrimitiveDataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='primitiveDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	primitiveDataType getPrimitiveDataType();

	/**
	 * Sets the value of the '{@link uml.ownerClassifier#getPrimitiveDataType <em>Primitive Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Data Type</em>' containment reference.
	 * @see #getPrimitiveDataType()
	 * @generated
	 */
	void setPrimitiveDataType(primitiveDataType value);

} // ownerClassifier
