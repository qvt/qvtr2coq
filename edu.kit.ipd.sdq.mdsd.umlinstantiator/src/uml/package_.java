/**
 */
package uml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>package </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.package_#getClassifiersAndAssociations <em>Classifiers And Associations</em>}</li>
 *   <li>{@link uml.package_#getKind <em>Kind</em>}</li>
 *   <li>{@link uml.package_#getName <em>Name</em>}</li>
 *   <li>{@link uml.package_#getOID <em>OID</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getpackage_()
 * @model extendedMetaData="name='package__._type' kind='elementOnly'"
 * @generated
 */
public interface package_ extends EObject {
	/**
	 * Returns the value of the '<em><b>Classifiers And Associations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifiers And Associations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifiers And Associations</em>' containment reference.
	 * @see #setClassifiersAndAssociations(classifiersAndAssociations)
	 * @see uml.UmlPackage#getpackage__ClassifiersAndAssociations()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='classifiersAndAssociations' namespace='##targetNamespace'"
	 * @generated
	 */
	classifiersAndAssociations getClassifiersAndAssociations();

	/**
	 * Sets the value of the '{@link uml.package_#getClassifiersAndAssociations <em>Classifiers And Associations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifiers And Associations</em>' containment reference.
	 * @see #getClassifiersAndAssociations()
	 * @generated
	 */
	void setClassifiersAndAssociations(classifiersAndAssociations value);

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
	 * @see uml.UmlPackage#getpackage__Kind()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='kind'"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link uml.package_#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

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
	 * @see uml.UmlPackage#getpackage__Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uml.package_#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OID</em>' attribute.
	 * @see #setOID(String)
	 * @see uml.UmlPackage#getpackage__OID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='oID'"
	 * @generated
	 */
	String getOID();

	/**
	 * Sets the value of the '{@link uml.package_#getOID <em>OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OID</em>' attribute.
	 * @see #getOID()
	 * @generated
	 */
	void setOID(String value);

} // package_
