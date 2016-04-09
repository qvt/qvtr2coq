/**
 */
package umlMM_.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import umlMM_.UmlMMPackage;
import umlMM_.dummy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>dummy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link umlMM_.impl.dummyImpl#getContainsPackage <em>Contains Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class dummyImpl extends MinimalEObjectImpl.Container implements dummy {
	/**
	 * The cached value of the '{@link #getContainsPackage() <em>Contains Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<umlMM_.Package> containsPackage;

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
		return UmlMMPackage.Literals.DUMMY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<umlMM_.Package> getContainsPackage() {
		if (containsPackage == null) {
			containsPackage = new EObjectContainmentWithInverseEList<umlMM_.Package>(umlMM_.Package.class, this, UmlMMPackage.DUMMY__CONTAINS_PACKAGE, UmlMMPackage.PACKAGE__DUMMY);
		}
		return containsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmlMMPackage.DUMMY__CONTAINS_PACKAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainsPackage()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmlMMPackage.DUMMY__CONTAINS_PACKAGE:
				return ((InternalEList<?>)getContainsPackage()).basicRemove(otherEnd, msgs);
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
			case UmlMMPackage.DUMMY__CONTAINS_PACKAGE:
				return getContainsPackage();
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
			case UmlMMPackage.DUMMY__CONTAINS_PACKAGE:
				getContainsPackage().clear();
				getContainsPackage().addAll((Collection<? extends umlMM_.Package>)newValue);
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
			case UmlMMPackage.DUMMY__CONTAINS_PACKAGE:
				getContainsPackage().clear();
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
			case UmlMMPackage.DUMMY__CONTAINS_PACKAGE:
				return containsPackage != null && !containsPackage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //dummyImpl
