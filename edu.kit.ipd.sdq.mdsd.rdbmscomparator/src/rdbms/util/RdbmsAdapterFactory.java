/**
 */
package rdbms.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rdbms.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rdbms.RdbmsPackage
 * @generated
 */
public class RdbmsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RdbmsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdbmsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RdbmsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdbmsSwitch<Adapter> modelSwitch =
		new RdbmsSwitch<Adapter>() {
			@Override
			public Adapter casecolumn(column object) {
				return createcolumnAdapter();
			}
			@Override
			public Adapter casecolumns(columns object) {
				return createcolumnsAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseforeignKey(foreignKey object) {
				return createforeignKeyAdapter();
			}
			@Override
			public Adapter caseforeignKeys(foreignKeys object) {
				return createforeignKeysAdapter();
			}
			@Override
			public Adapter casehasForeignKeys(hasForeignKeys object) {
				return createhasForeignKeysAdapter();
			}
			@Override
			public Adapter casekey(key object) {
				return createkeyAdapter();
			}
			@Override
			public Adapter casekey2(key2 object) {
				return createkey2Adapter();
			}
			@Override
			public Adapter caseoID(oID object) {
				return createoIDAdapter();
			}
			@Override
			public Adapter caseRDBMS(RDBMS object) {
				return createRDBMSAdapter();
			}
			@Override
			public Adapter casereferencedColumns(referencedColumns object) {
				return createreferencedColumnsAdapter();
			}
			@Override
			public Adapter casereferencedKeys(referencedKeys object) {
				return createreferencedKeysAdapter();
			}
			@Override
			public Adapter caseschema(schema object) {
				return createschemaAdapter();
			}
			@Override
			public Adapter caseschemas(schemas object) {
				return createschemasAdapter();
			}
			@Override
			public Adapter casetable(table object) {
				return createtableAdapter();
			}
			@Override
			public Adapter casetables(tables object) {
				return createtablesAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link rdbms.column <em>column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdbms.column
	 * @generated
	 */
	public Adapter createcolumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdbms.columns <em>columns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdbms.columns
	 * @generated
	 */
	public Adapter createcolumnsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdbms.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdbms.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdbms.foreignKey <em>foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdbms.foreignKey
	 * @generated
	 */
	public Adapter createforeignKeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdbms.foreignKeys <em>foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdbms.foreignKeys
	 * @generated
	 */
	public Adapter createforeignKeysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdbms.hasForeignKeys <em>has Foreign Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdbms.hasForeignKeys
	 * @generated
	 */
	public Adapter createhasForeignKeysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdbms.key <em>key</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdbms.key
	 * @generated
	 */
	public Adapter createkeyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdbms.key2 <em>key2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdbms.key2
	 * @generated
	 */
	public Adapter createkey2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdbms.oID <em>oID</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdbms.oID
	 * @generated
	 */
	public Adapter createoIDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdbms.RDBMS <em>RDBMS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdbms.RDBMS
	 * @generated
	 */
	public Adapter createRDBMSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdbms.referencedColumns <em>referenced Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdbms.referencedColumns
	 * @generated
	 */
	public Adapter createreferencedColumnsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdbms.referencedKeys <em>referenced Keys</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdbms.referencedKeys
	 * @generated
	 */
	public Adapter createreferencedKeysAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdbms.schema <em>schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdbms.schema
	 * @generated
	 */
	public Adapter createschemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdbms.schemas <em>schemas</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdbms.schemas
	 * @generated
	 */
	public Adapter createschemasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdbms.table <em>table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdbms.table
	 * @generated
	 */
	public Adapter createtableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rdbms.tables <em>tables</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rdbms.tables
	 * @generated
	 */
	public Adapter createtablesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RdbmsAdapterFactory
