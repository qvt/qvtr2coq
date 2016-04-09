/**
 */
package umlMM_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link umlMM_.Package#getName <em>Name</em>}</li>
 *   <li>{@link umlMM_.Package#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link umlMM_.Package#getAssociation <em>Association</em>}</li>
 *   <li>{@link umlMM_.Package#getDummy <em>Dummy</em>}</li>
 * </ul>
 * </p>
 *
 * @see umlMM_.UmlMMPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
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
	 * @see umlMM_.UmlMMPackage#getPackage_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link umlMM_.Package#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link umlMM_.Classifier}.
	 * It is bidirectional and its opposite is '{@link umlMM_.Classifier#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' containment reference list.
	 * @see umlMM_.UmlMMPackage#getPackage_Classifier()
	 * @see umlMM_.Classifier#getNamespace
	 * @model opposite="namespace" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Classifier> getClassifier();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' containment reference list.
	 * The list contents are of type {@link umlMM_.Association}.
	 * It is bidirectional and its opposite is '{@link umlMM_.Association#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' containment reference list.
	 * @see umlMM_.UmlMMPackage#getPackage_Association()
	 * @see umlMM_.Association#getNamespace
	 * @model opposite="namespace" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Association> getAssociation();

	/**
	 * Returns the value of the '<em><b>Dummy</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlMM_.dummy#getContainsPackage <em>Contains Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dummy</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dummy</em>' container reference.
	 * @see #setDummy(dummy)
	 * @see umlMM_.UmlMMPackage#getPackage_Dummy()
	 * @see umlMM_.dummy#getContainsPackage
	 * @model opposite="containsPackage" required="true" transient="false"
	 * @generated
	 */
	dummy getDummy();

	/**
	 * Sets the value of the '{@link umlMM_.Package#getDummy <em>Dummy</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dummy</em>' container reference.
	 * @see #getDummy()
	 * @generated
	 */
	void setDummy(dummy value);

} // Package
