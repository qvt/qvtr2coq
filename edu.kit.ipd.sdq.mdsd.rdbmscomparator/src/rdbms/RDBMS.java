/**
 */
package rdbms;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDBMS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rdbms.RDBMS#getSchemas <em>Schemas</em>}</li>
 * </ul>
 * </p>
 *
 * @see rdbms.RdbmsPackage#getRDBMS()
 * @model extendedMetaData="name='RDBMS_._type' kind='elementOnly'"
 * @generated
 */
public interface RDBMS extends EObject {
	/**
	 * Returns the value of the '<em><b>Schemas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schemas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemas</em>' containment reference.
	 * @see #setSchemas(schemas)
	 * @see rdbms.RdbmsPackage#getRDBMS_Schemas()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='schemas' namespace='##targetNamespace'"
	 * @generated
	 */
	schemas getSchemas();

	/**
	 * Sets the value of the '{@link rdbms.RDBMS#getSchemas <em>Schemas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schemas</em>' containment reference.
	 * @see #getSchemas()
	 * @generated
	 */
	void setSchemas(schemas value);

} // RDBMS
