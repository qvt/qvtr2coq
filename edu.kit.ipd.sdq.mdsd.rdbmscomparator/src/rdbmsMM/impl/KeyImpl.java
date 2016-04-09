/**
 */
package rdbmsMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import rdbmsMM.Column;
import rdbmsMM.ForeignKey;
import rdbmsMM.Key;
import rdbmsMM.RdbmsMMPackage;
import rdbmsMM.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdbmsMM.impl.KeyImpl#getName <em>Name</em>}</li>
 *   <li>{@link rdbmsMM.impl.KeyImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link rdbmsMM.impl.KeyImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link rdbmsMM.impl.KeyImpl#getReferedBy <em>Refered By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyImpl extends MinimalEObjectImpl.Container implements Key {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> column;

	/**
	 * The cached value of the '{@link #getReferedBy() <em>Refered By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKey> referedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbmsMMPackage.Literals.KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsMMPackage.KEY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getOwner() {
		if (eContainerFeatureID() != RdbmsMMPackage.KEY__OWNER) return null;
		return (Table)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Table newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, RdbmsMMPackage.KEY__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Table newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != RdbmsMMPackage.KEY__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, RdbmsMMPackage.TABLE__HAS_KEY, Table.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsMMPackage.KEY__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumn() {
		if (column == null) {
			column = new EObjectWithInverseResolvingEList.ManyInverse<Column>(Column.class, this, RdbmsMMPackage.KEY__COLUMN, RdbmsMMPackage.COLUMN__HAS_KEY);
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForeignKey> getReferedBy() {
		if (referedBy == null) {
			referedBy = new EObjectWithInverseResolvingEList<ForeignKey>(ForeignKey.class, this, RdbmsMMPackage.KEY__REFERED_BY, RdbmsMMPackage.FOREIGN_KEY__REFERS_TO);
		}
		return referedBy;
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
			case RdbmsMMPackage.KEY__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((Table)otherEnd, msgs);
			case RdbmsMMPackage.KEY__COLUMN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getColumn()).basicAdd(otherEnd, msgs);
			case RdbmsMMPackage.KEY__REFERED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReferedBy()).basicAdd(otherEnd, msgs);
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
			case RdbmsMMPackage.KEY__OWNER:
				return basicSetOwner(null, msgs);
			case RdbmsMMPackage.KEY__COLUMN:
				return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
			case RdbmsMMPackage.KEY__REFERED_BY:
				return ((InternalEList<?>)getReferedBy()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RdbmsMMPackage.KEY__OWNER:
				return eInternalContainer().eInverseRemove(this, RdbmsMMPackage.TABLE__HAS_KEY, Table.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdbmsMMPackage.KEY__NAME:
				return getName();
			case RdbmsMMPackage.KEY__OWNER:
				return getOwner();
			case RdbmsMMPackage.KEY__COLUMN:
				return getColumn();
			case RdbmsMMPackage.KEY__REFERED_BY:
				return getReferedBy();
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
			case RdbmsMMPackage.KEY__NAME:
				setName((String)newValue);
				return;
			case RdbmsMMPackage.KEY__OWNER:
				setOwner((Table)newValue);
				return;
			case RdbmsMMPackage.KEY__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends Column>)newValue);
				return;
			case RdbmsMMPackage.KEY__REFERED_BY:
				getReferedBy().clear();
				getReferedBy().addAll((Collection<? extends ForeignKey>)newValue);
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
			case RdbmsMMPackage.KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RdbmsMMPackage.KEY__OWNER:
				setOwner((Table)null);
				return;
			case RdbmsMMPackage.KEY__COLUMN:
				getColumn().clear();
				return;
			case RdbmsMMPackage.KEY__REFERED_BY:
				getReferedBy().clear();
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
			case RdbmsMMPackage.KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RdbmsMMPackage.KEY__OWNER:
				return getOwner() != null;
			case RdbmsMMPackage.KEY__COLUMN:
				return column != null && !column.isEmpty();
			case RdbmsMMPackage.KEY__REFERED_BY:
				return referedBy != null && !referedBy.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //KeyImpl
