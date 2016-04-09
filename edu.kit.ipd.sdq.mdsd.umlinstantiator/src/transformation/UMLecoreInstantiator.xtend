package transformation

import java.util.Map
import java.util.Random
import java.util.HashMap
import java.util.ArrayList
import java.util.HashSet

/**
 * Creates random UML.ecore models (the variant from the ModelMorf example).
 *
 * This is done, because EMF Random Instantiator...
 * * produces many invalid models (multiplicity bounds are not regarded), leading to almost empty RDBMS models with ModelMorf => killer issue!
 * * cannot produce XMI ID-based references, only XPath references => hope is that models are compatible to UMLemof...
 * * length of random names are 64 characters and cannot be configured (bug?), making the models hardly readable
 * 
 * An out of memory exception might occur. This is mostly due to the Eclipse Console window running out of memory.
 * In such case turn off debug mode (this makes sense only when producing few models anyways).
 * 
 * @author Andreas Rentschler
 * @date 2016-02-28
 */
class UMLecoreInstantiator {
	var DebugMode = false  // Highly detailed output
	
	val RandomMaxNumberWhenUnbounded = 15;  // random.nextInt(15) elements for a reference [X..*]
	val PersistentKindChance = 80;  // random.nextInt(100) < 80 ? Persistent : Other
	val GeneralClassChance = 10;  // random.nextInt(100) < 10 ? Class : null
	val AttributeTypeIsClassChance = 10;  // random.nextInt(100) < 10 ? Class : PrimitiveType
	
	val factory = umlMM_.UmlMMFactory.eINSTANCE
	
	def transform(/*List<EObject> input,*/ Map<String, String> config) {
		val output = createDummy() //as EObject
		deferredActions.forEach[run]
		println("Model consists of " + classes.size + " Classes, " + primitiveDataTypes.size + " PrimitiveDataTypes.")
		println("Reachable classes per class are: \n" + classes.keySet.map[key | key + "->(" + classesReachableFromClass.getOrDefault(key, newHashSet).join(', ') + ")"].join(', \n'))
		if (DebugMode) {
			output.validateDummy  // This should never happen, but better safe than sorry...
			println("Doublecheck succeeded, no cycles detected.")
		}
		output
	}
	
	// Note: This can be a (cached) create method, because we only call once, further calls return the cached element
	def create result:factory.createdummy createDummy() {
		result.containsPackage += (1..randomNumber(factory.umlMMPackage.getdummy_ContainsPackage.lowerBound, factory.umlMMPackage.getdummy_ContainsPackage.upperBound)).map[createPackage]
	}
	def validateDummy(umlMM_.dummy o) {
		o.containsPackage.forEach[validatePackage]
	}
	
	def createPackage() {
		val result = factory.createPackage
		val name = uniqueName
		println("Creating package " + name)
		result.name = name
		result.classifier += (1..randomNumber(factory.umlMMPackage.package_Classifier.lowerBound, factory.umlMMPackage.package_Classifier.upperBound)).map[createClass]
		result.classifier += (1..randomNumber(factory.umlMMPackage.package_Classifier.lowerBound, factory.umlMMPackage.package_Classifier.upperBound)).map[createPrimitiveDataType]
		result.association += (1..randomNumber(factory.umlMMPackage.package_Association.lowerBound, factory.umlMMPackage.package_Association.upperBound)).map[createAssociation]
		result
	}
	def validatePackage(umlMM_.Package o) {
		o.classifier.filter(umlMM_.Class).forEach[c | c.validateClass(new ArrayList<Object>())]
	}
	
	def createAssociation() {
		val result = factory.createAssociation
		val name = uniqueName
		println("Creating association " + name)
		result.name = name
		// result.namespace umlMM.Namespace => reverse/container reference not required
		// Note: Associations may form cycles without crashing the Coq transformation
		deferredActions += [ result.source = randomClass ]
		deferredActions += [ result.destination = randomClass ]
		result
	}

	def createPrimitiveDataType() {
		val result = factory.createPrimitiveDataType
		val name = uniqueName
		println("Creating primitive data type " + name)
		result.name = name
		// result.typeOf umlMM.Classifier => reverse/container reference not required
		// result.namespace umlMM.Namespace => reverse/container reference not required
		primitiveDataTypes.put(result.name, result)
		result
	}

	def createClass() {
		val result = factory.createClass
		val name = uniqueName
		println("Creating class " + name)
		result.name = name		
		// result.typeOf umlMM.Attribute => reverse of Attribute.type
		// result.namespace umlMM.Namespace => reverse/container reference not required
		result.kind = (if (random.nextInt(100) < PersistentKindChance) umlMM_.KIND.PERSISTENT else umlMM_.KIND.OTHER)  // Note that ModelMorf is case-sensitive!
		result.attribute += (1..randomNumber(factory.umlMMPackage.class_Attribute.lowerBound, factory.umlMMPackage.class_Attribute.upperBound)).map[createAttribute]
		deferredActions += [ result.general = (if (random.nextInt(100) < GeneralClassChance) randomClassWithoutFormingCycle(result) else null) ]
		// result.subclass umlMM.Class => reverse of Class.general, thus not in Coq/DTD 
		// result.sourceOf umlMM.Association => reverse of Association.source, thus not in Coq.DTD
		// result.destinationOf umlMM.Association => reverse of Association.destination, thus not in Coq.DTD
		classes.put(result.name, result)
		result
	}
	def void validateClass(umlMM_.Class o, ArrayList<Object> os) {
		if (os.filter(umlMM_.Classifier).exists(x | x.name.equals(o.name))) throw new Exception ("Cycle detected!")
		val os2 = new ArrayList(os)
		os2.add(o)
		o.attribute.filterNull.forEach[a | a.validateAttribute(os2)]
		o.general?.validateClass(os2)
	}
	
