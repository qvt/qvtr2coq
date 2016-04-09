/**
 */
package umlMM_.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import umlMM_.Association;
import umlMM_.Classifier;
import umlMM_.UmlMMPackage;
import umlMM_.dummy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link umlMM_.impl.PackageImpl#getName <em>Name</em>}</li>
 *   <li>{@link umlMM_.impl.PackageImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link umlMM_.impl.PackageImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link umlMM_.impl.PackageImpl#getDummy <em>Dummy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends MinimalEObjectImpl.Container implements umlMM_.Package {
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
	 * The cached value of the '{@link #getClassifier() <em>Classifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> classifier;

	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> association;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlMMPackage.Literals.PACKAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UmlMMPackage.PACKAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getClassifier() {
		if (classifier == null) {
			classifier = new EObjectContainmentWithInverseEList<Classifier>(Classifier.class, this, UmlMMPackage.PACKAGE__CLASSIFIER, UmlMMPackage.CLASSIFIER__NAMESPACE);
		}
		return classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getAssociation() {
		if (association == null) {
			association = new EObjectContainmentWithInverseEList<Association>(Association.class, this, UmlMMPackage.PACKAGE__ASSOCIATION, UmlMMPackage.ASSOCIATION__NAMESPACE);
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dummy getDummy() {
		if (eContainerFeatureID() != UmlMMPackage.PACKAGE__DUMMY) return null;
		return (dummy)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDummy(dummy newDummy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDummy, UmlMMPackage.PACKAGE__DUMMY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDummy(dummy newDummy) {
		if (newDummy != eInternalContainer() || (eContainerFeatureID() != UmlMMPackage.PACKAGE__DUMMY && newDummy != null)) {
			if (EcoreUtil.isAncestor(this, newDummy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDummy != null)
				msgs = ((InternalEObject)newDummy).eInverseAdd(this, UmlMMPackage.DUMMY__CONTAINS_PACKAGE, dummy.class, msgs);
			msgs = basicSetDummy(newDummy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlMMPackage.PACKAGE__DUMMY, newDummy, newDummy));
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
			case UmlMMPackage.PACKAGE__CLASSIFIER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClassifier()).basicAdd(otherEnd, msgs);
			case UmlMMPackage.PACKAGE__ASSOCIATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssociation()).basicAdd(otherEnd, msgs);
			case UmlMMPackage.PACKAGE__DUMMY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDummy((dummy)otherEnd, msgs);
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
			case UmlMMPackage.PACKAGE__CLASSIFIER:
				return ((InternalEList<?>)getClassifier()).basicRemove(otherEnd, msgs);
			case UmlMMPackage.PACKAGE__ASSOCIATION:
				return ((InternalEList<?>)getAssociation()).basicRemove(otherEnd, msgs);
			case UmlMMPackage.PACKAGE__DUMMY:
				return basicSetDummy(null, msgs);
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
			case UmlMMPackage.PACKAGE__DUMMY:
				return eInternalContainer().eInverseRemove(this, UmlMMPackage.DUMMY__CONTAINS_PACKAGE, dummy.class, msgs);
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
			case UmlMMPackage.PACKAGE__NAME:
				return getName();
			case UmlMMPackage.PACKAGE__CLASSIFIER:
				return getClassifier();
			case UmlMMPackage.PACKAGE__ASSOCIATION:
				return getAssociation();
			case UmlMMPackage.PACKAGE__DUMMY:
				return getDummy();
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
			case UmlMMPackage.PACKAGE__NAME:
				setName((String)newValue);
				return;
			case UmlMMPackage.PACKAGE__CLASSIFIER:
				getClassifier().clear();
				getClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case UmlMMPackage.PACKAGE__ASSOCIATION:
				getAssociation().clear();
				getAssociation().addAll((Collection<? extends Association>)newValue);
				return;
			case UmlMMPackage.PACKAGE__DUMMY:
				setDummy((dummy)newValue);
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
			case UmlMMPackage.PACKAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UmlMMPackage.PACKAGE__CLASSIFIER:
				getClassifier().clear();
				return;
			case UmlMMPackage.PACKAGE__ASSOCIATION:
				getAssociation().clear();
				return;
			case UmlMMPackage.PACKAGE__DUMMY:
				setDummy((dummy)null);
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
			case UmlMMPackage.PACKAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UmlMMPackage.PACKAGE__CLASSIFIER:
				return classifier != null && !classifier.isEmpty();
			case UmlMMPackage.PACKAGE__ASSOCIATION:
				return association != null && !association.isEmpty();
			case UmlMMPackage.PACKAGE__DUMMY:
				return getDummy() != null;
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

} //PackageImpl
