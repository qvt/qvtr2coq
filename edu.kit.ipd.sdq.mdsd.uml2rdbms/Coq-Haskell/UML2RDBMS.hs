-- UML2RDBMS.hs, extracted from Coq (2015-11-29).

-- Modifications:
-- * Added picklers, and derived Show, Eq, etc. for each type
-- * Extracted CoqTypes to separate module

-- Warning: The extraction is currently set to bypass opacity,
-- the following opaque constant bodies have been accessed :
-- Transform.

module UML2RDBMS where

import qualified Prelude

import qualified Text.XML.HXT.Core
--import Data.Tuple.Curry

import CoqTypes
{-
data Bool =
   True
 | False

data Nat =
   O
 | S Nat

data Option a =
   Some a
 | None

data Sum a b =
   Inl a
 | Inr b

data List a =
   Nil
 | Cons a (List a)

app :: (List a1) -> (List a1) -> List a1
app l m =
  case l of {
   Nil -> m;
   Cons a l1 -> Cons a (app l1 m)}

type Sig a =
  a
  -- singleton inductive, whose constructor was exist
  
map :: (a1 -> a2) -> (List a1) -> List a2
map f l =
  case l of {
   Nil -> Nil;
   Cons a t -> Cons (f a) (map f t)}

flat_map :: (a1 -> List a2) -> (List a1) -> List a2
flat_map f l =
  case l of {
   Nil -> Nil;
   Cons x t -> app (f x) (flat_map f t)}

beq_nat :: Nat -> Nat -> Bool
beq_nat n m =
  case n of {
   O ->
    case m of {
     O -> True;
     S n0 -> False};
   S n1 ->
    case m of {
     O -> False;
     S m1 -> beq_nat n1 m1}}

data Ascii0 =
   Ascii Bool Bool Bool Bool Bool Bool Bool Bool

data String =
   EmptyString
 | String0 Ascii0 String

append :: String -> String -> String
append s1 s2 =
  case s1 of {
   EmptyString -> s2;
   String0 c s1' -> String0 c (append s1' s2)}
-}

data KIND =
   PERSISTENT
 | OTHER
 deriving (Prelude.Show, Prelude.Eq, Prelude.Ord, Prelude.Read)
instance Text.XML.HXT.Core.XmlPickler KIND where
  xpickle = Text.XML.HXT.Core.xpPrim

type Package_OID =
  Nat
  -- singleton inductive, whose constructor was Build_Package_OID
  
project_Package_OID_nat :: Package_OID -> Nat
project_Package_OID_nat p =
  p

type Class_OID =
  Nat
  -- singleton inductive, whose constructor was Build_Class_OID
  
project_Class_OID_nat :: Class_OID -> Nat
project_Class_OID_nat c =
  c

type Attribute_OID =
  Nat
  -- singleton inductive, whose constructor was Build_Attribute_OID
  
project_Attribute_OID_nat :: Attribute_OID -> Nat
project_Attribute_OID_nat a =
  a

type PrimitiveDataType_OID =
  Nat
  -- singleton inductive, whose constructor was Build_PrimitiveDataType_OID
  
type Association_OID =
  Nat
  -- singleton inductive, whose constructor was Build_Association_OID

project_Association_OID_nat :: Association_OID -> Nat
project_Association_OID_nat a =
  a

data ModelElement =
   Build_ModelElement KIND String
 deriving (Prelude.Show, Prelude.Eq, Prelude.Ord, Prelude.Read)
xpModelElement :: Text.XML.HXT.Core.PU ModelElement
xpModelElement
 = -- pickle into container tag: -- Text.XML.HXT.Core.xpElem "ModelElement" Prelude.$
   Text.XML.HXT.Core.xpWrap
     (\ (kind, name) -> (Build_ModelElement kind (fromPreludeString name)),
      \ (Build_ModelElement kind name) -> (kind, toPreludeString name)) Prelude.$
   Text.XML.HXT.Core.xpPair
     (Text.XML.HXT.Core.xpAttr "kind" Text.XML.HXT.Core.xpickle)
     (Text.XML.HXT.Core.xpAttr "name" Text.XML.HXT.Core.xpText)
instance Text.XML.HXT.Core.XmlPickler ModelElement where
  xpickle = xpModelElement

data PackageElement =
   Build_PackageElement ModelElement
 deriving (Prelude.Show, Prelude.Eq, Prelude.Ord, Prelude.Read)
xpPackageElement :: Text.XML.HXT.Core.PU PackageElement
xpPackageElement
 = -- pickle into container tag: -- Text.XML.HXT.Core.xpElem "PackageElement" Prelude.$
   Text.XML.HXT.Core.xpWrap
     (\ (super) -> (Build_PackageElement super), 
      \ (Build_PackageElement super) -> (super)) Prelude.$
   Text.XML.HXT.Core.xpickle
instance Text.XML.HXT.Core.XmlPickler PackageElement where
  xpickle = xpPackageElement
 
data Classifier =
   Build_Classifier PackageElement
 deriving (Prelude.Show, Prelude.Eq, Prelude.Ord, Prelude.Read)
xpClassifier :: Text.XML.HXT.Core.PU Classifier
xpClassifier
 = -- pickle into container tag: -- Text.XML.HXT.Core.xpElem "Classifier" Prelude.$
   Text.XML.HXT.Core.xpWrap
     (\ (package) -> Build_Classifier package, 
      \ (Build_Classifier package) -> (package)) Prelude.$
   Text.XML.HXT.Core.xpickle
instance Text.XML.HXT.Core.XmlPickler Classifier where
  xpickle = xpClassifier
 
data Attribute =
   Build_Attribute Attribute_OID ModelElement (Sum Class PrimitiveDataType)
 deriving (Prelude.Show, Prelude.Eq, Prelude.Ord, Prelude.Read)
