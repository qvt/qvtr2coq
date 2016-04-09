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
import rdbms.key;
import rdbms.referencedColumns;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdbms.impl.keyImpl#getReferencedColumns <em>Referenced Columns</em>}</li>
 *   <li>{@link rdbms.impl.keyImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link rdbms.impl.keyImpl#getName <em>Name</em>}</li>
 *   <li>{@link rdbms.impl.keyImpl#getOID <em>OID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class keyImpl extends MinimalEObjectImpl.Container implements key {
	/**
	 * The cached value of the '{@link #getReferencedColumns() <em>Referenced Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedColumns()
	 * @generated
	 * @ordered
	 */
	protected referencedColumns referencedColumns;

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
	protected keyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbmsPackage.Literals.KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public referencedColumns getReferencedColumns() {
		return referencedColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedColumns(referencedColumns newReferencedColumns, NotificationChain msgs) {
		referencedColumns oldReferencedColumns = referencedColumns;
		referencedColumns = newReferencedColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdbmsPackage.KEY__REFERENCED_COLUMNS, oldReferencedColumns, newReferencedColumns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedColumns(referencedColumns newReferencedColumns) {
		if (newReferencedColumns != referencedColumns) {
			NotificationChain msgs = null;
			if (referencedColumns != null)
				msgs = ((InternalEObject)referencedColumns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdbmsPackage.KEY__REFERENCED_COLUMNS, null, msgs);
			if (newReferencedColumns != null)
				msgs = ((InternalEObject)newReferencedColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdbmsPackage.KEY__REFERENCED_COLUMNS, null, msgs);
			msgs = basicSetReferencedColumns(newReferencedColumns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.KEY__REFERENCED_COLUMNS, newReferencedColumns, newReferencedColumns));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.KEY__KIND, oldKind, kind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.KEY__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.KEY__OID, oldOID, oID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdbmsPackage.KEY__REFERENCED_COLUMNS:
				return basicSetReferencedColumns(null, msgs);
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
			case RdbmsPackage.KEY__REFERENCED_COLUMNS:
				return getReferencedColumns();
			case RdbmsPackage.KEY__KIND:
				return getKind();
			case RdbmsPackage.KEY__NAME:
				return getName();
			case RdbmsPackage.KEY__OID:
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
			case RdbmsPackage.KEY__REFERENCED_COLUMNS:
				setReferencedColumns((referencedColumns)newValue);
				return;
			case RdbmsPackage.KEY__KIND:
				setKind((String)newValue);
				return;
			case RdbmsPackage.KEY__NAME:
				setName((String)newValue);
				return;
			case RdbmsPackage.KEY__OID:
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
			case RdbmsPackage.KEY__REFERENCED_COLUMNS:
				setReferencedColumns((referencedColumns)null);
				return;
			case RdbmsPackage.KEY__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case RdbmsPackage.KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RdbmsPackage.KEY__OID:
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
			case RdbmsPackage.KEY__REFERENCED_COLUMNS:
				return referencedColumns != null;
			case RdbmsPackage.KEY__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
			case RdbmsPackage.KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RdbmsPackage.KEY__OID:
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

} //keyImpl
