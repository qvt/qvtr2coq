/**
 */
package uml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import uml.DocumentRoot;
import uml.UmlFactory;
import uml.UmlPackage;
import uml.association;
import uml.attribute;
import uml.attributes;
import uml.class_;
import uml.classifiersAndAssociations;
import uml.generalClass;
import uml.ownerClassifier;
import uml.package_;
import uml.packages;
import uml.primitiveDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlPackageImpl extends EPackageImpl implements UmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifiersAndAssociationsEClass = null;

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
	private EClass generalClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ownerClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass package_EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packagesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlEClass = null;

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
	 * @see uml.UmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UmlPackageImpl() {
		super(eNS_URI, UmlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UmlPackage init() {
		if (isInited) return (UmlPackage)EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI);

		// Obtain or create and register package
		UmlPackageImpl theUmlPackage = (UmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UmlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUmlPackage.createPackageContents();

		// Initialize created meta-data
		theUmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UmlPackage.eNS_URI, theUmlPackage);
		return theUmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getassociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getassociation_Destination() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getassociation_Kind() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getassociation_Name() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getassociation_OID() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getassociation_Source() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getattribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattribute_OwnerClassifier() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getattribute_Kind() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getattribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getattribute_OID() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getattributes() {
		return attributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getattributes_Group() {
		return (EAttribute)attributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getattributes_Attribute() {
		return (EReference)attributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getclass_() {
		return class_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getclass__GeneralClass() {
		return (EReference)class_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getclass__Attributes() {
		return (EReference)class_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getclass__Kind() {
		return (EAttribute)class_EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getclass__Name() {
		return (EAttribute)class_EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getclass__OID() {
		return (EAttribute)class_EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getclassifiersAndAssociations() {
		return classifiersAndAssociationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getclassifiersAndAssociations_Group() {
		return (EAttribute)classifiersAndAssociationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getclassifiersAndAssociations_Class() {
		return (EReference)classifiersAndAssociationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getclassifiersAndAssociations_PrimitiveDataType() {
		return (EReference)classifiersAndAssociationsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getclassifiersAndAssociations_Association() {
		return (EReference)classifiersAndAssociationsEClass.getEStructuralFeatures().get(3);
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
	public EReference getDocumentRoot_Association() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Attribute() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Attributes() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Class() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ClassifiersAndAssociations() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GeneralClass() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OwnerClassifier() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Package() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Packages() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PrimitiveDataType() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UML() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getgeneralClass() {
		return generalClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getgeneralClass_Class() {
		return (EReference)generalClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getownerClassifier() {
		return ownerClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getownerClassifier_Class() {
		return (EReference)ownerClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getownerClassifier_PrimitiveDataType() {
		return (EReference)ownerClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getpackage_() {
		return package_EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getpackage__ClassifiersAndAssociations() {
		return (EReference)package_EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getpackage__Kind() {
		return (EAttribute)package_EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getpackage__Name() {
		return (EAttribute)package_EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getpackage__OID() {
		return (EAttribute)package_EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getpackages() {
		return packagesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getpackages_Group() {
		return (EAttribute)packagesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getpackages_Package() {
		return (EReference)packagesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getprimitiveDataType() {
		return primitiveDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getprimitiveDataType_Kind() {
		return (EAttribute)primitiveDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getprimitiveDataType_Name() {
		return (EAttribute)primitiveDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getprimitiveDataType_OID() {
		return (EAttribute)primitiveDataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUML() {
		return umlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUML_Packages() {
		return (EReference)umlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlFactory getUmlFactory() {
		return (UmlFactory)getEFactoryInstance();
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
		associationEClass = createEClass(ASSOCIATION);
		createEAttribute(associationEClass, ASSOCIATION__DESTINATION);
		createEAttribute(associationEClass, ASSOCIATION__KIND);
		createEAttribute(associationEClass, ASSOCIATION__NAME);
		createEAttribute(associationEClass, ASSOCIATION__OID);
		createEAttribute(associationEClass, ASSOCIATION__SOURCE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEReference(attributeEClass, ATTRIBUTE__OWNER_CLASSIFIER);
		createEAttribute(attributeEClass, ATTRIBUTE__KIND);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEAttribute(attributeEClass, ATTRIBUTE__OID);

		attributesEClass = createEClass(ATTRIBUTES);
		createEAttribute(attributesEClass, ATTRIBUTES__GROUP);
		createEReference(attributesEClass, ATTRIBUTES__ATTRIBUTE);

		class_EClass = createEClass(CLASS_);
		createEReference(class_EClass, CLASS___GENERAL_CLASS);
		createEReference(class_EClass, CLASS___ATTRIBUTES);
		createEAttribute(class_EClass, CLASS___KIND);
		createEAttribute(class_EClass, CLASS___NAME);
		createEAttribute(class_EClass, CLASS___OID);

		classifiersAndAssociationsEClass = createEClass(CLASSIFIERS_AND_ASSOCIATIONS);
		createEAttribute(classifiersAndAssociationsEClass, CLASSIFIERS_AND_ASSOCIATIONS__GROUP);
		createEReference(classifiersAndAssociationsEClass, CLASSIFIERS_AND_ASSOCIATIONS__CLASS);
		createEReference(classifiersAndAssociationsEClass, CLASSIFIERS_AND_ASSOCIATIONS__PRIMITIVE_DATA_TYPE);
		createEReference(classifiersAndAssociationsEClass, CLASSIFIERS_AND_ASSOCIATIONS__ASSOCIATION);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ASSOCIATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ATTRIBUTE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ATTRIBUTES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLASS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CLASSIFIERS_AND_ASSOCIATIONS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__GENERAL_CLASS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OWNER_CLASSIFIER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PACKAGE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PACKAGES);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PRIMITIVE_DATA_TYPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__UML);

		generalClassEClass = createEClass(GENERAL_CLASS);
		createEReference(generalClassEClass, GENERAL_CLASS__CLASS);

		ownerClassifierEClass = createEClass(OWNER_CLASSIFIER);
		createEReference(ownerClassifierEClass, OWNER_CLASSIFIER__CLASS);
		createEReference(ownerClassifierEClass, OWNER_CLASSIFIER__PRIMITIVE_DATA_TYPE);

		package_EClass = createEClass(PACKAGE_);
		createEReference(package_EClass, PACKAGE___CLASSIFIERS_AND_ASSOCIATIONS);
		createEAttribute(package_EClass, PACKAGE___KIND);
		createEAttribute(package_EClass, PACKAGE___NAME);
		createEAttribute(package_EClass, PACKAGE___OID);

		packagesEClass = createEClass(PACKAGES);
		createEAttribute(packagesEClass, PACKAGES__GROUP);
		createEReference(packagesEClass, PACKAGES__PACKAGE);

		primitiveDataTypeEClass = createEClass(PRIMITIVE_DATA_TYPE);
		createEAttribute(primitiveDataTypeEClass, PRIMITIVE_DATA_TYPE__KIND);
		createEAttribute(primitiveDataTypeEClass, PRIMITIVE_DATA_TYPE__NAME);
		createEAttribute(primitiveDataTypeEClass, PRIMITIVE_DATA_TYPE__OID);

		umlEClass = createEClass(UML);
		createEReference(umlEClass, UML__PACKAGES);
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
		initEClass(associationEClass, association.class, "association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getassociation_Destination(), theXMLTypePackage.getString(), "destination", null, 1, 1, association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getassociation_Kind(), theXMLTypePackage.getString(), "kind", null, 1, 1, association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getassociation_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getassociation_OID(), theXMLTypePackage.getString(), "oID", null, 1, 1, association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getassociation_Source(), theXMLTypePackage.getString(), "source", null, 1, 1, association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, attribute.class, "attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getattribute_OwnerClassifier(), this.getownerClassifier(), null, "ownerClassifier", null, 1, 1, attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getattribute_Kind(), theXMLTypePackage.getString(), "kind", null, 1, 1, attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getattribute_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getattribute_OID(), theXMLTypePackage.getString(), "oID", null, 1, 1, attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributesEClass, attributes.class, "attributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getattributes_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, attributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getattributes_Attribute(), this.getattribute(), null, "attribute", null, 0, -1, attributes.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(class_EClass, class_.class, "class_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getclass__GeneralClass(), this.getgeneralClass(), null, "generalClass", null, 1, 1, class_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getclass__Attributes(), this.getattributes(), null, "attributes", null, 1, 1, class_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getclass__Kind(), theXMLTypePackage.getString(), "kind", null, 1, 1, class_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getclass__Name(), theXMLTypePackage.getString(), "name", null, 1, 1, class_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getclass__OID(), theXMLTypePackage.getString(), "oID", null, 1, 1, class_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classifiersAndAssociationsEClass, classifiersAndAssociations.class, "classifiersAndAssociations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getclassifiersAndAssociations_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, classifiersAndAssociations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getclassifiersAndAssociations_Class(), this.getclass_(), null, "class", null, 0, -1, classifiersAndAssociations.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getclassifiersAndAssociations_PrimitiveDataType(), this.getprimitiveDataType(), null, "primitiveDataType", null, 0, -1, classifiersAndAssociations.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getclassifiersAndAssociations_Association(), this.getassociation(), null, "association", null, 0, -1, classifiersAndAssociations.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Association(), this.getassociation(), null, "association", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Attribute(), this.getattribute(), null, "attribute", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Attributes(), this.getattributes(), null, "attributes", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Class(), this.getclass_(), null, "class", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ClassifiersAndAssociations(), this.getclassifiersAndAssociations(), null, "classifiersAndAssociations", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_GeneralClass(), this.getgeneralClass(), null, "generalClass", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_OwnerClassifier(), this.getownerClassifier(), null, "ownerClassifier", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Package(), this.getpackage_(), null, "package", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Packages(), this.getpackages(), null, "packages", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PrimitiveDataType(), this.getprimitiveDataType(), null, "primitiveDataType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_UML(), this.getUML(), null, "uML", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(generalClassEClass, generalClass.class, "generalClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getgeneralClass_Class(), this.getclass_(), null, "class", null, 0, 1, generalClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ownerClassifierEClass, ownerClassifier.class, "ownerClassifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getownerClassifier_Class(), this.getclass_(), null, "class", null, 0, 1, ownerClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getownerClassifier_PrimitiveDataType(), this.getprimitiveDataType(), null, "primitiveDataType", null, 0, 1, ownerClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(package_EClass, package_.class, "package_", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getpackage__ClassifiersAndAssociations(), this.getclassifiersAndAssociations(), null, "classifiersAndAssociations", null, 1, 1, package_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getpackage__Kind(), theXMLTypePackage.getString(), "kind", null, 1, 1, package_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getpackage__Name(), theXMLTypePackage.getString(), "name", null, 1, 1, package_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getpackage__OID(), theXMLTypePackage.getString(), "oID", null, 1, 1, package_.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packagesEClass, packages.class, "packages", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getpackages_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, packages.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getpackages_Package(), this.getpackage_(), null, "package", null, 0, -1, packages.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(primitiveDataTypeEClass, primitiveDataType.class, "primitiveDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getprimitiveDataType_Kind(), theXMLTypePackage.getString(), "kind", null, 1, 1, primitiveDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getprimitiveDataType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, primitiveDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getprimitiveDataType_OID(), theXMLTypePackage.getString(), "oID", null, 1, 1, primitiveDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlEClass, uml.UML.class, "UML", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUML_Packages(), this.getpackages(), null, "packages", null, 1, 1, uml.UML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (associationEClass, 
		   source, 
		   new String[] {
			 "name", "association_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getassociation_Destination(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "destination"
		   });	
		addAnnotation
		  (getassociation_Kind(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kind"
		   });	
		addAnnotation
		  (getassociation_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getassociation_OID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "oID"
		   });	
		addAnnotation
		  (getassociation_Source(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "source"
		   });	
		addAnnotation
		  (attributeEClass, 
		   source, 
		   new String[] {
			 "name", "attribute_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getattribute_OwnerClassifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ownerClassifier",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getattribute_Kind(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kind"
		   });	
		addAnnotation
		  (getattribute_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getattribute_OID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "oID"
		   });	
		addAnnotation
		  (attributesEClass, 
		   source, 
		   new String[] {
			 "name", "attributes_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getattributes_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getattributes_Attribute(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "attribute",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (class_EClass, 
		   source, 
		   new String[] {
			 "name", "class__._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getclass__GeneralClass(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "generalClass",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getclass__Attributes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "attributes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getclass__Kind(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kind"
		   });	
		addAnnotation
		  (getclass__Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getclass__OID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "oID"
		   });	
		addAnnotation
		  (classifiersAndAssociationsEClass, 
		   source, 
		   new String[] {
			 "name", "classifiersAndAssociations_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getclassifiersAndAssociations_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getclassifiersAndAssociations_Class(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "class_",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getclassifiersAndAssociations_PrimitiveDataType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "primitiveDataType",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getclassifiersAndAssociations_Association(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "association",
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
		  (getDocumentRoot_Association(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "association",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Attribute(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "attribute",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Attributes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "attributes",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Class(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "class_",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_ClassifiersAndAssociations(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "classifiersAndAssociations",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_GeneralClass(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "generalClass",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_OwnerClassifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ownerClassifier",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Package(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "package_",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_Packages(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "packages",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_PrimitiveDataType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "primitiveDataType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getDocumentRoot_UML(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UML",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (generalClassEClass, 
		   source, 
		   new String[] {
			 "name", "generalClass_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getgeneralClass_Class(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "class_",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (ownerClassifierEClass, 
		   source, 
		   new String[] {
			 "name", "ownerClassifier_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getownerClassifier_Class(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "class_",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getownerClassifier_PrimitiveDataType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "primitiveDataType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (package_EClass, 
		   source, 
		   new String[] {
			 "name", "package__._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getpackage__ClassifiersAndAssociations(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "classifiersAndAssociations",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getpackage__Kind(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kind"
		   });	
		addAnnotation
		  (getpackage__Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getpackage__OID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "oID"
		   });	
		addAnnotation
		  (packagesEClass, 
		   source, 
		   new String[] {
			 "name", "packages_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getpackages_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getpackages_Package(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "package_",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (primitiveDataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "primitiveDataType_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getprimitiveDataType_Kind(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kind"
		   });	
		addAnnotation
		  (getprimitiveDataType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getprimitiveDataType_OID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "oID"
		   });	
		addAnnotation
		  (umlEClass, 
		   source, 
		   new String[] {
			 "name", "UML_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getUML_Packages(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "packages",
			 "namespace", "##targetNamespace"
		   });
	}

} //UmlPackageImpl
