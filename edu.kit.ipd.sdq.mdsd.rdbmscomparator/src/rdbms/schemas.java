/**
 */
package rdbms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>schemas</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdbms.schemas#getGroup <em>Group</em>}</li>
 *   <li>{@link rdbms.schemas#getSchema <em>Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdbms.RdbmsPackage#getschemas()
 * @model extendedMetaData="name='schemas_._type' kind='elementOnly'"
 * @generated
 */
public interface schemas extends EObject {
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
	 * @see rdbms.RdbmsPackage#getschemas_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference list.
	 * The list contents are of type {@link rdbms.schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference list.
	 * @see rdbms.RdbmsPackage#getschemas_Schema()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='schema' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<schema> getSchema();

} // schemas