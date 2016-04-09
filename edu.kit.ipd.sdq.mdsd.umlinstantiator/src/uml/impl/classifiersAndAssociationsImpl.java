/**
 */
package uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.UmlPackage;
import uml.association;
import uml.class_;
import uml.classifiersAndAssociations;
import uml.primitiveDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>classifiers And Associations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.classifiersAndAssociationsImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link uml.impl.classifiersAndAssociationsImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link uml.impl.classifiersAndAssociationsImpl#getPrimitiveDataType <em>Primitive Data Type</em>}</li>
 *   <li>{@link uml.impl.classifiersAndAssociationsImpl#getAssociation <em>Association</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class classifiersAndAssociationsImpl extends MinimalEObjectImpl.Container implements classifiersAndAssociations {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected classifiersAndAssociationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlPackage.Literals.CLASSIFIERS_AND_ASSOCIATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, UmlPackage.CLASSIFIERS_AND_ASSOCIATIONS__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<class_> getClass_() {
		return getGroup().list(UmlPackage.Literals.CLASSIFIERS_AND_ASSOCIATIONS__CLASS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<primitiveDataType> getPrimitiveDataType() {
		return getGroup().list(UmlPackage.Literals.CLASSIFIERS_AND_ASSOCIATIONS__PRIMITIVE_DATA_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<association> getAssociation() {
		return getGroup().list(UmlPackage.Literals.CLASSIFIERS_AND_ASSOCIATIONS__ASSOCIATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmlPackage.CLASSIFIERS_AND_ASSOCIATIONS__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case UmlPackage.CLASSIFIERS_AND_ASSOCIATIONS__CLASS:
				return ((InternalEList<?>)getClass_()).basicRemove(otherEnd, msgs);
			case UmlPackage.CLASSIFIERS_AND_ASSOCIATIONS__PRIMITIVE_DATA_TYPE:
				return ((InternalEList<?>)getPrimitiveDataType()).basicRemove(otherEnd, msgs);
			case UmlPackage.CLASSIFIERS_AND_ASSOCIATIONS__ASSOCIATION:
				return ((InternalEList<?>)getAssociation()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.CLASSIFIERS_AND_ASSOCIATIONS__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case UmlPackage.CLASSIFIERS_AND_ASSOCIATIONS__CLASS:
				return getClass_();
			case UmlPackage.CLASSIFIERS_AND_ASSOCIATIONS__PRIMITIVE_DATA_TYPE:
				return getPrimitiveDataType();
			case UmlPackage.CLASSIFIERS_AND_ASSOCIATIONS__ASSOCIATION:
				return getAssociation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UmlPackage.CLASSIFIERS_AND_ASSOCIATIONS__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case UmlPackage.CLASSIFIERS_AND_ASSOCIATIONS__CLASS:
				getClass_().clear();
				getClass_().addAll((Collection<? extends class_>)newValue);
				return;
			case UmlPackage.CLASSIFIERS_AND_ASSOCIATIONS__PRIMITIVE_DATA_TYPE:
				getPrimitiveDataType().clear();
				getPrimitiveDataType().addAll((Collection<? extends primitiveDataType>)newValue);
				return;
			case UmlPackage.CLASSIFIERS_AND_ASSOCIATIONS__ASSOCIATION:
				getAssociation().clear();
				getAssociation().addAll((Collection<? extends association>)newValue);
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
			case UmlPackage.CLASSIFIERS_AND_ASSOCIATIONS__GROUP:
				getGroup().clear();
				return;
			case UmlPackage.CLASSIFIERS_AND_ASSOCIATIONS__CLASS:
				getClass_().clear();
				return;
			case UmlPackage.CLASSIFIERS_AND_ASSOCIATIONS__PRIMITIVE_DATA_TYPE:
				getPrimitiveDataType().clear();
				return;
			case UmlPackage.CLASSIFIERS_AND_ASSOCIATIONS__ASSOCIATION:
				getAssociation().clear();
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
			case UmlPackage.CLASSIFIERS_AND_ASSOCIATIONS__GROUP:
				return group != null && !group.isEmpty();
			case UmlPackage.CLASSIFIERS_AND_ASSOCIATIONS__CLASS:
				return !getClass_().isEmpty();
			case UmlPackage.CLASSIFIERS_AND_ASSOCIATIONS__PRIMITIVE_DATA_TYPE:
				return !getPrimitiveDataType().isEmpty();
			case UmlPackage.CLASSIFIERS_AND_ASSOCIATIONS__ASSOCIATION:
				return !getAssociation().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //classifiersAndAssociationsImpl
