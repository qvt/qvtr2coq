/**
 */
package rdbms.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rdbms.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdbmsFactoryImpl extends EFactoryImpl implements RdbmsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RdbmsFactory init() {
		try {
			RdbmsFactory theRdbmsFactory = (RdbmsFactory)EPackage.Registry.INSTANCE.getEFactory(RdbmsPackage.eNS_URI);
			if (theRdbmsFactory != null) {
				return theRdbmsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RdbmsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RdbmsPackage.COLUMN: return createcolumn();
			case RdbmsPackage.COLUMNS: return createcolumns();
			case RdbmsPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case RdbmsPackage.FOREIGN_KEY: return createforeignKey();
			case RdbmsPackage.FOREIGN_KEYS: return createforeignKeys();
			case RdbmsPackage.HAS_FOREIGN_KEYS: return createhasForeignKeys();
			case RdbmsPackage.KEY: return createkey();
			case RdbmsPackage.KEY2: return createkey2();
			case RdbmsPackage.OID: return createoID();
			case RdbmsPackage.RDBMS: return createRDBMS();
			case RdbmsPackage.REFERENCED_COLUMNS: return createreferencedColumns();
			case RdbmsPackage.REFERENCED_KEYS: return createreferencedKeys();
			case RdbmsPackage.SCHEMA: return createschema();
			case RdbmsPackage.SCHEMAS: return createschemas();
			case RdbmsPackage.TABLE: return createtable();
			case RdbmsPackage.TABLES: return createtables();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public column createcolumn() {
		columnImpl column = new columnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public columns createcolumns() {
		columnsImpl columns = new columnsImpl();
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public foreignKey createforeignKey() {
		foreignKeyImpl foreignKey = new foreignKeyImpl();
		return foreignKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public foreignKeys createforeignKeys() {
		foreignKeysImpl foreignKeys = new foreignKeysImpl();
		return foreignKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public hasForeignKeys createhasForeignKeys() {
		hasForeignKeysImpl hasForeignKeys = new hasForeignKeysImpl();
		return hasForeignKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public key createkey() {
		keyImpl key = new keyImpl();
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public key2 createkey2() {
		key2Impl key2 = new key2Impl();
		return key2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public oID createoID() {
		oIDImpl oID = new oIDImpl();
		return oID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RDBMS createRDBMS() {
		RDBMSImpl rdbms = new RDBMSImpl();
		return rdbms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public referencedColumns createreferencedColumns() {
		referencedColumnsImpl referencedColumns = new referencedColumnsImpl();
		return referencedColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public referencedKeys createreferencedKeys() {
		referencedKeysImpl referencedKeys = new referencedKeysImpl();
		return referencedKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public schema createschema() {
		schemaImpl schema = new schemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public schemas createschemas() {
		schemasImpl schemas = new schemasImpl();
		return schemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public table createtable() {
		tableImpl table = new tableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tables createtables() {
		tablesImpl tables = new tablesImpl();
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsPackage getRdbmsPackage() {
		return (RdbmsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RdbmsPackage getPackage() {
		return RdbmsPackage.eINSTANCE;
	}

} //RdbmsFactoryImpl
