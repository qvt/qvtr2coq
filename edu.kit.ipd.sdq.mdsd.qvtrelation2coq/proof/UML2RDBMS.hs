----------------------------------------------------------------------------------
-- Verified UML2RDBMS in Haskell,
-- Program has been automatically extracted from UML2RDBMS.Theorem's proof in Coq,
-- including an example UML model MediaLibrary that has been extracted accordingly.

-- Still needs to be adjusted to a particular Haskell implementation.
-- * For the Hugs98 interpreter, show functions must be provided, 
--   see "Programming Languages: Principles and Practices" by Kenneth Louden, Lambert.
-- * For the YHC compiler, we must provide a function main :: IO ()
----------------------------------------------------------------------------------

module Main where

import qualified Prelude
import Text.Show.Functions

----------------------------------------------------------------------------------
-- Generated from "Recursive Extract Transform".
-- Warning: The extraction is currently set to bypass opacity,
-- the following opaque constant bodies have been accessed :
-- Transform.
----------------------------------------------------------------------------------

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

data KIND =
   PERSISTENT
 | OTHER

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
data PackageElement =
   Build_PackageElement ModelElement
data Classifier =
   Build_Classifier PackageElement
data Attribute =
   Build_Attribute Attribute_OID ModelElement (Sum Class PrimitiveDataType)
data Association =
   Build_Association Association_OID PackageElement Class_OID Class_OID
data PrimitiveDataType =
   Build_PrimitiveDataType PrimitiveDataType_OID Classifier
data Class =
   Build_Class Class_OID Classifier (Option Class) (List Attribute)
data Package =
   Build_Package Package_OID ModelElement (List (Sum (Sum Class PrimitiveDataType) Association))

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

project_Package_elements :: Package -> List (Sum (Sum Class PrimitiveDataType) Association)
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

filter_Class :: (List (Sum (Sum Class PrimitiveDataType) Association)) -> List Class
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

filter_Association :: (List (Sum (Sum Class PrimitiveDataType) Association)) -> List Association
filter_Association lc =
  case lc of {
   Nil -> Nil;
   Cons s lc_tail ->
    case s of {
     Inl s0 -> filter_Association lc_tail;
     Inr lc_head -> Cons lc_head (filter_Association lc_tail)}}

dereference_Class'' :: (List (Sum (Sum Class PrimitiveDataType) Association)) -> Class_OID -> Option
                       Class
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

data ForeignKey =
   Build_ForeignKey ForeignKey_OID ModelElement0 Table_OID Key_OID (List Column_OID)

data Key =
   Build_Key Key_OID ModelElement0 (List Column_OID)

data Column =
   Build_Column Column_OID ModelElement0 TYPE (List Key_OID) (List ForeignKey_OID)

data Table =
   Build_Table Table_OID ModelElement0 (List Column) (Option Key)

data Schema =
   Build_Schema Schema_OID ModelElement0 (List Table) (List ForeignKey)

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
                                             Ascii b15 b16 b17 b18 b19 b20 b21 b22 ->
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
                                                               EmptyString -> VARCHAR;
                                                               String0 a2 s2 ->
                                                                case a2 of {
                                                                 Ascii b23 b24 b25 b26 b27 b28 b29
                                                                  b30 ->
                                                                  case b23 of {
                                                                   True ->
                                                                    case b24 of {
                                                                     True -> VARCHAR;
                                                                     False ->
                                                                      case b25 of {
                                                                       True ->
                                                                        case b26 of {
                                                                         True -> VARCHAR;
                                                                         False ->
                                                                          case b27 of {
                                                                           True -> VARCHAR;
                                                                           False ->
                                                                            case b28 of {
                                                                             True ->
                                                                              case b29 of {
                                                                               True ->
                                                                                case b30 of {
                                                                                 True -> VARCHAR;
                                                                                 False ->
                                                                                  case s2 of {
                                                                                   EmptyString ->
                                                                                    VARCHAR;
                                                                                   String0 a3 s3 ->
                                                                                    case a3 of {
                                                                                     Ascii b31 b32
                                                                                      b33 b34 b35 b36
                                                                                      b37 b38 ->
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
                                                                               False -> VARCHAR};
                                                                             False -> VARCHAR}}};
                                                                       False -> VARCHAR}};
                                                                   False -> VARCHAR}}}};
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
                                             Ascii b15 b16 b17 b18 b19 b20 b21 b22 ->
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
                                                               EmptyString -> VARCHAR;
                                                               String0 a2 s2 ->
                                                                case a2 of {
                                                                 Ascii b23 b24 b25 b26 b27 b28 b29
                                                                  b30 ->
                                                                  case b23 of {
                                                                   True -> VARCHAR;
                                                                   False ->
                                                                    case b24 of {
                                                                     True -> VARCHAR;
                                                                     False ->
                                                                      case b25 of {
                                                                       True ->
                                                                        case b26 of {
                                                                         True ->
                                                                          case b27 of {
                                                                           True -> VARCHAR;
                                                                           False ->
                                                                            case b28 of {
                                                                             True ->
                                                                              case b29 of {
                                                                               True ->
                                                                                case b30 of {
                                                                                 True -> VARCHAR;
                                                                                 False ->
                                                                                  case s2 of {
                                                                                   EmptyString ->
                                                                                    VARCHAR;
                                                                                   String0 a3 s3 ->
                                                                                    case a3 of {
                                                                                     Ascii b31 b32
                                                                                      b33 b34 b35 b36
                                                                                      b37 b38 ->
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
                                                                               False -> VARCHAR};
                                                                             False -> VARCHAR}};
                                                                         False -> VARCHAR};
                                                                       False -> VARCHAR}}}}}};
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

build_PrimitiveAttributeToColumn :: Attribute -> PrimitiveDataType -> String -> Column
build_PrimitiveAttributeToColumn a p prefix =
  Build_Column (project_Attribute_OID_nat (project_Attribute_oid a)) (Build_ModelElement0
    (case prefix of {
      EmptyString -> project_Attribute_name a;
      String0 a0 s ->
       append prefix
         (append (String0 (Ascii True True True True True False True False) EmptyString)
           (project_Attribute_name a))}) EmptyString)
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
                    (append (String0 (Ascii True True True True True False True False) EmptyString)
                      (project_Attribute_name a)))) (complexAttributeToColumn l');
             Inr p -> complexAttributeToColumn l'}}}
       in complexAttributeToColumn (project_Class_attributes c))
      (case project_Class_general c of {
        Some sc -> establish_AttributeToColumn sc prefix;
        None -> Nil}))

