/**
 */
package umlMM_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link umlMM_.Classifier#getName <em>Name</em>}</li>
 *   <li>{@link umlMM_.Classifier#getTypeOf <em>Type Of</em>}</li>
 *   <li>{@link umlMM_.Classifier#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see umlMM_.UmlMMPackage#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see umlMM_.UmlMMPackage#getClassifier_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link umlMM_.Classifier#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type Of</b></em>' reference list.
	 * The list contents are of type {@link umlMM_.Attribute}.
	 * It is bidirectional and its opposite is '{@link umlMM_.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Of</em>' reference list.
	 * @see umlMM_.UmlMMPackage#getClassifier_TypeOf()
	 * @see umlMM_.Attribute#getType
	 * @model opposite="type" required="true" ordered="false"
	 * @generated
	 */
	EList<Attribute> getTypeOf();

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlMM_.Package#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' container reference.
	 * @see #setNamespace(umlMM_.Package)
	 * @see umlMM_.UmlMMPackage#getClassifier_Namespace()
	 * @see umlMM_.Package#getClassifier
	 * @model opposite="classifier" required="true" transient="false" ordered="false"
	 * @generated
	 */
	umlMM_.Package getNamespace();

	/**
	 * Sets the value of the '{@link umlMM_.Classifier#getNamespace <em>Namespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' container reference.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(umlMM_.Package value);

} // Classifier
