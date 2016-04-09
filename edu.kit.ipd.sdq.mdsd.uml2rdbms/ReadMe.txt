# Verification of ModelMorf against proven Coq implementation of UML2RDBMS example transformation

We want to find out if the existing QVT-R implementations produce different output for the 'official' UML2RDBMS transformation, with identical metamodels and the same input models.

Our approach integrates five steps into an almost fully automatized workflow:

* Grouping of Xtend scripts into two projects with a single MWE workflow each, UMLinstantiator and RDBMScomparator
* Custom MWE2 MweBulkReader + MweBulkTransformer + MweBulkWriter components and
	* MweBulkReader: Read a list of ResourceSets from a folder and put into output slot 
	* MweBulkTransformer: Take a list of ResourceSets, and for each transform the model contained, and finally return a list of new ResourceSets (same order, old URI?)
	* MweBulkWriter: Output a list of ResourceSets into a folder using the input ResourceSet's name URI (but replace/append file ending?)
* CoqBulkTransform.sh + ModelMorfBulkTransform.bat
	* TransformAllInstantorResults.sh: Run script on each file following pattern *.uml.xml
	* transformInstantiatorResults.bat: Run script on each file following pattern *.emof.umlmm

Note: Transformation engines mediniQVT and Eclipse QVTd are not yet supported.

## Manual

Eclipse Workflow UMLinstantiator.mwe2: Generate random UML models as input set
* Install Eclipse Luna Modeling Edition
* Install Modeling Components: Xtext
* Checkout projects from https://github.com/qvt/qvtr2coq.git 
* Set the number of instances in the MWE2 file (var numberOfInstances = "100")
* Optional: Adjust the random number generator bounds in the UMLecoreInstantiator.xtend
* Run the MWE2 workflow by clicking on the play icon in the tool bar and selecting UMLinstantiator.mwe2
* Eclipse may end up with an out of memory error
  This is not a bug or a restriction of the workflow (memory is set to 2GB in the launch config).
  It is due to the console window being filled with too much text. 
  => Turn off debug mode (val DebugMode = false) when generating lots of models

Script CompileUml2RdbmsAndCreateXsdFiles.sh: Compile the Coq/Haskell transformation
* The Haskell files are located in this project under Coq-Haskell
* Install the Haskell compiler from https://www.haskell.org (tested with GHC 7.10.3 for OSX)
* Install the HXT package at the console: cabal install HXT
* Run the script CompileUml2RdbmsAndCreateXsdFiles.sh to create the executables

