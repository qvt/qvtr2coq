/**
 */
package uml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlFactoryImpl extends EFactoryImpl implements UmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UmlFactory init() {
		try {
			UmlFactory theUmlFactory = (UmlFactory)EPackage.Registry.INSTANCE.getEFactory(UmlPackage.eNS_URI);
			if (theUmlFactory != null) {
				return theUmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlFactoryImpl() {
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
			case UmlPackage.ASSOCIATION: return createassociation();
			case UmlPackage.ATTRIBUTE: return createattribute();
			case UmlPackage.ATTRIBUTES: return createattributes();
			case UmlPackage.CLASS_: return createclass_();
			case UmlPackage.CLASSIFIERS_AND_ASSOCIATIONS: return createclassifiersAndAssociations();
			case UmlPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case UmlPackage.GENERAL_CLASS: return creategeneralClass();
			case UmlPackage.OWNER_CLASSIFIER: return createownerClassifier();
			case UmlPackage.PACKAGE_: return createpackage_();
			case UmlPackage.PACKAGES: return createpackages();
			case UmlPackage.PRIMITIVE_DATA_TYPE: return createprimitiveDataType();
			case UmlPackage.UML: return createUML();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public association createassociation() {
		associationImpl association = new associationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attribute createattribute() {
		attributeImpl attribute = new attributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attributes createattributes() {
		attributesImpl attributes = new attributesImpl();
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class_ createclass_() {
		class_Impl class_ = new class_Impl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public classifiersAndAssociations createclassifiersAndAssociations() {
		classifiersAndAssociationsImpl classifiersAndAssociations = new classifiersAndAssociationsImpl();
		return classifiersAndAssociations;
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
	public generalClass creategeneralClass() {
		generalClassImpl generalClass = new generalClassImpl();
		return generalClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ownerClassifier createownerClassifier() {
		ownerClassifierImpl ownerClassifier = new ownerClassifierImpl();
		return ownerClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public package_ createpackage_() {
		package_Impl package_ = new package_Impl();
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public packages createpackages() {
		packagesImpl packages = new packagesImpl();
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public primitiveDataType createprimitiveDataType() {
		primitiveDataTypeImpl primitiveDataType = new primitiveDataTypeImpl();
		return primitiveDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML createUML() {
		UMLImpl uml = new UMLImpl();
		return uml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlPackage getUmlPackage() {
		return (UmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UmlPackage getPackage() {
		return UmlPackage.eINSTANCE;
	}

} //UmlFactoryImpl
