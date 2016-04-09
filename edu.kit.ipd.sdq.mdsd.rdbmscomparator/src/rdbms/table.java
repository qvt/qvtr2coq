/**
 */
package rdbms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdbms.table#getColumns <em>Columns</em>}</li>
 *   <li>{@link rdbms.table#getKey2 <em>Key2</em>}</li>
 *   <li>{@link rdbms.table#getKind <em>Kind</em>}</li>
 *   <li>{@link rdbms.table#getName <em>Name</em>}</li>
 *   <li>{@link rdbms.table#getOID <em>OID</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdbms.RdbmsPackage#gettable()
 * @model extendedMetaData="name='table_._type' kind='elementOnly'"
 * @generated
 */
public interface table extends EObject {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference.
	 * @see #setColumns(columns)
	 * @see rdbms.RdbmsPackage#gettable_Columns()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='columns' namespace='##targetNamespace'"
	 * @generated
	 */
	columns getColumns();

	/**
	 * Sets the value of the '{@link rdbms.table#getColumns <em>Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' containment reference.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(columns value);

	/**
	 * Returns the value of the '<em><b>Key2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key2</em>' containment reference.
	 * @see #setKey2(key2)
	 * @see rdbms.RdbmsPackage#gettable_Key2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='key2' namespace='##targetNamespace'"
	 * @generated
	 */
	key2 getKey2();

	/**
	 * Sets the value of the '{@link rdbms.table#getKey2 <em>Key2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key2</em>' containment reference.
	 * @see #getKey2()
	 * @generated
	 */
	void setKey2(key2 value);

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
	 * @see rdbms.RdbmsPackage#gettable_Kind()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='kind'"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link rdbms.table#getKind <em>Kind</em>}' attribute.
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
	 * @see rdbms.RdbmsPackage#gettable_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rdbms.table#getName <em>Name</em>}' attribute.
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
	 * @see rdbms.RdbmsPackage#gettable_OID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='oID'"
	 * @generated
	 */
	String getOID();

	/**
	 * Sets the value of the '{@link rdbms.table#getOID <em>OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OID</em>' attribute.
	 * @see #getOID()
	 * @generated
	 */
	void setOID(String value);

} // table
