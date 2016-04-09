/**
 */
package uml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>classifiers And Associations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.classifiersAndAssociations#getGroup <em>Group</em>}</li>
 *   <li>{@link uml.classifiersAndAssociations#getClass_ <em>Class</em>}</li>
 *   <li>{@link uml.classifiersAndAssociations#getPrimitiveDataType <em>Primitive Data Type</em>}</li>
 *   <li>{@link uml.classifiersAndAssociations#getAssociation <em>Association</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getclassifiersAndAssociations()
 * @model extendedMetaData="name='classifiersAndAssociations_._type' kind='elementOnly'"
 * @generated
 */
public interface classifiersAndAssociations extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see uml.UmlPackage#getclassifiersAndAssociations_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference list.
	 * The list contents are of type {@link uml.class_}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference list.
	 * @see uml.UmlPackage#getclassifiersAndAssociations_Class()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='class_' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<class_> getClass_();

	/**
	 * Returns the value of the '<em><b>Primitive Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link uml.primitiveDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Data Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Data Type</em>' containment reference list.
	 * @see uml.UmlPackage#getclassifiersAndAssociations_PrimitiveDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='primitiveDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<primitiveDataType> getPrimitiveDataType();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' containment reference list.
	 * The list contents are of type {@link uml.association}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' containment reference list.
	 * @see uml.UmlPackage#getclassifiersAndAssociations_Association()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='association' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<association> getAssociation();

} // classifiersAndAssociations
