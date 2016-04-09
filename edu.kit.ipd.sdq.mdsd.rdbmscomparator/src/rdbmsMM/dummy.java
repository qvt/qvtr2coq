/**
 */
package rdbmsMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>dummy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdbmsMM.dummy#getContainsSchema <em>Contains Schema</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdbmsMM.RdbmsMMPackage#getdummy()
 * @model
 * @generated
 */
public interface dummy extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains Schema</b></em>' containment reference list.
	 * The list contents are of type {@link rdbmsMM.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Schema</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Schema</em>' containment reference list.
	 * @see rdbmsMM.RdbmsMMPackage#getdummy_ContainsSchema()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<Schema> getContainsSchema();

} // dummy
