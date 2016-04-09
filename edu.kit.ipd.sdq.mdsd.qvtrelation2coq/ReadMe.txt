# Creating Verified Implementations of QVTr Transformations

This project contains a transformation that automatically converts a QVTr transformation into a Coq specification.
The result currently lacks a functional implementation and a proof that the implementation adheres to the specification.

## Steps

1. Install the QVTd project (the 2012 version, the QVTr metamodel of later versions are no longer compatible)
2. Run the transformation on an input QVTr transformation script (e.g., Uml2Rdbms.qvtr) by starting the Eclipse workflow QVTrelation2Coq
3. Add a functional implementation based on the output Coq templated
4. Provide a proof that the functional implementation adheres to the functional implementation
5. Now you can extract the functional implementation to Haskell or ML
