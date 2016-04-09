/**
 */
package umlMM;

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
 *   <li>{@link umlMM.Package#getName <em>Name</em>}</li>
 *   <li>{@link umlMM.Package#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link umlMM.Package#getAssociation <em>Association</em>}</li>
 * </ul>
 * </p>
 *
 * @see umlMM.UmlMMPackage#getPackage()
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
	 * @see umlMM.UmlMMPackage#getPackage_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link umlMM.Package#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link umlMM.Classifier}.
	 * It is bidirectional and its opposite is '{@link umlMM.Classifier#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifier</em>' containment reference list.
	 * @see umlMM.UmlMMPackage#getPackage_Classifier()
	 * @see umlMM.Classifier#getNamespace
	 * @model opposite="namespace" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Classifier> getClassifier();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' containment reference list.
	 * The list contents are of type {@link umlMM.Association}.
	 * It is bidirectional and its opposite is '{@link umlMM.Association#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' containment reference list.
	 * @see umlMM.UmlMMPackage#getPackage_Association()
	 * @see umlMM.Association#getNamespace
	 * @model opposite="namespace" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Association> getAssociation();

} // Package
