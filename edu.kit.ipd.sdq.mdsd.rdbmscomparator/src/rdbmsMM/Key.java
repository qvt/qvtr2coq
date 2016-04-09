/**
 */
package rdbmsMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdbmsMM.Key#getName <em>Name</em>}</li>
 *   <li>{@link rdbmsMM.Key#getOwner <em>Owner</em>}</li>
 *   <li>{@link rdbmsMM.Key#getColumn <em>Column</em>}</li>
 *   <li>{@link rdbmsMM.Key#getReferedBy <em>Refered By</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdbmsMM.RdbmsMMPackage#getKey()
 * @model
 * @generated
 */
public interface Key extends EObject {
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
	 * @see rdbmsMM.RdbmsMMPackage#getKey_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rdbmsMM.Key#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link rdbmsMM.Table#getHasKey <em>Has Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Table)
	 * @see rdbmsMM.RdbmsMMPackage#getKey_Owner()
	 * @see rdbmsMM.Table#getHasKey
	 * @model opposite="hasKey" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Table getOwner();

	/**
	 * Sets the value of the '{@link rdbmsMM.Key#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Table value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference list.
	 * The list contents are of type {@link rdbmsMM.Column}.
	 * It is bidirectional and its opposite is '{@link rdbmsMM.Column#getHasKey <em>Has Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference list.
	 * @see rdbmsMM.RdbmsMMPackage#getKey_Column()
	 * @see rdbmsMM.Column#getHasKey
	 * @model opposite="hasKey" required="true" ordered="false"
	 * @generated
	 */
	EList<Column> getColumn();

	/**
	 * Returns the value of the '<em><b>Refered By</b></em>' reference list.
	 * The list contents are of type {@link rdbmsMM.ForeignKey}.
	 * It is bidirectional and its opposite is '{@link rdbmsMM.ForeignKey#getRefersTo <em>Refers To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refered By</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refered By</em>' reference list.
	 * @see rdbmsMM.RdbmsMMPackage#getKey_ReferedBy()
	 * @see rdbmsMM.ForeignKey#getRefersTo
	 * @model opposite="refersTo" required="true" ordered="false"
	 * @generated
	 */
	EList<ForeignKey> getReferedBy();

} // Key
