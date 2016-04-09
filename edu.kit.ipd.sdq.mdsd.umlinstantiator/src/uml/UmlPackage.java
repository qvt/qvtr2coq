/**
 */
package uml;

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
 * @see uml.UmlFactory
 * @model kind="package"
 * @generated
 */
public interface UmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "uml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UmlPackage eINSTANCE = uml.impl.UmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link uml.impl.associationImpl <em>association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.impl.associationImpl
	 * @see uml.impl.UmlPackageImpl#getassociation()
	 * @generated
	 */
	int ASSOCIATION = 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__DESTINATION = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__KIND = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = 2;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__OID = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = 4;

	/**
	 * The number of structural features of the '<em>association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml.impl.attributeImpl <em>attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.impl.attributeImpl
	 * @see uml.impl.UmlPackageImpl#getattribute()
	 * @generated
	 */
	int ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Owner Classifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__OWNER_CLASSIFIER = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__KIND = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 2;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__OID = 3;

	/**
	 * The number of structural features of the '<em>attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml.impl.attributesImpl <em>attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.impl.attributesImpl
	 * @see uml.impl.UmlPackageImpl#getattributes()
	 * @generated
	 */
	int ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml.impl.class_Impl <em>class </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.impl.class_Impl
	 * @see uml.impl.UmlPackageImpl#getclass_()
	 * @generated
	 */
	int CLASS_ = 3;

	/**
	 * The feature id for the '<em><b>General Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___GENERAL_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___KIND = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___NAME = 3;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS___OID = 4;

	/**
	 * The number of structural features of the '<em>class </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>class </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml.impl.classifiersAndAssociationsImpl <em>classifiers And Associations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.impl.classifiersAndAssociationsImpl
	 * @see uml.impl.UmlPackageImpl#getclassifiersAndAssociations()
	 * @generated
	 */
	int CLASSIFIERS_AND_ASSOCIATIONS = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIERS_AND_ASSOCIATIONS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIERS_AND_ASSOCIATIONS__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Primitive Data Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIERS_AND_ASSOCIATIONS__PRIMITIVE_DATA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIERS_AND_ASSOCIATIONS__ASSOCIATION = 3;

	/**
	 * The number of structural features of the '<em>classifiers And Associations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIERS_AND_ASSOCIATIONS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>classifiers And Associations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIERS_AND_ASSOCIATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.impl.DocumentRootImpl
	 * @see uml.impl.UmlPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 5;

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
	 * The feature id for the '<em><b>Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ASSOCIATION = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ATTRIBUTES = 5;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASS = 6;

	/**
	 * The feature id for the '<em><b>Classifiers And Associations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASSIFIERS_AND_ASSOCIATIONS = 7;

	/**
	 * The feature id for the '<em><b>General Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GENERAL_CLASS = 8;

	/**
	 * The feature id for the '<em><b>Owner Classifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OWNER_CLASSIFIER = 9;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PACKAGE = 10;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PACKAGES = 11;

	/**
	 * The feature id for the '<em><b>Primitive Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRIMITIVE_DATA_TYPE = 12;

	/**
	 * The feature id for the '<em><b>UML</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UML = 13;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml.impl.generalClassImpl <em>general Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.impl.generalClassImpl
	 * @see uml.impl.UmlPackageImpl#getgeneralClass()
	 * @generated
	 */
	int GENERAL_CLASS = 6;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_CLASS__CLASS = 0;

	/**
	 * The number of structural features of the '<em>general Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_CLASS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>general Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml.impl.ownerClassifierImpl <em>owner Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.impl.ownerClassifierImpl
	 * @see uml.impl.UmlPackageImpl#getownerClassifier()
	 * @generated
	 */
	int OWNER_CLASSIFIER = 7;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_CLASSIFIER__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Primitive Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_CLASSIFIER__PRIMITIVE_DATA_TYPE = 1;

	/**
	 * The number of structural features of the '<em>owner Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_CLASSIFIER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>owner Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_CLASSIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml.impl.package_Impl <em>package </em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.impl.package_Impl
	 * @see uml.impl.UmlPackageImpl#getpackage_()
	 * @generated
	 */
	int PACKAGE_ = 8;

	/**
	 * The feature id for the '<em><b>Classifiers And Associations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___CLASSIFIERS_AND_ASSOCIATIONS = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___KIND = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___NAME = 2;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE___OID = 3;

	/**
	 * The number of structural features of the '<em>package </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>package </em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml.impl.packagesImpl <em>packages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.impl.packagesImpl
	 * @see uml.impl.UmlPackageImpl#getpackages()
	 * @generated
	 */
	int PACKAGES = 9;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGES__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGES__PACKAGE = 1;

	/**
	 * The number of structural features of the '<em>packages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>packages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml.impl.primitiveDataTypeImpl <em>primitive Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.impl.primitiveDataTypeImpl
	 * @see uml.impl.UmlPackageImpl#getprimitiveDataType()
	 * @generated
	 */
	int PRIMITIVE_DATA_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__KIND = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE__OID = 2;

	/**
	 * The number of structural features of the '<em>primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link uml.impl.UMLImpl <em>UML</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uml.impl.UMLImpl
	 * @see uml.impl.UmlPackageImpl#getUML()
	 * @generated
	 */
	int UML = 11;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML__PACKAGES = 0;

	/**
	 * The number of structural features of the '<em>UML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>UML</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link uml.association <em>association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>association</em>'.
	 * @see uml.association
	 * @generated
	 */
	EClass getassociation();

	/**
	 * Returns the meta object for the attribute '{@link uml.association#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see uml.association#getDestination()
	 * @see #getassociation()
	 * @generated
	 */
	EAttribute getassociation_Destination();

	/**
	 * Returns the meta object for the attribute '{@link uml.association#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see uml.association#getKind()
	 * @see #getassociation()
	 * @generated
	 */
	EAttribute getassociation_Kind();

	/**
	 * Returns the meta object for the attribute '{@link uml.association#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uml.association#getName()
	 * @see #getassociation()
	 * @generated
	 */
	EAttribute getassociation_Name();

	/**
	 * Returns the meta object for the attribute '{@link uml.association#getOID <em>OID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OID</em>'.
	 * @see uml.association#getOID()
	 * @see #getassociation()
	 * @generated
	 */
	EAttribute getassociation_OID();

	/**
	 * Returns the meta object for the attribute '{@link uml.association#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see uml.association#getSource()
	 * @see #getassociation()
	 * @generated
	 */
	EAttribute getassociation_Source();

	/**
	 * Returns the meta object for class '{@link uml.attribute <em>attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attribute</em>'.
	 * @see uml.attribute
	 * @generated
	 */
	EClass getattribute();

	/**
	 * Returns the meta object for the containment reference '{@link uml.attribute#getOwnerClassifier <em>Owner Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owner Classifier</em>'.
	 * @see uml.attribute#getOwnerClassifier()
	 * @see #getattribute()
	 * @generated
	 */
	EReference getattribute_OwnerClassifier();

	/**
	 * Returns the meta object for the attribute '{@link uml.attribute#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see uml.attribute#getKind()
	 * @see #getattribute()
	 * @generated
	 */
	EAttribute getattribute_Kind();

	/**
	 * Returns the meta object for the attribute '{@link uml.attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uml.attribute#getName()
	 * @see #getattribute()
	 * @generated
	 */
	EAttribute getattribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link uml.attribute#getOID <em>OID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OID</em>'.
	 * @see uml.attribute#getOID()
	 * @see #getattribute()
	 * @generated
	 */
	EAttribute getattribute_OID();

	/**
	 * Returns the meta object for class '{@link uml.attributes <em>attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>attributes</em>'.
	 * @see uml.attributes
	 * @generated
	 */
	EClass getattributes();

	/**
	 * Returns the meta object for the attribute list '{@link uml.attributes#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see uml.attributes#getGroup()
	 * @see #getattributes()
	 * @generated
	 */
	EAttribute getattributes_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.attributes#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see uml.attributes#getAttribute()
	 * @see #getattributes()
	 * @generated
	 */
	EReference getattributes_Attribute();

	/**
	 * Returns the meta object for class '{@link uml.class_ <em>class </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>class </em>'.
	 * @see uml.class_
	 * @generated
	 */
	EClass getclass_();

	/**
	 * Returns the meta object for the containment reference '{@link uml.class_#getGeneralClass <em>General Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General Class</em>'.
	 * @see uml.class_#getGeneralClass()
	 * @see #getclass_()
	 * @generated
	 */
	EReference getclass__GeneralClass();

	/**
	 * Returns the meta object for the containment reference '{@link uml.class_#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see uml.class_#getAttributes()
	 * @see #getclass_()
	 * @generated
	 */
	EReference getclass__Attributes();

	/**
	 * Returns the meta object for the attribute '{@link uml.class_#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see uml.class_#getKind()
	 * @see #getclass_()
	 * @generated
	 */
	EAttribute getclass__Kind();

	/**
	 * Returns the meta object for the attribute '{@link uml.class_#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uml.class_#getName()
	 * @see #getclass_()
	 * @generated
	 */
	EAttribute getclass__Name();

	/**
	 * Returns the meta object for the attribute '{@link uml.class_#getOID <em>OID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OID</em>'.
	 * @see uml.class_#getOID()
	 * @see #getclass_()
	 * @generated
	 */
	EAttribute getclass__OID();

	/**
	 * Returns the meta object for class '{@link uml.classifiersAndAssociations <em>classifiers And Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>classifiers And Associations</em>'.
	 * @see uml.classifiersAndAssociations
	 * @generated
	 */
	EClass getclassifiersAndAssociations();

	/**
	 * Returns the meta object for the attribute list '{@link uml.classifiersAndAssociations#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see uml.classifiersAndAssociations#getGroup()
	 * @see #getclassifiersAndAssociations()
	 * @generated
	 */
	EAttribute getclassifiersAndAssociations_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.classifiersAndAssociations#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see uml.classifiersAndAssociations#getClass_()
	 * @see #getclassifiersAndAssociations()
	 * @generated
	 */
	EReference getclassifiersAndAssociations_Class();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.classifiersAndAssociations#getPrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primitive Data Type</em>'.
	 * @see uml.classifiersAndAssociations#getPrimitiveDataType()
	 * @see #getclassifiersAndAssociations()
	 * @generated
	 */
	EReference getclassifiersAndAssociations_PrimitiveDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.classifiersAndAssociations#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association</em>'.
	 * @see uml.classifiersAndAssociations#getAssociation()
	 * @see #getclassifiersAndAssociations()
	 * @generated
	 */
	EReference getclassifiersAndAssociations_Association();

	/**
	 * Returns the meta object for class '{@link uml.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see uml.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link uml.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see uml.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link uml.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see uml.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link uml.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see uml.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link uml.DocumentRoot#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Association</em>'.
	 * @see uml.DocumentRoot#getAssociation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Association();

	/**
	 * Returns the meta object for the containment reference '{@link uml.DocumentRoot#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute</em>'.
	 * @see uml.DocumentRoot#getAttribute()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Attribute();

	/**
	 * Returns the meta object for the containment reference '{@link uml.DocumentRoot#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see uml.DocumentRoot#getAttributes()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Attributes();

	/**
	 * Returns the meta object for the containment reference '{@link uml.DocumentRoot#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class</em>'.
	 * @see uml.DocumentRoot#getClass_()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Class();

	/**
	 * Returns the meta object for the containment reference '{@link uml.DocumentRoot#getClassifiersAndAssociations <em>Classifiers And Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classifiers And Associations</em>'.
	 * @see uml.DocumentRoot#getClassifiersAndAssociations()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ClassifiersAndAssociations();

	/**
	 * Returns the meta object for the containment reference '{@link uml.DocumentRoot#getGeneralClass <em>General Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>General Class</em>'.
	 * @see uml.DocumentRoot#getGeneralClass()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GeneralClass();

	/**
	 * Returns the meta object for the containment reference '{@link uml.DocumentRoot#getOwnerClassifier <em>Owner Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owner Classifier</em>'.
	 * @see uml.DocumentRoot#getOwnerClassifier()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OwnerClassifier();

	/**
	 * Returns the meta object for the containment reference '{@link uml.DocumentRoot#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Package</em>'.
	 * @see uml.DocumentRoot#getPackage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Package();

	/**
	 * Returns the meta object for the containment reference '{@link uml.DocumentRoot#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Packages</em>'.
	 * @see uml.DocumentRoot#getPackages()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Packages();

	/**
	 * Returns the meta object for the containment reference '{@link uml.DocumentRoot#getPrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primitive Data Type</em>'.
	 * @see uml.DocumentRoot#getPrimitiveDataType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PrimitiveDataType();

	/**
	 * Returns the meta object for the containment reference '{@link uml.DocumentRoot#getUML <em>UML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>UML</em>'.
	 * @see uml.DocumentRoot#getUML()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UML();

	/**
	 * Returns the meta object for class '{@link uml.generalClass <em>general Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>general Class</em>'.
	 * @see uml.generalClass
	 * @generated
	 */
	EClass getgeneralClass();

	/**
	 * Returns the meta object for the containment reference '{@link uml.generalClass#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class</em>'.
	 * @see uml.generalClass#getClass_()
	 * @see #getgeneralClass()
	 * @generated
	 */
	EReference getgeneralClass_Class();

	/**
	 * Returns the meta object for class '{@link uml.ownerClassifier <em>owner Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>owner Classifier</em>'.
	 * @see uml.ownerClassifier
	 * @generated
	 */
	EClass getownerClassifier();

	/**
	 * Returns the meta object for the containment reference '{@link uml.ownerClassifier#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class</em>'.
	 * @see uml.ownerClassifier#getClass_()
	 * @see #getownerClassifier()
	 * @generated
	 */
	EReference getownerClassifier_Class();

	/**
	 * Returns the meta object for the containment reference '{@link uml.ownerClassifier#getPrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primitive Data Type</em>'.
	 * @see uml.ownerClassifier#getPrimitiveDataType()
	 * @see #getownerClassifier()
	 * @generated
	 */
	EReference getownerClassifier_PrimitiveDataType();

	/**
	 * Returns the meta object for class '{@link uml.package_ <em>package </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>package </em>'.
	 * @see uml.package_
	 * @generated
	 */
	EClass getpackage_();

	/**
	 * Returns the meta object for the containment reference '{@link uml.package_#getClassifiersAndAssociations <em>Classifiers And Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classifiers And Associations</em>'.
	 * @see uml.package_#getClassifiersAndAssociations()
	 * @see #getpackage_()
	 * @generated
	 */
	EReference getpackage__ClassifiersAndAssociations();

	/**
	 * Returns the meta object for the attribute '{@link uml.package_#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see uml.package_#getKind()
	 * @see #getpackage_()
	 * @generated
	 */
	EAttribute getpackage__Kind();

	/**
	 * Returns the meta object for the attribute '{@link uml.package_#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uml.package_#getName()
	 * @see #getpackage_()
	 * @generated
	 */
	EAttribute getpackage__Name();

	/**
	 * Returns the meta object for the attribute '{@link uml.package_#getOID <em>OID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OID</em>'.
	 * @see uml.package_#getOID()
	 * @see #getpackage_()
	 * @generated
	 */
	EAttribute getpackage__OID();

	/**
	 * Returns the meta object for class '{@link uml.packages <em>packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>packages</em>'.
	 * @see uml.packages
	 * @generated
	 */
	EClass getpackages();

	/**
	 * Returns the meta object for the attribute list '{@link uml.packages#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see uml.packages#getGroup()
	 * @see #getpackages()
	 * @generated
	 */
	EAttribute getpackages_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link uml.packages#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package</em>'.
	 * @see uml.packages#getPackage()
	 * @see #getpackages()
	 * @generated
	 */
	EReference getpackages_Package();

	/**
	 * Returns the meta object for class '{@link uml.primitiveDataType <em>primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>primitive Data Type</em>'.
	 * @see uml.primitiveDataType
	 * @generated
	 */
	EClass getprimitiveDataType();

	/**
	 * Returns the meta object for the attribute '{@link uml.primitiveDataType#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see uml.primitiveDataType#getKind()
	 * @see #getprimitiveDataType()
	 * @generated
	 */
	EAttribute getprimitiveDataType_Kind();

	/**
	 * Returns the meta object for the attribute '{@link uml.primitiveDataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uml.primitiveDataType#getName()
	 * @see #getprimitiveDataType()
	 * @generated
	 */
	EAttribute getprimitiveDataType_Name();

	/**
	 * Returns the meta object for the attribute '{@link uml.primitiveDataType#getOID <em>OID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>OID</em>'.
	 * @see uml.primitiveDataType#getOID()
	 * @see #getprimitiveDataType()
	 * @generated
	 */
	EAttribute getprimitiveDataType_OID();

	/**
	 * Returns the meta object for class '{@link uml.UML <em>UML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML</em>'.
	 * @see uml.UML
	 * @generated
	 */
	EClass getUML();

	/**
	 * Returns the meta object for the containment reference '{@link uml.UML#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Packages</em>'.
	 * @see uml.UML#getPackages()
	 * @see #getUML()
	 * @generated
	 */
	EReference getUML_Packages();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UmlFactory getUmlFactory();

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
		 * The meta object literal for the '{@link uml.impl.associationImpl <em>association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.impl.associationImpl
		 * @see uml.impl.UmlPackageImpl#getassociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getassociation();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__DESTINATION = eINSTANCE.getassociation_Destination();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__KIND = eINSTANCE.getassociation_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__NAME = eINSTANCE.getassociation_Name();

		/**
		 * The meta object literal for the '<em><b>OID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__OID = eINSTANCE.getassociation_OID();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__SOURCE = eINSTANCE.getassociation_Source();

		/**
		 * The meta object literal for the '{@link uml.impl.attributeImpl <em>attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.impl.attributeImpl
		 * @see uml.impl.UmlPackageImpl#getattribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getattribute();

		/**
		 * The meta object literal for the '<em><b>Owner Classifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__OWNER_CLASSIFIER = eINSTANCE.getattribute_OwnerClassifier();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__KIND = eINSTANCE.getattribute_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getattribute_Name();

		/**
		 * The meta object literal for the '<em><b>OID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__OID = eINSTANCE.getattribute_OID();

		/**
		 * The meta object literal for the '{@link uml.impl.attributesImpl <em>attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.impl.attributesImpl
		 * @see uml.impl.UmlPackageImpl#getattributes()
		 * @generated
		 */
		EClass ATTRIBUTES = eINSTANCE.getattributes();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTES__GROUP = eINSTANCE.getattributes_Group();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTES__ATTRIBUTE = eINSTANCE.getattributes_Attribute();

		/**
		 * The meta object literal for the '{@link uml.impl.class_Impl <em>class </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.impl.class_Impl
		 * @see uml.impl.UmlPackageImpl#getclass_()
		 * @generated
		 */
		EClass CLASS_ = eINSTANCE.getclass_();

		/**
		 * The meta object literal for the '<em><b>General Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS___GENERAL_CLASS = eINSTANCE.getclass__GeneralClass();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS___ATTRIBUTES = eINSTANCE.getclass__Attributes();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS___KIND = eINSTANCE.getclass__Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS___NAME = eINSTANCE.getclass__Name();

		/**
		 * The meta object literal for the '<em><b>OID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS___OID = eINSTANCE.getclass__OID();

		/**
		 * The meta object literal for the '{@link uml.impl.classifiersAndAssociationsImpl <em>classifiers And Associations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.impl.classifiersAndAssociationsImpl
		 * @see uml.impl.UmlPackageImpl#getclassifiersAndAssociations()
		 * @generated
		 */
		EClass CLASSIFIERS_AND_ASSOCIATIONS = eINSTANCE.getclassifiersAndAssociations();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSIFIERS_AND_ASSOCIATIONS__GROUP = eINSTANCE.getclassifiersAndAssociations_Group();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIERS_AND_ASSOCIATIONS__CLASS = eINSTANCE.getclassifiersAndAssociations_Class();

		/**
		 * The meta object literal for the '<em><b>Primitive Data Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIERS_AND_ASSOCIATIONS__PRIMITIVE_DATA_TYPE = eINSTANCE.getclassifiersAndAssociations_PrimitiveDataType();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSIFIERS_AND_ASSOCIATIONS__ASSOCIATION = eINSTANCE.getclassifiersAndAssociations_Association();

		/**
		 * The meta object literal for the '{@link uml.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.impl.DocumentRootImpl
		 * @see uml.impl.UmlPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Association</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ASSOCIATION = eINSTANCE.getDocumentRoot_Association();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ATTRIBUTE = eINSTANCE.getDocumentRoot_Attribute();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ATTRIBUTES = eINSTANCE.getDocumentRoot_Attributes();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLASS = eINSTANCE.getDocumentRoot_Class();

		/**
		 * The meta object literal for the '<em><b>Classifiers And Associations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CLASSIFIERS_AND_ASSOCIATIONS = eINSTANCE.getDocumentRoot_ClassifiersAndAssociations();

		/**
		 * The meta object literal for the '<em><b>General Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GENERAL_CLASS = eINSTANCE.getDocumentRoot_GeneralClass();

		/**
		 * The meta object literal for the '<em><b>Owner Classifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OWNER_CLASSIFIER = eINSTANCE.getDocumentRoot_OwnerClassifier();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PACKAGE = eINSTANCE.getDocumentRoot_Package();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PACKAGES = eINSTANCE.getDocumentRoot_Packages();

		/**
		 * The meta object literal for the '<em><b>Primitive Data Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PRIMITIVE_DATA_TYPE = eINSTANCE.getDocumentRoot_PrimitiveDataType();

		/**
		 * The meta object literal for the '<em><b>UML</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UML = eINSTANCE.getDocumentRoot_UML();

		/**
		 * The meta object literal for the '{@link uml.impl.generalClassImpl <em>general Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.impl.generalClassImpl
		 * @see uml.impl.UmlPackageImpl#getgeneralClass()
		 * @generated
		 */
		EClass GENERAL_CLASS = eINSTANCE.getgeneralClass();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERAL_CLASS__CLASS = eINSTANCE.getgeneralClass_Class();

		/**
		 * The meta object literal for the '{@link uml.impl.ownerClassifierImpl <em>owner Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.impl.ownerClassifierImpl
		 * @see uml.impl.UmlPackageImpl#getownerClassifier()
		 * @generated
		 */
		EClass OWNER_CLASSIFIER = eINSTANCE.getownerClassifier();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWNER_CLASSIFIER__CLASS = eINSTANCE.getownerClassifier_Class();

		/**
		 * The meta object literal for the '<em><b>Primitive Data Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWNER_CLASSIFIER__PRIMITIVE_DATA_TYPE = eINSTANCE.getownerClassifier_PrimitiveDataType();

		/**
		 * The meta object literal for the '{@link uml.impl.package_Impl <em>package </em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.impl.package_Impl
		 * @see uml.impl.UmlPackageImpl#getpackage_()
		 * @generated
		 */
		EClass PACKAGE_ = eINSTANCE.getpackage_();

		/**
		 * The meta object literal for the '<em><b>Classifiers And Associations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE___CLASSIFIERS_AND_ASSOCIATIONS = eINSTANCE.getpackage__ClassifiersAndAssociations();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE___KIND = eINSTANCE.getpackage__Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE___NAME = eINSTANCE.getpackage__Name();

		/**
		 * The meta object literal for the '<em><b>OID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE___OID = eINSTANCE.getpackage__OID();

		/**
		 * The meta object literal for the '{@link uml.impl.packagesImpl <em>packages</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.impl.packagesImpl
		 * @see uml.impl.UmlPackageImpl#getpackages()
		 * @generated
		 */
		EClass PACKAGES = eINSTANCE.getpackages();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGES__GROUP = eINSTANCE.getpackages_Group();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGES__PACKAGE = eINSTANCE.getpackages_Package();

		/**
		 * The meta object literal for the '{@link uml.impl.primitiveDataTypeImpl <em>primitive Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.impl.primitiveDataTypeImpl
		 * @see uml.impl.UmlPackageImpl#getprimitiveDataType()
		 * @generated
		 */
		EClass PRIMITIVE_DATA_TYPE = eINSTANCE.getprimitiveDataType();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_DATA_TYPE__KIND = eINSTANCE.getprimitiveDataType_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_DATA_TYPE__NAME = eINSTANCE.getprimitiveDataType_Name();

		/**
		 * The meta object literal for the '<em><b>OID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_DATA_TYPE__OID = eINSTANCE.getprimitiveDataType_OID();

		/**
		 * The meta object literal for the '{@link uml.impl.UMLImpl <em>UML</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uml.impl.UMLImpl
		 * @see uml.impl.UmlPackageImpl#getUML()
		 * @generated
		 */
		EClass UML = eINSTANCE.getUML();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML__PACKAGES = eINSTANCE.getUML_Packages();

	}

} //UmlPackage
