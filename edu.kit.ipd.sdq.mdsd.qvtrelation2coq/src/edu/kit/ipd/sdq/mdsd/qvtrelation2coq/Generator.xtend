package edu.kit.ipd.sdq.mdsd.qvtrelation2coq

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.qvtd.xtext.qvtrelationcst.TopLevelCS
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import javax.inject.Inject

class Generator implements IGenerator {
	
	@Inject extension edu.kit.ipd.sdq.mdsd.qvtrelation2coq.Ecore2Coq
	@Inject extension edu.kit.ipd.sdq.mdsd.qvtrelation2coq.QVTr2Coq
	
	override void doGenerate(Resource input, IFileSystemAccess fsa) {
		// Generate Coq proofs from .ecore models and parsed .qvtr scripts
		for (EObject eObject : input.contents.filter(e | e instanceof EPackage || e instanceof TopLevelCS)) {
			compile(eObject, fsa)
		}
	}
	 
	///////////////////////////////////////////////////////////////////////////
	// Catch unhandled input resources
	def dispatch void compile(EObject eObject, IFileSystemAccess fsa) {
		println("Warning, no generator defined for input resource " + eObject.toString)
	}

	///////////////////////////////////////////////////////////////////////////
	// Generate Coq proofs from .ecore models
	def dispatch compile(EPackage ePackage, IFileSystemAccess fsa) {
		fsa.generateFile(ePackage.name + ".v", mapModel(ePackage))
	}
	
	///////////////////////////////////////////////////////////////////////////
	// Generate Coq proofs from .qvtr scripts
	def dispatch compile(TopLevelCS topLevelCS, IFileSystemAccess fsa) {
		fsa.generateFile(topLevelCS.transformations.get(0).name + ".v", mapTransformation(topLevelCS))
	}

}