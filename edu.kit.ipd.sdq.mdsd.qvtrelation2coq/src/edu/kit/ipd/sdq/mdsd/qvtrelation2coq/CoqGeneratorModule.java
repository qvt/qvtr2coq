package edu.kit.ipd.sdq.mdsd.qvtrelation2coq;

import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

public class CoqGeneratorModule extends AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return "QVTrelation transformation and imported metamodels transformed to Coq specification";
	}

	@Override
	protected String getFileExtensions() {
		return "qvtr,ecore";
	}
	
	public Class<? extends IGenerator> bindIGenerator() {
		return Generator.class;
	}

//	public Class<? extends ResourceSet> bindResourceSet() {
//		return ResourceSetImpl.class;
//	}
	
}
