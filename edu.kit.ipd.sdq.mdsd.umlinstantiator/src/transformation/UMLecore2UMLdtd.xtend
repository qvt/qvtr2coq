package transformation

import java.util.ArrayList
import java.util.HashMap
import java.util.Map
import org.eclipse.emf.ecore.EObject

/**
 * Converts UML.ecore models (the variant from the ModelMorf example) to a proprietary format parsed by Haskell's HXT library.
 * This format is a direct representation of the input model as specified in Coq (and automatically extracted to Haskell).
 * After loading in Haskell, it can be executed by the Coq-proven UML2RDBMS transformation (which has been automatically extracted from the Coq proof, as well).
 * 
 * The Coq/Haskell implementation requires references to be unrolled, thus we do use
 *   def NewNode transform(OldNode node) { val result = new NewNode() ...
 * instead of cached methods
 *   def create result:new NewNode() transform(OldNode node) { ...
 * Note that cyclic references lead to infinite recursion!
 * 
 * To edit original ModelMorf MediaStore, add
 *     xsi:schemaLocation="umlMM ../metamodels/umlMM.xml.emof#umlMM"
 * and remove 'null:' references
 * 
 * Links:
 * * https://theholyjava.wordpress.com/2011/01/03/creating-dynamic-emf-model-from-xsds-and-loading-its-instances-from-xml-as-sdos/
 * 
 * @author Andreas Rentschler
 * @date 2015-12-23
 */
class UMLecore2UMLdtd {
	val factory = uml.UmlFactory.eINSTANCE
	
	def transform(/*List<EObject>*//*Resource*/EObject input, Map<String, String> config) {
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
			"xml", new UmlResourceFactoryCustomImpl()
		);

		val output = factory.createDocumentRoot 
		output.UML = (input as umlMM_.dummy)?.mapDummy2UML
		//output += input.contents.filter(DummyType).map[mapDummy2UML]
		deferredActions.forEach[run]
		
		output as EObject
	}
	
	def /*create result:factory.createUML*/ mapDummy2UML(umlMM_.dummy self_) {
		val result = factory.createUML
		result.packages = factory.createpackages
		result.packages.package += self_.containsPackage.map[mapPackage2Package]
		result
	}
	
	def /*create result:factory.createpackage_*/ mapPackage2Package(umlMM_.Package self_) {
//		println("Transforming package " + self_.name)
		val result = factory.createpackage_
		result.OID = self_.OID
		result.kind = "OTHER"
		result.name = self_.name
		// self.classifier EList<Classifier> => in Coq/DTD, this is contained directly
		result.classifiersAndAssociations = factory.createclassifiersAndAssociations
		result.classifiersAndAssociations.class_ += self_.classifier.filter(umlMM_.Class).map[mapClass2Class/*(new ArrayList<Object>())*/]
		result.classifiersAndAssociations.primitiveDataType += self_.classifier.filter(umlMM_.PrimitiveDataType).map[mapPrimitiveDataType2PrimitiveDataType]
		result.classifiersAndAssociations.association += self_.association.map[mapAssociation2Association]
		result
	}
	
	def /*create result:factory.createassociation*/ mapAssociation2Association(umlMM_.Association self_) {
//		println("Transforming association " + self_.name)
		val result = factory.createassociation
		result.OID = self_.OID
		result.kind = "OTHER"  // TODO: umlMM.xml.emof misses Association.kind attribute = "OTHER"|"PERSISTENT"!
		result.name = self_.name
		result.source = self_.source.OID
		result.destination = self_.destination.OID
		// self.namespace umlMM.Namespace => reverse/container reference not in Coq/DTD
		result
	}

	def /*create result:factory.createprimitiveDataType*/ mapPrimitiveDataType2PrimitiveDataType(umlMM_.PrimitiveDataType self_) {
//		println("Transforming primitive data type " + self_.name)
		val result = factory.createprimitiveDataType
		result.OID = self_.OID
		result.kind = "OTHER"
		result.name = self_.name.toLowerCase.toFirstUpper
		// self.typeof umlMM.Attribute => reverse of Attribute.type, thus not in Coq/DTD
		// self.namespace umlMM.Namespace => reverse/container reference not in Coq/DTD
		result
	}

	def /*create result:factory.createclass_*/uml.class_ mapClass2Class(umlMM_.Class self_/*, ArrayList<Object> os*/) {
//		if (os.filter(umlMM_.Classifier).exists(x | x.name.equals(self_.name))) throw new Exception ("Cycle detected!")
//		val os2 = new ArrayList(os)
//		os2.add(self_)
		
		println("Transforming class " + self_.name)
		val result = factory.createclass_
		result.OID = self_.OID
		result.kind = (if (self_.kind == umlMM_.KIND.PERSISTENT) "PERSISTENT" else "OTHER")  // Coq/Haskell is not case-sensitive!
		result.name = self_.name
		result.attributes = factory.createattributes
		result.attributes.attribute += self_.attribute.map[mapAttribute2Attribute/*(os2)*/]
		result.generalClass = factory.creategeneralClass
		if (self_.general != null) println("Recursing into generalClass reference")
		if (self_.general != null)		
			result.generalClass.class = self_.general.mapClass2Class/*(os2)*/  // in Coq/DTD, this reference is unrolled as a containment
		// self.sourceOf umlMM.Association => reverse of Association.source, thus not in Coq.DTD
		// self.destinationOf umlMM.Association => reverse of Association.destination, thus not in Coq.DTD
		// self.subclass umlMM.Class => reverse of Class.general, thus not in Coq/DTD 
		// self.namespace umlMM.Namespace => reverse/container reference not in Coq/DTD
		result
	}
	
	def /*create result:factory.createattribute*/ mapAttribute2Attribute(umlMM_.Attribute self_/*, ArrayList<Object> os*/) {
//		if (os.filter(umlMM_.Attribute).exists(x | x.name.equals(self_.name))) throw new Exception ("Cycle detected!")
//		val os2 = new ArrayList(os)
//		os2.add(self_)

		if (self_.type instanceof umlMM_.Class) println("Transforming attribute " + self_.name + " : " + self_.type?.name)
		val result = factory.createattribute
		result.OID = self_.OID
		result.kind = "OTHER"
		result.name = self_.name
		result.ownerClassifier = factory.createownerClassifier
		// in Coq/DTD, this reference is unrolled as a containment
		if (self_.type instanceof umlMM_.Class) {
			result.ownerClassifier.class = (self_.type as umlMM_.Class).mapClass2Class/*(os2)*/
		} else
		if (self_.type instanceof umlMM_.PrimitiveDataType) {
			result.ownerClassifier.primitiveDataType = (self_.type as umlMM_.PrimitiveDataType).mapPrimitiveDataType2PrimitiveDataType
		}
		result
	}
	
	// In Coq/DTD, OIDs are unique numbers used for cross referencing. 
	// When translating UML from ModelMorf/Ecore to Coq/DTD, OIDs must be created that are unique per type to allow for cross referencing.
	// OIDs must be globally unique, to prevent clashes from different source types, e.g. columns created from an association and a class (Build_Assoc2Column and Build_Class2Column).
	var OIDs = new HashMap<EObject, Integer>()
	def String getOID(EObject self_) {
		var oid = OIDs.get(self_)
		if (oid == null) {
			oid = OIDs.values.size
			OIDs.put(self_, oid)			
		}
		return oid.toString()
	}
	
	// Objects corresponding to OIDs might be created after reference, and must be executed after all objects are created.
	var deferredActions = new ArrayList<Runnable>
}

