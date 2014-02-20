package edu.kit.ipd.sdq.mdsd.qvtrelation2coq;


import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

public class CoqGeneratorSupport extends AbstractGenericResourceSupport {

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport#createGuiceModule()
	 */
	@Override
	protected Module createGuiceModule() {
		return new CoqGeneratorModule();
	}

}