xpAttribute :: Text.XML.HXT.Core.PU Attribute
xpAttribute
 = Text.XML.HXT.Core.xpElem "attribute" Prelude.$ -- IMPORTANT NOTE: Even class names must be lowercase, because in the chain Haskell->DTD->XSD->Ecore, the XSD to Ecore importer cannot be instrumented to handle <element ref=...> as Uppercase, because all XML tags represent the references (and references must always begin with lowercase under Ecore). Couldn't fix this, cf. https://www.eclipse.org/modeling/emf/docs/overviews/XMLSchemaToEcoreMapping.pdf where section 5.9 explains the pattern we use here (introduced by the DTD-to-XSD exporter)
   Text.XML.HXT.Core.xpWrap
     (\ (oid, super, owner) -> (Build_Attribute oid super owner),
      \ (Build_Attribute oid super owner) -> (oid, super, owner)) Prelude.$
   Text.XML.HXT.Core.xpTriple
     (Text.XML.HXT.Core.xpAttr "oID" Text.XML.HXT.Core.xpickle)
     ({-Text.XML.HXT.Core.xpAttr "ModelElement"-} Text.XML.HXT.Core.xpickle)
     (Text.XML.HXT.Core.xpElem "ownerClassifier" Text.XML.HXT.Core.xpickle)
instance Text.XML.HXT.Core.XmlPickler Attribute where
  xpickle = xpAttribute
 
data Association =
   Build_Association Association_OID PackageElement Class_OID Class_OID
 deriving (Prelude.Show, Prelude.Eq, Prelude.Ord, Prelude.Read)
xpAssociation :: Text.XML.HXT.Core.PU Association
xpAssociation
 = Text.XML.HXT.Core.xpElem "association" Prelude.$
   Text.XML.HXT.Core.xpWrap
     (\ (oid, namespace, source, destination) -> (Build_Association oid namespace source destination),
      \ (Build_Association oid namespace source destination) -> (oid, namespace, source, destination)) Prelude.$
   Text.XML.HXT.Core.xp4Tuple
     (Text.XML.HXT.Core.xpAttr "oID" Text.XML.HXT.Core.xpickle)
     ({-Text.XML.HXT.Core.xpElem "namespace" Prelude.$-} Text.XML.HXT.Core.xpickle)
     (Text.XML.HXT.Core.xpAttr "source" Text.XML.HXT.Core.xpickle)
     (Text.XML.HXT.Core.xpAttr "destination" Text.XML.HXT.Core.xpickle)
instance Text.XML.HXT.Core.XmlPickler Association where
  xpickle = xpAssociation
 
data PrimitiveDataType =
   Build_PrimitiveDataType PrimitiveDataType_OID Classifier
 deriving (Prelude.Show, Prelude.Eq, Prelude.Ord, Prelude.Read)
xpPrimitiveDataType :: Text.XML.HXT.Core.PU PrimitiveDataType
xpPrimitiveDataType
 = Text.XML.HXT.Core.xpElem "primitiveDataType" Prelude.$
   Text.XML.HXT.Core.xpWrap
     (Prelude.uncurry Build_PrimitiveDataType, 
      \ (Build_PrimitiveDataType oid super) -> (oid, super)) Prelude.$
   Text.XML.HXT.Core.xpPair
     (Text.XML.HXT.Core.xpAttr "oID" Text.XML.HXT.Core.xpickle)
     ({-Text.XML.HXT.Core.xpAttr "super"-} Text.XML.HXT.Core.xpickle)
instance Text.XML.HXT.Core.XmlPickler PrimitiveDataType where
  xpickle = xpPrimitiveDataType
 
data Class =
   Build_Class Class_OID Classifier (Option Class) (List Attribute)
 deriving (Prelude.Show, Prelude.Eq, Prelude.Ord, Prelude.Read)
xpClass :: Text.XML.HXT.Core.PU Class
xpClass
 = Text.XML.HXT.Core.xpElem "class_" Prelude.$
   Text.XML.HXT.Core.xpWrap
     (\ (oid, classifier, super, attributes) -> (Build_Class oid classifier (fromPreludeMaybe super) (fromPreludeList attributes)), 
      \ (Build_Class oid classifier super attributes) -> (oid, classifier, toPreludeMaybe super, toPreludeList attributes)) Prelude.$
   Text.XML.HXT.Core.xp4Tuple
     (Text.XML.HXT.Core.xpAttr "oID" Text.XML.HXT.Core.xpickle)
     ({-Text.XML.HXT.Core.xpAttr "super"-} Text.XML.HXT.Core.xpickle)
     (Text.XML.HXT.Core.xpElem "generalClass" Prelude.$ Text.XML.HXT.Core.xpOption Text.XML.HXT.Core.xpickle)
     (Text.XML.HXT.Core.xpElem "attributes" Prelude.$ Text.XML.HXT.Core.xpickle)
instance Text.XML.HXT.Core.XmlPickler Class where
  xpickle = xpClass
 
data Package =
   Build_Package Package_OID ModelElement (List (Sum (Sum Class PrimitiveDataType) Association))
 deriving (Prelude.Show, Prelude.Eq, Prelude.Ord, Prelude.Read)
xpPackage :: Text.XML.HXT.Core.PU Package
xpPackage
 = Text.XML.HXT.Core.xpElem "package_" Prelude.$
   Text.XML.HXT.Core.xpWrap
     (\ (oid, super, elements) -> (Build_Package oid super (fromPreludeList elements)), 
      \ (Build_Package oid super elements) -> (oid, super, toPreludeList elements)) Prelude.$
   Text.XML.HXT.Core.xpTriple
     (Text.XML.HXT.Core.xpAttr "oID" Text.XML.HXT.Core.xpickle)
     ({-Text.XML.HXT.Core.xpAttr "ModelElement"-} Text.XML.HXT.Core.xpickle)
     (Text.XML.HXT.Core.xpElem "classifiersAndAssociations" Prelude.$ Text.XML.HXT.Core.xpList Text.XML.HXT.Core.xpickle)
instance Text.XML.HXT.Core.XmlPickler Package where
  xpickle = xpPackage

project_ModelElement_kind :: ModelElement -> KIND
project_ModelElement_kind x =
  case x of {
   Build_ModelElement kind s -> kind}

project_ModelElement_name :: ModelElement -> String
project_ModelElement_name x =
  case x of {
   Build_ModelElement k name -> name}

project_PackageElement_super :: PackageElement -> ModelElement
project_PackageElement_super x =
  case x of {
   Build_PackageElement super -> super}

