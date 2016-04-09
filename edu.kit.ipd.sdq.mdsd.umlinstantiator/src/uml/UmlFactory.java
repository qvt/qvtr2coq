/**
 */
package uml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uml.UmlPackage
 * @generated
 */
public interface UmlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UmlFactory eINSTANCE = uml.impl.UmlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>association</em>'.
	 * @generated
	 */
	association createassociation();

	/**
	 * Returns a new object of class '<em>attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>attribute</em>'.
	 * @generated
	 */
	attribute createattribute();

	/**
	 * Returns a new object of class '<em>attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>attributes</em>'.
	 * @generated
	 */
	attributes createattributes();

	/**
	 * Returns a new object of class '<em>class </em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>class </em>'.
	 * @generated
	 */
	class_ createclass_();

	/**
	 * Returns a new object of class '<em>classifiers And Associations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>classifiers And Associations</em>'.
	 * @generated
	 */
	classifiersAndAssociations createclassifiersAndAssociations();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>general Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>general Class</em>'.
	 * @generated
	 */
	generalClass creategeneralClass();

	/**
	 * Returns a new object of class '<em>owner Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>owner Classifier</em>'.
	 * @generated
	 */
	ownerClassifier createownerClassifier();

	/**
	 * Returns a new object of class '<em>package </em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>package </em>'.
	 * @generated
	 */
	package_ createpackage_();

	/**
	 * Returns a new object of class '<em>packages</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>packages</em>'.
	 * @generated
	 */
	packages createpackages();

	/**
	 * Returns a new object of class '<em>primitive Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>primitive Data Type</em>'.
	 * @generated
	 */
	primitiveDataType createprimitiveDataType();

	/**
	 * Returns a new object of class '<em>UML</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML</em>'.
	 * @generated
	 */
	UML createUML();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UmlPackage getUmlPackage();

} //UmlFactory
