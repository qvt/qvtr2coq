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
import rdbms.foreignKeys;
import rdbms.schema;
import rdbms.tables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdbms.impl.schemaImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link rdbms.impl.schemaImpl#getForeignKeys <em>Foreign Keys</em>}</li>
 *   <li>{@link rdbms.impl.schemaImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link rdbms.impl.schemaImpl#getName <em>Name</em>}</li>
 *   <li>{@link rdbms.impl.schemaImpl#getOID <em>OID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class schemaImpl extends MinimalEObjectImpl.Container implements schema {
	/**
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected tables tables;

	/**
	 * The cached value of the '{@link #getForeignKeys() <em>Foreign Keys</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignKeys()
	 * @generated
	 * @ordered
	 */
	protected foreignKeys foreignKeys;

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
	protected schemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbmsPackage.Literals.SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tables getTables() {
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTables(tables newTables, NotificationChain msgs) {
		tables oldTables = tables;
		tables = newTables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdbmsPackage.SCHEMA__TABLES, oldTables, newTables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTables(tables newTables) {
		if (newTables != tables) {
			NotificationChain msgs = null;
			if (tables != null)
				msgs = ((InternalEObject)tables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdbmsPackage.SCHEMA__TABLES, null, msgs);
			if (newTables != null)
				msgs = ((InternalEObject)newTables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdbmsPackage.SCHEMA__TABLES, null, msgs);
			msgs = basicSetTables(newTables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.SCHEMA__TABLES, newTables, newTables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public foreignKeys getForeignKeys() {
		return foreignKeys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForeignKeys(foreignKeys newForeignKeys, NotificationChain msgs) {
		foreignKeys oldForeignKeys = foreignKeys;
		foreignKeys = newForeignKeys;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdbmsPackage.SCHEMA__FOREIGN_KEYS, oldForeignKeys, newForeignKeys);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignKeys(foreignKeys newForeignKeys) {
		if (newForeignKeys != foreignKeys) {
			NotificationChain msgs = null;
			if (foreignKeys != null)
				msgs = ((InternalEObject)foreignKeys).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdbmsPackage.SCHEMA__FOREIGN_KEYS, null, msgs);
			if (newForeignKeys != null)
				msgs = ((InternalEObject)newForeignKeys).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdbmsPackage.SCHEMA__FOREIGN_KEYS, null, msgs);
			msgs = basicSetForeignKeys(newForeignKeys, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.SCHEMA__FOREIGN_KEYS, newForeignKeys, newForeignKeys));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.SCHEMA__KIND, oldKind, kind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.SCHEMA__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.SCHEMA__OID, oldOID, oID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdbmsPackage.SCHEMA__TABLES:
				return basicSetTables(null, msgs);
			case RdbmsPackage.SCHEMA__FOREIGN_KEYS:
				return basicSetForeignKeys(null, msgs);
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
			case RdbmsPackage.SCHEMA__TABLES:
				return getTables();
			case RdbmsPackage.SCHEMA__FOREIGN_KEYS:
				return getForeignKeys();
			case RdbmsPackage.SCHEMA__KIND:
				return getKind();
			case RdbmsPackage.SCHEMA__NAME:
				return getName();
			case RdbmsPackage.SCHEMA__OID:
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
			case RdbmsPackage.SCHEMA__TABLES:
				setTables((tables)newValue);
				return;
			case RdbmsPackage.SCHEMA__FOREIGN_KEYS:
				setForeignKeys((foreignKeys)newValue);
				return;
			case RdbmsPackage.SCHEMA__KIND:
				setKind((String)newValue);
				return;
			case RdbmsPackage.SCHEMA__NAME:
				setName((String)newValue);
				return;
			case RdbmsPackage.SCHEMA__OID:
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
			case RdbmsPackage.SCHEMA__TABLES:
				setTables((tables)null);
				return;
			case RdbmsPackage.SCHEMA__FOREIGN_KEYS:
				setForeignKeys((foreignKeys)null);
				return;
			case RdbmsPackage.SCHEMA__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case RdbmsPackage.SCHEMA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RdbmsPackage.SCHEMA__OID:
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
			case RdbmsPackage.SCHEMA__TABLES:
				return tables != null;
			case RdbmsPackage.SCHEMA__FOREIGN_KEYS:
				return foreignKeys != null;
			case RdbmsPackage.SCHEMA__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
			case RdbmsPackage.SCHEMA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RdbmsPackage.SCHEMA__OID:
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

} //schemaImpl