project_Classifier_super :: Classifier -> PackageElement
project_Classifier_super x =
  case x of {
   Build_Classifier super -> super}

project_Attribute_oid :: Attribute -> Attribute_OID
project_Attribute_oid x =
  case x of {
   Build_Attribute oid m s -> oid}

project_Attribute_super :: Attribute -> ModelElement
project_Attribute_super x =
  case x of {
   Build_Attribute a super s -> super}

project_Attribute_type :: Attribute -> Sum Class PrimitiveDataType
project_Attribute_type x =
  case x of {
   Build_Attribute a m type0 -> type0}

project_Association_oid :: Association -> Association_OID
project_Association_oid x =
  case x of {
   Build_Association oid p c c0 -> oid}

project_Association_super :: Association -> PackageElement
project_Association_super x =
  case x of {
   Build_Association a super c c0 -> super}

project_Association_source :: Association -> Class_OID
project_Association_source x =
  case x of {
   Build_Association oid super source destination -> source}

project_Association_destination :: Association -> Class_OID
project_Association_destination x =
  case x of {
   Build_Association a p c destination -> destination}

project_PrimitiveDataType_super :: PrimitiveDataType -> Classifier
project_PrimitiveDataType_super x =
  case x of {
   Build_PrimitiveDataType p super -> super}

project_Class_oid :: Class -> Class_OID
project_Class_oid x =
  case x of {
   Build_Class oid c o l -> oid}

project_Class_super :: Class -> Classifier
project_Class_super x =
  case x of {
   Build_Class c super o l -> super}

project_Class_general :: Class -> Option Class
project_Class_general x =
  case x of {
   Build_Class c c0 general l -> general}

project_Class_attributes :: Class -> List Attribute
project_Class_attributes x =
  case x of {
   Build_Class c c0 o attributes -> attributes}

project_Package_oid :: Package -> Package_OID
project_Package_oid x =
  case x of {
   Build_Package oid m l -> oid}

project_Package_super :: Package -> ModelElement
project_Package_super x =
  case x of {
   Build_Package p super l -> super}

project_Package_elements :: Package -> List
                            (Sum (Sum Class PrimitiveDataType) Association)
project_Package_elements x =
  case x of {
   Build_Package p m elements -> elements}

type UML =
  List Package
  -- singleton inductive, whose constructor was Build
  
content :: UML -> List Package
content u =
  u

allInstances_Package :: UML -> List Package
allInstances_Package uml =
  content uml

filter_Class :: (List (Sum (Sum Class PrimitiveDataType) Association)) -> List
                Class
filter_Class lc =
  case lc of {
   Nil -> Nil;
   Cons s lc_tail ->
    case s of {
     Inl s0 ->
      case s0 of {
       Inl lc_head -> Cons lc_head (filter_Class lc_tail);
       Inr p -> filter_Class lc_tail};
     Inr a -> filter_Class lc_tail}}

filter_Association :: (List (Sum (Sum Class PrimitiveDataType) Association))
                      -> List Association
filter_Association lc =
  case lc of {
   Nil -> Nil;
   Cons s lc_tail ->
    case s of {
     Inl s0 -> filter_Association lc_tail;
     Inr lc_head -> Cons lc_head (filter_Association lc_tail)}}

dereference_Class'' :: (List (Sum (Sum Class PrimitiveDataType) Association))
                       -> Class_OID -> Option Class
dereference_Class'' lc c_oid =
  case lc of {
   Nil -> None;
   Cons s lc_tail ->
    case s of {
     Inl s0 ->
      case s0 of {
       Inl lc_head ->
        case beq_nat (project_Class_OID_nat (project_Class_oid lc_head))
               (project_Class_OID_nat c_oid) of {
         True -> Some lc_head;
         False -> dereference_Class'' lc_tail c_oid};
       Inr p -> dereference_Class'' lc_tail c_oid};
     Inr a -> dereference_Class'' lc_tail c_oid}}

