/**
 */
package uml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uml.UmlPackage;
import uml.class_;
import uml.ownerClassifier;
import uml.primitiveDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>owner Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ownerClassifierImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link uml.impl.ownerClassifierImpl#getPrimitiveDataType <em>Primitive Data Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ownerClassifierImpl extends MinimalEObjectImpl.Container implements ownerClassifier {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected class_ class_;

	/**
	 * The cached value of the '{@link #getPrimitiveDataType() <em>Primitive Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveDataType()
	 * @generated
	 * @ordered
	 */
	protected primitiveDataType primitiveDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ownerClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlPackage.Literals.OWNER_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class_ getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(class_ newClass, NotificationChain msgs) {
		class_ oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.OWNER_CLASSIFIER__CLASS, oldClass, newClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(class_ newClass) {
		if (newClass != class_) {
			NotificationChain msgs = null;
			if (class_ != null)
				msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNER_CLASSIFIER__CLASS, null, msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNER_CLASSIFIER__CLASS, null, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNER_CLASSIFIER__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public primitiveDataType getPrimitiveDataType() {
		return primitiveDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimitiveDataType(primitiveDataType newPrimitiveDataType, NotificationChain msgs) {
		primitiveDataType oldPrimitiveDataType = primitiveDataType;
		primitiveDataType = newPrimitiveDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.OWNER_CLASSIFIER__PRIMITIVE_DATA_TYPE, oldPrimitiveDataType, newPrimitiveDataType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveDataType(primitiveDataType newPrimitiveDataType) {
		if (newPrimitiveDataType != primitiveDataType) {
			NotificationChain msgs = null;
			if (primitiveDataType != null)
				msgs = ((InternalEObject)primitiveDataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNER_CLASSIFIER__PRIMITIVE_DATA_TYPE, null, msgs);
			if (newPrimitiveDataType != null)
				msgs = ((InternalEObject)newPrimitiveDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.OWNER_CLASSIFIER__PRIMITIVE_DATA_TYPE, null, msgs);
			msgs = basicSetPrimitiveDataType(newPrimitiveDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.OWNER_CLASSIFIER__PRIMITIVE_DATA_TYPE, newPrimitiveDataType, newPrimitiveDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmlPackage.OWNER_CLASSIFIER__CLASS:
				return basicSetClass(null, msgs);
			case UmlPackage.OWNER_CLASSIFIER__PRIMITIVE_DATA_TYPE:
				return basicSetPrimitiveDataType(null, msgs);
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
			case UmlPackage.OWNER_CLASSIFIER__CLASS:
				return getClass_();
			case UmlPackage.OWNER_CLASSIFIER__PRIMITIVE_DATA_TYPE:
				return getPrimitiveDataType();
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
			case UmlPackage.OWNER_CLASSIFIER__CLASS:
				setClass((class_)newValue);
				return;
			case UmlPackage.OWNER_CLASSIFIER__PRIMITIVE_DATA_TYPE:
				setPrimitiveDataType((primitiveDataType)newValue);
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
			case UmlPackage.OWNER_CLASSIFIER__CLASS:
				setClass((class_)null);
				return;
			case UmlPackage.OWNER_CLASSIFIER__PRIMITIVE_DATA_TYPE:
				setPrimitiveDataType((primitiveDataType)null);
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
			case UmlPackage.OWNER_CLASSIFIER__CLASS:
				return class_ != null;
			case UmlPackage.OWNER_CLASSIFIER__PRIMITIVE_DATA_TYPE:
				return primitiveDataType != null;
		}
		return super.eIsSet(featureID);
	}

} //ownerClassifierImpl
