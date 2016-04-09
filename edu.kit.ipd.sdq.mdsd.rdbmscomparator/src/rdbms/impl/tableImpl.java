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
import rdbms.columns;
import rdbms.key2;
import rdbms.table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdbms.impl.tableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link rdbms.impl.tableImpl#getKey2 <em>Key2</em>}</li>
 *   <li>{@link rdbms.impl.tableImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link rdbms.impl.tableImpl#getName <em>Name</em>}</li>
 *   <li>{@link rdbms.impl.tableImpl#getOID <em>OID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class tableImpl extends MinimalEObjectImpl.Container implements table {
	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected columns columns;

	/**
	 * The cached value of the '{@link #getKey2() <em>Key2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey2()
	 * @generated
	 * @ordered
	 */
	protected key2 key2;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected tableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbmsPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public columns getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumns(columns newColumns, NotificationChain msgs) {
		columns oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdbmsPackage.TABLE__COLUMNS, oldColumns, newColumns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(columns newColumns) {
		if (newColumns != columns) {
			NotificationChain msgs = null;
			if (columns != null)
				msgs = ((InternalEObject)columns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdbmsPackage.TABLE__COLUMNS, null, msgs);
			if (newColumns != null)
				msgs = ((InternalEObject)newColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdbmsPackage.TABLE__COLUMNS, null, msgs);
			msgs = basicSetColumns(newColumns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.TABLE__COLUMNS, newColumns, newColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public key2 getKey2() {
		return key2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKey2(key2 newKey2, NotificationChain msgs) {
		key2 oldKey2 = key2;
		key2 = newKey2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdbmsPackage.TABLE__KEY2, oldKey2, newKey2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey2(key2 newKey2) {
		if (newKey2 != key2) {
			NotificationChain msgs = null;
			if (key2 != null)
				msgs = ((InternalEObject)key2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdbmsPackage.TABLE__KEY2, null, msgs);
			if (newKey2 != null)
				msgs = ((InternalEObject)newKey2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdbmsPackage.TABLE__KEY2, null, msgs);
			msgs = basicSetKey2(newKey2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.TABLE__KEY2, newKey2, newKey2));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.TABLE__KIND, oldKind, kind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.TABLE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.TABLE__OID, oldOID, oID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdbmsPackage.TABLE__COLUMNS:
				return basicSetColumns(null, msgs);
			case RdbmsPackage.TABLE__KEY2:
				return basicSetKey2(null, msgs);
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
			case RdbmsPackage.TABLE__COLUMNS:
				return getColumns();
			case RdbmsPackage.TABLE__KEY2:
				return getKey2();
			case RdbmsPackage.TABLE__KIND:
				return getKind();
			case RdbmsPackage.TABLE__NAME:
				return getName();
			case RdbmsPackage.TABLE__OID:
				return getOID();
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
			case RdbmsPackage.TABLE__COLUMNS:
				setColumns((columns)newValue);
				return;
			case RdbmsPackage.TABLE__KEY2:
				setKey2((key2)newValue);
				return;
			case RdbmsPackage.TABLE__KIND:
				setKind((String)newValue);
				return;
			case RdbmsPackage.TABLE__NAME:
				setName((String)newValue);
				return;
			case RdbmsPackage.TABLE__OID:
				setOID((String)newValue);
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
			case RdbmsPackage.TABLE__COLUMNS:
				setColumns((columns)null);
				return;
			case RdbmsPackage.TABLE__KEY2:
				setKey2((key2)null);
				return;
			case RdbmsPackage.TABLE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case RdbmsPackage.TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RdbmsPackage.TABLE__OID:
				setOID(OID_EDEFAULT);
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
			case RdbmsPackage.TABLE__COLUMNS:
				return columns != null;
			case RdbmsPackage.TABLE__KEY2:
				return key2 != null;
			case RdbmsPackage.TABLE__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
			case RdbmsPackage.TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RdbmsPackage.TABLE__OID:
				return OID_EDEFAULT == null ? oID != null : !OID_EDEFAULT.equals(oID);
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
		result.append(')');
		return result.toString();
	}

} //tableImpl
