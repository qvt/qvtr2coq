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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
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
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdbmsMM.impl.TableImpl#getName <em>Name</em>}</li>
 *   <li>{@link rdbmsMM.impl.TableImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link rdbmsMM.impl.TableImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link rdbmsMM.impl.TableImpl#getHasKey <em>Has Key</em>}</li>
 *   <li>{@link rdbmsMM.impl.TableImpl#getHasForeignKey <em>Has Foreign Key</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends MinimalEObjectImpl.Container implements Table {
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
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> column;

	/**
	 * The cached value of the '{@link #getHasKey() <em>Has Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasKey()
	 * @generated
	 * @ordered
	 */
	protected Key hasKey;

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
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbmsMMPackage.Literals.TABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsMMPackage.TABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getSchema() {
		if (eContainerFeatureID() != RdbmsMMPackage.TABLE__SCHEMA) return null;
		return (Schema)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchema(Schema newSchema, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSchema, RdbmsMMPackage.TABLE__SCHEMA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(Schema newSchema) {
		if (newSchema != eInternalContainer() || (eContainerFeatureID() != RdbmsMMPackage.TABLE__SCHEMA && newSchema != null)) {
			if (EcoreUtil.isAncestor(this, newSchema))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSchema != null)
				msgs = ((InternalEObject)newSchema).eInverseAdd(this, RdbmsMMPackage.SCHEMA__TABLE, Schema.class, msgs);
			msgs = basicSetSchema(newSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsMMPackage.TABLE__SCHEMA, newSchema, newSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumn() {
		if (column == null) {
			column = new EObjectContainmentWithInverseEList<Column>(Column.class, this, RdbmsMMPackage.TABLE__COLUMN, RdbmsMMPackage.COLUMN__OWNER);
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Key getHasKey() {
		return hasKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHasKey(Key newHasKey, NotificationChain msgs) {
		Key oldHasKey = hasKey;
		hasKey = newHasKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdbmsMMPackage.TABLE__HAS_KEY, oldHasKey, newHasKey);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasKey(Key newHasKey) {
		if (newHasKey != hasKey) {
			NotificationChain msgs = null;
			if (hasKey != null)
				msgs = ((InternalEObject)hasKey).eInverseRemove(this, RdbmsMMPackage.KEY__OWNER, Key.class, msgs);
			if (newHasKey != null)
				msgs = ((InternalEObject)newHasKey).eInverseAdd(this, RdbmsMMPackage.KEY__OWNER, Key.class, msgs);
			msgs = basicSetHasKey(newHasKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsMMPackage.TABLE__HAS_KEY, newHasKey, newHasKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ForeignKey> getHasForeignKey() {
		if (hasForeignKey == null) {
			hasForeignKey = new EObjectWithInverseResolvingEList<ForeignKey>(ForeignKey.class, this, RdbmsMMPackage.TABLE__HAS_FOREIGN_KEY, RdbmsMMPackage.FOREIGN_KEY__OWNER);
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
			case RdbmsMMPackage.TABLE__SCHEMA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSchema((Schema)otherEnd, msgs);
			case RdbmsMMPackage.TABLE__COLUMN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getColumn()).basicAdd(otherEnd, msgs);
			case RdbmsMMPackage.TABLE__HAS_KEY:
				if (hasKey != null)
					msgs = ((InternalEObject)hasKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdbmsMMPackage.TABLE__HAS_KEY, null, msgs);
				return basicSetHasKey((Key)otherEnd, msgs);
			case RdbmsMMPackage.TABLE__HAS_FOREIGN_KEY:
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
			case RdbmsMMPackage.TABLE__SCHEMA:
				return basicSetSchema(null, msgs);
			case RdbmsMMPackage.TABLE__COLUMN:
				return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
			case RdbmsMMPackage.TABLE__HAS_KEY:
				return basicSetHasKey(null, msgs);
			case RdbmsMMPackage.TABLE__HAS_FOREIGN_KEY:
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
			case RdbmsMMPackage.TABLE__SCHEMA:
				return eInternalContainer().eInverseRemove(this, RdbmsMMPackage.SCHEMA__TABLE, Schema.class, msgs);
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
			case RdbmsMMPackage.TABLE__NAME:
				return getName();
			case RdbmsMMPackage.TABLE__SCHEMA:
				return getSchema();
			case RdbmsMMPackage.TABLE__COLUMN:
				return getColumn();
			case RdbmsMMPackage.TABLE__HAS_KEY:
				return getHasKey();
			case RdbmsMMPackage.TABLE__HAS_FOREIGN_KEY:
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
			case RdbmsMMPackage.TABLE__NAME:
				setName((String)newValue);
				return;
			case RdbmsMMPackage.TABLE__SCHEMA:
				setSchema((Schema)newValue);
				return;
			case RdbmsMMPackage.TABLE__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends Column>)newValue);
				return;
			case RdbmsMMPackage.TABLE__HAS_KEY:
				setHasKey((Key)newValue);
				return;
			case RdbmsMMPackage.TABLE__HAS_FOREIGN_KEY:
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
			case RdbmsMMPackage.TABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RdbmsMMPackage.TABLE__SCHEMA:
				setSchema((Schema)null);
				return;
			case RdbmsMMPackage.TABLE__COLUMN:
				getColumn().clear();
				return;
			case RdbmsMMPackage.TABLE__HAS_KEY:
				setHasKey((Key)null);
				return;
			case RdbmsMMPackage.TABLE__HAS_FOREIGN_KEY:
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
			case RdbmsMMPackage.TABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RdbmsMMPackage.TABLE__SCHEMA:
				return getSchema() != null;
			case RdbmsMMPackage.TABLE__COLUMN:
				return column != null && !column.isEmpty();
			case RdbmsMMPackage.TABLE__HAS_KEY:
				return hasKey != null;
			case RdbmsMMPackage.TABLE__HAS_FOREIGN_KEY:
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
		result.append(')');
		return result.toString();
	}

} //TableImpl
