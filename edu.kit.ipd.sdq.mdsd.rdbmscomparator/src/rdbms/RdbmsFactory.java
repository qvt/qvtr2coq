/**
 */
package rdbms;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rdbms.RdbmsPackage
 * @generated
 */
public interface RdbmsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RdbmsFactory eINSTANCE = rdbms.impl.RdbmsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>column</em>'.
	 * @generated
	 */
	column createcolumn();

	/**
	 * Returns a new object of class '<em>columns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>columns</em>'.
	 * @generated
	 */
	columns createcolumns();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>foreign Key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>foreign Key</em>'.
	 * @generated
	 */
	foreignKey createforeignKey();

	/**
	 * Returns a new object of class '<em>foreign Keys</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>foreign Keys</em>'.
	 * @generated
	 */
	foreignKeys createforeignKeys();

	/**
	 * Returns a new object of class '<em>has Foreign Keys</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>has Foreign Keys</em>'.
	 * @generated
	 */
	hasForeignKeys createhasForeignKeys();

	/**
	 * Returns a new object of class '<em>key</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>key</em>'.
	 * @generated
	 */
	key createkey();

	/**
	 * Returns a new object of class '<em>key2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>key2</em>'.
	 * @generated
	 */
	key2 createkey2();

	/**
	 * Returns a new object of class '<em>oID</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>oID</em>'.
	 * @generated
	 */
	oID createoID();

	/**
	 * Returns a new object of class '<em>RDBMS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RDBMS</em>'.
	 * @generated
	 */
	RDBMS createRDBMS();

	/**
	 * Returns a new object of class '<em>referenced Columns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>referenced Columns</em>'.
	 * @generated
	 */
	referencedColumns createreferencedColumns();

	/**
	 * Returns a new object of class '<em>referenced Keys</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>referenced Keys</em>'.
	 * @generated
	 */
	referencedKeys createreferencedKeys();

	/**
	 * Returns a new object of class '<em>schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>schema</em>'.
	 * @generated
	 */
	schema createschema();

	/**
	 * Returns a new object of class '<em>schemas</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>schemas</em>'.
	 * @generated
	 */
	schemas createschemas();

	/**
	 * Returns a new object of class '<em>table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>table</em>'.
	 * @generated
	 */
	table createtable();

	/**
	 * Returns a new object of class '<em>tables</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>tables</em>'.
	 * @generated
	 */
	tables createtables();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RdbmsPackage getRdbmsPackage();

} //RdbmsFactory
