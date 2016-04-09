/**
 */
package rdbms.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import rdbms.DocumentRoot;
import rdbms.RdbmsFactory;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdbmsPackageImpl extends EPackageImpl implements RdbmsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foreignKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foreignKeysEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasForeignKeysEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass key2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oIDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdbmsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencedColumnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencedKeysEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schemasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tablesEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see rdbms.RdbmsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RdbmsPackageImpl() {
		super(eNS_URI, RdbmsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RdbmsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RdbmsPackage init() {
		if (isInited) return (RdbmsPackage)EPackage.Registry.INSTANCE.getEPackage(RdbmsPackage.eNS_URI);

		// Obtain or create and register package
		RdbmsPackageImpl theRdbmsPackage = (RdbmsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RdbmsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RdbmsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRdbmsPackage.createPackageContents();

		// Initialize created meta-data
		theRdbmsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRdbmsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RdbmsPackage.eNS_URI, theRdbmsPackage);
		return theRdbmsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcolumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcolumn_ReferencedKeys() {
		return (EReference)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcolumn_HasForeignKeys() {
		return (EReference)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcolumn_Kind() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcolumn_Name() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcolumn_OID() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcolumn_Type() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcolumns() {
		return columnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcolumns_Group() {
		return (EAttribute)columnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcolumns_Column() {
		return (EReference)columnsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Column() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Columns() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ForeignKey() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ForeignKeys() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HasForeignKeys() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Key() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Key2() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OID() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RDBMS() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferencedColumns() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReferencedKeys() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Schema() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Schemas() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Table() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Tables() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getforeignKey() {
		return foreignKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getforeignKey_ReferencedColumns() {
		return (EReference)foreignKeyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getforeignKey_Kind() {
		return (EAttribute)foreignKeyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getforeignKey_Name() {
		return (EAttribute)foreignKeyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getforeignKey_OID() {
		return (EAttribute)foreignKeyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getforeignKey_Owner() {
		return (EAttribute)foreignKeyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getforeignKey_RefersTo() {
		return (EAttribute)foreignKeyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getforeignKeys() {
		return foreignKeysEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getforeignKeys_Group() {
		return (EAttribute)foreignKeysEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getforeignKeys_ForeignKey() {
		return (EReference)foreignKeysEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gethasForeignKeys() {
		return hasForeignKeysEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gethasForeignKeys_Group() {
		return (EAttribute)hasForeignKeysEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gethasForeignKeys_OID() {
		return (EReference)hasForeignKeysEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getkey() {
		return keyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getkey_ReferencedColumns() {
		return (EReference)keyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getkey_Kind() {
		return (EAttribute)keyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getkey_Name() {
		return (EAttribute)keyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getkey_OID() {
		return (EAttribute)keyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getkey2() {
		return key2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getkey2_Key() {
		return (EReference)key2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getoID() {
		return oIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getoID_OID() {
		return (EAttribute)oIDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRDBMS() {
		return rdbmsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRDBMS_Schemas() {
		return (EReference)rdbmsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getreferencedColumns() {
		return referencedColumnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getreferencedColumns_Group() {
		return (EAttribute)referencedColumnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getreferencedColumns_OID() {
		return (EReference)referencedColumnsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getreferencedKeys() {
		return referencedKeysEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getreferencedKeys_Group() {
		return (EAttribute)referencedKeysEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getreferencedKeys_OID() {
		return (EReference)referencedKeysEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getschema() {
		return schemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getschema_Tables() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getschema_ForeignKeys() {
		return (EReference)schemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getschema_Kind() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getschema_Name() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getschema_OID() {
		return (EAttribute)schemaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getschemas() {
		return schemasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getschemas_Group() {
		return (EAttribute)schemasEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getschemas_Schema() {
		return (EReference)schemasEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettable_Columns() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettable_Key2() {
		return (EReference)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettable_Kind() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettable_Name() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettable_OID() {
		return (EAttribute)tableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettables() {
		return tablesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettables_Group() {
		return (EAttribute)tablesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettables_Table() {
		return (EReference)tablesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsFactory getRdbmsFactory() {
		return (RdbmsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		columnEClass = createEClass(COLUMN);
		createEReference(columnEClass, COLUMN__REFERENCED_KEYS);
		createEReference(columnEClass, COLUMN__HAS_FOREIGN_KEYS);
		createEAttribute(columnEClass, COLUMN__KIND);
		createEAttribute(columnEClass, COLUMN__NAME);
		createEAttribute(columnEClass, COLUMN__OID);
		createEAttribute(columnEClass, COLUMN__TYPE);

		columnsEClass = createEClass(COLUMNS);
		createEAttribute(columnsEClass, COLUMNS__GROUP);
		createEReference(columnsEClass, COLUMNS__COLUMN);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COLUMN);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COLUMNS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FOREIGN_KEY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FOREIGN_KEYS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HAS_FOREIGN_KEYS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KEY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KEY2);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OID);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RDBMS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REFERENCED_COLUMNS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REFERENCED_KEYS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SCHEMA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SCHEMAS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TABLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TABLES);

		foreignKeyEClass = createEClass(FOREIGN_KEY);
		createEReference(foreignKeyEClass, FOREIGN_KEY__REFERENCED_COLUMNS);
		createEAttribute(foreignKeyEClass, FOREIGN_KEY__KIND);
		createEAttribute(foreignKeyEClass, FOREIGN_KEY__NAME);
		createEAttribute(foreignKeyEClass, FOREIGN_KEY__OID);
		createEAttribute(foreignKeyEClass, FOREIGN_KEY__OWNER);
		createEAttribute(foreignKeyEClass, FOREIGN_KEY__REFERS_TO);

		foreignKeysEClass = createEClass(FOREIGN_KEYS);
		createEAttribute(foreignKeysEClass, FOREIGN_KEYS__GROUP);
		createEReference(foreignKeysEClass, FOREIGN_KEYS__FOREIGN_KEY);

		hasForeignKeysEClass = createEClass(HAS_FOREIGN_KEYS);
		createEAttribute(hasForeignKeysEClass, HAS_FOREIGN_KEYS__GROUP);
		createEReference(hasForeignKeysEClass, HAS_FOREIGN_KEYS__OID);

		keyEClass = createEClass(KEY);
		createEReference(keyEClass, KEY__REFERENCED_COLUMNS);
		createEAttribute(keyEClass, KEY__KIND);
		createEAttribute(keyEClass, KEY__NAME);
		createEAttribute(keyEClass, KEY__OID);

		key2EClass = createEClass(KEY2);
		createEReference(key2EClass, KEY2__KEY);

		oIDEClass = createEClass(OID);
		createEAttribute(oIDEClass, OID__OID);

		rdbmsEClass = createEClass(RDBMS);
		createEReference(rdbmsEClass, RDBMS__SCHEMAS);

		referencedColumnsEClass = createEClass(REFERENCED_COLUMNS);
		createEAttribute(referencedColumnsEClass, REFERENCED_COLUMNS__GROUP);
		createEReference(referencedColumnsEClass, REFERENCED_COLUMNS__OID);

		referencedKeysEClass = createEClass(REFERENCED_KEYS);
		createEAttribute(referencedKeysEClass, REFERENCED_KEYS__GROUP);
		createEReference(referencedKeysEClass, REFERENCED_KEYS__OID);

		schemaEClass = createEClass(SCHEMA);
		createEReference(schemaEClass, SCHEMA__TABLES);
		createEReference(schemaEClass, SCHEMA__FOREIGN_KEYS);
		createEAttribute(schemaEClass, SCHEMA__KIND);
		createEAttribute(schemaEClass, SCHEMA__NAME);
		createEAttribute(schemaEClass, SCHEMA__OID);

		schemasEClass = createEClass(SCHEMAS);
		createEAttribute(schemasEClass, SCHEMAS__GROUP);
		createEReference(schemasEClass, SCHEMAS__SCHEMA);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__COLUMNS);
		createEReference(tableEClass, TABLE__KEY2);
		createEAttribute(tableEClass, TABLE__KIND);
		createEAttribute(tableEClass, TABLE__NAME);
		createEAttribute(tableEClass, TABLE__OID);

		tablesEClass = createEClass(TABLES);
		createEAttribute(tablesEClass, TABLES__GROUP);
		createEReference(tablesEClass, TABLES__TABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(columnEClass, column.class, "column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getcolumn_ReferencedKeys(), this.getreferencedKeys(), null, "referencedKeys", null, 1, 1, column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getcolumn_HasForeignKeys(), this.gethasForeignKeys(), null, "hasForeignKeys", null, 1, 1, column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getcolumn_Kind(), theXMLTypePackage.getString(), "kind", null, 1, 1, column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getcolumn_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getcolumn_OID(), theXMLTypePackage.getString(), "oID", null, 1, 1, column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getcolumn_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnsEClass, columns.class, "columns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getcolumns_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, columns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getcolumns_Column(), this.getcolumn(), null, "column", null, 0, -1, columns.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Column(), this.getcolumn(), null, "column", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Columns(), this.getcolumns(), null, "columns", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ForeignKey(), this.getforeignKey(), null, "foreignKey", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ForeignKeys(), this.getforeignKeys(), null, "foreignKeys", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HasForeignKeys(), this.gethasForeignKeys(), null, "hasForeignKeys", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Key(), this.getkey(), null, "key", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Key2(), this.getkey2(), null, "key2", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OID(), this.getoID(), null, "oID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RDBMS(), this.getRDBMS(), null, "rDBMS", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ReferencedColumns(), this.getreferencedColumns(), null, "referencedColumns", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ReferencedKeys(), this.getreferencedKeys(), null, "referencedKeys", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Schema(), this.getschema(), null, "schema", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Schemas(), this.getschemas(), null, "schemas", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Table(), this.gettable(), null, "table", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Tables(), this.gettables(), null, "tables", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(foreignKeyEClass, foreignKey.class, "foreignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getforeignKey_ReferencedColumns(), this.getreferencedColumns(), null, "referencedColumns", null, 1, 1, foreignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getforeignKey_Kind(), theXMLTypePackage.getString(), "kind", null, 1, 1, foreignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getforeignKey_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, foreignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getforeignKey_OID(), theXMLTypePackage.getString(), "oID", null, 1, 1, foreignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getforeignKey_Owner(), theXMLTypePackage.getString(), "owner", null, 1, 1, foreignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getforeignKey_RefersTo(), theXMLTypePackage.getString(), "refersTo", null, 1, 1, foreignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foreignKeysEClass, foreignKeys.class, "foreignKeys", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getforeignKeys_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, foreignKeys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getforeignKeys_ForeignKey(), this.getforeignKey(), null, "foreignKey", null, 0, -1, foreignKeys.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(hasForeignKeysEClass, hasForeignKeys.class, "hasForeignKeys", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(gethasForeignKeys_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, hasForeignKeys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gethasForeignKeys_OID(), this.getoID(), null, "oID", null, 0, -1, hasForeignKeys.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(keyEClass, key.class, "key", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getkey_ReferencedColumns(), this.getreferencedColumns(), null, "referencedColumns", null, 1, 1, key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getkey_Kind(), theXMLTypePackage.getString(), "kind", null, 1, 1, key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getkey_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getkey_OID(), theXMLTypePackage.getString(), "oID", null, 1, 1, key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(key2EClass, key2.class, "key2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getkey2_Key(), this.getkey(), null, "key", null, 0, 1, key2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oIDEClass, oID.class, "oID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getoID_OID(), theXMLTypePackage.getString(), "oID", null, 1, 1, oID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdbmsEClass, rdbms.RDBMS.class, "RDBMS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRDBMS_Schemas(), this.getschemas(), null, "schemas", null, 1, 1, rdbms.RDBMS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referencedColumnsEClass, referencedColumns.class, "referencedColumns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getreferencedColumns_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, referencedColumns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getreferencedColumns_OID(), this.getoID(), null, "oID", null, 0, -1, referencedColumns.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(referencedKeysEClass, referencedKeys.class, "referencedKeys", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getreferencedKeys_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, referencedKeys.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getreferencedKeys_OID(), this.getoID(), null, "oID", null, 0, -1, referencedKeys.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(schemaEClass, schema.class, "schema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getschema_Tables(), this.gettables(), null, "tables", null, 1, 1, schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getschema_ForeignKeys(), this.getforeignKeys(), null, "foreignKeys", null, 1, 1, schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getschema_Kind(), theXMLTypePackage.getString(), "kind", null, 1, 1, schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getschema_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getschema_OID(), theXMLTypePackage.getString(), "oID", null, 1, 1, schema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schemasEClass, schemas.class, "schemas", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getschemas_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, schemas.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getschemas_Schema(), this.getschema(), null, "schema", null, 0, -1, schemas.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, table.class, "table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(gettable_Columns(), this.getcolumns(), null, "columns", null, 1, 1, table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettable_Key2(), this.getkey2(), null, "key2", null, 1, 1, table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettable_Kind(), theXMLTypePackage.getString(), "kind", null, 1, 1, table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettable_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettable_OID(), theXMLTypePackage.getString(), "oID", null, 1, 1, table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tablesEClass, tables.class, "tables", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(gettables_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, tables.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettables_Table(), this.gettable(), null, "table", null, 0, -1, tables.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (columnEClass, 
		   source, 
		   new String[] {
			 "name", "column_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getcolumn_ReferencedKeys(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "referencedKeys",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getcolumn_HasForeignKeys(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hasForeignKeys",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getcolumn_Kind(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kind"
		   });	
		addAnnotation
		  (getcolumn_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getcolumn_OID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "oID"
		   });	
		addAnnotation
		  (getcolumn_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });	
		addAnnotation
		  (columnsEClass, 
		   source, 
		   new String[] {
			 "name", "columns_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getcolumns_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getcolumns_Column(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "column",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_Column(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "column",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Columns(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "columns",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_ForeignKey(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "foreignKey",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_ForeignKeys(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "foreignKeys",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_HasForeignKeys(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hasForeignKeys",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Key(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "key",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Key2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "key2",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_OID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "oID",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_RDBMS(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RDBMS",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_ReferencedColumns(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "referencedColumns",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_ReferencedKeys(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "referencedKeys",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Schema(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "schema",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Schemas(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "schemas",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Table(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "table",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Tables(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tables",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (foreignKeyEClass, 
		   source, 
		   new String[] {
			 "name", "foreignKey_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getforeignKey_ReferencedColumns(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "referencedColumns",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getforeignKey_Kind(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kind"
		   });	
		addAnnotation
		  (getforeignKey_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getforeignKey_OID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "oID"
		   });	
		addAnnotation
		  (getforeignKey_Owner(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "owner"
		   });	
		addAnnotation
		  (getforeignKey_RefersTo(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "refersTo"
		   });	
		addAnnotation
		  (foreignKeysEClass, 
		   source, 
		   new String[] {
			 "name", "foreignKeys_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getforeignKeys_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getforeignKeys_ForeignKey(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "foreignKey",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (hasForeignKeysEClass, 
		   source, 
		   new String[] {
			 "name", "hasForeignKeys_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (gethasForeignKeys_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (gethasForeignKeys_OID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "oID",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (keyEClass, 
		   source, 
		   new String[] {
			 "name", "key_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getkey_ReferencedColumns(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "referencedColumns",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getkey_Kind(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kind"
		   });	
		addAnnotation
		  (getkey_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getkey_OID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "oID"
		   });	
		addAnnotation
		  (key2EClass, 
		   source, 
		   new String[] {
			 "name", "key2_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getkey2_Key(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "key",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (oIDEClass, 
		   source, 
		   new String[] {
			 "name", "oID_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getoID_OID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "oID"
		   });	
		addAnnotation
		  (rdbmsEClass, 
		   source, 
		   new String[] {
			 "name", "RDBMS_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getRDBMS_Schemas(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "schemas",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (referencedColumnsEClass, 
		   source, 
		   new String[] {
			 "name", "referencedColumns_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getreferencedColumns_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getreferencedColumns_OID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "oID",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (referencedKeysEClass, 
		   source, 
		   new String[] {
			 "name", "referencedKeys_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getreferencedKeys_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getreferencedKeys_OID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "oID",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (schemaEClass, 
		   source, 
		   new String[] {
			 "name", "schema_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getschema_Tables(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tables",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getschema_ForeignKeys(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "foreignKeys",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getschema_Kind(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kind"
		   });	
		addAnnotation
		  (getschema_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getschema_OID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "oID"
		   });	
		addAnnotation
		  (schemasEClass, 
		   source, 
		   new String[] {
			 "name", "schemas_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getschemas_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getschemas_Schema(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "schema",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (tableEClass, 
		   source, 
		   new String[] {
			 "name", "table_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (gettable_Columns(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "columns",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (gettable_Key2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "key2",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (gettable_Kind(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kind"
		   });	
		addAnnotation
		  (gettable_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (gettable_OID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "oID"
		   });	
		addAnnotation
		  (tablesEClass, 
		   source, 
		   new String[] {
			 "name", "tables_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (gettables_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (gettables_Table(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "table",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });
	}

} //RdbmsPackageImpl
