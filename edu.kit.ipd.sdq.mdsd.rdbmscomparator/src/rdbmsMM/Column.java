/**
 */
package rdbmsMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdbmsMM.Column#getName <em>Name</em>}</li>
 *   <li>{@link rdbmsMM.Column#getType <em>Type</em>}</li>
 *   <li>{@link rdbmsMM.Column#getOwner <em>Owner</em>}</li>
 *   <li>{@link rdbmsMM.Column#getHasKey <em>Has Key</em>}</li>
 *   <li>{@link rdbmsMM.Column#getHasForeignKey <em>Has Foreign Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdbmsMM.RdbmsMMPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
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
	 * @see rdbmsMM.RdbmsMMPackage#getColumn_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rdbmsMM.Column#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see rdbmsMM.RdbmsMMPackage#getColumn_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link rdbmsMM.Column#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rdbmsMM.Table#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Table)
	 * @see rdbmsMM.RdbmsMMPackage#getColumn_Owner()
	 * @see rdbmsMM.Table#getColumn
	 * @model opposite="column" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Table getOwner();

	/**
	 * Sets the value of the '{@link rdbmsMM.Column#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Table value);

	/**
	 * Returns the value of the '<em><b>Has Key</b></em>' reference list.
	 * The list contents are of type {@link rdbmsMM.Key}.
	 * It is bidirectional and its opposite is '{@link rdbmsMM.Key#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Key</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Key</em>' reference list.
	 * @see rdbmsMM.RdbmsMMPackage#getColumn_HasKey()
	 * @see rdbmsMM.Key#getColumn
	 * @model opposite="column" required="true" ordered="false"
	 * @generated
	 */
	EList<Key> getHasKey();

	/**
	 * Returns the value of the '<em><b>Has Foreign Key</b></em>' reference list.
	 * The list contents are of type {@link rdbmsMM.ForeignKey}.
	 * It is bidirectional and its opposite is '{@link rdbmsMM.ForeignKey#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Foreign Key</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Foreign Key</em>' reference list.
	 * @see rdbmsMM.RdbmsMMPackage#getColumn_HasForeignKey()
	 * @see rdbmsMM.ForeignKey#getColumn
	 * @model opposite="column" required="true" ordered="false"
	 * @generated
	 */
	EList<ForeignKey> getHasForeignKey();

} // Column