Script TransformAllInstantorResults.sh: Transform the generated UML models with the Coq transformation
* Copy the models folder from workspace/edu.kit.ipd.sdq.mdsd.umlinstantiator into the folder where the script CompileUml2RdbmsAndCreateXsdFiles.sh resides
* Run TransformAllInstantorResults.sh which transforms ./models/*.uml.xml into ./models/*.rdbms.xml

Script TransformInstantiatorResults.bat: Run the ModelMorf transformation
* ModelMorf must be installed under Windows, because there is a JVM incompatibility that causes an exception under OSX   
* Extract the ModelMorf.zip file on a Windows OS with Java installed
* Copy the file ModelMorf\Example\UmlToRdbms\TransformInstantiatorResults.bat to the folder ModelMorf\Example\UmlToRdbms
* Copy the models folder from the previous step into the folder ModelMorf\Example\UmlToRdbms where the script transformInstantiatorResults.bat resides
* Run the batch file TransformInstantiatorResults.bat to transform .\models\*.emof.umlmm into .\models\*.emof.rdbmsmm - This can take many hours!
  If ModelMorf gives a deserialization 'errornull' on even the built-in models, erase contents of the folder ModelMorf\workspace 

Eclipse Workflow RDBMScomparator.mwe2: Find differences in the output of each of the two transformations
* Copy the models folder from the previous step into the workspace/edu.kit.ipd.sdq.mdsd.rdbmscomparator project
* Run the MWE2 workflow by clicking on the play icon in the tool bar and selecting RDBMScomparator.mwe2
* Check the output for reported differences

## Result

No differences found:
* used MediaStore example (see CaseStudy\MediaStore)
* performed 1 test run with 100 randomly generated UML models (see CaseStudy\2016-04-09)

## Details on the Design of each of the Steps

1. Get the UML2RDBMS transformation (particularly, the one from the QVT standard, also formalized in Coq) to run under the QVT-R implementations under study:
* (QVTd: dynamic semantics are announced to be available with Eclipse Mars SR0: https://wiki.eclipse.org/QVTd/New_and_Noteworthy/Mars)
* MediniQVT: they use a completely different variant
* ModelMorf: they use an almost identical variant (except for a dummy container and some different naming [, and different cardinalities?])
* Coq: we use an almost identical variant (except for some simplifications introduced by Jeff to overcome difficulties that occur in a functional implementation?)
* (jQVT: excluded -- they are not standards compliant, when and where clauses follow an imperative style and use Xbase instead of OCL)

2. Create lots of random instances using Instantiator 
* Run the shell command
* For editing Instantiator ecore files, in the sample reflective ecore model editor, you ought to add the schema location:
<org.eclipse.mmt.qvtd.UmlToRdbms:dummy <<< ... existing namespace definitions ... >>> xsi:schemaLocation="http://www.eclipse.org/mmt/qvtd/UmlToRdbms#umlMM umlMM.ecore">

* Instantiator causes almost empty models (note that with 1000 elements, ModelMorf crashes, 300 seems to work, or is it recursive inheritance?)
  => Instantiator produces invalid instances, proven by built-in diagnosis output, e.g. 
     * for multiplicities [1..5] zero or more than 5 elements are generated)
     * root element 'dummy' is instantiated zero or multiple times, whereas ModelMorf does support only one single element
* Wrote an own instantiator in Xtend, customized for the UML model
  * Increased heap space for MWE runner in the launch config

3. Convert input/output models to a format compatible with the particular engine
* ModelMorf uses EMOF-conforming XMI:
  * metamodels: open the .ecore file, save as... choose .emof or .ecore to convert
  * models:
    * Converter .xmi <-> (.v) .xml for Coq
    * Converter .xmi --> .xml for ModelMorf
    For viewing .xml files, rename to .xmi, and add schema location:
    <umlMM:Schema <<< ... existing namespace definitions ... >>> xsi:schemaLocation="umlMM umlMM.xml.emof">
    <rdbmsMM:Schema <<< ... existing namespace definitions ... >>> xsi:schemaLocation="rdbmsMM rdbmsMM.xml.emof">

  => Adapted ModelMorf metamodel so that it conforms to Coq metamodel
  * UmlMM differences: attribute 'persistent' only on classes
  * RdbmsMM differences: add superclass ModelElement, Table-->[0..1]Key instead of *, naming => both are covered by XMI->XML transformation 
  * tested workflow using a generated model

* Coq:
  * metamodels: a converter exists (?)
  * models: Transformations in Xtend
  
4. Run the transformation engines
* ModelMorf: batch script, ANT script with Java plugins (https://www.eclipse.org/forums/index.php/t/781820/) => Windows batch script (couldn't get the engine to run under OSX)
* MediniQVT: generator for launch configs, or a batch/java program that launches the engine
  * ModelMorf seems to have some weird bug on a Mac (probably JVM related), couldn't fix it
* Coq:
  * bash script that compiles haskell-based XML parser wrapped around Coq/Haskell script, extracts XML Schema for Ecore
  * java program that 
    * converts instances from XMI to XML based on extracted XML Schema, => MWE2 workflow and Xtend script
    * runs haskell script, => automated
    * converts target XML back to XMI => MWE2 workflow and Xtend script  
  
5. Compare the output models:
* (Manually, or)
* Programmatically:
  * .xmi models from Medini for Ecore and .xml models from ModelMorf for Emof => MWE2 workflow and Xtend script
    * The QVT-O project defines an EMFdiffer to compare models for their unit tests, useful? Probably too much effort involved!
    * Wrote a custom differ for RDBMS model instances
	* Created diff report file per file set, i.e. result1.* -> result1.txt, result2.* -> result2.txt, ...

## Literature and Links
UML2RDBMS under Willinks QVTi implementation: http://dev.eclipse.org/mhonarc/lists/qvtd-dev/msg00107.html
Automatic Model Generation Strategies for Model Transformation Testing: http://www.irisa.fr/triskell/publis/2009/Sen09a.pdf
Pramana is a tool to automatically synthesize models for testing model transformations: http://www.irisa.fr/triskell/Software/pramana/
EMF Fuzz Testing framework: http://eclipsesource.com/blogs/2014/11/13/fuzzy-testing-of-datamodel-centric-applications/
Rules Chains Coverage for testing QVT-Relations Transformations
