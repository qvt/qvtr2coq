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
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdbmsMM.impl.ColumnImpl#getName <em>Name</em>}</li>
 *   <li>{@link rdbmsMM.impl.ColumnImpl#getType <em>Type</em>}</li>
 *   <li>{@link rdbmsMM.impl.ColumnImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link rdbmsMM.impl.ColumnImpl#getHasKey <em>Has Key</em>}</li>
 *   <li>{@link rdbmsMM.impl.ColumnImpl#getHasForeignKey <em>Has Foreign Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColumnImpl extends MinimalEObjectImpl.Container implements Column {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasKey() <em>Has Key</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasKey()
	 * @generated
	 * @ordered
	 */
	protected EList<Key> hasKey;

	/**
	 * The cached value of the '{@link #getHasForeignKey() <em>Has Foreign Key</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasForeignKey()
	 * @generated
	 * @ordered
	 */
	protected EList<ForeignKey> hasForeignKey;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbmsMMPackage.Literals.COLUMN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsMMPackage.COLUMN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsMMPackage.COLUMN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getOwner() {
		if (eContainerFeatureID() != RdbmsMMPackage.COLUMN__OWNER) return null;
		return (Table)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Table newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, RdbmsMMPackage.COLUMN__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Table newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != RdbmsMMPackage.COLUMN__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, RdbmsMMPackage.TABLE__COLUMN, Table.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsMMPackage.COLUMN__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Key> getHasKey() {
		if (hasKey == null) {
			hasKey = new EObjectWithInverseResolvingEList.ManyInverse<Key>(Key.class, this, RdbmsMMPackage.COLUMN__HAS_KEY, RdbmsMMPackage.KEY__COLUMN);
		}
		return hasKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForeignKey> getHasForeignKey() {
		if (hasForeignKey == null) {
			hasForeignKey = new EObjectWithInverseResolvingEList.ManyInverse<ForeignKey>(ForeignKey.class, this, RdbmsMMPackage.COLUMN__HAS_FOREIGN_KEY, RdbmsMMPackage.FOREIGN_KEY__COLUMN);
		}
		return hasForeignKey;
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
			case RdbmsMMPackage.COLUMN__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((Table)otherEnd, msgs);
			case RdbmsMMPackage.COLUMN__HAS_KEY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasKey()).basicAdd(otherEnd, msgs);
			case RdbmsMMPackage.COLUMN__HAS_FOREIGN_KEY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasForeignKey()).basicAdd(otherEnd, msgs);
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
			case RdbmsMMPackage.COLUMN__OWNER:
				return basicSetOwner(null, msgs);
			case RdbmsMMPackage.COLUMN__HAS_KEY:
				return ((InternalEList<?>)getHasKey()).basicRemove(otherEnd, msgs);
			case RdbmsMMPackage.COLUMN__HAS_FOREIGN_KEY:
				return ((InternalEList<?>)getHasForeignKey()).basicRemove(otherEnd, msgs);
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
			case RdbmsMMPackage.COLUMN__OWNER:
				return eInternalContainer().eInverseRemove(this, RdbmsMMPackage.TABLE__COLUMN, Table.class, msgs);
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
			case RdbmsMMPackage.COLUMN__NAME:
				return getName();
			case RdbmsMMPackage.COLUMN__TYPE:
				return getType();
			case RdbmsMMPackage.COLUMN__OWNER:
				return getOwner();
			case RdbmsMMPackage.COLUMN__HAS_KEY:
				return getHasKey();
			case RdbmsMMPackage.COLUMN__HAS_FOREIGN_KEY:
				return getHasForeignKey();
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
			case RdbmsMMPackage.COLUMN__NAME:
				setName((String)newValue);
				return;
			case RdbmsMMPackage.COLUMN__TYPE:
				setType((String)newValue);
				return;
			case RdbmsMMPackage.COLUMN__OWNER:
				setOwner((Table)newValue);
				return;
			case RdbmsMMPackage.COLUMN__HAS_KEY:
				getHasKey().clear();
				getHasKey().addAll((Collection<? extends Key>)newValue);
				return;
			case RdbmsMMPackage.COLUMN__HAS_FOREIGN_KEY:
				getHasForeignKey().clear();
				getHasForeignKey().addAll((Collection<? extends ForeignKey>)newValue);
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
			case RdbmsMMPackage.COLUMN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RdbmsMMPackage.COLUMN__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case RdbmsMMPackage.COLUMN__OWNER:
				setOwner((Table)null);
				return;
			case RdbmsMMPackage.COLUMN__HAS_KEY:
				getHasKey().clear();
				return;
			case RdbmsMMPackage.COLUMN__HAS_FOREIGN_KEY:
				getHasForeignKey().clear();
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
			case RdbmsMMPackage.COLUMN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RdbmsMMPackage.COLUMN__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case RdbmsMMPackage.COLUMN__OWNER:
				return getOwner() != null;
			case RdbmsMMPackage.COLUMN__HAS_KEY:
				return hasKey != null && !hasKey.isEmpty();
			case RdbmsMMPackage.COLUMN__HAS_FOREIGN_KEY:
				return hasForeignKey != null && !hasForeignKey.isEmpty();
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
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
