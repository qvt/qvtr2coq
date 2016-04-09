/**
 */
package uml;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link uml.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link uml.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link uml.DocumentRoot#getAssociation <em>Association</em>}</li>
 *   <li>{@link uml.DocumentRoot#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link uml.DocumentRoot#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link uml.DocumentRoot#getClass_ <em>Class</em>}</li>
 *   <li>{@link uml.DocumentRoot#getClassifiersAndAssociations <em>Classifiers And Associations</em>}</li>
 *   <li>{@link uml.DocumentRoot#getGeneralClass <em>General Class</em>}</li>
 *   <li>{@link uml.DocumentRoot#getOwnerClassifier <em>Owner Classifier</em>}</li>
 *   <li>{@link uml.DocumentRoot#getPackage <em>Package</em>}</li>
 *   <li>{@link uml.DocumentRoot#getPackages <em>Packages</em>}</li>
 *   <li>{@link uml.DocumentRoot#getPrimitiveDataType <em>Primitive Data Type</em>}</li>
 *   <li>{@link uml.DocumentRoot#getUML <em>UML</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see uml.UmlPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see uml.UmlPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see uml.UmlPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' containment reference.
	 * @see #setAssociation(association)
	 * @see uml.UmlPackage#getDocumentRoot_Association()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='association' namespace='##targetNamespace'"
	 * @generated
	 */
	association getAssociation();

	/**
	 * Sets the value of the '{@link uml.DocumentRoot#getAssociation <em>Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' containment reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(association value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference.
	 * @see #setAttribute(attribute)
	 * @see uml.UmlPackage#getDocumentRoot_Attribute()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='attribute' namespace='##targetNamespace'"
	 * @generated
	 */
	attribute getAttribute();

	/**
	 * Sets the value of the '{@link uml.DocumentRoot#getAttribute <em>Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' containment reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(attribute value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference.
	 * @see #setAttributes(attributes)
	 * @see uml.UmlPackage#getDocumentRoot_Attributes()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='attributes' namespace='##targetNamespace'"
	 * @generated
	 */
	attributes getAttributes();

	/**
	 * Sets the value of the '{@link uml.DocumentRoot#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(attributes value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' containment reference.
	 * @see #setClass(class_)
	 * @see uml.UmlPackage#getDocumentRoot_Class()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='class_' namespace='##targetNamespace'"
	 * @generated
	 */
	class_ getClass_();

	/**
	 * Sets the value of the '{@link uml.DocumentRoot#getClass_ <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' containment reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(class_ value);

	/**
	 * Returns the value of the '<em><b>Classifiers And Associations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifiers And Associations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifiers And Associations</em>' containment reference.
	 * @see #setClassifiersAndAssociations(classifiersAndAssociations)
	 * @see uml.UmlPackage#getDocumentRoot_ClassifiersAndAssociations()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='classifiersAndAssociations' namespace='##targetNamespace'"
	 * @generated
	 */
	classifiersAndAssociations getClassifiersAndAssociations();

	/**
	 * Sets the value of the '{@link uml.DocumentRoot#getClassifiersAndAssociations <em>Classifiers And Associations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifiers And Associations</em>' containment reference.
	 * @see #getClassifiersAndAssociations()
	 * @generated
	 */
	void setClassifiersAndAssociations(classifiersAndAssociations value);

	/**
	 * Returns the value of the '<em><b>General Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Class</em>' containment reference.
	 * @see #setGeneralClass(generalClass)
	 * @see uml.UmlPackage#getDocumentRoot_GeneralClass()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='generalClass' namespace='##targetNamespace'"
	 * @generated
	 */
	generalClass getGeneralClass();

	/**
	 * Sets the value of the '{@link uml.DocumentRoot#getGeneralClass <em>General Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Class</em>' containment reference.
	 * @see #getGeneralClass()
	 * @generated
	 */
	void setGeneralClass(generalClass value);

	/**
	 * Returns the value of the '<em><b>Owner Classifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Classifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Classifier</em>' containment reference.
	 * @see #setOwnerClassifier(ownerClassifier)
	 * @see uml.UmlPackage#getDocumentRoot_OwnerClassifier()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ownerClassifier' namespace='##targetNamespace'"
	 * @generated
	 */
	ownerClassifier getOwnerClassifier();

	/**
	 * Sets the value of the '{@link uml.DocumentRoot#getOwnerClassifier <em>Owner Classifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Classifier</em>' containment reference.
	 * @see #getOwnerClassifier()
	 * @generated
	 */
	void setOwnerClassifier(ownerClassifier value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' containment reference.
	 * @see #setPackage(package_)
	 * @see uml.UmlPackage#getDocumentRoot_Package()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='package_' namespace='##targetNamespace'"
	 * @generated
	 */
	package_ getPackage();

	/**
	 * Sets the value of the '{@link uml.DocumentRoot#getPackage <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' containment reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(package_ value);

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference.
	 * @see #setPackages(packages)
	 * @see uml.UmlPackage#getDocumentRoot_Packages()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='packages' namespace='##targetNamespace'"
	 * @generated
	 */
	packages getPackages();

	/**
	 * Sets the value of the '{@link uml.DocumentRoot#getPackages <em>Packages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packages</em>' containment reference.
	 * @see #getPackages()
	 * @generated
	 */
	void setPackages(packages value);

	/**
	 * Returns the value of the '<em><b>Primitive Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Data Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Data Type</em>' containment reference.
	 * @see #setPrimitiveDataType(primitiveDataType)
	 * @see uml.UmlPackage#getDocumentRoot_PrimitiveDataType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='primitiveDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	primitiveDataType getPrimitiveDataType();

	/**
	 * Sets the value of the '{@link uml.DocumentRoot#getPrimitiveDataType <em>Primitive Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Data Type</em>' containment reference.
	 * @see #getPrimitiveDataType()
	 * @generated
	 */
	void setPrimitiveDataType(primitiveDataType value);

	/**
	 * Returns the value of the '<em><b>UML</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UML</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UML</em>' containment reference.
	 * @see #setUML(UML)
	 * @see uml.UmlPackage#getDocumentRoot_UML()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UML' namespace='##targetNamespace'"
	 * @generated
	 */
	UML getUML();

	/**
	 * Sets the value of the '{@link uml.DocumentRoot#getUML <em>UML</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UML</em>' containment reference.
	 * @see #getUML()
	 * @generated
	 */
	void setUML(UML value);

} // DocumentRoot
