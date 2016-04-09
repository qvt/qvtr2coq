package transformation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent2;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

public class RDBMSemofComparatorTransformer extends AbstractWorkflowComponent2 {
	private String inputSlot1;
	private String inputSlot2;
	private String outputSlot;
	
	private final Map<String, String> config;
	
	public RDBMSemofComparatorTransformer() {
		config = new HashMap<String, String>();
	}
	
	/**
	 * Set the Coq RDBMS models converted back to ecore models to compare.
	 * The order and number must match the content of slot 2. 
	 * @param inputSlot1
	 */
	public void setInputSlot1(String inputSlot1) {
		this.inputSlot1 = inputSlot1;
	}

	/**
	 * Set the ModelMorf models to compare.
	 * Can be a collection read by BulkReader and option <code>firstElementOnly = false</code>.
	 * This collection contains another collection of root elements of type rdbmsMM.schema which are then moved to a single root dummy element because the ModelMorf engine does not support that. 
	 * The order and number must match the content of slot 1. 
	 * @param inputSlot2 The ModelMorf model set
	 */
	public void setInputSlot2(String inputSlot2) {
		this.inputSlot2 = inputSlot2;
	}
	
	/**
	 * Slot will be filled with output reports, one per model pair in the input slots.
	 * @param outputSlot
	 */
	public void setOutputSlot(String outputSlot) {
		this.outputSlot = outputSlot;
	}
	
//	public void setSomeFeature(String s) {
//		config.put("someFeature", s);
//	}
	
	@Override
	protected void checkConfigurationInternal(Issues issues) {
		checkRequiredConfigProperty("inputSlot1", inputSlot1, issues);
		checkRequiredConfigProperty("inputSlot2", inputSlot2, issues);

	}

	@Override
	protected void invokeInternal(WorkflowContext ctx, ProgressMonitor m,
			Issues issues) {
		Object inputSlot1Content = ctx.get(inputSlot1);
		Object inputSlot2Content = ctx.get(inputSlot2);
		
		if (inputSlot1Content == null) {
			
			issues.addError(String.format("Slot %s is empty", inputSlot1));
			
		} else if (inputSlot2Content == null) {
			
			issues.addError(String.format("Slot %s is empty", inputSlot2));
			
		} else if (inputSlot1Content instanceof Collection<?> && inputSlot2Content instanceof Collection<?>) {
			
			Collection<?> inputSlot1List = (Collection<?>) inputSlot1Content;
			Collection<?> inputSlot2List = (Collection<?>) inputSlot2Content;
		    HashMap<URI, StringBuffer> map = new HashMap<URI, StringBuffer>();
			
			if (inputSlot1List.size() == inputSlot2List.size()) {
				issues.addInfo(String.format("Slots %s and %s contain a list with %s elements", inputSlot1, inputSlot2, inputSlot1List.size()));
				Iterator<?> inputSlot2Iterator = inputSlot2List.iterator();
				for (Object element1 : inputSlot1List) {
					Object element2 = inputSlot2Iterator.next();
					
					// ModelMorf does not store into dummy root element, we must fix this
					if (element2 instanceof EList<?>) {
						final rdbmsMM.dummy dummy = rdbmsMM.RdbmsMMFactory.eINSTANCE.createdummy();
						final EList<rdbmsMM.Schema> dummySchemas = dummy.getContainsSchema();
						Resource res = null;
		                for (Object obj : ((EList<?>) element2).toArray()) {
		                	if (res == null) res = ((EObject) obj).eResource();
							if (obj instanceof rdbmsMM.Schema)
								dummySchemas.add((rdbmsMM.Schema) obj);
						}
		                res.getContents().add(dummy);
						element2 = dummy;
					}

					if (element1 instanceof /*rdbms.RDBMSType*/EObject && element2 instanceof /*rdbms.RDBMSType*/EObject) {
						EObject inputModel1 = (EObject) element1;
						EObject inputModel2 = (EObject) element2;
						EcoreUtil.resolveAll(inputModel1.eResource());
						EcoreUtil.resolveAll(inputModel2.eResource());
						
						// execute the transformation
						StringBuffer report = new RDBMSemofComparator().transform(inputModel1, inputModel2, config, issues);
						
					    // Create a HashMap to keep the first model's original URI
					    URI uri = inputModel1.eResource().getURI();
					    map.put(uri, report);
					} else {
						issues.addError(String.format("List element is skipped because it is of an unsupported type (type %s in slot #1, type %s in slot #2)", element1.getClass(), element2.getClass()));
					}
				}
			} else {
				issues.addError("Slot #1 and #2 contain a different number of elements (" + inputSlot1List.size() + " != " + inputSlot2List.size() + ")");
			}
				
			ctx.set(outputSlot, map);
			
		} else if (inputSlot1Content instanceof /*rdbms.RDBMSType*/EObject && inputSlot2Content instanceof /*rdbms.RDBMSType*/EObject) {
			
			/*rdbms.RDBMSType*/EObject inputModel1 = (/*rdbms.RDBMSType*/EObject) inputSlot1Content;
			/*rdbms.RDBMSType*/EObject inputModel2 = (/*rdbms.RDBMSType*/EObject) inputSlot2Content;
			EcoreUtil.resolveAll(inputModel1.eResource());
			EcoreUtil.resolveAll(inputModel2.eResource());
			
			// execute the transformation
			StringBuffer report = new RDBMSemofComparator().transform(inputModel1, inputModel2, config, issues);
			
		    // Create a HashMap to keep the first model's original URI
		    URI uri = inputModel1.eResource().getURI();
		    HashMap<URI, StringBuffer> map = new HashMap<URI, StringBuffer>();
		    map.put(uri, report);
			
			ctx.set(outputSlot, map);
			
		} else {
			
			issues.addError("Content types of input slot #1 (type '" + inputSlot1Content.getClass() + "') and slot #2 (type '" + inputSlot2Content.getClass() + "') do not match");
			
		}
	}
}
