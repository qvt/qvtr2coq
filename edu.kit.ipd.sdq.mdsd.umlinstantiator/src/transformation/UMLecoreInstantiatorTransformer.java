package transformation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class UMLecoreInstantiatorTransformer extends AbstractWorkflowComponent2 {
	private Integer numberOfInstances = 0;
	private String uriBaseFilename = "result";

	//	private String inputSlot;
	private String outputSlot;
	
	private final Map<String, String> config;
	
	public UMLecoreInstantiatorTransformer() {
		config = new HashMap<String, String>();
	}
	
	public void setNumberOfInstances(String numberOfInstances) {
		try {
			this.numberOfInstances = Integer.parseInt(numberOfInstances);
		}
		catch(NumberFormatException e) {
		}
	}
	
	public void setUriBaseFilename(String uriBaseFilename) {
		this.uriBaseFilename = uriBaseFilename;
	}

//	public void setInputSlot(String inputSlot) {
//		this.inputSlot = inputSlot;
//	}

	public void setOutputSlot(String outputSlot) {
		this.outputSlot = outputSlot;
	}
	
//	public void setSomeFeature(String s) {
//		config.put("someFeature", s);
//	}
	
	@Override
	protected void checkConfigurationInternal(Issues issues) {
//		checkRequiredConfigProperty("inputSlot", inputSlot, issues);
		checkRequiredConfigProperty("outputSlot", outputSlot, issues);

	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor m,
			Issues issues) {
		if (numberOfInstances <= 0) {
			issues.addError(String.format("Slot 'numberOfInstances' must contain an integer value >= 1"));
		}
		
//		Object inputSlotContent = ctx.get(inputSlot);
//		if (inputSlotContent == null) {
//			issues.addError(String.format("Slot %s is empty", inputSlotContent));
//			return;
//		}
//
//		if (!(inputSlotContent instanceof /*uml.UML*/EObject)) {
//			issues.addError("No model found in input slot");
//			return;
//		}
//		/*uml.UML*/EObject inputModel = (/*uml.UML*/EObject) inputSlotContent;
//		EcoreUtil.resolveAll(inputModel.eResource());
		
		List<Object> transformedModels = new ArrayList<Object>();
		
		// execute the transformation
		for (int i = 0; i < numberOfInstances; i++) {
			/*umlMM.dummy*/EObject transformedModel = null;
			try {
				transformedModel = new UMLecoreInstantiator().transform(/*inputModel.eResource().getContents(),*/ config);
			} catch (Exception e) {
				issues.addWarning("Exception occured during instantiation: " + e);
				issues.addWarning("Retrying...");
				i--;
				continue;
			}
			if (transformedModel != null) transformedModels.add(transformedModel);
			
		    // Create a dummy resource set and resource to keep the original number
		    ResourceSet resSet = new ResourceSetImpl();
		    Resource resource = resSet.createResource(URI.createURI(uriBaseFilename + (i + 1)));
		    resource.getContents().add(transformedModel);
		}
		
		ctx.set(outputSlot, transformedModels);
	}
}