class UmlResourceFactoryCustomImpl extends uml.util.UmlResourceFactoryImpl {
	protected val org.eclipse.emf.ecore.util.BasicExtendedMetaData extendedMetaData
	
	new() {
		super()
		// Added the two lines below to omit namespace prefixes from being written to the XML (which are not understood by Haskell HQT framework):
		// TODO: Figure out if this can be done using ePrefix="null" in the generated code (https://www.eclipse.org/forums/index.php/t/131249/)
	    extendedMetaData = new org.eclipse.emf.ecore.util.BasicExtendedMetaData(new org.eclipse.emf.ecore.impl.EPackageRegistryImpl(org.eclipse.emf.ecore.EPackage.Registry.INSTANCE)); 
	    extendedMetaData.putPackage(null, uml.UmlPackage.eINSTANCE); 
	}

	public override org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		val result = new UmlResourceCustomImpl(uri)/*super.createResource(uri)*/ as org.eclipse.emf.ecore.xmi.XMLResource
		
		// Modified the two lines below to omit namespace prefixes from being written to the XML (which are not understood by Haskell HQT framework):
		result.getDefaultLoadOptions().put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData)
		result.getDefaultSaveOptions().put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData)

		result.getDefaultSaveOptions().put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE)

		result.getDefaultLoadOptions().put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE)
		result.getDefaultSaveOptions().put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE)

		result.getDefaultLoadOptions().put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE)
		
		// Added the line below to change the default ASCII encoding to one supported by the Haskell HQT framework for parsing XML:
		// cf. Ed Merks comment:
		// You can use org.eclipse.emf.ecore.xmi.XMLResource.OPTION_ENCODING or 
		// org.eclipse.emf.ecore.xmi.XMLResource.setEncoding(String). You might 
		// want to do that in the generated resource factory implementation so that 
		// it's the default.
		result.getDefaultSaveOptions().put(org.eclipse.emf.ecore.xmi.XMLResource.OPTION_ENCODING, "ISO-8859-1")
		
		result
	}

} //UmlResourceFactoryImpl

// Let's save without namespace! Just delegate to appropriate Resource API
// cf. http://tweakeclipse.blogspot.de/2008/10/save-emf-resource-with-or-without.html
class CustomNamespaceLessXMLHelper extends org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl {
	new(uml.util.UmlResourceImpl resource) {
		super(resource)
	}
	protected override String getQName(org.eclipse.emf.ecore.EPackage package1, String name, boolean mustHavePrefix) {
		// I don't want a namespace prefix 
		return name //super.getQName(package1, name, false)
	}
	
}

public class UmlResourceCustomImpl extends uml.util.UmlResourceImpl {
	new(org.eclipse.emf.common.util.URI uri) {
		super(uri)
	}
	
	protected override org.eclipse.emf.ecore.xmi.XMLHelper createXMLHelper() {
		return new CustomNamespaceLessXMLHelper(this);
	} 
} //UmlResourceCustomImpl

