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
import rdbmsMM.Schema;
import rdbmsMM.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdbmsMM.impl.ForeignKeyImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link rdbmsMM.impl.ForeignKeyImpl#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link rdbmsMM.impl.ForeignKeyImpl#getName <em>Name</em>}</li>
 *   <li>{@link rdbmsMM.impl.ForeignKeyImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link rdbmsMM.impl.ForeignKeyImpl#getColumn <em>Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignKeyImpl extends MinimalEObjectImpl.Container implements ForeignKey {
	/**
	 * The cached value of the '{@link #getRefersTo() <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersTo()
	 * @generated
	 * @ordered
	 */
	protected Key refersTo;

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
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Table owner;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbmsMMPackage.Literals.FOREIGN_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getSchema() {
		if (eContainerFeatureID() != RdbmsMMPackage.FOREIGN_KEY__SCHEMA) return null;
		return (Schema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(Schema newSchema, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSchema, RdbmsMMPackage.FOREIGN_KEY__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(Schema newSchema) {
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RdbmsMMPackage.FOREIGN_KEY__SCHEMA && newSchema != null)) {
			if (EcoreUtil.isAncestor(this, newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = ((InternalEObject)newSchema).eInverseAdd(this, RdbmsMMPackage.SCHEMA__FOREIGN_KEY, Schema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsMMPackage.FOREIGN_KEY__SCHEMA, newSchema, newSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key getRefersTo() {
		if (refersTo != null && refersTo.eIsProxy()) {
			InternalEObject oldRefersTo = (InternalEObject)refersTo;
			refersTo = (Key)eResolveProxy(oldRefersTo);
			if (refersTo != oldRefersTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdbmsMMPackage.FOREIGN_KEY__REFERS_TO, oldRefersTo, refersTo));
			}
		}
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key basicGetRefersTo() {
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefersTo(Key newRefersTo, NotificationChain msgs) {
		Key oldRefersTo = refersTo;
		refersTo = newRefersTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdbmsMMPackage.FOREIGN_KEY__REFERS_TO, oldRefersTo, newRefersTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersTo(Key newRefersTo) {
		if (newRefersTo != refersTo) {
			NotificationChain msgs = null;
			if (refersTo != null)
				msgs = ((InternalEObject)refersTo).eInverseRemove(this, RdbmsMMPackage.KEY__REFERED_BY, Key.class, msgs);
			if (newRefersTo != null)
				msgs = ((InternalEObject)newRefersTo).eInverseAdd(this, RdbmsMMPackage.KEY__REFERED_BY, Key.class, msgs);
			msgs = basicSetRefersTo(newRefersTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsMMPackage.FOREIGN_KEY__REFERS_TO, newRefersTo, newRefersTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsMMPackage.FOREIGN_KEY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (Table)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdbmsMMPackage.FOREIGN_KEY__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Table newOwner, NotificationChain msgs) {
		Table oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdbmsMMPackage.FOREIGN_KEY__OWNER, oldOwner, newOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Table newOwner) {
		if (newOwner != owner) {
			NotificationChain msgs = null;
			if (owner != null)
				msgs = ((InternalEObject)owner).eInverseRemove(this, RdbmsMMPackage.TABLE__HAS_FOREIGN_KEY, Table.class, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, RdbmsMMPackage.TABLE__HAS_FOREIGN_KEY, Table.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsMMPackage.FOREIGN_KEY__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumn() {
		if (column == null) {
			column = new EObjectWithInverseResolvingEList.ManyInverse<Column>(Column.class, this, RdbmsMMPackage.FOREIGN_KEY__COLUMN, RdbmsMMPackage.COLUMN__HAS_FOREIGN_KEY);
		}
		return column;
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
			case RdbmsMMPackage.FOREIGN_KEY__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((Schema)otherEnd, msgs);
			case RdbmsMMPackage.FOREIGN_KEY__REFERS_TO:
				if (refersTo != null)
					msgs = ((InternalEObject)refersTo).eInverseRemove(this, RdbmsMMPackage.KEY__REFERED_BY, Key.class, msgs);
				return basicSetRefersTo((Key)otherEnd, msgs);
			case RdbmsMMPackage.FOREIGN_KEY__OWNER:
				if (owner != null)
					msgs = ((InternalEObject)owner).eInverseRemove(this, RdbmsMMPackage.TABLE__HAS_FOREIGN_KEY, Table.class, msgs);
				return basicSetOwner((Table)otherEnd, msgs);
			case RdbmsMMPackage.FOREIGN_KEY__COLUMN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getColumn()).basicAdd(otherEnd, msgs);
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
			case RdbmsMMPackage.FOREIGN_KEY__SCHEMA:
				return basicSetSchema(null, msgs);
			case RdbmsMMPackage.FOREIGN_KEY__REFERS_TO:
				return basicSetRefersTo(null, msgs);
			case RdbmsMMPackage.FOREIGN_KEY__OWNER:
				return basicSetOwner(null, msgs);
			case RdbmsMMPackage.FOREIGN_KEY__COLUMN:
				return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
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
			case RdbmsMMPackage.FOREIGN_KEY__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RdbmsMMPackage.SCHEMA__FOREIGN_KEY, Schema.class, msgs);
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
			case RdbmsMMPackage.FOREIGN_KEY__SCHEMA:
				return getSchema();
			case RdbmsMMPackage.FOREIGN_KEY__REFERS_TO:
				if (resolve) return getRefersTo();
				return basicGetRefersTo();
			case RdbmsMMPackage.FOREIGN_KEY__NAME:
				return getName();
			case RdbmsMMPackage.FOREIGN_KEY__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case RdbmsMMPackage.FOREIGN_KEY__COLUMN:
				return getColumn();
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
			case RdbmsMMPackage.FOREIGN_KEY__SCHEMA:
				setSchema((Schema)newValue);
				return;
			case RdbmsMMPackage.FOREIGN_KEY__REFERS_TO:
				setRefersTo((Key)newValue);
				return;
			case RdbmsMMPackage.FOREIGN_KEY__NAME:
				setName((String)newValue);
				return;
			case RdbmsMMPackage.FOREIGN_KEY__OWNER:
				setOwner((Table)newValue);
				return;
			case RdbmsMMPackage.FOREIGN_KEY__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends Column>)newValue);
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
			case RdbmsMMPackage.FOREIGN_KEY__SCHEMA:
				setSchema((Schema)null);
				return;
			case RdbmsMMPackage.FOREIGN_KEY__REFERS_TO:
				setRefersTo((Key)null);
				return;
			case RdbmsMMPackage.FOREIGN_KEY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RdbmsMMPackage.FOREIGN_KEY__OWNER:
				setOwner((Table)null);
				return;
			case RdbmsMMPackage.FOREIGN_KEY__COLUMN:
				getColumn().clear();
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
			case RdbmsMMPackage.FOREIGN_KEY__SCHEMA:
				return getSchema() != null;
			case RdbmsMMPackage.FOREIGN_KEY__REFERS_TO:
				return refersTo != null;
			case RdbmsMMPackage.FOREIGN_KEY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RdbmsMMPackage.FOREIGN_KEY__OWNER:
				return owner != null;
			case RdbmsMMPackage.FOREIGN_KEY__COLUMN:
				return column != null && !column.isEmpty();
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

} //ForeignKeyImpl
