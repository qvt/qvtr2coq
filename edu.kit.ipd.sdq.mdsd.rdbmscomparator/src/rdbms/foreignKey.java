/**
 */
package rdbms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdbms.foreignKey#getReferencedColumns <em>Referenced Columns</em>}</li>
 *   <li>{@link rdbms.foreignKey#getKind <em>Kind</em>}</li>
 *   <li>{@link rdbms.foreignKey#getName <em>Name</em>}</li>
 *   <li>{@link rdbms.foreignKey#getOID <em>OID</em>}</li>
 *   <li>{@link rdbms.foreignKey#getOwner <em>Owner</em>}</li>
 *   <li>{@link rdbms.foreignKey#getRefersTo <em>Refers To</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdbms.RdbmsPackage#getforeignKey()
 * @model extendedMetaData="name='foreignKey_._type' kind='elementOnly'"
 * @generated
 */
public interface foreignKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Referenced Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Columns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Columns</em>' containment reference.
	 * @see #setReferencedColumns(referencedColumns)
	 * @see rdbms.RdbmsPackage#getforeignKey_ReferencedColumns()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referencedColumns' namespace='##targetNamespace'"
	 * @generated
	 */
	referencedColumns getReferencedColumns();

	/**
	 * Sets the value of the '{@link rdbms.foreignKey#getReferencedColumns <em>Referenced Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Columns</em>' containment reference.
	 * @see #getReferencedColumns()
	 * @generated
	 */
	void setReferencedColumns(referencedColumns value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see rdbms.RdbmsPackage#getforeignKey_Kind()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='kind'"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link rdbms.foreignKey#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rdbms.RdbmsPackage#getforeignKey_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rdbms.foreignKey#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>OID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OID</em>' attribute.
	 * @see #setOID(String)
	 * @see rdbms.RdbmsPackage#getforeignKey_OID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='oID'"
	 * @generated
	 */
	String getOID();

	/**
	 * Sets the value of the '{@link rdbms.foreignKey#getOID <em>OID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OID</em>' attribute.
	 * @see #getOID()
	 * @generated
	 */
	void setOID(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #setOwner(String)
	 * @see rdbms.RdbmsPackage#getforeignKey_Owner()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='owner'"
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link rdbms.foreignKey#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' attribute.
	 * @see #setRefersTo(String)
	 * @see rdbms.RdbmsPackage#getforeignKey_RefersTo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='refersTo'"
	 * @generated
	 */
	String getRefersTo();

	/**
	 * Sets the value of the '{@link rdbms.foreignKey#getRefersTo <em>Refers To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' attribute.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(String value);

} // foreignKey
