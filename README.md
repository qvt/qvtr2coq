*QVTr2Coq* is a systematic embedding of the [QVT Relations](http://www.omg.org/spec/QVT/1.1/) (QVT-R) transformation language in Constructive Type Theory (CTT) as implemented by the [Coq proof assistant](http://coq.inria.fr/). The framework allows to manually construct and verify implementations of QVT-R transformation programs in Coq. Verified transformations can be used as a test oracle, i.e., for testing existing QVT-R transformation tools if they are in compliance with standardised semantics.

## Description

QVT-R semantics are complex and not well understood. At the present time, QVT-R semantics are implicitly modeled in tooling, but we cannot be sure if interpreters do what we expect the QVT-R specification to do.

One solution to this problem is to build a test oracle that can be utilised to semi-automatically construct reference implementations of individual transformations to test QVT-R execution engines. Because of the problem-oriented nature of the QVT-R language, there is a gap between specification and the actual interpretation of QVT-R programs. To ensure that a model transformation specified in QVT-R results in the intended behaviour, it must be tested.

For demonstration, we used the framework to generate a CTT specification from the well-known UML2RDBMS example transformation. The specification is then verified in a manual step and an implementation is extracted.

## Features

The project consists of three Xtend-based model transformations for encoding QVT-R in Coq,

* *QVTr2Coq* translates QVT-R programs (parsed with QVTd) to Coq specifications;
* *Ecore2Coq* translates Ecore metamodels to Coq specifications;
* *XMI2Coq* translates Ecore instances to Coq specifications.

Additionally, we provide a verified implementation of *UML2RDBMS* as an example use case.

## Installing

*QVTr2Coq* runs on the Eclipse Modeling Tools. The following steps assume a fresh installation of Eclipse. 

<<<<<<< HEAD
* Download Eclipse [Modeling Tools 4.3 (Kepler)](http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/keplersr1) (Kepler) and launch it;
* Install through menu **Help > Install Modeling Components...** [Eclipse Xtext 2.5+](http://www.eclipse.org/modeling/tmf/downloads/?project=xtext) of the Model Development Tools (MDT) project;
* Choose **Help > Install New Software...** to install [Eclipse QVTd 0.10+](http://www.eclipse.org/mmt/downloads/?project=qvtd) of the Model to Model Transformation (MMT) project, [update site](http://download.eclipse.org/mmt/qvtd/updates/releases);
* Download [QVTr2Coq](https://github.com/qvt/qvtr2coq/zipball/master) and import contained projects through **File > Import > Existing Projects into Workspace…** into your Eclipse workspace.
=======
* Download Eclipse [Modeling Tools 4.3 (Kepler)](http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/keplersr1) (Kepler);
* Download and install in Eclipse the following archives in the given order, by choosing **Help > Install New Software…**:
  + [Eclipse Xtext 2.5+](http://www.eclipse.org/modeling/tmf/downloads/?project=xtext) of the Model Development Tools (MDT) project;
  + [Eclipse QVTd 0.10+](http://www.eclipse.org/mmt/downloads/?project=qvtd) of the Model to Model Transformation (MMT) project;
* Download [QVTr2Coq](https://github.com/qvt/qvtr2coq/zipball/master);
* Import the contained project through **File > Import > Existing Projects into Workspace…** into your Eclipse workspace.
>>>>>>> f45eac6bc7e984b6671c63e485a132d3be7b05c9

<!--(http://qvt.github.io/qvtr2coq/downloads/qvtr2coq-0.1.0.zip)-->

You are ready to use the code generator to produce Coq specifications from QVT-R programs, Ecore metamodels and instances thereof. To do so, use the run configuration **Generate Coq Code**. The transformation searches in subfolder [models](http://github.com/qvt/qvtr2coq/tree/master/edu.kit.ipd.sdq.mdsd.qvtrelation2coq/models) for files ending with .qvtr, .ecore, and .xmi. Resulting Coq specifications (.v files) are placed into [src-gen](http://github.com/qvt/qvtr2coq/tree/master/edu.kit.ipd.sdq.mdsd.qvtrelation2coq/src-gen). 

To use the generated Coq files, you need to install the [Coq proof assistant](http://coq.inria.fr/download), version 8.4 or higher. We recommend to download Coq bundled with CoqIDE.

## Example Proof

Folder [models](http://github.com/qvt/qvtr2coq/tree/master/edu.kit.ipd.sdq.mdsd.qvtrelation2coq/models) already contains QVT-R implementations together with their Ecore metamodels. One of them is the example transformation UML2RDBMS that maps UML to RDBMS models. It is the same version as that provided by the Eclipse QVTd project.

In folder [proof](http://github.com/qvt/qvtr2coq/tree/master/edu.kit.ipd.sdq.mdsd.qvtrelation2coq/proof), you will find the generated Coq specification of UML2RDBMS, complemented by an example proof. Several of the lemmas are general enough to be used in your own proofs, for instance package ListHelpers.

<!--([see also](https://sdqweb.ipd.kit.edu/wiki/Testing_QVT-R_Transformation_Tools))-->

## Publication
* A. Rentschler, J. Terrell, S. Zschaler, L. Happe, R. Reussner. [*Testing QVT-R Transformation Tools with Coq-Verified Implementations*](http://could.finally.lead.to/paper.pdf). Submitted to the 7th International Conference on Model Transformation (ICMT'14).

## Contributors
* [Andreas Rentschler] (http://sdq.ipd.kit.edu/people/andreas_rentschler/) from Karlsruhe Institute of Technology
* [Jeffrey Terrell] (http://www.inf.kcl.ac.uk/pg/terrellj/) from King's College, London
* [Steffen Zschaler] (https://kclpure.kcl.ac.uk/portal/steffen.zschaler.html) from King's College, London

This research is a cooperation between King's College London (KCL) and Karlsruhe Institute of Technology (KIT).
Work has partly been funded by the German Research Foundation (DFG) under grant No. RE 1674/5-1: [Model-Driven Methods and Tools for Performance Prediction and Capacity Planning of Component-Based Software Systems](http://www.ferdinand-project.org) and the Priority Programme SPP 1593: [Design For Future – Managed Software Evolution](http://www.dfg-spp1593.de).

<img src="http://qvt.github.io/qvtr2coq/images/Logo_KIT.png" alt="KIT" height="70px"/>&nbsp;&nbsp;&nbsp;&nbsp;
<img src="http://qvt.github.io/qvtr2coq/images/Logo_KCL.png" alt="KCL" height="70px"/>&nbsp;&nbsp;&nbsp;&nbsp;
<img src="http://qvt.github.io/qvtr2coq/images/Logo_FERDINAND.png" alt="FERDINAND" height="50px"/>&nbsp;&nbsp;
<img src="http://qvt.github.io/qvtr2coq/images/Logo_PPADVERT.png" alt="ADVERT" height="70px"/>
