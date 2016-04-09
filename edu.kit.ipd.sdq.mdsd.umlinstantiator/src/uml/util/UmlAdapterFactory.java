/**
 */
package uml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uml.UmlPackage
 * @generated
 */
public class UmlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UmlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UmlPackage.eINSTANCE;
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
	protected UmlSwitch<Adapter> modelSwitch =
		new UmlSwitch<Adapter>() {
			@Override
			public Adapter caseassociation(association object) {
				return createassociationAdapter();
			}
			@Override
			public Adapter caseattribute(attribute object) {
				return createattributeAdapter();
			}
			@Override
			public Adapter caseattributes(attributes object) {
				return createattributesAdapter();
			}
			@Override
			public Adapter caseclass_(class_ object) {
				return createclass_Adapter();
			}
			@Override
			public Adapter caseclassifiersAndAssociations(classifiersAndAssociations object) {
				return createclassifiersAndAssociationsAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter casegeneralClass(generalClass object) {
				return creategeneralClassAdapter();
			}
			@Override
			public Adapter caseownerClassifier(ownerClassifier object) {
				return createownerClassifierAdapter();
			}
			@Override
			public Adapter casepackage_(package_ object) {
				return createpackage_Adapter();
			}
			@Override
			public Adapter casepackages(packages object) {
				return createpackagesAdapter();
			}
			@Override
			public Adapter caseprimitiveDataType(primitiveDataType object) {
				return createprimitiveDataTypeAdapter();
			}
			@Override
			public Adapter caseUML(UML object) {
				return createUMLAdapter();
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
	 * Creates a new adapter for an object of class '{@link uml.association <em>association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.association
	 * @generated
	 */
	public Adapter createassociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.attribute <em>attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.attribute
	 * @generated
	 */
	public Adapter createattributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.attributes <em>attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.attributes
	 * @generated
	 */
	public Adapter createattributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.class_ <em>class </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.class_
	 * @generated
	 */
	public Adapter createclass_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.classifiersAndAssociations <em>classifiers And Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.classifiersAndAssociations
	 * @generated
	 */
	public Adapter createclassifiersAndAssociationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.generalClass <em>general Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.generalClass
	 * @generated
	 */
	public Adapter creategeneralClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.ownerClassifier <em>owner Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.ownerClassifier
	 * @generated
	 */
	public Adapter createownerClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.package_ <em>package </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.package_
	 * @generated
	 */
	public Adapter createpackage_Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.packages <em>packages</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.packages
	 * @generated
	 */
	public Adapter createpackagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.primitiveDataType <em>primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.primitiveDataType
	 * @generated
	 */
	public Adapter createprimitiveDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.UML <em>UML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.UML
	 * @generated
	 */
	public Adapter createUMLAdapter() {
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

} //UmlAdapterFactory
