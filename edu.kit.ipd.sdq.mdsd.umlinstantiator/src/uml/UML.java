/**
 */
package uml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.UML#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getUML()
 * @model extendedMetaData="name='UML_._type' kind='elementOnly'"
 * @generated
 */
public interface UML extends EObject {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference.
	 * @see #setPackages(packages)
	 * @see uml.UmlPackage#getUML_Packages()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='packages' namespace='##targetNamespace'"
	 * @generated
	 */
	packages getPackages();

	/**
	 * Sets the value of the '{@link uml.UML#getPackages <em>Packages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packages</em>' containment reference.
	 * @see #getPackages()
	 * @generated
	 */
	void setPackages(packages value);

} // UML
