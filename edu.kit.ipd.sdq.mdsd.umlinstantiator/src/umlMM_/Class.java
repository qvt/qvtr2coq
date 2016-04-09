/**
 */
package umlMM_;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link umlMM_.Class#getKind <em>Kind</em>}</li>
 *   <li>{@link umlMM_.Class#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link umlMM_.Class#getGeneral <em>General</em>}</li>
 *   <li>{@link umlMM_.Class#getSubclass <em>Subclass</em>}</li>
 *   <li>{@link umlMM_.Class#getSourceOf <em>Source Of</em>}</li>
 *   <li>{@link umlMM_.Class#getDestinationOf <em>Destination Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see umlMM_.UmlMMPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Classifier {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link umlMM_.KIND}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see umlMM_.KIND
	 * @see #setKind(KIND)
	 * @see umlMM_.UmlMMPackage#getClass_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	KIND getKind();

	/**
	 * Sets the value of the '{@link umlMM_.Class#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see umlMM_.KIND
	 * @see #getKind()
	 * @generated
	 */
	void setKind(KIND value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link umlMM_.Attribute}.
	 * It is bidirectional and its opposite is '{@link umlMM_.Attribute#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see umlMM_.UmlMMPackage#getClass_Attribute()
	 * @see umlMM_.Attribute#getOwner
	 * @model opposite="owner" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>General</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link umlMM_.Class#getSubclass <em>Subclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' reference.
	 * @see #setGeneral(Class)
	 * @see umlMM_.UmlMMPackage#getClass_General()
	 * @see umlMM_.Class#getSubclass
	 * @model opposite="subclass" required="true" ordered="false"
	 * @generated
	 */
	Class getGeneral();

	/**
	 * Sets the value of the '{@link umlMM_.Class#getGeneral <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' reference.
	 * @see #getGeneral()
	 * @generated
	 */
	void setGeneral(Class value);

	/**
	 * Returns the value of the '<em><b>Subclass</b></em>' reference list.
	 * The list contents are of type {@link umlMM_.Class}.
	 * It is bidirectional and its opposite is '{@link umlMM_.Class#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subclass</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subclass</em>' reference list.
	 * @see umlMM_.UmlMMPackage#getClass_Subclass()
	 * @see umlMM_.Class#getGeneral
	 * @model opposite="general" required="true" ordered="false"
	 * @generated
	 */
	EList<Class> getSubclass();

	/**
	 * Returns the value of the '<em><b>Source Of</b></em>' reference list.
	 * The list contents are of type {@link umlMM_.Association}.
	 * It is bidirectional and its opposite is '{@link umlMM_.Association#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Of</em>' reference list.
	 * @see umlMM_.UmlMMPackage#getClass_SourceOf()
	 * @see umlMM_.Association#getSource
	 * @model opposite="source" required="true" ordered="false"
	 * @generated
	 */
	EList<Association> getSourceOf();

	/**
	 * Returns the value of the '<em><b>Destination Of</b></em>' reference list.
	 * The list contents are of type {@link umlMM_.Association}.
	 * It is bidirectional and its opposite is '{@link umlMM_.Association#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Of</em>' reference list.
	 * @see umlMM_.UmlMMPackage#getClass_DestinationOf()
	 * @see umlMM_.Association#getDestination
	 * @model opposite="destination" required="true" ordered="false"
	 * @generated
	 */
	EList<Association> getDestinationOf();

} // Class
