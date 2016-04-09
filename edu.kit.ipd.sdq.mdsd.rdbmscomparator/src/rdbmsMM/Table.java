/**
 */
package rdbmsMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdbmsMM.Table#getName <em>Name</em>}</li>
 *   <li>{@link rdbmsMM.Table#getSchema <em>Schema</em>}</li>
 *   <li>{@link rdbmsMM.Table#getColumn <em>Column</em>}</li>
 *   <li>{@link rdbmsMM.Table#getHasKey <em>Has Key</em>}</li>
 *   <li>{@link rdbmsMM.Table#getHasForeignKey <em>Has Foreign Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdbmsMM.RdbmsMMPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
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
	 * @see rdbmsMM.RdbmsMMPackage#getTable_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rdbmsMM.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rdbmsMM.Schema#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(Schema)
	 * @see rdbmsMM.RdbmsMMPackage#getTable_Schema()
	 * @see rdbmsMM.Schema#getTable
	 * @model opposite="table" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link rdbmsMM.Table#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link rdbmsMM.Column}.
	 * It is bidirectional and its opposite is '{@link rdbmsMM.Column#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see rdbmsMM.RdbmsMMPackage#getTable_Column()
	 * @see rdbmsMM.Column#getOwner
	 * @model opposite="owner" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Column> getColumn();

	/**
	 * Returns the value of the '<em><b>Has Key</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link rdbmsMM.Key#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Key</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Key</em>' containment reference.
	 * @see #setHasKey(Key)
	 * @see rdbmsMM.RdbmsMMPackage#getTable_HasKey()
	 * @see rdbmsMM.Key#getOwner
	 * @model opposite="owner" containment="true" required="true" ordered="false"
	 * @generated
	 */
	Key getHasKey();

	/**
	 * Sets the value of the '{@link rdbmsMM.Table#getHasKey <em>Has Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Key</em>' containment reference.
	 * @see #getHasKey()
	 * @generated
	 */
	void setHasKey(Key value);

	/**
	 * Returns the value of the '<em><b>Has Foreign Key</b></em>' reference list.
	 * The list contents are of type {@link rdbmsMM.ForeignKey}.
	 * It is bidirectional and its opposite is '{@link rdbmsMM.ForeignKey#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Foreign Key</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Foreign Key</em>' reference list.
	 * @see rdbmsMM.RdbmsMMPackage#getTable_HasForeignKey()
	 * @see rdbmsMM.ForeignKey#getOwner
	 * @model opposite="owner" required="true" ordered="false"
	 * @generated
	 */
	EList<ForeignKey> getHasForeignKey();

} // Table