dereference_Class' :: (List Package) -> Class_OID -> Option Class
dereference_Class' lp c_oid =
  case lp of {
   Nil -> None;
   Cons p tail ->
    case dereference_Class'' (project_Package_elements p) c_oid of {
     Some c -> Some c;
     None -> dereference_Class' tail c_oid}}

dereference_Class :: UML -> Class_OID -> Option Class
dereference_Class uml c_oid =
  dereference_Class' (content uml) c_oid

project_Package_name :: Package -> String
project_Package_name o =
  project_ModelElement_name (project_Package_super o)

project_Attribute_name :: Attribute -> String
project_Attribute_name o =
  project_ModelElement_name (project_Attribute_super o)

project_PackageElement_kind :: PackageElement -> KIND
project_PackageElement_kind o =
  project_ModelElement_kind (project_PackageElement_super o)

project_PackageElement_name :: PackageElement -> String
project_PackageElement_name o =
  project_ModelElement_name (project_PackageElement_super o)

project_Classifier_kind :: Classifier -> KIND
project_Classifier_kind o =
  project_PackageElement_kind (project_Classifier_super o)

project_Classifier_name :: Classifier -> String
project_Classifier_name o =
  project_PackageElement_name (project_Classifier_super o)

project_Class_kind :: Class -> KIND
project_Class_kind o =
  project_Classifier_kind (project_Class_super o)

project_Class_name :: Class -> String
project_Class_name o =
  project_Classifier_name (project_Class_super o)

project_PrimitiveDataType_name :: PrimitiveDataType -> String
project_PrimitiveDataType_name o =
  project_Classifier_name (project_PrimitiveDataType_super o)

project_Association_name :: Association -> String
project_Association_name o =
  project_PackageElement_name (project_Association_super o)

data TYPE =
   NUMBER
 | BOOLEAN
 | VARCHAR
 deriving (Prelude.Show, Prelude.Eq, Prelude.Ord, Prelude.Read)
-- fromType :: TYPE -> Prelude.String
-- fromType NUMBER = "NUMBER"
-- fromType BOOLEAN = "BOOLEAN"
-- fromType VARCHAR = "VARCHAR"
-- toType :: Prelude.String -> TYPE
-- toType "NUMBER" = NUMBER
-- toType "BOOLEAN" = BOOLEAN
-- toType "VARCHAR" = VARCHAR
instance Text.XML.HXT.Core.XmlPickler TYPE where
  xpickle = Text.XML.HXT.Core.xpPrim
--  xpickle = Text.XML.HXT.Core.xpWrap (Prelude.toEnum, Prelude.fromEnum) Text.XML.HXT.Core.xpickle

type Schema_OID =
  Nat
  -- singleton inductive, whose constructor was Build_Schema_OID
  
type Table_OID =
  Nat
  -- singleton inductive, whose constructor was Build_Table_OID
  
type Column_OID =
  Nat
  -- singleton inductive, whose constructor was Build_Column_OID
  
type Key_OID =
  Nat
  -- singleton inductive, whose constructor was Build_Key_OID
  
type ForeignKey_OID =
  Nat
  -- singleton inductive, whose constructor was Build_ForeignKey_OID
  
data ModelElement0 =
   Build_ModelElement0 String String
 deriving (Prelude.Show, Prelude.Eq, Prelude.Ord, Prelude.Read)
xpModelElement0 :: Text.XML.HXT.Core.PU ModelElement0
xpModelElement0
 = -- pickle into container tag: -- Text.XML.HXT.Core.xpElem "ModelElement" Prelude.$
   Text.XML.HXT.Core.xpWrap
     (\ (name , kind) -> (Build_ModelElement0 (fromPreludeString name) (fromPreludeString kind)),
      \ (Build_ModelElement0 name kind) -> (toPreludeString name, toPreludeString kind)) Prelude.$
   Text.XML.HXT.Core.xpPair
     (Text.XML.HXT.Core.xpAttr "name" Text.XML.HXT.Core.xpText)
     (Text.XML.HXT.Core.xpAttr "kind" Text.XML.HXT.Core.xpText)
instance Text.XML.HXT.Core.XmlPickler ModelElement0 where
  xpickle = xpModelElement0

data ForeignKey =
   Build_ForeignKey ForeignKey_OID ModelElement0 Table_OID Key_OID (List
                                                                   Column_OID)
 deriving (Prelude.Show, Prelude.Eq, Prelude.Ord, Prelude.Read)
xpForeignKey :: Text.XML.HXT.Core.PU ForeignKey
xpForeignKey
 = Text.XML.HXT.Core.xpElem "foreignKey" Prelude.$
   Text.XML.HXT.Core.xpWrap
     (\ (oid, super, table_OID, key_OID, column_OIDs) -> (Build_ForeignKey oid super table_OID key_OID (fromPreludeList column_OIDs)), 
      \ (Build_ForeignKey oid super table_OID key_OID column_OIDs) -> (oid, super, table_OID, key_OID, toPreludeList column_OIDs)) Prelude.$
   Text.XML.HXT.Core.xp5Tuple
     (Text.XML.HXT.Core.xpAttr "oID" Text.XML.HXT.Core.xpickle)
     ({-Text.XML.HXT.Core.xpAttr "ModelElement"-} Text.XML.HXT.Core.xpickle)
     (Text.XML.HXT.Core.xpAttr "owner" Text.XML.HXT.Core.xpickle)
     (Text.XML.HXT.Core.xpAttr "refersTo" Text.XML.HXT.Core.xpickle)
     (Text.XML.HXT.Core.xpElem "referencedColumns" {-NOTREALLY-} Prelude.$ Text.XML.HXT.Core.xpList (Text.XML.HXT.Core.xpElem "oID" Prelude.$ Text.XML.HXT.Core.xpAttr "oID" Text.XML.HXT.Core.xpickle)) -- NOTE: References must be globally different to actual element containers, thus 'referencedColumns' instead of 'columns'
instance Text.XML.HXT.Core.XmlPickler ForeignKey where
  xpickle = xpForeignKey

data Key =
   Build_Key Key_OID ModelElement0 (List Column_OID)
 deriving (Prelude.Show, Prelude.Eq, Prelude.Ord, Prelude.Read)
xpKey :: Text.XML.HXT.Core.PU Key
xpKey
 = Text.XML.HXT.Core.xpElem "key" Prelude.$
   Text.XML.HXT.Core.xpWrap
     (\ (oid, super, column_OIDs) -> (Build_Key oid super (fromPreludeList column_OIDs)), 
      \ (Build_Key oid super column_OIDs) -> (oid, super, toPreludeList column_OIDs)) Prelude.$
   Text.XML.HXT.Core.xpTriple
     (Text.XML.HXT.Core.xpAttr "oID" Text.XML.HXT.Core.xpickle)
     ({-Text.XML.HXT.Core.xpAttr "ModelElement"-} Text.XML.HXT.Core.xpickle)
     (Text.XML.HXT.Core.xpElem "referencedColumns" {-NOTREALLY-} Prelude.$ Text.XML.HXT.Core.xpList (Text.XML.HXT.Core.xpElem "oID" Prelude.$ Text.XML.HXT.Core.xpAttr "oID" Text.XML.HXT.Core.xpickle))
instance Text.XML.HXT.Core.XmlPickler Key where
  xpickle = xpKey

data Column =
   Build_Column Column_OID ModelElement0 TYPE (List Key_OID) (List
                                                             ForeignKey_OID)
 deriving (Prelude.Show, Prelude.Eq, Prelude.Ord, Prelude.Read)
xpColumn :: Text.XML.HXT.Core.PU Column
xpColumn
 = Text.XML.HXT.Core.xpElem "column" Prelude.$
   Text.XML.HXT.Core.xpWrap
     (\ (oid, super, _type, key_OIDs, foreignKey_OIDs) -> (Build_Column oid super _type (fromPreludeList key_OIDs) (fromPreludeList foreignKey_OIDs)), 
      \ (Build_Column oid super _type key_OIDs foreignKey_OIDs) -> (oid, super, _type, toPreludeList key_OIDs, toPreludeList foreignKey_OIDs)) Prelude.$
   Text.XML.HXT.Core.xp5Tuple
     (Text.XML.HXT.Core.xpAttr "oID" Text.XML.HXT.Core.xpickle)
     ({-Text.XML.HXT.Core.xpAttr "ModelElement"-} Text.XML.HXT.Core.xpickle)
     (Text.XML.HXT.Core.xpAttr "type" Text.XML.HXT.Core.xpickle)
     (Text.XML.HXT.Core.xpElem "referencedKeys" {-NOTREALLY-} Prelude.$ Text.XML.HXT.Core.xpList (Text.XML.HXT.Core.xpElem "oID" Prelude.$ Text.XML.HXT.Core.xpAttr "oID" Text.XML.HXT.Core.xpickle)) -- not filled by Coq transformation, only reverse direction Key.referencedColumns?
     (Text.XML.HXT.Core.xpElem "hasForeignKeys" {-ONLYONE-} Prelude.$ Text.XML.HXT.Core.xpList (Text.XML.HXT.Core.xpElem "oID" Prelude.$ Text.XML.HXT.Core.xpAttr "oID" Text.XML.HXT.Core.xpickle)) -- not filled by Coq transformation, only reverse direction ForeignKey.referencedColumns?
instance Text.XML.HXT.Core.XmlPickler Column where
  xpickle = xpColumn

data Table =
   Build_Table Table_OID ModelElement0 (List Column) (Option Key)
 deriving (Prelude.Show, Prelude.Eq, Prelude.Ord, Prelude.Read)
xpTable :: Text.XML.HXT.Core.PU Table
xpTable
 = Text.XML.HXT.Core.xpElem "table" Prelude.$
   Text.XML.HXT.Core.xpWrap
     (\ (oid, super, columns, key) -> (Build_Table oid super (fromPreludeList columns) (fromPreludeMaybe key)), 
      \ (Build_Table oid super columns key) -> (oid, super, toPreludeList columns, toPreludeMaybe key)) Prelude.$
   Text.XML.HXT.Core.xp4Tuple
     (Text.XML.HXT.Core.xpAttr "oID" Text.XML.HXT.Core.xpickle)
     ({-Text.XML.HXT.Core.xpAttr "ModelElement"-} Text.XML.HXT.Core.xpickle)
     (Text.XML.HXT.Core.xpElem "columns" Prelude.$ Text.XML.HXT.Core.xpList Text.XML.HXT.Core.xpickle)
     (Text.XML.HXT.Core.xpElem "key2" Prelude.$ Text.XML.HXT.Core.xpOption Text.XML.HXT.Core.xpickle) --(Text.XML.HXT.Core.xpOption {-"Key"-} Text.XML.HXT.Core.xpickle)
instance Text.XML.HXT.Core.XmlPickler Table where
  xpickle = xpTable

data Schema =
   Build_Schema Schema_OID ModelElement0 (List Table) (List ForeignKey)
 deriving (Prelude.Show, Prelude.Eq, Prelude.Ord, Prelude.Read)
xpSchema :: Text.XML.HXT.Core.PU Schema
xpSchema
 = Text.XML.HXT.Core.xpElem "schema" Prelude.$
   Text.XML.HXT.Core.xpWrap
     (\ (oid, super, tables, foreignKey) -> (Build_Schema oid super (fromPreludeList tables) (fromPreludeList foreignKey)), 
      \ (Build_Schema oid super tables foreignKey) -> (oid, super, toPreludeList tables, toPreludeList foreignKey)) Prelude.$
   Text.XML.HXT.Core.xp4Tuple
     (Text.XML.HXT.Core.xpAttr "oID" Text.XML.HXT.Core.xpickle)
     ({-Text.XML.HXT.Core.xpAttr "ModelElement"-} Text.XML.HXT.Core.xpickle)
     (Text.XML.HXT.Core.xpElem "tables" Prelude.$ Text.XML.HXT.Core.xpList Text.XML.HXT.Core.xpickle)
     (Text.XML.HXT.Core.xpElem "foreignKeys" Prelude.$ Text.XML.HXT.Core.xpList Text.XML.HXT.Core.xpickle)
instance Text.XML.HXT.Core.XmlPickler Schema where
  xpickle = xpSchema

type RDBMS =
  List Schema 
  -- singleton inductive, whose constructor was Build
  
primitiveTypeToSqlType :: String -> TYPE
primitiveTypeToSqlType name =
  case name of {
   EmptyString -> VARCHAR;
   String0 a s ->
    case a of {
     Ascii b b0 b1 b2 b3 b4 b5 b6 ->
      case b of {
       True ->
        case b0 of {
         True -> VARCHAR;
         False ->
          case b1 of {
           True -> VARCHAR;
           False ->
            case b2 of {
             True ->
              case b3 of {
               True -> VARCHAR;
               False ->
                case b4 of {
                 True -> VARCHAR;
                 False ->
                  case b5 of {
                   True ->
                    case b6 of {
                     True -> VARCHAR;
                     False ->
                      case s of {
                       EmptyString -> VARCHAR;
                       String0 a0 s0 ->
                        case a0 of {
                         Ascii b7 b8 b9 b10 b11 b12 b13 b14 ->
                          case b7 of {
                           True -> VARCHAR;
                           False ->
                            case b8 of {
                             True ->
                              case b9 of {
                               True ->
                                case b10 of {
                                 True ->
                                  case b11 of {
                                   True -> VARCHAR;
                                   False ->
                                    case b12 of {
                                     True ->
                                      case b13 of {
                                       True ->
                                        case b14 of {
                                         True -> VARCHAR;
                                         False ->
                                          case s0 of {
                                           EmptyString -> VARCHAR;
                                           String0 a1 s1 ->
                                            case a1 of {
                                             Ascii b15 b16 b17 b18 b19 b20 b21
                                              b22 ->
                                              case b15 of {
                                               True -> VARCHAR;
                                               False ->
                                                case b16 of {
                                                 True -> VARCHAR;
                                                 False ->
                                                  case b17 of {
                                                   True ->
                                                    case b18 of {
                                                     True -> VARCHAR;
                                                     False ->
                                                      case b19 of {
                                                       True ->
                                                        case b20 of {
                                                         True ->
                                                          case b21 of {
                                                           True ->
                                                            case b22 of {
                                                             True -> VARCHAR;
                                                             False ->
                                                              case s1 of {
                                                               EmptyString ->
                                                                VARCHAR;
                                                               String0 a2
                                                                s2 ->
                                                                case a2 of {
                                                                 Ascii b23 b24
                                                                  b25 b26 b27
                                                                  b28 b29
                                                                  b30 ->
                                                                  case b23 of {
                                                                   True ->
                                                                    case b24 of {
                                                                     True ->
                                                                     VARCHAR;
                                                                     False ->
                                                                     case b25 of {
                                                                      True ->
                                                                     case b26 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case b27 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case b28 of {
                                                                      True ->
                                                                     case b29 of {
                                                                      True ->
                                                                     case b30 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case s2 of {
                                                                      EmptyString ->
                                                                     VARCHAR;
                                                                      String0 a3
                                                                     s3 ->
                                                                     case a3 of {
                                                                      Ascii b31
                                                                     b32 b33
                                                                     b34 b35
                                                                     b36 b37
                                                                     b38 ->
                                                                     case b31 of {
                                                                      True ->
                                                                     case b32 of {
                                                                      True ->
                                                                     case b33 of {
                                                                      True ->
                                                                     case b34 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case b35 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case b36 of {
                                                                      True ->
                                                                     case b37 of {
                                                                      True ->
                                                                     case b38 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case s3 of {
                                                                      EmptyString ->
                                                                     VARCHAR;
                                                                      String0 a4
                                                                     s4 ->
                                                                     case a4 of {
                                                                      Ascii b39
                                                                     b40 b41
                                                                     b42 b43
                                                                     b44 b45
                                                                     b46 ->
                                                                     case b39 of {
                                                                      True ->
                                                                     case b40 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case b41 of {
                                                                      True ->
                                                                     case b42 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case b43 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case b44 of {
                                                                      True ->
                                                                     case b45 of {
                                                                      True ->
                                                                     case b46 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case s4 of {
                                                                      EmptyString ->
                                                                     VARCHAR;
                                                                      String0 a5
                                                                     s5 ->
                                                                     case a5 of {
                                                                      Ascii b47
                                                                     b48 b49
                                                                     b50 b51
                                                                     b52 b53
                                                                     b54 ->
                                                                     case b47 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case b48 of {
                                                                      True ->
                                                                     case b49 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case b50 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case b51 of {
                                                                      True ->
                                                                     case b52 of {
                                                                      True ->
                                                                     case b53 of {
                                                                      True ->
                                                                     case b54 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case s5 of {
                                                                      EmptyString ->
                                                                     NUMBER;
                                                                      String0 a6
                                                                     s6 ->
                                                                     VARCHAR}};
                                                                      False ->
                                                                     VARCHAR};
                                                                      False ->
                                                                     VARCHAR};
                                                                      False ->
                                                                     VARCHAR}}};
                                                                      False ->
                                                                     VARCHAR}}}}};
                                                                      False ->
                                                                     VARCHAR};
                                                                      False ->
                                                                     VARCHAR}}};
                                                                      False ->
                                                                     VARCHAR}};
                                                                      False ->
                                                                     VARCHAR}}}};
                                                                      False ->
                                                                     VARCHAR};
                                                                      False ->
                                                                     VARCHAR}}};
                                                                      False ->
                                                                     VARCHAR};
                                                                      False ->
                                                                     VARCHAR};
                                                                      False ->
                                                                     VARCHAR}}}};
                                                                      False ->
                                                                     VARCHAR};
                                                                      False ->
                                                                     VARCHAR}}};
                                                                      False ->
                                                                     VARCHAR}};
                                                                   False ->
                                                                    VARCHAR}}}};
                                                           False -> VARCHAR};
                                                         False -> VARCHAR};
                                                       False -> VARCHAR}};
                                                   False -> VARCHAR}}}}}};
                                       False -> VARCHAR};
                                     False -> VARCHAR}};
                                 False -> VARCHAR};
                               False -> VARCHAR};
                             False -> VARCHAR}}}}};
                   False -> VARCHAR}}};
             False -> VARCHAR}}};
       False ->
        case b0 of {
         True ->
          case b1 of {
           True -> VARCHAR;
           False ->
            case b2 of {
             True -> VARCHAR;
             False ->
              case b3 of {
               True -> VARCHAR;
               False ->
                case b4 of {
                 True -> VARCHAR;
                 False ->
                  case b5 of {
                   True ->
                    case b6 of {
                     True -> VARCHAR;
                     False ->
                      case s of {
                       EmptyString -> VARCHAR;
                       String0 a0 s0 ->
                        case a0 of {
                         Ascii b7 b8 b9 b10 b11 b12 b13 b14 ->
                          case b7 of {
                           True ->
                            case b8 of {
                             True ->
                              case b9 of {
                               True ->
                                case b10 of {
                                 True ->
                                  case b11 of {
                                   True -> VARCHAR;
                                   False ->
                                    case b12 of {
                                     True ->
                                      case b13 of {
                                       True ->
                                        case b14 of {
                                         True -> VARCHAR;
                                         False ->
                                          case s0 of {
                                           EmptyString -> VARCHAR;
                                           String0 a1 s1 ->
                                            case a1 of {
                                             Ascii b15 b16 b17 b18 b19 b20 b21
                                              b22 ->
                                              case b15 of {
                                               True ->
                                                case b16 of {
                                                 True ->
                                                  case b17 of {
                                                   True ->
                                                    case b18 of {
                                                     True ->
                                                      case b19 of {
                                                       True -> VARCHAR;
                                                       False ->
                                                        case b20 of {
                                                         True ->
                                                          case b21 of {
                                                           True ->
                                                            case b22 of {
                                                             True -> VARCHAR;
                                                             False ->
                                                              case s1 of {
                                                               EmptyString ->
                                                                VARCHAR;
                                                               String0 a2
                                                                s2 ->
                                                                case a2 of {
                                                                 Ascii b23 b24
                                                                  b25 b26 b27
                                                                  b28 b29
                                                                  b30 ->
                                                                  case b23 of {
                                                                   True ->
                                                                    VARCHAR;
                                                                   False ->
                                                                    case b24 of {
                                                                     True ->
                                                                     VARCHAR;
                                                                     False ->
                                                                     case b25 of {
                                                                      True ->
                                                                     case b26 of {
                                                                      True ->
                                                                     case b27 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case b28 of {
                                                                      True ->
                                                                     case b29 of {
                                                                      True ->
                                                                     case b30 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case s2 of {
                                                                      EmptyString ->
                                                                     VARCHAR;
                                                                      String0 a3
                                                                     s3 ->
                                                                     case a3 of {
                                                                      Ascii b31
                                                                     b32 b33
                                                                     b34 b35
                                                                     b36 b37
                                                                     b38 ->
                                                                     case b31 of {
                                                                      True ->
                                                                     case b32 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case b33 of {
                                                                      True ->
                                                                     case b34 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case b35 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case b36 of {
                                                                      True ->
                                                                     case b37 of {
                                                                      True ->
                                                                     case b38 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case s3 of {
                                                                      EmptyString ->
                                                                     VARCHAR;
                                                                      String0 a4
                                                                     s4 ->
                                                                     case a4 of {
                                                                      Ascii b39
                                                                     b40 b41
                                                                     b42 b43
                                                                     b44 b45
                                                                     b46 ->
                                                                     case b39 of {
                                                                      True ->
                                                                     case b40 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case b41 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case b42 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case b43 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case b44 of {
                                                                      True ->
                                                                     case b45 of {
                                                                      True ->
                                                                     case b46 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case s4 of {
                                                                      EmptyString ->
                                                                     VARCHAR;
                                                                      String0 a5
                                                                     s5 ->
                                                                     case a5 of {
                                                                      Ascii b47
                                                                     b48 b49
                                                                     b50 b51
                                                                     b52 b53
                                                                     b54 ->
                                                                     case b47 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case b48 of {
                                                                      True ->
                                                                     case b49 of {
                                                                      True ->
                                                                     case b50 of {
                                                                      True ->
                                                                     case b51 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case b52 of {
                                                                      True ->
                                                                     case b53 of {
                                                                      True ->
                                                                     case b54 of {
                                                                      True ->
                                                                     VARCHAR;
                                                                      False ->
                                                                     case s5 of {
                                                                      EmptyString ->
                                                                     BOOLEAN;
                                                                      String0 a6
                                                                     s6 ->
                                                                     VARCHAR}};
                                                                      False ->
                                                                     VARCHAR};
                                                                      False ->
                                                                     VARCHAR}};
                                                                      False ->
                                                                     VARCHAR};
                                                                      False ->
                                                                     VARCHAR};
                                                                      False ->
                                                                     VARCHAR}}}}};
                                                                      False ->
                                                                     VARCHAR};
                                                                      False ->
                                                                     VARCHAR}}}}};
                                                                      False ->
                                                                     VARCHAR}}}};
                                                                      False ->
                                                                     VARCHAR};
                                                                      False ->
                                                                     VARCHAR}}};
                                                                      False ->
                                                                     VARCHAR}};
                                                                      False ->
                                                                     VARCHAR}}}};
                                                                      False ->
                                                                     VARCHAR};
                                                                      False ->
                                                                     VARCHAR}};
                                                                      False ->
                                                                     VARCHAR};
                                                                      False ->
                                                                     VARCHAR}}}}}};
                                                           False -> VARCHAR};
                                                         False -> VARCHAR}};
                                                     False -> VARCHAR};
                                                   False -> VARCHAR};
                                                 False -> VARCHAR};
                                               False -> VARCHAR}}}};
                                       False -> VARCHAR};
                                     False -> VARCHAR}};
                                 False -> VARCHAR};
                               False -> VARCHAR};
                             False -> VARCHAR};
                           False -> VARCHAR}}}};
                   False -> VARCHAR}}}}};
         False -> VARCHAR}}}}

