/**
 */
package rdbmsMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdbmsMM.ForeignKey#getSchema <em>Schema</em>}</li>
 *   <li>{@link rdbmsMM.ForeignKey#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link rdbmsMM.ForeignKey#getName <em>Name</em>}</li>
 *   <li>{@link rdbmsMM.ForeignKey#getOwner <em>Owner</em>}</li>
 *   <li>{@link rdbmsMM.ForeignKey#getColumn <em>Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdbmsMM.RdbmsMMPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends EObject {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rdbmsMM.Schema#getForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' container reference.
	 * @see #setSchema(Schema)
	 * @see rdbmsMM.RdbmsMMPackage#getForeignKey_Schema()
	 * @see rdbmsMM.Schema#getForeignKey
	 * @model opposite="foreignKey" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Schema getSchema();

	/**
	 * Sets the value of the '{@link rdbmsMM.ForeignKey#getSchema <em>Schema</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema</em>' container reference.
	 * @see #getSchema()
	 * @generated
	 */
	void setSchema(Schema value);

	/**
	 * Returns the value of the '<em><b>Refers To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rdbmsMM.Key#getReferedBy <em>Refered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To</em>' reference.
	 * @see #setRefersTo(Key)
	 * @see rdbmsMM.RdbmsMMPackage#getForeignKey_RefersTo()
	 * @see rdbmsMM.Key#getReferedBy
	 * @model opposite="referedBy" required="true" ordered="false"
	 * @generated
	 */
	Key getRefersTo();

	/**
	 * Sets the value of the '{@link rdbmsMM.ForeignKey#getRefersTo <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To</em>' reference.
	 * @see #getRefersTo()
	 * @generated
	 */
	void setRefersTo(Key value);

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
	 * @see rdbmsMM.RdbmsMMPackage#getForeignKey_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rdbmsMM.ForeignKey#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link rdbmsMM.Table#getHasForeignKey <em>Has Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Table)
	 * @see rdbmsMM.RdbmsMMPackage#getForeignKey_Owner()
	 * @see rdbmsMM.Table#getHasForeignKey
	 * @model opposite="hasForeignKey" required="true" ordered="false"
	 * @generated
	 */
	Table getOwner();

	/**
	 * Sets the value of the '{@link rdbmsMM.ForeignKey#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Table value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference list.
	 * The list contents are of type {@link rdbmsMM.Column}.
	 * It is bidirectional and its opposite is '{@link rdbmsMM.Column#getHasForeignKey <em>Has Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference list.
	 * @see rdbmsMM.RdbmsMMPackage#getForeignKey_Column()
	 * @see rdbmsMM.Column#getHasForeignKey
	 * @model opposite="hasForeignKey" required="true" ordered="false"
	 * @generated
	 */
	EList<Column> getColumn();

} // ForeignKey
