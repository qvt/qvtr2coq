/**
 */
package rdbms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdbms.schema#getTables <em>Tables</em>}</li>
 *   <li>{@link rdbms.schema#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link rdbms.schema#getKind <em>Kind</em>}</li>
 *   <li>{@link rdbms.schema#getName <em>Name</em>}</li>
 *   <li>{@link rdbms.schema#getOID <em>OID</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdbms.RdbmsPackage#getschema()
 * @model extendedMetaData="name='schema_._type' kind='elementOnly'"
 * @generated
 */
public interface schema extends EObject {
	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference.
	 * @see #setTables(tables)
	 * @see rdbms.RdbmsPackage#getschema_Tables()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='tables' namespace='##targetNamespace'"
	 * @generated
	 */
	tables getTables();

	/**
	 * Sets the value of the '{@link rdbms.schema#getTables <em>Tables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tables</em>' containment reference.
	 * @see #getTables()
	 * @generated
	 */
	void setTables(tables value);

	/**
	 * Returns the value of the '<em><b>Foreign Keys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Keys</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Keys</em>' containment reference.
	 * @see #setForeignKeys(foreignKeys)
	 * @see rdbms.RdbmsPackage#getschema_ForeignKeys()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='foreignKeys' namespace='##targetNamespace'"
	 * @generated
	 */
	foreignKeys getForeignKeys();

	/**
	 * Sets the value of the '{@link rdbms.schema#getForeignKeys <em>Foreign Keys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Keys</em>' containment reference.
	 * @see #getForeignKeys()
	 * @generated
	 */
	void setForeignKeys(foreignKeys value);

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
	 * @see rdbms.RdbmsPackage#getschema_Kind()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='kind'"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link rdbms.schema#getKind <em>Kind</em>}' attribute.
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
	 * @see rdbms.RdbmsPackage#getschema_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rdbms.schema#getName <em>Name</em>}' attribute.
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
	 * @see rdbms.RdbmsPackage#getschema_OID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='oID'"
	 * @generated
	 */
	String getOID();

	/**
	 * Sets the value of the '{@link rdbms.schema#getOID <em>OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OID</em>' attribute.
	 * @see #getOID()
	 * @generated
	 */
	void setOID(String value);

} // schema
