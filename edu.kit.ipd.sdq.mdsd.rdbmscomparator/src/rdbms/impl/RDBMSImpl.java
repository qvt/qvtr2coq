/**
 */
package rdbms.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rdbms.RDBMS;
import rdbms.RdbmsPackage;
import rdbms.schemas;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RDBMS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdbms.impl.RDBMSImpl#getSchemas <em>Schemas</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RDBMSImpl extends MinimalEObjectImpl.Container implements RDBMS {
	/**
	 * The cached value of the '{@link #getSchemas() <em>Schemas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemas()
	 * @generated
	 * @ordered
	 */
	protected schemas schemas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RDBMSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbmsPackage.Literals.RDBMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public schemas getSchemas() {
		return schemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchemas(schemas newSchemas, NotificationChain msgs) {
		schemas oldSchemas = schemas;
		schemas = newSchemas;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdbmsPackage.RDBMS__SCHEMAS, oldSchemas, newSchemas);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemas(schemas newSchemas) {
		if (newSchemas != schemas) {
			NotificationChain msgs = null;
			if (schemas != null)
				msgs = ((InternalEObject)schemas).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdbmsPackage.RDBMS__SCHEMAS, null, msgs);
			if (newSchemas != null)
				msgs = ((InternalEObject)newSchemas).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdbmsPackage.RDBMS__SCHEMAS, null, msgs);
			msgs = basicSetSchemas(newSchemas, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.RDBMS__SCHEMAS, newSchemas, newSchemas));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdbmsPackage.RDBMS__SCHEMAS:
				return basicSetSchemas(null, msgs);
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
			case RdbmsPackage.RDBMS__SCHEMAS:
				return getSchemas();
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
			case RdbmsPackage.RDBMS__SCHEMAS:
				setSchemas((schemas)newValue);
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
			case RdbmsPackage.RDBMS__SCHEMAS:
				setSchemas((schemas)null);
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
			case RdbmsPackage.RDBMS__SCHEMAS:
				return schemas != null;
		}
		return super.eIsSet(featureID);
	}

} //RDBMSImpl
