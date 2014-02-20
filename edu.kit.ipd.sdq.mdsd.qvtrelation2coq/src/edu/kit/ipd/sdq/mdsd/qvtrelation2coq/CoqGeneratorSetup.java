package edu.kit.ipd.sdq.mdsd.qvtrelation2coq;

import org.eclipse.xtext.ISetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class CoqGeneratorSetup implements ISetup {

	/* (non-Javadoc)
	 * @see org.eclipse.xtext.ISetup#createInjectorAndDoEMFRegistration()
	 */
	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		// setup injector
		return Guice.createInjector(new CoqGeneratorModule());
	}
}
