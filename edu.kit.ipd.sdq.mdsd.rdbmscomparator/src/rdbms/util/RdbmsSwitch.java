/**
 */
package rdbms.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rdbms.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see rdbms.RdbmsPackage
 * @generated
 */
public class RdbmsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RdbmsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsSwitch() {
		if (modelPackage == null) {
			modelPackage = RdbmsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RdbmsPackage.COLUMN: {
				column column = (column)theEObject;
				T result = casecolumn(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.COLUMNS: {
				columns columns = (columns)theEObject;
				T result = casecolumns(columns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.FOREIGN_KEY: {
				foreignKey foreignKey = (foreignKey)theEObject;
				T result = caseforeignKey(foreignKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.FOREIGN_KEYS: {
				foreignKeys foreignKeys = (foreignKeys)theEObject;
				T result = caseforeignKeys(foreignKeys);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.HAS_FOREIGN_KEYS: {
				hasForeignKeys hasForeignKeys = (hasForeignKeys)theEObject;
				T result = casehasForeignKeys(hasForeignKeys);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.KEY: {
				key key = (key)theEObject;
				T result = casekey(key);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.KEY2: {
				key2 key2 = (key2)theEObject;
				T result = casekey2(key2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.OID: {
				oID oID = (oID)theEObject;
				T result = caseoID(oID);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.RDBMS: {
				RDBMS rdbms = (RDBMS)theEObject;
				T result = caseRDBMS(rdbms);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.REFERENCED_COLUMNS: {
				referencedColumns referencedColumns = (referencedColumns)theEObject;
				T result = casereferencedColumns(referencedColumns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.REFERENCED_KEYS: {
				referencedKeys referencedKeys = (referencedKeys)theEObject;
				T result = casereferencedKeys(referencedKeys);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.SCHEMA: {
				schema schema = (schema)theEObject;
				T result = caseschema(schema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.SCHEMAS: {
				schemas schemas = (schemas)theEObject;
				T result = caseschemas(schemas);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.TABLE: {
				table table = (table)theEObject;
				T result = casetable(table);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdbmsPackage.TABLES: {
				tables tables = (tables)theEObject;
				T result = casetables(tables);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecolumn(column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>columns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>columns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecolumns(columns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>foreign Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseforeignKey(foreignKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>foreign Keys</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>foreign Keys</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseforeignKeys(foreignKeys object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>has Foreign Keys</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>has Foreign Keys</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casehasForeignKeys(hasForeignKeys object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casekey(key object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>key2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>key2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casekey2(key2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>oID</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>oID</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseoID(oID object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RDBMS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RDBMS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRDBMS(RDBMS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>referenced Columns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>referenced Columns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casereferencedColumns(referencedColumns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>referenced Keys</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>referenced Keys</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casereferencedKeys(referencedKeys object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseschema(schema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>schemas</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>schemas</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseschemas(schemas object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetable(table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tables</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tables</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetables(tables object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RdbmsSwitch
