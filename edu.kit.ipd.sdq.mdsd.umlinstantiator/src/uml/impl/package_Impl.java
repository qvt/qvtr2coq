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
import uml.classifiersAndAssociations;
import uml.package_;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>package </b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.package_Impl#getClassifiersAndAssociations <em>Classifiers And Associations</em>}</li>
 *   <li>{@link uml.impl.package_Impl#getKind <em>Kind</em>}</li>
 *   <li>{@link uml.impl.package_Impl#getName <em>Name</em>}</li>
 *   <li>{@link uml.impl.package_Impl#getOID <em>OID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class package_Impl extends MinimalEObjectImpl.Container implements package_ {
	/**
	 * The cached value of the '{@link #getClassifiersAndAssociations() <em>Classifiers And Associations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifiersAndAssociations()
	 * @generated
	 * @ordered
	 */
	protected classifiersAndAssociations classifiersAndAssociations;

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
	protected package_Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlPackage.Literals.PACKAGE_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public classifiersAndAssociations getClassifiersAndAssociations() {
		return classifiersAndAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassifiersAndAssociations(classifiersAndAssociations newClassifiersAndAssociations, NotificationChain msgs) {
		classifiersAndAssociations oldClassifiersAndAssociations = classifiersAndAssociations;
		classifiersAndAssociations = newClassifiersAndAssociations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGE___CLASSIFIERS_AND_ASSOCIATIONS, oldClassifiersAndAssociations, newClassifiersAndAssociations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifiersAndAssociations(classifiersAndAssociations newClassifiersAndAssociations) {
		if (newClassifiersAndAssociations != classifiersAndAssociations) {
			NotificationChain msgs = null;
			if (classifiersAndAssociations != null)
				msgs = ((InternalEObject)classifiersAndAssociations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.PACKAGE___CLASSIFIERS_AND_ASSOCIATIONS, null, msgs);
			if (newClassifiersAndAssociations != null)
				msgs = ((InternalEObject)newClassifiersAndAssociations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.PACKAGE___CLASSIFIERS_AND_ASSOCIATIONS, null, msgs);
			msgs = basicSetClassifiersAndAssociations(newClassifiersAndAssociations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGE___CLASSIFIERS_AND_ASSOCIATIONS, newClassifiersAndAssociations, newClassifiersAndAssociations));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGE___KIND, oldKind, kind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGE___NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.PACKAGE___OID, oldOID, oID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmlPackage.PACKAGE___CLASSIFIERS_AND_ASSOCIATIONS:
				return basicSetClassifiersAndAssociations(null, msgs);
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
			case UmlPackage.PACKAGE___CLASSIFIERS_AND_ASSOCIATIONS:
				return getClassifiersAndAssociations();
			case UmlPackage.PACKAGE___KIND:
				return getKind();
			case UmlPackage.PACKAGE___NAME:
				return getName();
			case UmlPackage.PACKAGE___OID:
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
			case UmlPackage.PACKAGE___CLASSIFIERS_AND_ASSOCIATIONS:
				setClassifiersAndAssociations((classifiersAndAssociations)newValue);
				return;
			case UmlPackage.PACKAGE___KIND:
				setKind((String)newValue);
				return;
			case UmlPackage.PACKAGE___NAME:
				setName((String)newValue);
				return;
			case UmlPackage.PACKAGE___OID:
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
			case UmlPackage.PACKAGE___CLASSIFIERS_AND_ASSOCIATIONS:
				setClassifiersAndAssociations((classifiersAndAssociations)null);
				return;
			case UmlPackage.PACKAGE___KIND:
				setKind(KIND_EDEFAULT);
				return;
			case UmlPackage.PACKAGE___NAME:
				setName(NAME_EDEFAULT);
				return;
			case UmlPackage.PACKAGE___OID:
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
			case UmlPackage.PACKAGE___CLASSIFIERS_AND_ASSOCIATIONS:
				return classifiersAndAssociations != null;
			case UmlPackage.PACKAGE___KIND:
				return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
			case UmlPackage.PACKAGE___NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UmlPackage.PACKAGE___OID:
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

} //package_Impl
