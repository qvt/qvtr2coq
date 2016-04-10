# Creating Verified Implementations of QVTr Transformations

This project contains a transformation that automatically converts a QVTr transformation into a Coq specification.
The result currently lacks a functional implementation and a proof that the implementation adheres to the specification.

## Steps

1. Install Eclipse Luna Modeling Edition and click on Install Modeling Components to install:
  * QVTd project (the 2014 version, the QVTr metamodel of later versions might be incompatible)
2. Run the transformations on an input QVTr transformation script and related metamodels
   * Default transformation is Uml2Rdbms.qvtr: Launch the Eclipse workflow QVTrelation2Coq
   * Default metamodels are UML.ecore and RDBMS.ecore: Launch the Eclipse workflow Ecore2Coq
   * Models e.g. source.xmi may be translatable to a Coq representation in the future, currently there is no workflow Xmi2Coq 
3. Add a functional implementation based on the output Coq templated
4. Provide a proof that the functional implementation adheres to the functional implementation
   * A functional implementation together with a proof for UML2RDBMS is available under folder ./proof
5. Now you can run the transformation inside Coq on input models translated to the Coq representation
   * A manual translation of the MediaStore metamodel is contained at the end of the proof of UML2RDBMS
6. You can also extract the functional implementation to Haskell or ML for practical use
   * An extracted Haskell program with a thin XML wrapper is in project edu.kit.ipd.sdq.mdsd.uml2rdbms/Coq-Haskell
