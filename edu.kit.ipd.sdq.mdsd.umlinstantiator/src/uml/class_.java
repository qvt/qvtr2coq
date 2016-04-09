/**
 */
package uml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>class </b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.class_#getGeneralClass <em>General Class</em>}</li>
 *   <li>{@link uml.class_#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link uml.class_#getKind <em>Kind</em>}</li>
 *   <li>{@link uml.class_#getName <em>Name</em>}</li>
 *   <li>{@link uml.class_#getOID <em>OID</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getclass_()
 * @model extendedMetaData="name='class__._type' kind='elementOnly'"
 * @generated
 */
public interface class_ extends EObject {
	/**
	 * Returns the value of the '<em><b>General Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Class</em>' containment reference.
	 * @see #setGeneralClass(generalClass)
	 * @see uml.UmlPackage#getclass__GeneralClass()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='generalClass' namespace='##targetNamespace'"
	 * @generated
	 */
	generalClass getGeneralClass();

	/**
	 * Sets the value of the '{@link uml.class_#getGeneralClass <em>General Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Class</em>' containment reference.
	 * @see #getGeneralClass()
	 * @generated
	 */
	void setGeneralClass(generalClass value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference.
	 * @see #setAttributes(attributes)
	 * @see uml.UmlPackage#getclass__Attributes()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='attributes' namespace='##targetNamespace'"
	 * @generated
	 */
	attributes getAttributes();

	/**
	 * Sets the value of the '{@link uml.class_#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(attributes value);

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
	 * @see uml.UmlPackage#getclass__Kind()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='kind'"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link uml.class_#getKind <em>Kind</em>}' attribute.
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
	 * @see uml.UmlPackage#getclass__Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uml.class_#getName <em>Name</em>}' attribute.
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
	 * @see uml.UmlPackage#getclass__OID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='oID'"
	 * @generated
	 */
	String getOID();

	/**
	 * Sets the value of the '{@link uml.class_#getOID <em>OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OID</em>' attribute.
	 * @see #getOID()
	 * @generated
	 */
	void setOID(String value);

} // class_
