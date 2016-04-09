/**
 */
package rdbms;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rdbms.RdbmsFactory
 * @model kind="package"
 * @generated
 */
public interface RdbmsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rdbms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "rdbms"; // no URI results in "" generated, but null is found in input instance

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rdbms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RdbmsPackage eINSTANCE = rdbms.impl.RdbmsPackageImpl.init();

	/**
	 * The meta object id for the '{@link rdbms.impl.columnImpl <em>column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.columnImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getcolumn()
	 * @generated
	 */
	int COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Referenced Keys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__REFERENCED_KEYS = 0;

	/**
	 * The feature id for the '<em><b>Has Foreign Keys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__HAS_FOREIGN_KEYS = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__KIND = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = 3;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__OID = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = 5;

	/**
	 * The number of structural features of the '<em>column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.columnsImpl <em>columns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.columnsImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getcolumns()
	 * @generated
	 */
	int COLUMNS = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS__COLUMN = 1;

	/**
	 * The number of structural features of the '<em>columns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>columns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMNS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.DocumentRootImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLUMNS = 4;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOREIGN_KEY = 5;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOREIGN_KEYS = 6;

	/**
	 * The feature id for the '<em><b>Has Foreign Keys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HAS_FOREIGN_KEYS = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEY = 8;

	/**
	 * The feature id for the '<em><b>Key2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEY2 = 9;

	/**
	 * The feature id for the '<em><b>OID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OID = 10;

	/**
	 * The feature id for the '<em><b>RDBMS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RDBMS = 11;

	/**
	 * The feature id for the '<em><b>Referenced Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REFERENCED_COLUMNS = 12;

	/**
	 * The feature id for the '<em><b>Referenced Keys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REFERENCED_KEYS = 13;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCHEMA = 14;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCHEMAS = 15;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE = 16;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLES = 17;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.foreignKeyImpl <em>foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.foreignKeyImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getforeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 3;

	/**
	 * The feature id for the '<em><b>Referenced Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__REFERENCED_COLUMNS = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__KIND = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__NAME = 2;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__OID = 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__OWNER = 4;

	/**
	 * The feature id for the '<em><b>Refers To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__REFERS_TO = 5;

	/**
	 * The number of structural features of the '<em>foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.foreignKeysImpl <em>foreign Keys</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.foreignKeysImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getforeignKeys()
	 * @generated
	 */
	int FOREIGN_KEYS = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEYS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Foreign Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEYS__FOREIGN_KEY = 1;

	/**
	 * The number of structural features of the '<em>foreign Keys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEYS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>foreign Keys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEYS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.hasForeignKeysImpl <em>has Foreign Keys</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.hasForeignKeysImpl
	 * @see rdbms.impl.RdbmsPackageImpl#gethasForeignKeys()
	 * @generated
	 */
	int HAS_FOREIGN_KEYS = 5;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_FOREIGN_KEYS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>OID</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_FOREIGN_KEYS__OID = 1;

	/**
	 * The number of structural features of the '<em>has Foreign Keys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_FOREIGN_KEYS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>has Foreign Keys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_FOREIGN_KEYS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.keyImpl <em>key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.keyImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getkey()
	 * @generated
	 */
	int KEY = 6;

	/**
	 * The feature id for the '<em><b>Referenced Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__REFERENCED_COLUMNS = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__KIND = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__NAME = 2;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY__OID = 3;

	/**
	 * The number of structural features of the '<em>key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.key2Impl <em>key2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.key2Impl
	 * @see rdbms.impl.RdbmsPackageImpl#getkey2()
	 * @generated
	 */
	int KEY2 = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY2__KEY = 0;

	/**
	 * The number of structural features of the '<em>key2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY2_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>key2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY2_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.oIDImpl <em>oID</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.oIDImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getoID()
	 * @generated
	 */
	int OID = 8;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID__OID = 0;

	/**
	 * The number of structural features of the '<em>oID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>oID</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.RDBMSImpl <em>RDBMS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.RDBMSImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getRDBMS()
	 * @generated
	 */
	int RDBMS = 9;

	/**
	 * The feature id for the '<em><b>Schemas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS__SCHEMAS = 0;

	/**
	 * The number of structural features of the '<em>RDBMS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>RDBMS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDBMS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.referencedColumnsImpl <em>referenced Columns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.referencedColumnsImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getreferencedColumns()
	 * @generated
	 */
	int REFERENCED_COLUMNS = 10;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_COLUMNS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>OID</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_COLUMNS__OID = 1;

	/**
	 * The number of structural features of the '<em>referenced Columns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_COLUMNS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>referenced Columns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_COLUMNS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.referencedKeysImpl <em>referenced Keys</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.referencedKeysImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getreferencedKeys()
	 * @generated
	 */
	int REFERENCED_KEYS = 11;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_KEYS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>OID</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_KEYS__OID = 1;

	/**
	 * The number of structural features of the '<em>referenced Keys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_KEYS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>referenced Keys</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_KEYS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.schemaImpl <em>schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.schemaImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getschema()
	 * @generated
	 */
	int SCHEMA = 12;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TABLES = 0;

	/**
	 * The feature id for the '<em><b>Foreign Keys</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__FOREIGN_KEYS = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__KIND = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = 3;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__OID = 4;

	/**
	 * The number of structural features of the '<em>schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.schemasImpl <em>schemas</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.schemasImpl
	 * @see rdbms.impl.RdbmsPackageImpl#getschemas()
	 * @generated
	 */
	int SCHEMAS = 13;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMAS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMAS__SCHEMA = 1;

	/**
	 * The number of structural features of the '<em>schemas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMAS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>schemas</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMAS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.tableImpl <em>table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.tableImpl
	 * @see rdbms.impl.RdbmsPackageImpl#gettable()
	 * @generated
	 */
	int TABLE = 14;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = 0;

	/**
	 * The feature id for the '<em><b>Key2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__KEY2 = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__KIND = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 3;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__OID = 4;

	/**
	 * The number of structural features of the '<em>table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rdbms.impl.tablesImpl <em>tables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rdbms.impl.tablesImpl
	 * @see rdbms.impl.RdbmsPackageImpl#gettables()
	 * @generated
	 */
	int TABLES = 15;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLES__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLES__TABLE = 1;

	/**
	 * The number of structural features of the '<em>tables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>tables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLES_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link rdbms.column <em>column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>column</em>'.
	 * @see rdbms.column
	 * @generated
	 */
	EClass getcolumn();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.column#getReferencedKeys <em>Referenced Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referenced Keys</em>'.
	 * @see rdbms.column#getReferencedKeys()
	 * @see #getcolumn()
	 * @generated
	 */
	EReference getcolumn_ReferencedKeys();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.column#getHasForeignKeys <em>Has Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Foreign Keys</em>'.
	 * @see rdbms.column#getHasForeignKeys()
	 * @see #getcolumn()
	 * @generated
	 */
	EReference getcolumn_HasForeignKeys();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.column#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see rdbms.column#getKind()
	 * @see #getcolumn()
	 * @generated
	 */
	EAttribute getcolumn_Kind();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.column#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rdbms.column#getName()
	 * @see #getcolumn()
	 * @generated
	 */
	EAttribute getcolumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.column#getOID <em>OID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OID</em>'.
	 * @see rdbms.column#getOID()
	 * @see #getcolumn()
	 * @generated
	 */
	EAttribute getcolumn_OID();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see rdbms.column#getType()
	 * @see #getcolumn()
	 * @generated
	 */
	EAttribute getcolumn_Type();

	/**
	 * Returns the meta object for class '{@link rdbms.columns <em>columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>columns</em>'.
	 * @see rdbms.columns
	 * @generated
	 */
	EClass getcolumns();

	/**
	 * Returns the meta object for the attribute list '{@link rdbms.columns#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see rdbms.columns#getGroup()
	 * @see #getcolumns()
	 * @generated
	 */
	EAttribute getcolumns_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link rdbms.columns#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see rdbms.columns#getColumn()
	 * @see #getcolumns()
	 * @generated
	 */
	EReference getcolumns_Column();

	/**
	 * Returns the meta object for class '{@link rdbms.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see rdbms.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link rdbms.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see rdbms.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link rdbms.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see rdbms.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link rdbms.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see rdbms.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.DocumentRoot#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column</em>'.
	 * @see rdbms.DocumentRoot#getColumn()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Column();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.DocumentRoot#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Columns</em>'.
	 * @see rdbms.DocumentRoot#getColumns()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Columns();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.DocumentRoot#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreign Key</em>'.
	 * @see rdbms.DocumentRoot#getForeignKey()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ForeignKey();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.DocumentRoot#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreign Keys</em>'.
	 * @see rdbms.DocumentRoot#getForeignKeys()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ForeignKeys();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.DocumentRoot#getHasForeignKeys <em>Has Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Foreign Keys</em>'.
	 * @see rdbms.DocumentRoot#getHasForeignKeys()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HasForeignKeys();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.DocumentRoot#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see rdbms.DocumentRoot#getKey()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Key();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.DocumentRoot#getKey2 <em>Key2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key2</em>'.
	 * @see rdbms.DocumentRoot#getKey2()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Key2();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.DocumentRoot#getOID <em>OID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>OID</em>'.
	 * @see rdbms.DocumentRoot#getOID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OID();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.DocumentRoot#getRDBMS <em>RDBMS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>RDBMS</em>'.
	 * @see rdbms.DocumentRoot#getRDBMS()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RDBMS();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.DocumentRoot#getReferencedColumns <em>Referenced Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referenced Columns</em>'.
	 * @see rdbms.DocumentRoot#getReferencedColumns()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReferencedColumns();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.DocumentRoot#getReferencedKeys <em>Referenced Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referenced Keys</em>'.
	 * @see rdbms.DocumentRoot#getReferencedKeys()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ReferencedKeys();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.DocumentRoot#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see rdbms.DocumentRoot#getSchema()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Schema();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.DocumentRoot#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schemas</em>'.
	 * @see rdbms.DocumentRoot#getSchemas()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Schemas();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.DocumentRoot#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table</em>'.
	 * @see rdbms.DocumentRoot#getTable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Table();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.DocumentRoot#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tables</em>'.
	 * @see rdbms.DocumentRoot#getTables()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Tables();

	/**
	 * Returns the meta object for class '{@link rdbms.foreignKey <em>foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>foreign Key</em>'.
	 * @see rdbms.foreignKey
	 * @generated
	 */
	EClass getforeignKey();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.foreignKey#getReferencedColumns <em>Referenced Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referenced Columns</em>'.
	 * @see rdbms.foreignKey#getReferencedColumns()
	 * @see #getforeignKey()
	 * @generated
	 */
	EReference getforeignKey_ReferencedColumns();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.foreignKey#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see rdbms.foreignKey#getKind()
	 * @see #getforeignKey()
	 * @generated
	 */
	EAttribute getforeignKey_Kind();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.foreignKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rdbms.foreignKey#getName()
	 * @see #getforeignKey()
	 * @generated
	 */
	EAttribute getforeignKey_Name();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.foreignKey#getOID <em>OID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OID</em>'.
	 * @see rdbms.foreignKey#getOID()
	 * @see #getforeignKey()
	 * @generated
	 */
	EAttribute getforeignKey_OID();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.foreignKey#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see rdbms.foreignKey#getOwner()
	 * @see #getforeignKey()
	 * @generated
	 */
	EAttribute getforeignKey_Owner();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.foreignKey#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refers To</em>'.
	 * @see rdbms.foreignKey#getRefersTo()
	 * @see #getforeignKey()
	 * @generated
	 */
	EAttribute getforeignKey_RefersTo();

	/**
	 * Returns the meta object for class '{@link rdbms.foreignKeys <em>foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>foreign Keys</em>'.
	 * @see rdbms.foreignKeys
	 * @generated
	 */
	EClass getforeignKeys();

	/**
	 * Returns the meta object for the attribute list '{@link rdbms.foreignKeys#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see rdbms.foreignKeys#getGroup()
	 * @see #getforeignKeys()
	 * @generated
	 */
	EAttribute getforeignKeys_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link rdbms.foreignKeys#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Foreign Key</em>'.
	 * @see rdbms.foreignKeys#getForeignKey()
	 * @see #getforeignKeys()
	 * @generated
	 */
	EReference getforeignKeys_ForeignKey();

	/**
	 * Returns the meta object for class '{@link rdbms.hasForeignKeys <em>has Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>has Foreign Keys</em>'.
	 * @see rdbms.hasForeignKeys
	 * @generated
	 */
	EClass gethasForeignKeys();

	/**
	 * Returns the meta object for the attribute list '{@link rdbms.hasForeignKeys#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see rdbms.hasForeignKeys#getGroup()
	 * @see #gethasForeignKeys()
	 * @generated
	 */
	EAttribute gethasForeignKeys_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link rdbms.hasForeignKeys#getOID <em>OID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>OID</em>'.
	 * @see rdbms.hasForeignKeys#getOID()
	 * @see #gethasForeignKeys()
	 * @generated
	 */
	EReference gethasForeignKeys_OID();

	/**
	 * Returns the meta object for class '{@link rdbms.key <em>key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>key</em>'.
	 * @see rdbms.key
	 * @generated
	 */
	EClass getkey();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.key#getReferencedColumns <em>Referenced Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Referenced Columns</em>'.
	 * @see rdbms.key#getReferencedColumns()
	 * @see #getkey()
	 * @generated
	 */
	EReference getkey_ReferencedColumns();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.key#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see rdbms.key#getKind()
	 * @see #getkey()
	 * @generated
	 */
	EAttribute getkey_Kind();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.key#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rdbms.key#getName()
	 * @see #getkey()
	 * @generated
	 */
	EAttribute getkey_Name();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.key#getOID <em>OID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OID</em>'.
	 * @see rdbms.key#getOID()
	 * @see #getkey()
	 * @generated
	 */
	EAttribute getkey_OID();

	/**
	 * Returns the meta object for class '{@link rdbms.key2 <em>key2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>key2</em>'.
	 * @see rdbms.key2
	 * @generated
	 */
	EClass getkey2();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.key2#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see rdbms.key2#getKey()
	 * @see #getkey2()
	 * @generated
	 */
	EReference getkey2_Key();

	/**
	 * Returns the meta object for class '{@link rdbms.oID <em>oID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>oID</em>'.
	 * @see rdbms.oID
	 * @generated
	 */
	EClass getoID();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.oID#getOID <em>OID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OID</em>'.
	 * @see rdbms.oID#getOID()
	 * @see #getoID()
	 * @generated
	 */
	EAttribute getoID_OID();

	/**
	 * Returns the meta object for class '{@link rdbms.RDBMS <em>RDBMS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RDBMS</em>'.
	 * @see rdbms.RDBMS
	 * @generated
	 */
	EClass getRDBMS();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.RDBMS#getSchemas <em>Schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schemas</em>'.
	 * @see rdbms.RDBMS#getSchemas()
	 * @see #getRDBMS()
	 * @generated
	 */
	EReference getRDBMS_Schemas();

	/**
	 * Returns the meta object for class '{@link rdbms.referencedColumns <em>referenced Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>referenced Columns</em>'.
	 * @see rdbms.referencedColumns
	 * @generated
	 */
	EClass getreferencedColumns();

	/**
	 * Returns the meta object for the attribute list '{@link rdbms.referencedColumns#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see rdbms.referencedColumns#getGroup()
	 * @see #getreferencedColumns()
	 * @generated
	 */
	EAttribute getreferencedColumns_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link rdbms.referencedColumns#getOID <em>OID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>OID</em>'.
	 * @see rdbms.referencedColumns#getOID()
	 * @see #getreferencedColumns()
	 * @generated
	 */
	EReference getreferencedColumns_OID();

	/**
	 * Returns the meta object for class '{@link rdbms.referencedKeys <em>referenced Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>referenced Keys</em>'.
	 * @see rdbms.referencedKeys
	 * @generated
	 */
	EClass getreferencedKeys();

	/**
	 * Returns the meta object for the attribute list '{@link rdbms.referencedKeys#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see rdbms.referencedKeys#getGroup()
	 * @see #getreferencedKeys()
	 * @generated
	 */
	EAttribute getreferencedKeys_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link rdbms.referencedKeys#getOID <em>OID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>OID</em>'.
	 * @see rdbms.referencedKeys#getOID()
	 * @see #getreferencedKeys()
	 * @generated
	 */
	EReference getreferencedKeys_OID();

	/**
	 * Returns the meta object for class '{@link rdbms.schema <em>schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>schema</em>'.
	 * @see rdbms.schema
	 * @generated
	 */
	EClass getschema();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.schema#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tables</em>'.
	 * @see rdbms.schema#getTables()
	 * @see #getschema()
	 * @generated
	 */
	EReference getschema_Tables();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.schema#getForeignKeys <em>Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Foreign Keys</em>'.
	 * @see rdbms.schema#getForeignKeys()
	 * @see #getschema()
	 * @generated
	 */
	EReference getschema_ForeignKeys();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.schema#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see rdbms.schema#getKind()
	 * @see #getschema()
	 * @generated
	 */
	EAttribute getschema_Kind();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.schema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rdbms.schema#getName()
	 * @see #getschema()
	 * @generated
	 */
	EAttribute getschema_Name();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.schema#getOID <em>OID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OID</em>'.
	 * @see rdbms.schema#getOID()
	 * @see #getschema()
	 * @generated
	 */
	EAttribute getschema_OID();

	/**
	 * Returns the meta object for class '{@link rdbms.schemas <em>schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>schemas</em>'.
	 * @see rdbms.schemas
	 * @generated
	 */
	EClass getschemas();

	/**
	 * Returns the meta object for the attribute list '{@link rdbms.schemas#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see rdbms.schemas#getGroup()
	 * @see #getschemas()
	 * @generated
	 */
	EAttribute getschemas_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link rdbms.schemas#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema</em>'.
	 * @see rdbms.schemas#getSchema()
	 * @see #getschemas()
	 * @generated
	 */
	EReference getschemas_Schema();

	/**
	 * Returns the meta object for class '{@link rdbms.table <em>table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>table</em>'.
	 * @see rdbms.table
	 * @generated
	 */
	EClass gettable();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Columns</em>'.
	 * @see rdbms.table#getColumns()
	 * @see #gettable()
	 * @generated
	 */
	EReference gettable_Columns();

	/**
	 * Returns the meta object for the containment reference '{@link rdbms.table#getKey2 <em>Key2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key2</em>'.
	 * @see rdbms.table#getKey2()
	 * @see #gettable()
	 * @generated
	 */
	EReference gettable_Key2();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.table#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see rdbms.table#getKind()
	 * @see #gettable()
	 * @generated
	 */
	EAttribute gettable_Kind();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rdbms.table#getName()
	 * @see #gettable()
	 * @generated
	 */
	EAttribute gettable_Name();

	/**
	 * Returns the meta object for the attribute '{@link rdbms.table#getOID <em>OID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OID</em>'.
	 * @see rdbms.table#getOID()
	 * @see #gettable()
	 * @generated
	 */
	EAttribute gettable_OID();

	/**
	 * Returns the meta object for class '{@link rdbms.tables <em>tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>tables</em>'.
	 * @see rdbms.tables
	 * @generated
	 */
	EClass gettables();

	/**
	 * Returns the meta object for the attribute list '{@link rdbms.tables#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see rdbms.tables#getGroup()
	 * @see #gettables()
	 * @generated
	 */
	EAttribute gettables_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link rdbms.tables#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see rdbms.tables#getTable()
	 * @see #gettables()
	 * @generated
	 */
	EReference gettables_Table();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RdbmsFactory getRdbmsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link rdbms.impl.columnImpl <em>column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.columnImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getcolumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getcolumn();

		/**
		 * The meta object literal for the '<em><b>Referenced Keys</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__REFERENCED_KEYS = eINSTANCE.getcolumn_ReferencedKeys();

		/**
		 * The meta object literal for the '<em><b>Has Foreign Keys</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__HAS_FOREIGN_KEYS = eINSTANCE.getcolumn_HasForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__KIND = eINSTANCE.getcolumn_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__NAME = eINSTANCE.getcolumn_Name();

		/**
		 * The meta object literal for the '<em><b>OID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__OID = eINSTANCE.getcolumn_OID();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TYPE = eINSTANCE.getcolumn_Type();

		/**
		 * The meta object literal for the '{@link rdbms.impl.columnsImpl <em>columns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.columnsImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getcolumns()
		 * @generated
		 */
		EClass COLUMNS = eINSTANCE.getcolumns();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMNS__GROUP = eINSTANCE.getcolumns_Group();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMNS__COLUMN = eINSTANCE.getcolumns_Column();

		/**
		 * The meta object literal for the '{@link rdbms.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.DocumentRootImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COLUMN = eINSTANCE.getDocumentRoot_Column();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COLUMNS = eINSTANCE.getDocumentRoot_Columns();

		/**
		 * The meta object literal for the '<em><b>Foreign Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FOREIGN_KEY = eINSTANCE.getDocumentRoot_ForeignKey();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FOREIGN_KEYS = eINSTANCE.getDocumentRoot_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Has Foreign Keys</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HAS_FOREIGN_KEYS = eINSTANCE.getDocumentRoot_HasForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KEY = eINSTANCE.getDocumentRoot_Key();

		/**
		 * The meta object literal for the '<em><b>Key2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KEY2 = eINSTANCE.getDocumentRoot_Key2();

		/**
		 * The meta object literal for the '<em><b>OID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OID = eINSTANCE.getDocumentRoot_OID();

		/**
		 * The meta object literal for the '<em><b>RDBMS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RDBMS = eINSTANCE.getDocumentRoot_RDBMS();

		/**
		 * The meta object literal for the '<em><b>Referenced Columns</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REFERENCED_COLUMNS = eINSTANCE.getDocumentRoot_ReferencedColumns();

		/**
		 * The meta object literal for the '<em><b>Referenced Keys</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__REFERENCED_KEYS = eINSTANCE.getDocumentRoot_ReferencedKeys();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCHEMA = eINSTANCE.getDocumentRoot_Schema();

		/**
		 * The meta object literal for the '<em><b>Schemas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCHEMAS = eINSTANCE.getDocumentRoot_Schemas();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TABLE = eINSTANCE.getDocumentRoot_Table();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TABLES = eINSTANCE.getDocumentRoot_Tables();

		/**
		 * The meta object literal for the '{@link rdbms.impl.foreignKeyImpl <em>foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.foreignKeyImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getforeignKey()
		 * @generated
		 */
		EClass FOREIGN_KEY = eINSTANCE.getforeignKey();

		/**
		 * The meta object literal for the '<em><b>Referenced Columns</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__REFERENCED_COLUMNS = eINSTANCE.getforeignKey_ReferencedColumns();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY__KIND = eINSTANCE.getforeignKey_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY__NAME = eINSTANCE.getforeignKey_Name();

		/**
		 * The meta object literal for the '<em><b>OID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY__OID = eINSTANCE.getforeignKey_OID();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY__OWNER = eINSTANCE.getforeignKey_Owner();

		/**
		 * The meta object literal for the '<em><b>Refers To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEY__REFERS_TO = eINSTANCE.getforeignKey_RefersTo();

		/**
		 * The meta object literal for the '{@link rdbms.impl.foreignKeysImpl <em>foreign Keys</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.foreignKeysImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getforeignKeys()
		 * @generated
		 */
		EClass FOREIGN_KEYS = eINSTANCE.getforeignKeys();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOREIGN_KEYS__GROUP = eINSTANCE.getforeignKeys_Group();

		/**
		 * The meta object literal for the '<em><b>Foreign Key</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEYS__FOREIGN_KEY = eINSTANCE.getforeignKeys_ForeignKey();

		/**
		 * The meta object literal for the '{@link rdbms.impl.hasForeignKeysImpl <em>has Foreign Keys</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.hasForeignKeysImpl
		 * @see rdbms.impl.RdbmsPackageImpl#gethasForeignKeys()
		 * @generated
		 */
		EClass HAS_FOREIGN_KEYS = eINSTANCE.gethasForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_FOREIGN_KEYS__GROUP = eINSTANCE.gethasForeignKeys_Group();

		/**
		 * The meta object literal for the '<em><b>OID</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAS_FOREIGN_KEYS__OID = eINSTANCE.gethasForeignKeys_OID();

		/**
		 * The meta object literal for the '{@link rdbms.impl.keyImpl <em>key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.keyImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getkey()
		 * @generated
		 */
		EClass KEY = eINSTANCE.getkey();

		/**
		 * The meta object literal for the '<em><b>Referenced Columns</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY__REFERENCED_COLUMNS = eINSTANCE.getkey_ReferencedColumns();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY__KIND = eINSTANCE.getkey_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY__NAME = eINSTANCE.getkey_Name();

		/**
		 * The meta object literal for the '<em><b>OID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY__OID = eINSTANCE.getkey_OID();

		/**
		 * The meta object literal for the '{@link rdbms.impl.key2Impl <em>key2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.key2Impl
		 * @see rdbms.impl.RdbmsPackageImpl#getkey2()
		 * @generated
		 */
		EClass KEY2 = eINSTANCE.getkey2();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY2__KEY = eINSTANCE.getkey2_Key();

		/**
		 * The meta object literal for the '{@link rdbms.impl.oIDImpl <em>oID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.oIDImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getoID()
		 * @generated
		 */
		EClass OID = eINSTANCE.getoID();

		/**
		 * The meta object literal for the '<em><b>OID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OID__OID = eINSTANCE.getoID_OID();

		/**
		 * The meta object literal for the '{@link rdbms.impl.RDBMSImpl <em>RDBMS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.RDBMSImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getRDBMS()
		 * @generated
		 */
		EClass RDBMS = eINSTANCE.getRDBMS();

		/**
		 * The meta object literal for the '<em><b>Schemas</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDBMS__SCHEMAS = eINSTANCE.getRDBMS_Schemas();

		/**
		 * The meta object literal for the '{@link rdbms.impl.referencedColumnsImpl <em>referenced Columns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.referencedColumnsImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getreferencedColumns()
		 * @generated
		 */
		EClass REFERENCED_COLUMNS = eINSTANCE.getreferencedColumns();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCED_COLUMNS__GROUP = eINSTANCE.getreferencedColumns_Group();

		/**
		 * The meta object literal for the '<em><b>OID</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCED_COLUMNS__OID = eINSTANCE.getreferencedColumns_OID();

		/**
		 * The meta object literal for the '{@link rdbms.impl.referencedKeysImpl <em>referenced Keys</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.referencedKeysImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getreferencedKeys()
		 * @generated
		 */
		EClass REFERENCED_KEYS = eINSTANCE.getreferencedKeys();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCED_KEYS__GROUP = eINSTANCE.getreferencedKeys_Group();

		/**
		 * The meta object literal for the '<em><b>OID</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCED_KEYS__OID = eINSTANCE.getreferencedKeys_OID();

		/**
		 * The meta object literal for the '{@link rdbms.impl.schemaImpl <em>schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.schemaImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getschema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getschema();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__TABLES = eINSTANCE.getschema_Tables();

		/**
		 * The meta object literal for the '<em><b>Foreign Keys</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__FOREIGN_KEYS = eINSTANCE.getschema_ForeignKeys();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__KIND = eINSTANCE.getschema_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__NAME = eINSTANCE.getschema_Name();

		/**
		 * The meta object literal for the '<em><b>OID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__OID = eINSTANCE.getschema_OID();

		/**
		 * The meta object literal for the '{@link rdbms.impl.schemasImpl <em>schemas</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.schemasImpl
		 * @see rdbms.impl.RdbmsPackageImpl#getschemas()
		 * @generated
		 */
		EClass SCHEMAS = eINSTANCE.getschemas();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMAS__GROUP = eINSTANCE.getschemas_Group();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMAS__SCHEMA = eINSTANCE.getschemas_Schema();

		/**
		 * The meta object literal for the '{@link rdbms.impl.tableImpl <em>table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.tableImpl
		 * @see rdbms.impl.RdbmsPackageImpl#gettable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.gettable();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.gettable_Columns();

		/**
		 * The meta object literal for the '<em><b>Key2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__KEY2 = eINSTANCE.gettable_Key2();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__KIND = eINSTANCE.gettable_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.gettable_Name();

		/**
		 * The meta object literal for the '<em><b>OID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__OID = eINSTANCE.gettable_OID();

		/**
		 * The meta object literal for the '{@link rdbms.impl.tablesImpl <em>tables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rdbms.impl.tablesImpl
		 * @see rdbms.impl.RdbmsPackageImpl#gettables()
		 * @generated
		 */
		EClass TABLES = eINSTANCE.gettables();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLES__GROUP = eINSTANCE.gettables_Group();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLES__TABLE = eINSTANCE.gettables_Table();

	}

} //RdbmsPackage
