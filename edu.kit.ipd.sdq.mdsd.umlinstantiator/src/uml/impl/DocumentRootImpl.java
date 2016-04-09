/**
 */
package uml.impl;

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

import uml.DocumentRoot;
import uml.UML;
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
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link uml.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link uml.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link uml.impl.DocumentRootImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link uml.impl.DocumentRootImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link uml.impl.DocumentRootImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link uml.impl.DocumentRootImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link uml.impl.DocumentRootImpl#getClassifiersAndAssociations <em>Classifiers And Associations</em>}</li>
 *   <li>{@link uml.impl.DocumentRootImpl#getGeneralClass <em>General Class</em>}</li>
 *   <li>{@link uml.impl.DocumentRootImpl#getOwnerClassifier <em>Owner Classifier</em>}</li>
 *   <li>{@link uml.impl.DocumentRootImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link uml.impl.DocumentRootImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link uml.impl.DocumentRootImpl#getPrimitiveDataType <em>Primitive Data Type</em>}</li>
 *   <li>{@link uml.impl.DocumentRootImpl#getUML <em>UML</em>}</li>
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
		return UmlPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, UmlPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, UmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, UmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public association getAssociation() {
		return (association)getMixed().get(UmlPackage.Literals.DOCUMENT_ROOT__ASSOCIATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociation(association newAssociation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.Literals.DOCUMENT_ROOT__ASSOCIATION, newAssociation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociation(association newAssociation) {
		((FeatureMap.Internal)getMixed()).set(UmlPackage.Literals.DOCUMENT_ROOT__ASSOCIATION, newAssociation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attribute getAttribute() {
		return (attribute)getMixed().get(UmlPackage.Literals.DOCUMENT_ROOT__ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttribute(attribute newAttribute, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.Literals.DOCUMENT_ROOT__ATTRIBUTE, newAttribute, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(attribute newAttribute) {
		((FeatureMap.Internal)getMixed()).set(UmlPackage.Literals.DOCUMENT_ROOT__ATTRIBUTE, newAttribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public attributes getAttributes() {
		return (attributes)getMixed().get(UmlPackage.Literals.DOCUMENT_ROOT__ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributes(attributes newAttributes, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.Literals.DOCUMENT_ROOT__ATTRIBUTES, newAttributes, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(attributes newAttributes) {
		((FeatureMap.Internal)getMixed()).set(UmlPackage.Literals.DOCUMENT_ROOT__ATTRIBUTES, newAttributes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class_ getClass_() {
		return (class_)getMixed().get(UmlPackage.Literals.DOCUMENT_ROOT__CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(class_ newClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.Literals.DOCUMENT_ROOT__CLASS, newClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(class_ newClass) {
		((FeatureMap.Internal)getMixed()).set(UmlPackage.Literals.DOCUMENT_ROOT__CLASS, newClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public classifiersAndAssociations getClassifiersAndAssociations() {
		return (classifiersAndAssociations)getMixed().get(UmlPackage.Literals.DOCUMENT_ROOT__CLASSIFIERS_AND_ASSOCIATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifiersAndAssociations(classifiersAndAssociations newClassifiersAndAssociations, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.Literals.DOCUMENT_ROOT__CLASSIFIERS_AND_ASSOCIATIONS, newClassifiersAndAssociations, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifiersAndAssociations(classifiersAndAssociations newClassifiersAndAssociations) {
		((FeatureMap.Internal)getMixed()).set(UmlPackage.Literals.DOCUMENT_ROOT__CLASSIFIERS_AND_ASSOCIATIONS, newClassifiersAndAssociations);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public generalClass getGeneralClass() {
		return (generalClass)getMixed().get(UmlPackage.Literals.DOCUMENT_ROOT__GENERAL_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralClass(generalClass newGeneralClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.Literals.DOCUMENT_ROOT__GENERAL_CLASS, newGeneralClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralClass(generalClass newGeneralClass) {
		((FeatureMap.Internal)getMixed()).set(UmlPackage.Literals.DOCUMENT_ROOT__GENERAL_CLASS, newGeneralClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ownerClassifier getOwnerClassifier() {
		return (ownerClassifier)getMixed().get(UmlPackage.Literals.DOCUMENT_ROOT__OWNER_CLASSIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerClassifier(ownerClassifier newOwnerClassifier, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.Literals.DOCUMENT_ROOT__OWNER_CLASSIFIER, newOwnerClassifier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerClassifier(ownerClassifier newOwnerClassifier) {
		((FeatureMap.Internal)getMixed()).set(UmlPackage.Literals.DOCUMENT_ROOT__OWNER_CLASSIFIER, newOwnerClassifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public package_ getPackage() {
		return (package_)getMixed().get(UmlPackage.Literals.DOCUMENT_ROOT__PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackage(package_ newPackage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.Literals.DOCUMENT_ROOT__PACKAGE, newPackage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(package_ newPackage) {
		((FeatureMap.Internal)getMixed()).set(UmlPackage.Literals.DOCUMENT_ROOT__PACKAGE, newPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public packages getPackages() {
		return (packages)getMixed().get(UmlPackage.Literals.DOCUMENT_ROOT__PACKAGES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackages(packages newPackages, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.Literals.DOCUMENT_ROOT__PACKAGES, newPackages, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackages(packages newPackages) {
		((FeatureMap.Internal)getMixed()).set(UmlPackage.Literals.DOCUMENT_ROOT__PACKAGES, newPackages);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public primitiveDataType getPrimitiveDataType() {
		return (primitiveDataType)getMixed().get(UmlPackage.Literals.DOCUMENT_ROOT__PRIMITIVE_DATA_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimitiveDataType(primitiveDataType newPrimitiveDataType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.Literals.DOCUMENT_ROOT__PRIMITIVE_DATA_TYPE, newPrimitiveDataType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveDataType(primitiveDataType newPrimitiveDataType) {
		((FeatureMap.Internal)getMixed()).set(UmlPackage.Literals.DOCUMENT_ROOT__PRIMITIVE_DATA_TYPE, newPrimitiveDataType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UML getUML() {
		return (UML)getMixed().get(UmlPackage.Literals.DOCUMENT_ROOT__UML, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUML(UML newUML, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UmlPackage.Literals.DOCUMENT_ROOT__UML, newUML, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUML(UML newUML) {
		((FeatureMap.Internal)getMixed()).set(UmlPackage.Literals.DOCUMENT_ROOT__UML, newUML);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmlPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case UmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case UmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case UmlPackage.DOCUMENT_ROOT__ASSOCIATION:
				return basicSetAssociation(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ATTRIBUTE:
				return basicSetAttribute(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__ATTRIBUTES:
				return basicSetAttributes(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CLASS:
				return basicSetClass(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__CLASSIFIERS_AND_ASSOCIATIONS:
				return basicSetClassifiersAndAssociations(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__GENERAL_CLASS:
				return basicSetGeneralClass(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__OWNER_CLASSIFIER:
				return basicSetOwnerClassifier(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PACKAGE:
				return basicSetPackage(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PACKAGES:
				return basicSetPackages(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__PRIMITIVE_DATA_TYPE:
				return basicSetPrimitiveDataType(null, msgs);
			case UmlPackage.DOCUMENT_ROOT__UML:
				return basicSetUML(null, msgs);
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
			case UmlPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case UmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case UmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case UmlPackage.DOCUMENT_ROOT__ASSOCIATION:
				return getAssociation();
			case UmlPackage.DOCUMENT_ROOT__ATTRIBUTE:
				return getAttribute();
			case UmlPackage.DOCUMENT_ROOT__ATTRIBUTES:
				return getAttributes();
			case UmlPackage.DOCUMENT_ROOT__CLASS:
				return getClass_();
			case UmlPackage.DOCUMENT_ROOT__CLASSIFIERS_AND_ASSOCIATIONS:
				return getClassifiersAndAssociations();
			case UmlPackage.DOCUMENT_ROOT__GENERAL_CLASS:
				return getGeneralClass();
			case UmlPackage.DOCUMENT_ROOT__OWNER_CLASSIFIER:
				return getOwnerClassifier();
			case UmlPackage.DOCUMENT_ROOT__PACKAGE:
				return getPackage();
			case UmlPackage.DOCUMENT_ROOT__PACKAGES:
				return getPackages();
			case UmlPackage.DOCUMENT_ROOT__PRIMITIVE_DATA_TYPE:
				return getPrimitiveDataType();
			case UmlPackage.DOCUMENT_ROOT__UML:
				return getUML();
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
			case UmlPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ASSOCIATION:
				setAssociation((association)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ATTRIBUTE:
				setAttribute((attribute)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__ATTRIBUTES:
				setAttributes((attributes)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CLASS:
				setClass((class_)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__CLASSIFIERS_AND_ASSOCIATIONS:
				setClassifiersAndAssociations((classifiersAndAssociations)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__GENERAL_CLASS:
				setGeneralClass((generalClass)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__OWNER_CLASSIFIER:
				setOwnerClassifier((ownerClassifier)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PACKAGE:
				setPackage((package_)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PACKAGES:
				setPackages((packages)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__PRIMITIVE_DATA_TYPE:
				setPrimitiveDataType((primitiveDataType)newValue);
				return;
			case UmlPackage.DOCUMENT_ROOT__UML:
				setUML((UML)newValue);
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
			case UmlPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case UmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case UmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case UmlPackage.DOCUMENT_ROOT__ASSOCIATION:
				setAssociation((association)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ATTRIBUTE:
				setAttribute((attribute)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__ATTRIBUTES:
				setAttributes((attributes)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CLASS:
				setClass((class_)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__CLASSIFIERS_AND_ASSOCIATIONS:
				setClassifiersAndAssociations((classifiersAndAssociations)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__GENERAL_CLASS:
				setGeneralClass((generalClass)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__OWNER_CLASSIFIER:
				setOwnerClassifier((ownerClassifier)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PACKAGE:
				setPackage((package_)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PACKAGES:
				setPackages((packages)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__PRIMITIVE_DATA_TYPE:
				setPrimitiveDataType((primitiveDataType)null);
				return;
			case UmlPackage.DOCUMENT_ROOT__UML:
				setUML((UML)null);
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
			case UmlPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case UmlPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case UmlPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case UmlPackage.DOCUMENT_ROOT__ASSOCIATION:
				return getAssociation() != null;
			case UmlPackage.DOCUMENT_ROOT__ATTRIBUTE:
				return getAttribute() != null;
			case UmlPackage.DOCUMENT_ROOT__ATTRIBUTES:
				return getAttributes() != null;
			case UmlPackage.DOCUMENT_ROOT__CLASS:
				return getClass_() != null;
			case UmlPackage.DOCUMENT_ROOT__CLASSIFIERS_AND_ASSOCIATIONS:
				return getClassifiersAndAssociations() != null;
			case UmlPackage.DOCUMENT_ROOT__GENERAL_CLASS:
				return getGeneralClass() != null;
			case UmlPackage.DOCUMENT_ROOT__OWNER_CLASSIFIER:
				return getOwnerClassifier() != null;
			case UmlPackage.DOCUMENT_ROOT__PACKAGE:
				return getPackage() != null;
			case UmlPackage.DOCUMENT_ROOT__PACKAGES:
				return getPackages() != null;
			case UmlPackage.DOCUMENT_ROOT__PRIMITIVE_DATA_TYPE:
				return getPrimitiveDataType() != null;
			case UmlPackage.DOCUMENT_ROOT__UML:
				return getUML() != null;
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
