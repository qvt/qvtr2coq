WARNING: Generated models are customized, search for '@generated not'!
=> Do not delete the generated output before conserving parts marked @Generated NOT
=> Where possible, persistency fixes are 'injected' by Xtend transformation at runtime to avoid custom parts as much as possible

No engine-generic model required, would complicate things too much 

RDBMS.ecore: Coq/Haskell output model (derived from Haskell HXT persistency wrapper code, see helper bash script)
RDBMS.ecore.xsd: Derived model from EMF XSD importer
RDBS.genmodel: Genmodel for generating Java sources
=> In rdbms.RdbmsPackage, changed the URI from "" to null, else loading fails ('package URI null not found'): String eNS_URI = null; //"";
   Maybe this could be done by a mapping in StandAlone-Setup? See http://www.eclipsezone.com/eclipse/forums/t57617.html : resourceSet.getPackageRegistry().put(null,pkg); 

rdbmsMM.xml.emof: ModelMorf original model
rdbmsMM.xml.genmodel: Genmodel for generating Java sources