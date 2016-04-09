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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import umlMM_.Association;
import umlMM_.Attribute;
import umlMM_.KIND;
import umlMM_.UmlMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link umlMM_.impl.ClassImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link umlMM_.impl.ClassImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link umlMM_.impl.ClassImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link umlMM_.impl.ClassImpl#getSubclass <em>Subclass</em>}</li>
 *   <li>{@link umlMM_.impl.ClassImpl#getSourceOf <em>Source Of</em>}</li>
 *   <li>{@link umlMM_.impl.ClassImpl#getDestinationOf <em>Destination Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends ClassifierImpl implements umlMM_.Class {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final KIND KIND_EDEFAULT = KIND.PERSISTENT;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected KIND kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected umlMM_.Class general;

	/**
	 * The cached value of the '{@link #getSubclass() <em>Subclass</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubclass()
	 * @generated
	 * @ordered
	 */
	protected EList<umlMM_.Class> subclass;

	/**
	 * The cached value of the '{@link #getSourceOf() <em>Source Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> sourceOf;

	/**
	 * The cached value of the '{@link #getDestinationOf() <em>Destination Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> destinationOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlMMPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KIND getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(KIND newKind) {
		KIND oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlMMPackage.CLASS__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentWithInverseEList<Attribute>(Attribute.class, this, UmlMMPackage.CLASS__ATTRIBUTE, UmlMMPackage.ATTRIBUTE__OWNER);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public umlMM_.Class getGeneral() {
		if (general != null && general.eIsProxy()) {
			InternalEObject oldGeneral = (InternalEObject)general;
			general = (umlMM_.Class)eResolveProxy(oldGeneral);
			if (general != oldGeneral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlMMPackage.CLASS__GENERAL, oldGeneral, general));
			}
		}
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public umlMM_.Class basicGetGeneral() {
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneral(umlMM_.Class newGeneral, NotificationChain msgs) {
		umlMM_.Class oldGeneral = general;
		general = newGeneral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlMMPackage.CLASS__GENERAL, oldGeneral, newGeneral);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(umlMM_.Class newGeneral) {
		if (newGeneral != general) {
			NotificationChain msgs = null;
			if (general != null)
				msgs = ((InternalEObject)general).eInverseRemove(this, UmlMMPackage.CLASS__SUBCLASS, umlMM_.Class.class, msgs);
			if (newGeneral != null)
				msgs = ((InternalEObject)newGeneral).eInverseAdd(this, UmlMMPackage.CLASS__SUBCLASS, umlMM_.Class.class, msgs);
			msgs = basicSetGeneral(newGeneral, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlMMPackage.CLASS__GENERAL, newGeneral, newGeneral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<umlMM_.Class> getSubclass() {
		if (subclass == null) {
			subclass = new EObjectWithInverseResolvingEList<umlMM_.Class>(umlMM_.Class.class, this, UmlMMPackage.CLASS__SUBCLASS, UmlMMPackage.CLASS__GENERAL);
		}
		return subclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getSourceOf() {
		if (sourceOf == null) {
			sourceOf = new EObjectWithInverseResolvingEList<Association>(Association.class, this, UmlMMPackage.CLASS__SOURCE_OF, UmlMMPackage.ASSOCIATION__SOURCE);
		}
		return sourceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getDestinationOf() {
		if (destinationOf == null) {
			destinationOf = new EObjectWithInverseResolvingEList<Association>(Association.class, this, UmlMMPackage.CLASS__DESTINATION_OF, UmlMMPackage.ASSOCIATION__DESTINATION);
		}
		return destinationOf;
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
			case UmlMMPackage.CLASS__ATTRIBUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAttribute()).basicAdd(otherEnd, msgs);
			case UmlMMPackage.CLASS__GENERAL:
				if (general != null)
					msgs = ((InternalEObject)general).eInverseRemove(this, UmlMMPackage.CLASS__SUBCLASS, umlMM_.Class.class, msgs);
				return basicSetGeneral((umlMM_.Class)otherEnd, msgs);
			case UmlMMPackage.CLASS__SUBCLASS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubclass()).basicAdd(otherEnd, msgs);
			case UmlMMPackage.CLASS__SOURCE_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceOf()).basicAdd(otherEnd, msgs);
			case UmlMMPackage.CLASS__DESTINATION_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDestinationOf()).basicAdd(otherEnd, msgs);
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
			case UmlMMPackage.CLASS__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case UmlMMPackage.CLASS__GENERAL:
				return basicSetGeneral(null, msgs);
			case UmlMMPackage.CLASS__SUBCLASS:
				return ((InternalEList<?>)getSubclass()).basicRemove(otherEnd, msgs);
			case UmlMMPackage.CLASS__SOURCE_OF:
				return ((InternalEList<?>)getSourceOf()).basicRemove(otherEnd, msgs);
			case UmlMMPackage.CLASS__DESTINATION_OF:
				return ((InternalEList<?>)getDestinationOf()).basicRemove(otherEnd, msgs);
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
			case UmlMMPackage.CLASS__KIND:
				return getKind();
			case UmlMMPackage.CLASS__ATTRIBUTE:
				return getAttribute();
			case UmlMMPackage.CLASS__GENERAL:
				if (resolve) return getGeneral();
				return basicGetGeneral();
			case UmlMMPackage.CLASS__SUBCLASS:
				return getSubclass();
			case UmlMMPackage.CLASS__SOURCE_OF:
				return getSourceOf();
			case UmlMMPackage.CLASS__DESTINATION_OF:
				return getDestinationOf();
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
			case UmlMMPackage.CLASS__KIND:
				setKind((KIND)newValue);
				return;
			case UmlMMPackage.CLASS__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case UmlMMPackage.CLASS__GENERAL:
				setGeneral((umlMM_.Class)newValue);
				return;
			case UmlMMPackage.CLASS__SUBCLASS:
				getSubclass().clear();
				getSubclass().addAll((Collection<? extends umlMM_.Class>)newValue);
				return;
			case UmlMMPackage.CLASS__SOURCE_OF:
				getSourceOf().clear();
				getSourceOf().addAll((Collection<? extends Association>)newValue);
				return;
			case UmlMMPackage.CLASS__DESTINATION_OF:
				getDestinationOf().clear();
				getDestinationOf().addAll((Collection<? extends Association>)newValue);
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
			case UmlMMPackage.CLASS__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case UmlMMPackage.CLASS__ATTRIBUTE:
				getAttribute().clear();
				return;
			case UmlMMPackage.CLASS__GENERAL:
				setGeneral((umlMM_.Class)null);
				return;
			case UmlMMPackage.CLASS__SUBCLASS:
				getSubclass().clear();
				return;
			case UmlMMPackage.CLASS__SOURCE_OF:
				getSourceOf().clear();
				return;
			case UmlMMPackage.CLASS__DESTINATION_OF:
				getDestinationOf().clear();
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
			case UmlMMPackage.CLASS__KIND:
				return kind != KIND_EDEFAULT;
			case UmlMMPackage.CLASS__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case UmlMMPackage.CLASS__GENERAL:
				return general != null;
			case UmlMMPackage.CLASS__SUBCLASS:
				return subclass != null && !subclass.isEmpty();
			case UmlMMPackage.CLASS__SOURCE_OF:
				return sourceOf != null && !sourceOf.isEmpty();
			case UmlMMPackage.CLASS__DESTINATION_OF:
				return destinationOf != null && !destinationOf.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ClassImpl
