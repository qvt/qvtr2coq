# QVTr2Coq

*QVTr2Coq* is a systematic embedding of the [QVT Relations](http://www.omg.org/spec/QVT/1.1/) (QVT-R) transformation language in Constructive Type Theory as implemented by the [Coq proof assistant](http://coq.inria.fr/). The framework allows to manually construct and verify implementations of transformation programs in QVT-R. 

## Example Use as a Test Oracle

QVT-R semantics are complex and not well understood. At the present time, QVT-R semantics are implicitly modeled in tooling, but we cannot be sure if interpreters do what we expect the QVT-R specification to do.

One solution to this problem is to build a test oracle that can be utilised to semi-automatically construct reference implementations of individual transformations to test QVT-R execution engines. Because of the problem-oriented nature of the QVT-R language, there is a gap between specification and the actual interpretation of QVT-R programs. To ensure that a model transformation specified in QVT-R results in the intended behaviour, it must be tested.

For demonstration, we used the framework to generate a CTT specification from the well-known UML2RDBMS example transformation. The specification is then verified in a manual step and an implementation is extracted.

For additional details on this use case please consult our publication.

## Features

Soon to be added.
<!--Blabla is meta-model independent, being able to process any meta-model specified in ECore and its respective instances in XMI. Additional constraints, as well as operations, are specified by embedding OCL in annotations, as prescribed by EMF. Inter-model consistency is specified by the [QVT Relations](http://www.omg.org/spec/QVT/1.1/) (QVT-R) transformation language.

Over these constraints and models, Qvtr2Coq possesses the following features.

<dl>
  <dt>Model visualization</dt>
  <dd>Models are presented using the Alloy visualizer. For better readability, an Alloy theme is automatically inferred from the meta-model, although an user-defined theme can also be provided if desired.</dd>

  <dt>Model generation</dt>
  <dd>Given a meta-model and user-specified size, Echo can generate a new model conformant with the metamodel. Additional constraints can also be specified to generate instances with a parametrized shape.</dd>

  <dt>Consistency check</dt>
  <dd>Given a model, Echo can check if it conforms to the respective meta-model.</dd>

  <dt>Model repair</dt>
  <dd>Given a model that does not conform to its meta-model, Echo can find a minimal repair that produces a consistent model.</dd>

  <dt>Inter-model consistency check</dt>
  <dd>Given a QVT-R transformation and two models that are supposed to be consistent via it, Echo can check if such is the case. The checking semantics follows exactly the specified in the QVT standard.</dd>

  <dt>Inter-model consistency repair</dt>
  <dd>QVT-R specifications are interpreted as bidirectional transformations, thus, given inconsistent models, Echo is able to repair either one to recover consistency.</dd>

  <dt>Inter-model generation</dt>
  <dd>Given a QVT-R transformation and an existing model, Echo can generate the minimal model consistent with existing model by the QVT-R transformation.</dd>
</dl>

For all generation and repair procedures, Echo presents *all* valid solutions, allowing the user to select the desired one.

Repair procedures are always *minimal*, in the sense that the resulting consistent model is as close as possible to the original inconsistent one. The user is able to choose how to measure this distance: either through *graph edit distance*, a meta-model independent metric that sees models as graphs and counts modifications of edges and nodes, or through an *operation-based distance*, that counts the number of applications of user-defined operations required to obtain the new model.

([read more](https://github.com/haslab/echo/wiki/Overview))
-->

## Installing

*QVTr2Coq* runs on the Eclipse Modeling Tools. The following steps assume a fresh installation of Eclipse. 

* Download Eclipse [Modeling Tools 4.3 (Kepler)](http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/keplersr1) (Kepler);
* Download and install in Eclipse (through the **Help > Install New Software...**) menu the following archives in the given order:
  + [Eclipse Xtext 2.5+](http://www.eclipse.org/modeling/tmf/downloads/?project=xtext) of the Model Development Tools (MDT) project;
  + [Eclipse QVTd 0.10+](http://www.eclipse.org/mmt/downloads/?project=qvtd) of the Model to Model Transformation (MMT) project;
* Download [QVTr2Coq](http://qvt.github.io/qvtr2coq/downloads/qvtr2coq-0.3.1.zip);
* Import the QVTr2Coq project into your Eclipse workspace.

You are ready to use the code generator to produce Coq specifications from QVT-R programs, Ecore metamodels and instances thereof.

<!--([read more](https://github.com/qvt/qvtr2coq/wiki/Install))-->


<!--## Examples

Folder [examples](http://github.com/haslab/echo/tree/master/examples) contains Ecore meta-models and QVT-R implementations of some typical bidirectional transformations, as well some example XMI model instances. Alternatively, download this [archive](http://haslab.github.io/echo/downloads/echo-0.3.0_examples.zip) containing the same examples.

([read more](https://sdqweb.ipd.kit.edu/wiki/Testing_QVT-R_Transformation_Tools))
([read more](https://github.com/haslab/echo/wiki/Examples))-->

## Publications
* A. Rentschler, J. Terrell, S. Zschaler, L. Happe, R. Reussner. [*Testing QVT-R Transformation Tools with Coq-Verified Implementations*](http://could.finally.lead.to/paper.pdf). Submitted to the 7th International Conference on Model Transformation (ICMT'14).

## Contributors
* [Andreas Rentschler] (http://sdq.ipd.kit.edu/people/andreas_rentschler/)
* [Jeffrey Terrell] (http://www.inf.kcl.ac.uk/pg/terrellj/)
* [Steffen Zschaler] (https://kclpure.kcl.ac.uk/portal/steffen.zschaler.html)

This research is a cooperation between King's College London (KCL) and Karlsruhe Institute of Technology (KIT).
Work has partly been funded by the German Research Foundation (DFG) under grant No. RE 1674/5-1: [Model-Driven Methods and Tools for Performance Prediction and Capacity Planning of Component-Based Software Systems](http://www.ferdinand-project.org) and the Priority Programme SPP 1593: [Design For Future – Managed Software Evolution](http://www.dfg-spp1593.de).

<img src="http://qvt.github.io/qvtr2coq/images/Logo_KIT.png" alt="KIT" height="80px"/>&nbsp;&nbsp;&nbsp;&nbsp;
<img src="http://qvt.github.io/qvtr2coq/images/Logo_KCL.png" alt="KCL" height="80px"/>&nbsp;&nbsp;&nbsp;&nbsp;
<img src="http://qvt.github.io/qvtr2coq/images/Logo_FERDINAND.png" alt="FERDINAND" height="70px"/>&nbsp;&nbsp;
<img src="http://qvt.github.io/qvtr2coq/images/Logo_PPADVERT.png" alt="ADVERT" height="80px"/>