build_AssocToColumn :: Class -> Class -> Association -> Column
build_AssocToColumn c1 c2 a =
  Build_Column (project_Association_OID_nat (project_Association_oid a)) (Build_ModelElement0
    (append
      (append (project_Class_name c1)
        (append (String0 (Ascii True True True True True False True False) EmptyString)
          (append (project_Association_name a)
            (append (String0 (Ascii True True True True True False True False) EmptyString)
              (project_Class_name c2))))) (String0 (Ascii True True True True True False True False)
      (String0 (Ascii False False True False True True True False) (String0 (Ascii True False False
      True False True True False) (String0 (Ascii False False True False False True True False)
      EmptyString))))) EmptyString) NUMBER Nil Nil

build_AssocToFKey :: Class -> Class -> Association -> ForeignKey
build_AssocToFKey c1 c2 a =
  Build_ForeignKey (project_Association_OID_nat (project_Association_oid a)) (Build_ModelElement0
    (append (project_Class_name c1)
      (append (String0 (Ascii True True True True True False True False) EmptyString)
        (append (project_Association_name a)
          (append (String0 (Ascii True True True True True False True False) EmptyString)
            (project_Class_name c2))))) EmptyString) (project_Class_OID_nat (project_Class_oid c1))
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
  Build_Table (project_Class_OID_nat (project_Class_oid c)) (Build_ModelElement0
    (project_Class_name c) EmptyString) (Cons (Build_Column
    (project_Class_OID_nat (project_Class_oid c)) (Build_ModelElement0
    (append (project_Class_name c) (String0 (Ascii True True True True True False True False)
      (String0 (Ascii False False True False True True True False) (String0 (Ascii True False False
      True False True True False) (String0 (Ascii False False True False False True True False)
      EmptyString))))) EmptyString) NUMBER Nil Nil)
    (app (establish_AttributeToColumn c prefix)
      (establish_AssocToColumn uml
        (flat_map (\p -> filter_Association (project_Package_elements p)) (allInstances_Package uml))
        c))) (Some (Build_Key (project_Class_OID_nat (project_Class_oid c)) (Build_ModelElement0
    (append (project_Class_name c) (String0 (Ascii True True True True True False True False)
      (String0 (Ascii False False False False True True True False) (String0 (Ascii True True False
      True False True True False) EmptyString)))) EmptyString) (Cons
    (project_Class_OID_nat (project_Class_oid c)) Nil)))

establish_ClassToTable :: UML -> (List Class) -> List Table
establish_ClassToTable uml lc =
  flat_map (\c ->
    case project_Class_kind c of {
     PERSISTENT -> Cons (build_ClassToTable uml c EmptyString) Nil;
     OTHER -> Nil}) lc

build_PackageToSchema :: UML -> Package -> Schema
build_PackageToSchema uml p =
  Build_Schema (project_Package_OID_nat (project_Package_oid p)) (Build_ModelElement0
    (project_Package_name p) EmptyString)
    (establish_ClassToTable uml (filter_Class (project_Package_elements p)))
    (establish_AssocToFKey uml (filter_Association (project_Package_elements p)))

establish_PackageToSchema :: UML -> RDBMS
establish_PackageToSchema uml =
  map (build_PackageToSchema uml) (allInstances_Package uml)

transform :: UML -> RDBMS
transform uml =
  establish_PackageToSchema uml

