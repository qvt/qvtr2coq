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
import uml.attribute;
import uml.ownerClassifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.attributeImpl#getOwnerClassifier <em>Owner Classifier</em>}</li>
 *   <li>{@link uml.impl.attributeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link uml.impl.attributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link uml.impl.attributeImpl#getOID <em>OID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class attributeImpl extends MinimalEObjectImpl.Container implements attribute {
	/**
	 * The cached value of the '{@link #getOwnerClassifier() <em>Owner Classifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerClassifier()
	 * @generated
	 * @ordered
	 */
	protected ownerClassifier ownerClassifier;

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
	protected attributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlPackage.Literals.ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ownerClassifier getOwnerClassifier() {
		return ownerClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerClassifier(ownerClassifier newOwnerClassifier, NotificationChain msgs) {
		ownerClassifier oldOwnerClassifier = ownerClassifier;
		ownerClassifier = newOwnerClassifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.ATTRIBUTE__OWNER_CLASSIFIER, oldOwnerClassifier, newOwnerClassifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerClassifier(ownerClassifier newOwnerClassifier) {
		if (newOwnerClassifier != ownerClassifier) {
			NotificationChain msgs = null;
			if (ownerClassifier != null)
				msgs = ((InternalEObject)ownerClassifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.ATTRIBUTE__OWNER_CLASSIFIER, null, msgs);
			if (newOwnerClassifier != null)
				msgs = ((InternalEObject)newOwnerClassifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.ATTRIBUTE__OWNER_CLASSIFIER, null, msgs);
			msgs = basicSetOwnerClassifier(newOwnerClassifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ATTRIBUTE__OWNER_CLASSIFIER, newOwnerClassifier, newOwnerClassifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ATTRIBUTE__KIND, oldKind, kind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ATTRIBUTE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ATTRIBUTE__OID, oldOID, oID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmlPackage.ATTRIBUTE__OWNER_CLASSIFIER:
				return basicSetOwnerClassifier(null, msgs);
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
			case UmlPackage.ATTRIBUTE__OWNER_CLASSIFIER:
				return getOwnerClassifier();
			case UmlPackage.ATTRIBUTE__KIND:
				return getKind();
			case UmlPackage.ATTRIBUTE__NAME:
				return getName();
			case UmlPackage.ATTRIBUTE__OID:
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
			case UmlPackage.ATTRIBUTE__OWNER_CLASSIFIER:
				setOwnerClassifier((ownerClassifier)newValue);
				return;
			case UmlPackage.ATTRIBUTE__KIND:
				setKind((String)newValue);
				return;
			case UmlPackage.ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case UmlPackage.ATTRIBUTE__OID:
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
			case UmlPackage.ATTRIBUTE__OWNER_CLASSIFIER:
				setOwnerClassifier((ownerClassifier)null);
				return;
			case UmlPackage.ATTRIBUTE__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case UmlPackage.ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UmlPackage.ATTRIBUTE__OID:
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
			case UmlPackage.ATTRIBUTE__OWNER_CLASSIFIER:
				return ownerClassifier != null;
			case UmlPackage.ATTRIBUTE__KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
			case UmlPackage.ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UmlPackage.ATTRIBUTE__OID:
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

} //attributeImpl
