/**
 */
package rdbmsMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdbmsMM.Schema#getName <em>Name</em>}</li>
 *   <li>{@link rdbmsMM.Schema#getTable <em>Table</em>}</li>
 *   <li>{@link rdbmsMM.Schema#getForeignKey <em>Foreign Key</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdbmsMM.RdbmsMMPackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject {
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
	 * @see rdbmsMM.RdbmsMMPackage#getSchema_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rdbmsMM.Schema#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link rdbmsMM.Table}.
	 * It is bidirectional and its opposite is '{@link rdbmsMM.Table#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see rdbmsMM.RdbmsMMPackage#getSchema_Table()
	 * @see rdbmsMM.Table#getSchema
	 * @model opposite="schema" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Table> getTable();

	/**
	 * Returns the value of the '<em><b>Foreign Key</b></em>' containment reference list.
	 * The list contents are of type {@link rdbmsMM.ForeignKey}.
	 * It is bidirectional and its opposite is '{@link rdbmsMM.ForeignKey#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Key</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Key</em>' containment reference list.
	 * @see rdbmsMM.RdbmsMMPackage#getSchema_ForeignKey()
	 * @see rdbmsMM.ForeignKey#getSchema
	 * @model opposite="schema" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<ForeignKey> getForeignKey();

} // Schema
