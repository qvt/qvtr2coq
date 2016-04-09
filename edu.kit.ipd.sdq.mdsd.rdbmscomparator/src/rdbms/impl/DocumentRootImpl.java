/**
 */
package rdbms.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import rdbms.DocumentRoot;
import rdbms.RDBMS;
import rdbms.RdbmsPackage;
import rdbms.column;
import rdbms.columns;
import rdbms.foreignKey;
import rdbms.foreignKeys;
import rdbms.hasForeignKeys;
import rdbms.key;
import rdbms.key2;
import rdbms.oID;
import rdbms.referencedColumns;
import rdbms.referencedKeys;
import rdbms.schema;
import rdbms.schemas;
import rdbms.table;
import rdbms.tables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdbms.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link rdbms.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link rdbms.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link rdbms.impl.DocumentRootImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link rdbms.impl.DocumentRootImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link rdbms.impl.DocumentRootImpl#getForeignKey <em>Foreign Key</em>}</li>
 *   <li>{@link rdbms.impl.DocumentRootImpl#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link rdbms.impl.DocumentRootImpl#getHasForeignKeys <em>Has Foreign Keys</em>}</li>
 *   <li>{@link rdbms.impl.DocumentRootImpl#getKey <em>Key</em>}</li>
 *   <li>{@link rdbms.impl.DocumentRootImpl#getKey2 <em>Key2</em>}</li>
 *   <li>{@link rdbms.impl.DocumentRootImpl#getOID <em>OID</em>}</li>
 *   <li>{@link rdbms.impl.DocumentRootImpl#getRDBMS <em>RDBMS</em>}</li>
 *   <li>{@link rdbms.impl.DocumentRootImpl#getReferencedColumns <em>Referenced Columns</em>}</li>
 *   <li>{@link rdbms.impl.DocumentRootImpl#getReferencedKeys <em>Referenced Keys</em>}</li>
 *   <li>{@link rdbms.impl.DocumentRootImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link rdbms.impl.DocumentRootImpl#getSchemas <em>Schemas</em>}</li>
 *   <li>{@link rdbms.impl.DocumentRootImpl#getTable <em>Table</em>}</li>
 *   <li>{@link rdbms.impl.DocumentRootImpl#getTables <em>Tables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbmsPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, RdbmsPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, RdbmsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, RdbmsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public column getColumn() {
		return (column)getMixed().get(RdbmsPackage.Literals.DOCUMENT_ROOT__COLUMN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumn(column newColumn, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RdbmsPackage.Literals.DOCUMENT_ROOT__COLUMN, newColumn, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(column newColumn) {
		((FeatureMap.Internal)getMixed()).set(RdbmsPackage.Literals.DOCUMENT_ROOT__COLUMN, newColumn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public columns getColumns() {
		return (columns)getMixed().get(RdbmsPackage.Literals.DOCUMENT_ROOT__COLUMNS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumns(columns newColumns, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RdbmsPackage.Literals.DOCUMENT_ROOT__COLUMNS, newColumns, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(columns newColumns) {
		((FeatureMap.Internal)getMixed()).set(RdbmsPackage.Literals.DOCUMENT_ROOT__COLUMNS, newColumns);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public foreignKey getForeignKey() {
		return (foreignKey)getMixed().get(RdbmsPackage.Literals.DOCUMENT_ROOT__FOREIGN_KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForeignKey(foreignKey newForeignKey, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RdbmsPackage.Literals.DOCUMENT_ROOT__FOREIGN_KEY, newForeignKey, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignKey(foreignKey newForeignKey) {
		((FeatureMap.Internal)getMixed()).set(RdbmsPackage.Literals.DOCUMENT_ROOT__FOREIGN_KEY, newForeignKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public foreignKeys getForeignKeys() {
		return (foreignKeys)getMixed().get(RdbmsPackage.Literals.DOCUMENT_ROOT__FOREIGN_KEYS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForeignKeys(foreignKeys newForeignKeys, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RdbmsPackage.Literals.DOCUMENT_ROOT__FOREIGN_KEYS, newForeignKeys, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignKeys(foreignKeys newForeignKeys) {
		((FeatureMap.Internal)getMixed()).set(RdbmsPackage.Literals.DOCUMENT_ROOT__FOREIGN_KEYS, newForeignKeys);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public hasForeignKeys getHasForeignKeys() {
		return (hasForeignKeys)getMixed().get(RdbmsPackage.Literals.DOCUMENT_ROOT__HAS_FOREIGN_KEYS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasForeignKeys(hasForeignKeys newHasForeignKeys, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RdbmsPackage.Literals.DOCUMENT_ROOT__HAS_FOREIGN_KEYS, newHasForeignKeys, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasForeignKeys(hasForeignKeys newHasForeignKeys) {
		((FeatureMap.Internal)getMixed()).set(RdbmsPackage.Literals.DOCUMENT_ROOT__HAS_FOREIGN_KEYS, newHasForeignKeys);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public key getKey() {
		return (key)getMixed().get(RdbmsPackage.Literals.DOCUMENT_ROOT__KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKey(key newKey, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RdbmsPackage.Literals.DOCUMENT_ROOT__KEY, newKey, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(key newKey) {
		((FeatureMap.Internal)getMixed()).set(RdbmsPackage.Literals.DOCUMENT_ROOT__KEY, newKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public key2 getKey2() {
		return (key2)getMixed().get(RdbmsPackage.Literals.DOCUMENT_ROOT__KEY2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKey2(key2 newKey2, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RdbmsPackage.Literals.DOCUMENT_ROOT__KEY2, newKey2, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey2(key2 newKey2) {
		((FeatureMap.Internal)getMixed()).set(RdbmsPackage.Literals.DOCUMENT_ROOT__KEY2, newKey2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public oID getOID() {
		return (oID)getMixed().get(RdbmsPackage.Literals.DOCUMENT_ROOT__OID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOID(oID newOID, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RdbmsPackage.Literals.DOCUMENT_ROOT__OID, newOID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOID(oID newOID) {
		((FeatureMap.Internal)getMixed()).set(RdbmsPackage.Literals.DOCUMENT_ROOT__OID, newOID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBMS getRDBMS() {
		return (RDBMS)getMixed().get(RdbmsPackage.Literals.DOCUMENT_ROOT__RDBMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRDBMS(RDBMS newRDBMS, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RdbmsPackage.Literals.DOCUMENT_ROOT__RDBMS, newRDBMS, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRDBMS(RDBMS newRDBMS) {
		((FeatureMap.Internal)getMixed()).set(RdbmsPackage.Literals.DOCUMENT_ROOT__RDBMS, newRDBMS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public referencedColumns getReferencedColumns() {
		return (referencedColumns)getMixed().get(RdbmsPackage.Literals.DOCUMENT_ROOT__REFERENCED_COLUMNS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedColumns(referencedColumns newReferencedColumns, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RdbmsPackage.Literals.DOCUMENT_ROOT__REFERENCED_COLUMNS, newReferencedColumns, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedColumns(referencedColumns newReferencedColumns) {
		((FeatureMap.Internal)getMixed()).set(RdbmsPackage.Literals.DOCUMENT_ROOT__REFERENCED_COLUMNS, newReferencedColumns);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public referencedKeys getReferencedKeys() {
		return (referencedKeys)getMixed().get(RdbmsPackage.Literals.DOCUMENT_ROOT__REFERENCED_KEYS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedKeys(referencedKeys newReferencedKeys, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RdbmsPackage.Literals.DOCUMENT_ROOT__REFERENCED_KEYS, newReferencedKeys, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedKeys(referencedKeys newReferencedKeys) {
		((FeatureMap.Internal)getMixed()).set(RdbmsPackage.Literals.DOCUMENT_ROOT__REFERENCED_KEYS, newReferencedKeys);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public schema getSchema() {
		return (schema)getMixed().get(RdbmsPackage.Literals.DOCUMENT_ROOT__SCHEMA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(schema newSchema, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RdbmsPackage.Literals.DOCUMENT_ROOT__SCHEMA, newSchema, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(schema newSchema) {
		((FeatureMap.Internal)getMixed()).set(RdbmsPackage.Literals.DOCUMENT_ROOT__SCHEMA, newSchema);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public schemas getSchemas() {
		return (schemas)getMixed().get(RdbmsPackage.Literals.DOCUMENT_ROOT__SCHEMAS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchemas(schemas newSchemas, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RdbmsPackage.Literals.DOCUMENT_ROOT__SCHEMAS, newSchemas, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemas(schemas newSchemas) {
		((FeatureMap.Internal)getMixed()).set(RdbmsPackage.Literals.DOCUMENT_ROOT__SCHEMAS, newSchemas);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public table getTable() {
		return (table)getMixed().get(RdbmsPackage.Literals.DOCUMENT_ROOT__TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(table newTable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RdbmsPackage.Literals.DOCUMENT_ROOT__TABLE, newTable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(table newTable) {
		((FeatureMap.Internal)getMixed()).set(RdbmsPackage.Literals.DOCUMENT_ROOT__TABLE, newTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tables getTables() {
		return (tables)getMixed().get(RdbmsPackage.Literals.DOCUMENT_ROOT__TABLES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTables(tables newTables, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(RdbmsPackage.Literals.DOCUMENT_ROOT__TABLES, newTables, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTables(tables newTables) {
		((FeatureMap.Internal)getMixed()).set(RdbmsPackage.Literals.DOCUMENT_ROOT__TABLES, newTables);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdbmsPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case RdbmsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case RdbmsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case RdbmsPackage.DOCUMENT_ROOT__COLUMN:
				return basicSetColumn(null, msgs);
			case RdbmsPackage.DOCUMENT_ROOT__COLUMNS:
				return basicSetColumns(null, msgs);
			case RdbmsPackage.DOCUMENT_ROOT__FOREIGN_KEY:
				return basicSetForeignKey(null, msgs);
			case RdbmsPackage.DOCUMENT_ROOT__FOREIGN_KEYS:
				return basicSetForeignKeys(null, msgs);
			case RdbmsPackage.DOCUMENT_ROOT__HAS_FOREIGN_KEYS:
				return basicSetHasForeignKeys(null, msgs);
			case RdbmsPackage.DOCUMENT_ROOT__KEY:
				return basicSetKey(null, msgs);
			case RdbmsPackage.DOCUMENT_ROOT__KEY2:
				return basicSetKey2(null, msgs);
			case RdbmsPackage.DOCUMENT_ROOT__OID:
				return basicSetOID(null, msgs);
			case RdbmsPackage.DOCUMENT_ROOT__RDBMS:
				return basicSetRDBMS(null, msgs);
			case RdbmsPackage.DOCUMENT_ROOT__REFERENCED_COLUMNS:
				return basicSetReferencedColumns(null, msgs);
			case RdbmsPackage.DOCUMENT_ROOT__REFERENCED_KEYS:
				return basicSetReferencedKeys(null, msgs);
			case RdbmsPackage.DOCUMENT_ROOT__SCHEMA:
				return basicSetSchema(null, msgs);
			case RdbmsPackage.DOCUMENT_ROOT__SCHEMAS:
				return basicSetSchemas(null, msgs);
			case RdbmsPackage.DOCUMENT_ROOT__TABLE:
				return basicSetTable(null, msgs);
			case RdbmsPackage.DOCUMENT_ROOT__TABLES:
				return basicSetTables(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdbmsPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case RdbmsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case RdbmsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case RdbmsPackage.DOCUMENT_ROOT__COLUMN:
				return getColumn();
			case RdbmsPackage.DOCUMENT_ROOT__COLUMNS:
				return getColumns();
			case RdbmsPackage.DOCUMENT_ROOT__FOREIGN_KEY:
				return getForeignKey();
			case RdbmsPackage.DOCUMENT_ROOT__FOREIGN_KEYS:
				return getForeignKeys();
			case RdbmsPackage.DOCUMENT_ROOT__HAS_FOREIGN_KEYS:
				return getHasForeignKeys();
			case RdbmsPackage.DOCUMENT_ROOT__KEY:
				return getKey();
			case RdbmsPackage.DOCUMENT_ROOT__KEY2:
				return getKey2();
			case RdbmsPackage.DOCUMENT_ROOT__OID:
				return getOID();
			case RdbmsPackage.DOCUMENT_ROOT__RDBMS:
				return getRDBMS();
			case RdbmsPackage.DOCUMENT_ROOT__REFERENCED_COLUMNS:
				return getReferencedColumns();
			case RdbmsPackage.DOCUMENT_ROOT__REFERENCED_KEYS:
				return getReferencedKeys();
			case RdbmsPackage.DOCUMENT_ROOT__SCHEMA:
				return getSchema();
			case RdbmsPackage.DOCUMENT_ROOT__SCHEMAS:
				return getSchemas();
			case RdbmsPackage.DOCUMENT_ROOT__TABLE:
				return getTable();
			case RdbmsPackage.DOCUMENT_ROOT__TABLES:
				return getTables();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RdbmsPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__COLUMN:
				setColumn((column)newValue);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__COLUMNS:
				setColumns((columns)newValue);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__FOREIGN_KEY:
				setForeignKey((foreignKey)newValue);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__FOREIGN_KEYS:
				setForeignKeys((foreignKeys)newValue);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__HAS_FOREIGN_KEYS:
				setHasForeignKeys((hasForeignKeys)newValue);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__KEY:
				setKey((key)newValue);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__KEY2:
				setKey2((key2)newValue);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__OID:
				setOID((oID)newValue);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__RDBMS:
				setRDBMS((RDBMS)newValue);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__REFERENCED_COLUMNS:
				setReferencedColumns((referencedColumns)newValue);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__REFERENCED_KEYS:
				setReferencedKeys((referencedKeys)newValue);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__SCHEMA:
				setSchema((schema)newValue);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__SCHEMAS:
				setSchemas((schemas)newValue);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__TABLE:
				setTable((table)newValue);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__TABLES:
				setTables((tables)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RdbmsPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case RdbmsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case RdbmsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case RdbmsPackage.DOCUMENT_ROOT__COLUMN:
				setColumn((column)null);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__COLUMNS:
				setColumns((columns)null);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__FOREIGN_KEY:
				setForeignKey((foreignKey)null);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__FOREIGN_KEYS:
				setForeignKeys((foreignKeys)null);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__HAS_FOREIGN_KEYS:
				setHasForeignKeys((hasForeignKeys)null);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__KEY:
				setKey((key)null);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__KEY2:
				setKey2((key2)null);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__OID:
				setOID((oID)null);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__RDBMS:
				setRDBMS((RDBMS)null);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__REFERENCED_COLUMNS:
				setReferencedColumns((referencedColumns)null);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__REFERENCED_KEYS:
				setReferencedKeys((referencedKeys)null);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__SCHEMA:
				setSchema((schema)null);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__SCHEMAS:
				setSchemas((schemas)null);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__TABLE:
				setTable((table)null);
				return;
			case RdbmsPackage.DOCUMENT_ROOT__TABLES:
				setTables((tables)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RdbmsPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case RdbmsPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case RdbmsPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case RdbmsPackage.DOCUMENT_ROOT__COLUMN:
				return getColumn() != null;
			case RdbmsPackage.DOCUMENT_ROOT__COLUMNS:
				return getColumns() != null;
			case RdbmsPackage.DOCUMENT_ROOT__FOREIGN_KEY:
				return getForeignKey() != null;
			case RdbmsPackage.DOCUMENT_ROOT__FOREIGN_KEYS:
				return getForeignKeys() != null;
			case RdbmsPackage.DOCUMENT_ROOT__HAS_FOREIGN_KEYS:
				return getHasForeignKeys() != null;
			case RdbmsPackage.DOCUMENT_ROOT__KEY:
				return getKey() != null;
			case RdbmsPackage.DOCUMENT_ROOT__KEY2:
				return getKey2() != null;
			case RdbmsPackage.DOCUMENT_ROOT__OID:
				return getOID() != null;
			case RdbmsPackage.DOCUMENT_ROOT__RDBMS:
				return getRDBMS() != null;
			case RdbmsPackage.DOCUMENT_ROOT__REFERENCED_COLUMNS:
				return getReferencedColumns() != null;
			case RdbmsPackage.DOCUMENT_ROOT__REFERENCED_KEYS:
				return getReferencedKeys() != null;
			case RdbmsPackage.DOCUMENT_ROOT__SCHEMA:
				return getSchema() != null;
			case RdbmsPackage.DOCUMENT_ROOT__SCHEMAS:
				return getSchemas() != null;
			case RdbmsPackage.DOCUMENT_ROOT__TABLE:
				return getTable() != null;
			case RdbmsPackage.DOCUMENT_ROOT__TABLES:
				return getTables() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
