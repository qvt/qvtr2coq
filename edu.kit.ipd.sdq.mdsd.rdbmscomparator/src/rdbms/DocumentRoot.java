/**
 */
package rdbms;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdbms.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link rdbms.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link rdbms.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link rdbms.DocumentRoot#getColumn <em>Column</em>}</li>
 *   <li>{@link rdbms.DocumentRoot#getColumns <em>Columns</em>}</li>
 *   <li>{@link rdbms.DocumentRoot#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link rdbms.DocumentRoot#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link rdbms.DocumentRoot#getHasForeignKeys <em>Has Foreign Keys</em>}</li>
 *   <li>{@link rdbms.DocumentRoot#getKey <em>Key</em>}</li>
 *   <li>{@link rdbms.DocumentRoot#getKey2 <em>Key2</em>}</li>
 *   <li>{@link rdbms.DocumentRoot#getOID <em>OID</em>}</li>
 *   <li>{@link rdbms.DocumentRoot#getRDBMS <em>RDBMS</em>}</li>
 *   <li>{@link rdbms.DocumentRoot#getReferencedColumns <em>Referenced Columns</em>}</li>
 *   <li>{@link rdbms.DocumentRoot#getReferencedKeys <em>Referenced Keys</em>}</li>
 *   <li>{@link rdbms.DocumentRoot#getSchema <em>Schema</em>}</li>
 *   <li>{@link rdbms.DocumentRoot#getSchemas <em>Schemas</em>}</li>
 *   <li>{@link rdbms.DocumentRoot#getTable <em>Table</em>}</li>
 *   <li>{@link rdbms.DocumentRoot#getTables <em>Tables</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdbms.RdbmsPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see rdbms.RdbmsPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see rdbms.RdbmsPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see rdbms.RdbmsPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference.
	 * @see #setColumn(column)
	 * @see rdbms.RdbmsPackage#getDocumentRoot_Column()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='column' namespace='##targetNamespace'"
	 * @generated
	 */
	column getColumn();

	/**
	 * Sets the value of the '{@link rdbms.DocumentRoot#getColumn <em>Column</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' containment reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(column value);

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
	 * @see rdbms.RdbmsPackage#getDocumentRoot_Columns()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='columns' namespace='##targetNamespace'"
	 * @generated
	 */
	columns getColumns();

	/**
	 * Sets the value of the '{@link rdbms.DocumentRoot#getColumns <em>Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' containment reference.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(columns value);

	/**
	 * Returns the value of the '<em><b>Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key</em>' containment reference.
	 * @see #setForeignKey(foreignKey)
	 * @see rdbms.RdbmsPackage#getDocumentRoot_ForeignKey()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='foreignKey' namespace='##targetNamespace'"
	 * @generated
	 */
	foreignKey getForeignKey();

	/**
	 * Sets the value of the '{@link rdbms.DocumentRoot#getForeignKey <em>Foreign Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Key</em>' containment reference.
	 * @see #getForeignKey()
	 * @generated
	 */
	void setForeignKey(foreignKey value);

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
	 * @see rdbms.RdbmsPackage#getDocumentRoot_ForeignKeys()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='foreignKeys' namespace='##targetNamespace'"
	 * @generated
	 */
	foreignKeys getForeignKeys();

	/**
	 * Sets the value of the '{@link rdbms.DocumentRoot#getForeignKeys <em>Foreign Keys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Keys</em>' containment reference.
	 * @see #getForeignKeys()
	 * @generated
	 */
	void setForeignKeys(foreignKeys value);

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
	 * @see rdbms.RdbmsPackage#getDocumentRoot_HasForeignKeys()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hasForeignKeys' namespace='##targetNamespace'"
	 * @generated
	 */
	hasForeignKeys getHasForeignKeys();

	/**
	 * Sets the value of the '{@link rdbms.DocumentRoot#getHasForeignKeys <em>Has Foreign Keys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Foreign Keys</em>' containment reference.
	 * @see #getHasForeignKeys()
	 * @generated
	 */
	void setHasForeignKeys(hasForeignKeys value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(key)
	 * @see rdbms.RdbmsPackage#getDocumentRoot_Key()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='key' namespace='##targetNamespace'"
	 * @generated
	 */
	key getKey();

	/**
	 * Sets the value of the '{@link rdbms.DocumentRoot#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(key value);

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
	 * @see rdbms.RdbmsPackage#getDocumentRoot_Key2()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='key2' namespace='##targetNamespace'"
	 * @generated
	 */
	key2 getKey2();

	/**
	 * Sets the value of the '{@link rdbms.DocumentRoot#getKey2 <em>Key2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key2</em>' containment reference.
	 * @see #getKey2()
	 * @generated
	 */
	void setKey2(key2 value);

	/**
	 * Returns the value of the '<em><b>OID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OID</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OID</em>' containment reference.
	 * @see #setOID(oID)
	 * @see rdbms.RdbmsPackage#getDocumentRoot_OID()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='oID' namespace='##targetNamespace'"
	 * @generated
	 */
	oID getOID();

	/**
	 * Sets the value of the '{@link rdbms.DocumentRoot#getOID <em>OID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OID</em>' containment reference.
	 * @see #getOID()
	 * @generated
	 */
	void setOID(oID value);

	/**
	 * Returns the value of the '<em><b>RDBMS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDBMS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDBMS</em>' containment reference.
	 * @see #setRDBMS(RDBMS)
	 * @see rdbms.RdbmsPackage#getDocumentRoot_RDBMS()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RDBMS' namespace='##targetNamespace'"
	 * @generated
	 */
	RDBMS getRDBMS();

	/**
	 * Sets the value of the '{@link rdbms.DocumentRoot#getRDBMS <em>RDBMS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RDBMS</em>' containment reference.
	 * @see #getRDBMS()
	 * @generated
	 */
	void setRDBMS(RDBMS value);

	/**
	 * Returns the value of the '<em><b>Referenced Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Columns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Columns</em>' containment reference.
	 * @see #setReferencedColumns(referencedColumns)
	 * @see rdbms.RdbmsPackage#getDocumentRoot_ReferencedColumns()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='referencedColumns' namespace='##targetNamespace'"
	 * @generated
	 */
	referencedColumns getReferencedColumns();

	/**
	 * Sets the value of the '{@link rdbms.DocumentRoot#getReferencedColumns <em>Referenced Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Columns</em>' containment reference.
	 * @see #getReferencedColumns()
	 * @generated
	 */
	void setReferencedColumns(referencedColumns value);

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
	 * @see rdbms.RdbmsPackage#getDocumentRoot_ReferencedKeys()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='referencedKeys' namespace='##targetNamespace'"
	 * @generated
	 */
	referencedKeys getReferencedKeys();

	/**
	 * Sets the value of the '{@link rdbms.DocumentRoot#getReferencedKeys <em>Referenced Keys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Keys</em>' containment reference.
	 * @see #getReferencedKeys()
	 * @generated
	 */
	void setReferencedKeys(referencedKeys value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference.
	 * @see #setSchema(schema)
	 * @see rdbms.RdbmsPackage#getDocumentRoot_Schema()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='schema' namespace='##targetNamespace'"
	 * @generated
	 */
	schema getSchema();

	/**
	 * Sets the value of the '{@link rdbms.DocumentRoot#getSchema <em>Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' containment reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(schema value);

	/**
	 * Returns the value of the '<em><b>Schemas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schemas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemas</em>' containment reference.
	 * @see #setSchemas(schemas)
	 * @see rdbms.RdbmsPackage#getDocumentRoot_Schemas()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='schemas' namespace='##targetNamespace'"
	 * @generated
	 */
	schemas getSchemas();

	/**
	 * Sets the value of the '{@link rdbms.DocumentRoot#getSchemas <em>Schemas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schemas</em>' containment reference.
	 * @see #getSchemas()
	 * @generated
	 */
	void setSchemas(schemas value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference.
	 * @see #setTable(table)
	 * @see rdbms.RdbmsPackage#getDocumentRoot_Table()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace'"
	 * @generated
	 */
	table getTable();

	/**
	 * Sets the value of the '{@link rdbms.DocumentRoot#getTable <em>Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' containment reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(table value);

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
	 * @see rdbms.RdbmsPackage#getDocumentRoot_Tables()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tables' namespace='##targetNamespace'"
	 * @generated
	 */
	tables getTables();

	/**
	 * Sets the value of the '{@link rdbms.DocumentRoot#getTables <em>Tables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tables</em>' containment reference.
	 * @see #getTables()
	 * @generated
	 */
	void setTables(tables value);

} // DocumentRoot
