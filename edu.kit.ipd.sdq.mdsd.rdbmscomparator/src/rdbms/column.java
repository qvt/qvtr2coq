/**
 */
package rdbms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdbms.column#getReferencedKeys <em>Referenced Keys</em>}</li>
 *   <li>{@link rdbms.column#getHasForeignKeys <em>Has Foreign Keys</em>}</li>
 *   <li>{@link rdbms.column#getKind <em>Kind</em>}</li>
 *   <li>{@link rdbms.column#getName <em>Name</em>}</li>
 *   <li>{@link rdbms.column#getOID <em>OID</em>}</li>
 *   <li>{@link rdbms.column#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdbms.RdbmsPackage#getcolumn()
 * @model extendedMetaData="name='column_._type' kind='elementOnly'"
 * @generated
 */
public interface column extends EObject {
	/**
	 * Returns the value of the '<em><b>Referenced Keys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Keys</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Keys</em>' containment reference.
	 * @see #setReferencedKeys(referencedKeys)
	 * @see rdbms.RdbmsPackage#getcolumn_ReferencedKeys()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referencedKeys' namespace='##targetNamespace'"
	 * @generated
	 */
	referencedKeys getReferencedKeys();

	/**
	 * Sets the value of the '{@link rdbms.column#getReferencedKeys <em>Referenced Keys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Keys</em>' containment reference.
	 * @see #getReferencedKeys()
	 * @generated
	 */
	void setReferencedKeys(referencedKeys value);

	/**
	 * Returns the value of the '<em><b>Has Foreign Keys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Foreign Keys</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Foreign Keys</em>' containment reference.
	 * @see #setHasForeignKeys(hasForeignKeys)
	 * @see rdbms.RdbmsPackage#getcolumn_HasForeignKeys()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='hasForeignKeys' namespace='##targetNamespace'"
	 * @generated
	 */
	hasForeignKeys getHasForeignKeys();

	/**
	 * Sets the value of the '{@link rdbms.column#getHasForeignKeys <em>Has Foreign Keys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Foreign Keys</em>' containment reference.
	 * @see #getHasForeignKeys()
	 * @generated
	 */
	void setHasForeignKeys(hasForeignKeys value);

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
	 * @see rdbms.RdbmsPackage#getcolumn_Kind()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='kind'"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link rdbms.column#getKind <em>Kind</em>}' attribute.
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
	 * @see rdbms.RdbmsPackage#getcolumn_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rdbms.column#getName <em>Name</em>}' attribute.
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
	 * @see rdbms.RdbmsPackage#getcolumn_OID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='oID'"
	 * @generated
	 */
	String getOID();

	/**
	 * Sets the value of the '{@link rdbms.column#getOID <em>OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OID</em>' attribute.
	 * @see #getOID()
	 * @generated
	 */
	void setOID(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see rdbms.RdbmsPackage#getcolumn_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link rdbms.column#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // column
