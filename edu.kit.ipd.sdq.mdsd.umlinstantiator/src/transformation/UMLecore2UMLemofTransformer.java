package transformation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class UMLecore2UMLemofTransformer extends AbstractWorkflowComponent2 {
	private String inputSlot;
	private String outputSlot;
	
	private final Map<String, String> config;
	
	public UMLecore2UMLemofTransformer() {
		config = new HashMap<String, String>();
	}
	
	public void setInputSlot(String inputSlot) {
		this.inputSlot = inputSlot;
	}

	public void setOutputSlot(String outputSlot) {
		this.outputSlot = outputSlot;
	}
	
//	public void setSomeFeature(String s) {
//		config.put("someFeature", s);
//	}
	
	@Override
	protected void checkConfigurationInternal(Issues issues) {
		checkRequiredConfigProperty("inputSlot", inputSlot, issues);
		checkRequiredConfigProperty("outputSlot", outputSlot, issues);

	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor m,
			Issues issues) {
		Object inputSlotContent = ctx.get(inputSlot);
		
		if (inputSlotContent == null) {
			
			issues.addError(String.format("Slot %s is empty", inputSlotContent));
			
		} else if (inputSlotContent instanceof Collection<?>) {
			
			List<Object> list = new ArrayList<Object>();
			issues.addInfo(String.format("Slot %s contains a list with %s elements", inputSlot, list.size()));
			for (Object element : (Collection<?>) inputSlotContent) {
				if (element instanceof /*uml.UML*/EObject) {
					EObject inputModel = (EObject) element;
					EcoreUtil.resolveAll(inputModel.eResource());
					
					// execute the transformation
					/*umlMM.dummy*/EObject transformedModel = new UMLecore2UMLemof().transform(inputModel, config);
					
				    // Create a dummy resource set and resource to keep the original URI
				    ResourceSet resSet = new ResourceSetImpl();
				    Resource resource = resSet.createResource(inputModel.eResource().getURI());
				    resource.getContents().add(transformedModel);
					
					list.add(transformedModel);
				} else {
					issues.addError(String.format("List element is skipped because it is of the unsupported type %s", inputSlotContent, element.getClass()));
				}
			}
				
			ctx.set(outputSlot, list);
			
		} else if (inputSlotContent instanceof /*uml.UML*/EObject) {
			
			/*uml.UML*/EObject inputModel = (/*uml.UML*/EObject) inputSlotContent;
			EcoreUtil.resolveAll(inputModel.eResource());
			
			// execute the transformation
			/*umlMM.dummy*/EObject transformedModel = new UMLecore2UMLemof().transform(inputModel, config);
			
			ctx.set(outputSlot, transformedModel);
			
		} else {
			
			issues.addError("No model found in input slot");
			
		}
	}
}