	def createAttribute() {
		val result = factory.createAttribute
		val name = uniqueName
		println("Creating attribute " + name + " : <type resolved later>")
		result.name = name
		// self.owner umlMM.Package => reverse/container reference not required
	    deferredActions += [ result.type = (if (random.nextInt(100) < AttributeTypeIsClassChance) randomClassWithoutFormingCycle(result.owner) else randomPrimitiveDataType) ]
		result
	}
	def void validateAttribute(umlMM_.Attribute o, ArrayList<Object> os) {
		if (os.filter(umlMM_.Attribute).exists(x | x.name.equals(o.name))) throw new Exception ("Cycle detected!")
		val os2 = new ArrayList(os)
		os2.add(o)
		if (o.type instanceof umlMM_.Class) (o.type as umlMM_.Class).validateClass(os2)
	}
	
	// Note: The Coq implemented transformation does not support recursion on
	//   class <>--attributes--> attribute --type--> class, and
	//   class --general--> class,
	// as these references are unrolled in the input model.
	// Therefore we avoid recursion by maintaining a reachability matrix.
	// This only works because any reference is constructed using this function.
	// HashSet won't work because the hashValue changes if the EObject is modified, we hash manually by name.
	val classes = new HashMap<String, umlMM_.Class>;
	val classesReachableFromClass = new HashMap<String, HashSet<String>>
	def randomClassWithoutFormingCycle(umlMM_.Class clazz) {
		val sourceClass = clazz.name
		val classesFromSourceClassReachable = classesReachableFromClass.getOrDefault(sourceClass, newHashSet)

		// Omit a cyclic reference:
		// When picking a random target class for source class, 
		// remove all classes which list source class as reachable
		// including the source class itself
		var safeTargetClasses = newArrayList
		safeTargetClasses.addAll(classes.keySet)
		safeTargetClasses.remove(sourceClass)
		val classesWithSourceClassReachable = classes.filter[key, value | 
			classesReachableFromClass.getOrDefault(key, newHashSet).contains(sourceClass)
		].keySet.toList
		safeTargetClasses.removeAll(classesWithSourceClassReachable)
		if (safeTargetClasses.empty) {
			safeTargetClasses.addAll(classes.keySet)
			println("ERROR: We are not able to avoid recursion, all remaining classes are already reachable!")
			println("       Either generate more classes or less class-to-class associations.")
			throw new Exception("Model turned out to be recursive!")
		}
		
		// Determine a pseudo random class from the remaining candidates, and add it to the partition
		val targetClass = safeTargetClasses.get(random.nextInt(safeTargetClasses.size))
		
		// Update reachability matrix: 
		// Target class and reachable classes from target class are now marked as reachable from 
		// source class and all classes for which source class is already reachable
		val classesFromTargetClassReachable = classesReachableFromClass.getOrDefault(targetClass, newHashSet) 
		classesFromSourceClassReachable.add(targetClass)
		classesFromSourceClassReachable.addAll(classesFromTargetClassReachable)
		classesReachableFromClass.put(sourceClass, classesFromSourceClassReachable)
		classesWithSourceClassReachable.forEach[key | 
			val values = classesReachableFromClass.getOrDefault(key, newHashSet); 
			values.add(targetClass)
			values.addAll(classesFromTargetClassReachable)
			classesReachableFromClass.put(key, values)
		]
		if (DebugMode)  {
			println("Adding reference " + sourceClass + "->" + targetClass)
			println("Reachable classes per class are: \n" + classes.keySet.map[key | key + "->(" + classesReachableFromClass.getOrDefault(key, newHashSet).join(', ') + ")"].join(', \n'))
			
		}
		
		classes.get(targetClass)
	}
	def randomClass() {
		classes.values.get(random.nextInt(classes.size))
	}

	val primitiveDataTypes = new HashMap<String, umlMM_.PrimitiveDataType>();
	def randomPrimitiveDataType() {
		primitiveDataTypes.values.get(random.nextInt(primitiveDataTypes.size))
	}
	
	int uniqueId = 0;
	def String uniqueName() {
		"Object" + uniqueId++
	}
	
	val random = new Random//(0)  // Set seed to generate same model for testing purposes
	def randomNumber(int from, int to) {
		val bound = if (to == -1) RandomMaxNumberWhenUnbounded else to;
		from + random.nextInt(bound)
	}
	
	// Objects corresponding to OIDs might be created after reference, and must be executed after all objects are created.
	var deferredActions = new ArrayList<Runnable>
}