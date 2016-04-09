/**
 */
package rdbms.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rdbms.RdbmsPackage;
import rdbms.column;
import rdbms.hasForeignKeys;
import rdbms.referencedKeys;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdbms.impl.columnImpl#getReferencedKeys <em>Referenced Keys</em>}</li>
 *   <li>{@link rdbms.impl.columnImpl#getHasForeignKeys <em>Has Foreign Keys</em>}</li>
 *   <li>{@link rdbms.impl.columnImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link rdbms.impl.columnImpl#getName <em>Name</em>}</li>
 *   <li>{@link rdbms.impl.columnImpl#getOID <em>OID</em>}</li>
 *   <li>{@link rdbms.impl.columnImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class columnImpl extends MinimalEObjectImpl.Container implements column {
	/**
	 * The cached value of the '{@link #getReferencedKeys() <em>Referenced Keys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedKeys()
	 * @generated
	 * @ordered
	 */
	protected referencedKeys referencedKeys;

	/**
	 * The cached value of the '{@link #getHasForeignKeys() <em>Has Foreign Keys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected hasForeignKeys hasForeignKeys;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected String kind = KIND_EDEFAULT;

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
	 * The default value of the '{@link #getOID() <em>OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOID()
	 * @generated
	 * @ordered
	 */
	protected static final String OID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOID() <em>OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOID()
	 * @generated
	 * @ordered
	 */
	protected String oID = OID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected columnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbmsPackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public referencedKeys getReferencedKeys() {
		return referencedKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedKeys(referencedKeys newReferencedKeys, NotificationChain msgs) {
		referencedKeys oldReferencedKeys = referencedKeys;
		referencedKeys = newReferencedKeys;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdbmsPackage.COLUMN__REFERENCED_KEYS, oldReferencedKeys, newReferencedKeys);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedKeys(referencedKeys newReferencedKeys) {
		if (newReferencedKeys != referencedKeys) {
			NotificationChain msgs = null;
			if (referencedKeys != null)
				msgs = ((InternalEObject)referencedKeys).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdbmsPackage.COLUMN__REFERENCED_KEYS, null, msgs);
			if (newReferencedKeys != null)
				msgs = ((InternalEObject)newReferencedKeys).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdbmsPackage.COLUMN__REFERENCED_KEYS, null, msgs);
			msgs = basicSetReferencedKeys(newReferencedKeys, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.COLUMN__REFERENCED_KEYS, newReferencedKeys, newReferencedKeys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public hasForeignKeys getHasForeignKeys() {
		return hasForeignKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasForeignKeys(hasForeignKeys newHasForeignKeys, NotificationChain msgs) {
		hasForeignKeys oldHasForeignKeys = hasForeignKeys;
		hasForeignKeys = newHasForeignKeys;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdbmsPackage.COLUMN__HAS_FOREIGN_KEYS, oldHasForeignKeys, newHasForeignKeys);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasForeignKeys(hasForeignKeys newHasForeignKeys) {
		if (newHasForeignKeys != hasForeignKeys) {
			NotificationChain msgs = null;
			if (hasForeignKeys != null)
				msgs = ((InternalEObject)hasForeignKeys).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdbmsPackage.COLUMN__HAS_FOREIGN_KEYS, null, msgs);
			if (newHasForeignKeys != null)
				msgs = ((InternalEObject)newHasForeignKeys).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdbmsPackage.COLUMN__HAS_FOREIGN_KEYS, null, msgs);
			msgs = basicSetHasForeignKeys(newHasForeignKeys, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.COLUMN__HAS_FOREIGN_KEYS, newHasForeignKeys, newHasForeignKeys));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(String newKind) {
		String oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.COLUMN__KIND, oldKind, kind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.COLUMN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOID() {
		return oID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOID(String newOID) {
		String oldOID = oID;
		oID = newOID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.COLUMN__OID, oldOID, oID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.COLUMN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdbmsPackage.COLUMN__REFERENCED_KEYS:
				return basicSetReferencedKeys(null, msgs);
			case RdbmsPackage.COLUMN__HAS_FOREIGN_KEYS:
				return basicSetHasForeignKeys(null, msgs);
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
			case RdbmsPackage.COLUMN__REFERENCED_KEYS:
				return getReferencedKeys();
			case RdbmsPackage.COLUMN__HAS_FOREIGN_KEYS:
				return getHasForeignKeys();
			case RdbmsPackage.COLUMN__KIND:
				return getKind();
			case RdbmsPackage.COLUMN__NAME:
				return getName();
			case RdbmsPackage.COLUMN__OID:
				return getOID();
			case RdbmsPackage.COLUMN__TYPE:
				return getType();
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
			case RdbmsPackage.COLUMN__REFERENCED_KEYS:
				setReferencedKeys((referencedKeys)newValue);
				return;
			case RdbmsPackage.COLUMN__HAS_FOREIGN_KEYS:
				setHasForeignKeys((hasForeignKeys)newValue);
				return;
			case RdbmsPackage.COLUMN__KIND:
				setKind((String)newValue);
				return;
			case RdbmsPackage.COLUMN__NAME:
				setName((String)newValue);
				return;
			case RdbmsPackage.COLUMN__OID:
				setOID((String)newValue);
				return;
			case RdbmsPackage.COLUMN__TYPE:
				setType((String)newValue);
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
			case RdbmsPackage.COLUMN__REFERENCED_KEYS:
				setReferencedKeys((referencedKeys)null);
				return;
			case RdbmsPackage.COLUMN__HAS_FOREIGN_KEYS:
				setHasForeignKeys((hasForeignKeys)null);
				return;
			case RdbmsPackage.COLUMN__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case RdbmsPackage.COLUMN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RdbmsPackage.COLUMN__OID:
				setOID(OID_EDEFAULT);
				return;
			case RdbmsPackage.COLUMN__TYPE:
				setType(TYPE_EDEFAULT);
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
			case RdbmsPackage.COLUMN__REFERENCED_KEYS:
				return referencedKeys != null;
			case RdbmsPackage.COLUMN__HAS_FOREIGN_KEYS:
				return hasForeignKeys != null;
			case RdbmsPackage.COLUMN__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
			case RdbmsPackage.COLUMN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RdbmsPackage.COLUMN__OID:
				return OID_EDEFAULT == null ? oID != null : !OID_EDEFAULT.equals(oID);
			case RdbmsPackage.COLUMN__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", name: ");
		result.append(name);
		result.append(", oID: ");
		result.append(oID);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //columnImpl
