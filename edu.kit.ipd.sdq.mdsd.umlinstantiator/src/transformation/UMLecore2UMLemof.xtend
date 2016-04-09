package transformation

import java.util.Map
import org.eclipse.emf.ecore.EObject

/**
 * Converts UML.ecore models (the variant from the ModelMorf example) to the UML.emof format compatible with ModelMorf.
 * 
 * The transformation is 1:1, but uses UUID references so that it can be used my ModelMorf:
 * 0. Took the umlMM.xml.emof model and saved as umlMM.ecore model (also used by Instantiator which always uses XPath references)
 * 1. Changed name, nsprefix, nsuri to 'umlMM_' of input ecore to avoid conflicts with the output emof model
 * 2. Set model > resource type to XMI in umlMM.xml.genmodel to generate an XMI factory
 * 3. Made umlMM.util.UmlMMResourceImpl extend *XMI*ResourceImpl and added 'protected boolean useUUIDs() { return true; }'
 * 4. Registered umlMM.util.UmlMMResourceFactoryImpl below so that it is used for file extension 'umlmm' by the MWE writer
 * See http://fredrikattebrant.blogspot.de/2012/10/enabling-uuids-in-emf-ecore-model.html
 * This could be probably solved easier, for example with a single model (although inplace copying might be required to trigger ID generation) 
 * 
 * The source model has been adapted for EMF Random Instantiator:
 * * Classifier.Kind is not EString but an EEnum because we need only "PERSISTENT" or "OTHER"
 * * Transformation must merge root elements, because multiple dummy elements might exist 
 * 
 * @author Andreas Rentschler
 * @date 2016-02-21
 */
class UMLecore2UMLemof {
	val factory = umlMM.UmlMMFactory.eINSTANCE
	
	def transform(EObject input, Map<String, String> config) {
		// Important: Register the manually adjusted XMI resource factory so that it is later used to 
		// serialize using UUID instead of XPath references.
		// Note that ending must match the one configured in the .genmodel (root package properties).
		// Do not forget to generate the model after changes.
		org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
			"umlmm", new umlMM.util.UmlMMResourceFactoryImpl()
		);
		
		// Shortcoming of EMF Random Instantiator was: creates multiple dummy (and Package) instances
		val output = (input as umlMM_.dummy).mapDummy2Dummy
		//output += input.contents.filter(DummyType).map[mapDummy2UML]
		output
	}
	
	def create result:factory.createdummy mapDummy2Dummy(umlMM_.dummy self_) {
		result.containsPackage += self_.containsPackage.map[mapPackage2Package]
	}
	
	def create result:factory.createPackage mapPackage2Package(umlMM_.Package self_) {
		println("Transforming package " + self_.name)
		result.name = self_.name
		result.classifier += self_.classifier.filter(umlMM_.Class).map[mapClass2Class]
		result.classifier += self_.classifier.filter(umlMM_.PrimitiveDataType).map[mapPrimitiveDataType2PrimitiveDataType]
		result.association += self_.association.map[mapAssociation2Association]
	}
	
	def create result:factory.createAssociation mapAssociation2Association(umlMM_.Association self_) {
		println("Transforming association " + self_.name)
		result.name = self_.name
		// self.namespace umlMM.Namespace => reverse/container reference not required
		result.source = mapClass2Class(self_.source)
		result.destination = mapClass2Class(self_.destination)
	}

	def create result:factory.createPrimitiveDataType mapPrimitiveDataType2PrimitiveDataType(umlMM_.PrimitiveDataType self_) {
		println("Transforming primitive data type " + self_.name)
		result.name = self_.name
		// result.typeOf umlMM.Classifier => reverse/container reference not required
		// self.namespace umlMM.Namespace => reverse/container reference not required
	}

	def create result:factory.createClass mapClass2Class(umlMM_.Class self_) {
		println("Transforming class " + self_.name)
		result.name = self_.name
		// result.typeOf umlMM.Attribute => reverse reference
		// self.namespace umlMM.Namespace => reverse/container reference not required
		result.kind = (if (self_.kind == umlMM_.KIND.PERSISTENT) "Persistent" else "Other")  // ModelMorf is case-sensitive!
		result.attribute += self_.attribute.map[mapAttribute2Attribute]
		result.general = self_.general?.mapClass2Class
		// self.subclass umlMM.Class => reverse of Class.general, thus not in Coq/DTD 
		// self.sourceOf umlMM.Association => reverse of Association.source, thus not in Coq.DTD
		// self.destinationOf umlMM.Association => reverse of Association.destination, thus not in Coq.DTD
	}
	
	def create result:factory.createAttribute mapAttribute2Attribute(umlMM_.Attribute self_) {
		println("Transforming attribute " + self_.name + " : " + self_.type?.name)
		result.name = self_.name
		// self.owner umlMM.Package => reverse/container reference not required
		if (self_.type instanceof umlMM_.Class) {
			result.type = (self_.type as umlMM_.Class).mapClass2Class
		} else
		if (self_.type instanceof umlMM_.PrimitiveDataType) {
			result.type = (self_.type as umlMM_.PrimitiveDataType).mapPrimitiveDataType2PrimitiveDataType
		}
	}
}