build_PrimitiveAttributeToColumn :: Attribute -> PrimitiveDataType -> String
                                    -> Column
build_PrimitiveAttributeToColumn a p prefix =
  Build_Column (project_Attribute_OID_nat (project_Attribute_oid a))
    (Build_ModelElement0
    (case prefix of {
      EmptyString -> project_Attribute_name a;
      String0 a0 s ->
       append prefix
         (append (String0 (Ascii True True True True True False True False)
           EmptyString) (project_Attribute_name a))}) EmptyString)
    (primitiveTypeToSqlType (project_PrimitiveDataType_name p)) Nil Nil

establish_AttributeToColumn :: Class -> String -> List Column
establish_AttributeToColumn c prefix =
  app
    (let {
      primitiveAttributeToColumn l =
        case l of {
         Nil -> Nil;
         Cons a l' ->
          case project_Attribute_type a of {
           Inl c0 -> primitiveAttributeToColumn l';
           Inr pdt -> Cons (build_PrimitiveAttributeToColumn a pdt prefix)
            (primitiveAttributeToColumn l')}}}
     in primitiveAttributeToColumn (project_Class_attributes c))
    (app
      (let {
        complexAttributeToColumn l =
          case l of {
           Nil -> Nil;
           Cons a l' ->
            case project_Attribute_type a of {
             Inl tc ->
              app
                (establish_AttributeToColumn tc
                  (append prefix
                    (append (String0 (Ascii True True True True True False
                      True False) EmptyString) (project_Attribute_name a))))
                (complexAttributeToColumn l');
             Inr p -> complexAttributeToColumn l'}}}
       in complexAttributeToColumn (project_Class_attributes c))
      (case project_Class_general c of {
        Some sc -> establish_AttributeToColumn sc prefix;
        None -> Nil}))

build_AssocToColumn :: Class -> Class -> Association -> Column
build_AssocToColumn c1 c2 a =
  Build_Column (project_Association_OID_nat (project_Association_oid a))
    (Build_ModelElement0
    (append
      (append (project_Class_name c1)
        (append (String0 (Ascii True True True True True False True False)
          EmptyString)
          (append (project_Association_name a)
            (append (String0 (Ascii True True True True True False True False)
              EmptyString) (project_Class_name c2))))) (String0 (Ascii True
      True True True True False True False) (String0 (Ascii False False True
      False True True True False) (String0 (Ascii True False False True False
      True True False) (String0 (Ascii False False True False False True True
      False) EmptyString))))) EmptyString) NUMBER Nil Nil

build_AssocToFKey :: Class -> Class -> Association -> ForeignKey
build_AssocToFKey c1 c2 a =
  Build_ForeignKey (project_Association_OID_nat (project_Association_oid a))
    (Build_ModelElement0
    (append (project_Class_name c1)
      (append (String0 (Ascii True True True True True False True False)
        EmptyString)
        (append (project_Association_name a)
          (append (String0 (Ascii True True True True True False True False)
            EmptyString) (project_Class_name c2))))) EmptyString)
    (project_Class_OID_nat (project_Class_oid c1))
    (project_Class_OID_nat (project_Class_oid c2)) (Cons
    (project_Association_OID_nat (project_Association_oid a)) Nil)

establish_AssocToFKey :: UML -> (List Association) -> List ForeignKey
establish_AssocToFKey uml le =
  flat_map (\assoc ->
    case dereference_Class uml (project_Association_source assoc) of {
     Some c1 ->
      case dereference_Class uml (project_Association_destination assoc) of {
       Some c2 ->
        case project_Class_kind c1 of {
         PERSISTENT ->
          case project_Class_kind c2 of {
           PERSISTENT -> Cons (build_AssocToFKey c1 c2 assoc) Nil;
           OTHER -> Nil};
         OTHER -> Nil};
       None -> Nil};
     None -> Nil}) le

establish_AssocToColumn :: UML -> (List Association) -> Class -> List Column
establish_AssocToColumn uml la sc =
  flat_map (\a ->
    case dereference_Class uml (project_Association_source a) of {
     Some c1 ->
      case dereference_Class uml (project_Association_destination a) of {
       Some c2 ->
        case project_Class_kind c1 of {
         PERSISTENT ->
          case project_Class_kind c2 of {
           PERSISTENT ->
            case beq_nat (project_Class_OID_nat (project_Class_oid c1))
                   (project_Class_OID_nat (project_Class_oid sc)) of {
             True -> Cons (build_AssocToColumn c1 c2 a) Nil;
             False -> Nil};
           OTHER -> Nil};
         OTHER -> Nil};
       None -> Nil};
     None -> Nil}) la

build_ClassToTable :: UML -> Class -> String -> Table
build_ClassToTable uml c prefix =
  Build_Table (project_Class_OID_nat (project_Class_oid c)) (Build_ModelElement0 (project_Class_name c)
    EmptyString) (Cons (Build_Column (project_Class_OID_nat (project_Class_oid c)) (Build_ModelElement0
    (append (project_Class_name c) (String0 (Ascii True True True True True False True False) (String0 (Ascii
      False False True False True True True False) (String0 (Ascii True False False True False True True
      False) (String0 (Ascii False False True False False True True False) EmptyString))))) EmptyString)
    NUMBER Nil Nil)
    (app (establish_AttributeToColumn c prefix)
      (establish_AssocToColumn uml
        (flat_map (\p -> filter_Association (project_Package_elements p)) (allInstances_Package uml)) c)))
    (Some (Build_Key (project_Class_OID_nat (project_Class_oid c)) (Build_ModelElement0
    (append (project_Class_name c) (String0 (Ascii True True True True True False True False) (String0 (Ascii
      False False False False True True True False) (String0 (Ascii True True False True False True True
      False) EmptyString)))) EmptyString) (Cons (project_Class_OID_nat (project_Class_oid c)) Nil)))

establish_ClassToTable :: UML -> (List Class) -> List Table
establish_ClassToTable uml lc =
  flat_map (\c ->
    case project_Class_kind c of {
     PERSISTENT -> Cons (build_ClassToTable uml c EmptyString) Nil;
     OTHER -> Nil}) lc

build_PackageToSchema :: UML -> Package -> Schema
build_PackageToSchema uml p =
  Build_Schema (project_Package_OID_nat (project_Package_oid p))
    (Build_ModelElement0 (project_Package_name p) EmptyString)
    (establish_ClassToTable uml (filter_Class (project_Package_elements p)))
    (establish_AssocToFKey uml
      (filter_Association (project_Package_elements p)))

establish_PackageToSchema :: UML -> RDBMS
establish_PackageToSchema uml =
  map (build_PackageToSchema uml) (allInstances_Package uml)

transform :: UML -> RDBMS
transform uml =
  establish_PackageToSchema uml

-- Added: the main picklers
xpRDBMS :: Text.XML.HXT.Core.PU RDBMS
xpRDBMS = Text.XML.HXT.Core.xpElem "RDBMS" Prelude.$
  Text.XML.HXT.Core.xpAddFixedAttr "xmlns" "rdbms" Prelude.$ -- TODO: Figure out how to properly define namespaces and namespace prefixes for all tags, currently prefixes are hacked out of the generated EMF model. What about http://www.filewatcher.com/p/haskell-hxt_9.3.1.1.orig.tar.gz.228205/hxt-9.3.1.1/examples/arrows/dtd2hxt/DTDtoHXT.hs.html
  {-Text.XML.HXT.Core.xpickle-} -- Instead, wrap into container tag:
  Text.XML.HXT.Core.xpWrap
    (\ (schemas) -> (fromPreludeList schemas), 
     \ (schemas) -> (toPreludeList schemas)) Prelude.$
  (Text.XML.HXT.Core.xpElem "schemas" Prelude.$ Text.XML.HXT.Core.xpList Text.XML.HXT.Core.xpickle)
    
xpUML :: Text.XML.HXT.Core.PU UML
xpUML = Text.XML.HXT.Core.xpElem "UML" Prelude.$
  --Text.XML.HXT.Core.xpAddFixedAttr "xmlns" "uml" Prelude.$ -- TODO: Figure out how to properly define namespaces and namespace prefixes for all tags, currently prefixes are hacked out of the generated EMF model. What about http://www.filewatcher.com/p/haskell-hxt_9.3.1.1.orig.tar.gz.228205/hxt-9.3.1.1/examples/arrows/dtd2hxt/DTDtoHXT.hs.html
  {-Text.XML.HXT.Core.xpickle-} -- Instead, wrap into container tag:
  Text.XML.HXT.Core.xpWrap
    (\ (packages) -> (fromPreludeList packages), 
     \ (packages) -> (toPreludeList packages)) Prelude.$
  (Text.XML.HXT.Core.xpElem "packages" Prelude.$ Text.XML.HXT.Core.xpList Text.XML.HXT.Core.xpickle)
    
