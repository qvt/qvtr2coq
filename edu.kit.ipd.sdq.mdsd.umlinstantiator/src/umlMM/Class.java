/**
 */
package umlMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link umlMM.Class#getKind <em>Kind</em>}</li>
 *   <li>{@link umlMM.Class#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link umlMM.Class#getGeneral <em>General</em>}</li>
 *   <li>{@link umlMM.Class#getSubclass <em>Subclass</em>}</li>
 *   <li>{@link umlMM.Class#getSourceOf <em>Source Of</em>}</li>
 *   <li>{@link umlMM.Class#getDestinationOf <em>Destination Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see umlMM.UmlMMPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Classifier {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see umlMM.UmlMMPackage#getClass_Kind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link umlMM.Class#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link umlMM.Attribute}.
	 * It is bidirectional and its opposite is '{@link umlMM.Attribute#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see umlMM.UmlMMPackage#getClass_Attribute()
	 * @see umlMM.Attribute#getOwner
	 * @model opposite="owner" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>General</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link umlMM.Class#getSubclass <em>Subclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General</em>' reference.
	 * @see #setGeneral(Class)
	 * @see umlMM.UmlMMPackage#getClass_General()
	 * @see umlMM.Class#getSubclass
	 * @model opposite="subclass" required="true" ordered="false"
	 * @generated
	 */
	Class getGeneral();

	/**
	 * Sets the value of the '{@link umlMM.Class#getGeneral <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General</em>' reference.
	 * @see #getGeneral()
	 * @generated
	 */
	void setGeneral(Class value);

	/**
	 * Returns the value of the '<em><b>Subclass</b></em>' reference list.
	 * The list contents are of type {@link umlMM.Class}.
	 * It is bidirectional and its opposite is '{@link umlMM.Class#getGeneral <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subclass</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subclass</em>' reference list.
	 * @see umlMM.UmlMMPackage#getClass_Subclass()
	 * @see umlMM.Class#getGeneral
	 * @model opposite="general" required="true" ordered="false"
	 * @generated
	 */
	EList<Class> getSubclass();

	/**
	 * Returns the value of the '<em><b>Source Of</b></em>' reference list.
	 * The list contents are of type {@link umlMM.Association}.
	 * It is bidirectional and its opposite is '{@link umlMM.Association#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Of</em>' reference list.
	 * @see umlMM.UmlMMPackage#getClass_SourceOf()
	 * @see umlMM.Association#getSource
	 * @model opposite="source" required="true" ordered="false"
	 * @generated
	 */
	EList<Association> getSourceOf();

	/**
	 * Returns the value of the '<em><b>Destination Of</b></em>' reference list.
	 * The list contents are of type {@link umlMM.Association}.
	 * It is bidirectional and its opposite is '{@link umlMM.Association#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Of</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Of</em>' reference list.
	 * @see umlMM.UmlMMPackage#getClass_DestinationOf()
	 * @see umlMM.Association#getDestination
	 * @model opposite="destination" required="true" ordered="false"
	 * @generated
	 */
	EList<Association> getDestinationOf();

} // Class
