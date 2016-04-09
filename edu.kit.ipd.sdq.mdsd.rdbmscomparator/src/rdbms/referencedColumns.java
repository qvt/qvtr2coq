/**
 */
package rdbms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>referenced Columns</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdbms.referencedColumns#getGroup <em>Group</em>}</li>
 *   <li>{@link rdbms.referencedColumns#getOID <em>OID</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdbms.RdbmsPackage#getreferencedColumns()
 * @model extendedMetaData="name='referencedColumns_._type' kind='elementOnly'"
 * @generated
 */
public interface referencedColumns extends EObject {
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
	 * @see rdbms.RdbmsPackage#getreferencedColumns_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>OID</b></em>' containment reference list.
	 * The list contents are of type {@link rdbms.oID}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OID</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OID</em>' containment reference list.
	 * @see rdbms.RdbmsPackage#getreferencedColumns_OID()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='oID' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<oID> getOID();

} // referencedColumns
