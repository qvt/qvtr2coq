/**
 */
package rdbmsMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rdbmsMM.RdbmsMMPackage;
import rdbmsMM.Schema;
import rdbmsMM.dummy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>dummy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdbmsMM.impl.dummyImpl#getContainsSchema <em>Contains Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class dummyImpl extends MinimalEObjectImpl.Container implements dummy {
	/**
	 * The cached value of the '{@link #getContainsSchema() <em>Contains Schema</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsSchema()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> containsSchema;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected dummyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbmsMMPackage.Literals.DUMMY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getContainsSchema() {
		if (containsSchema == null) {
			containsSchema = new EObjectContainmentEList<Schema>(Schema.class, this, RdbmsMMPackage.DUMMY__CONTAINS_SCHEMA);
		}
		return containsSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdbmsMMPackage.DUMMY__CONTAINS_SCHEMA:
				return ((InternalEList<?>)getContainsSchema()).basicRemove(otherEnd, msgs);
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
			case RdbmsMMPackage.DUMMY__CONTAINS_SCHEMA:
				return getContainsSchema();
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
			case RdbmsMMPackage.DUMMY__CONTAINS_SCHEMA:
				getContainsSchema().clear();
				getContainsSchema().addAll((Collection<? extends Schema>)newValue);
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
			case RdbmsMMPackage.DUMMY__CONTAINS_SCHEMA:
				getContainsSchema().clear();
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
			case RdbmsMMPackage.DUMMY__CONTAINS_SCHEMA:
				return containsSchema != null && !containsSchema.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //dummyImpl
