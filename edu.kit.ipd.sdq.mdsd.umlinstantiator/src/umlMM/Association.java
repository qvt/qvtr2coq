/**
 */
package umlMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link umlMM.Association#getName <em>Name</em>}</li>
 *   <li>{@link umlMM.Association#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link umlMM.Association#getSource <em>Source</em>}</li>
 *   <li>{@link umlMM.Association#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see umlMM.UmlMMPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends EObject {
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
	 * @see umlMM.UmlMMPackage#getAssociation_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link umlMM.Association#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link umlMM.Package#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' container reference.
	 * @see #setNamespace(umlMM.Package)
	 * @see umlMM.UmlMMPackage#getAssociation_Namespace()
	 * @see umlMM.Package#getAssociation
	 * @model opposite="association" required="true" transient="false" ordered="false"
	 * @generated
	 */
	umlMM.Package getNamespace();

	/**
	 * Sets the value of the '{@link umlMM.Association#getNamespace <em>Namespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' container reference.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(umlMM.Package value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link umlMM.Class#getSourceOf <em>Source Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(umlMM.Class)
	 * @see umlMM.UmlMMPackage#getAssociation_Source()
	 * @see umlMM.Class#getSourceOf
	 * @model opposite="sourceOf" required="true" ordered="false"
	 * @generated
	 */
	umlMM.Class getSource();

	/**
	 * Sets the value of the '{@link umlMM.Association#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(umlMM.Class value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link umlMM.Class#getDestinationOf <em>Destination Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(umlMM.Class)
	 * @see umlMM.UmlMMPackage#getAssociation_Destination()
	 * @see umlMM.Class#getDestinationOf
	 * @model opposite="destinationOf" required="true" ordered="false"
	 * @generated
	 */
	umlMM.Class getDestination();

	/**
	 * Sets the value of the '{@link umlMM.Association#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(umlMM.Class value);

} // Association
