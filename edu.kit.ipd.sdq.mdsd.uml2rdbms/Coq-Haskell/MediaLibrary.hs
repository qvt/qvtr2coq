-- MediaLibrary.hs, extracted from Coq (2015-11-29)

-- Modifications:
-- * Added picklers, and derived Show, Eq, etc. for each type
-- * Extracted CoqTypes into separate module to avoid clashes with model instance modules.

-- Warning: The extraction is currently set to bypass opacity,
-- the following opaque constant bodies have been accessed :
-- Transform.

module MediaLibrary where

import qualified Prelude

import UML2RDBMS
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

data Ascii0 =
   Ascii Bool Bool Bool Bool Bool Bool Bool Bool

data String =
   EmptyString
 | String0 Ascii0 String
-}

{-
data KIND =
   PERSISTENT
 | OTHER

type Package_OID =
  Nat
  -- singleton inductive, whose constructor was Build_Package_OID
  
type Class_OID =
  Nat
  -- singleton inductive, whose constructor was Build_Class_OID
  
type Attribute_OID =
  Nat
  -- singleton inductive, whose constructor was Build_Attribute_OID
  
type PrimitiveDataType_OID =
  Nat
  -- singleton inductive, whose constructor was Build_PrimitiveDataType_OID
  
type Association_OID =
  Nat
  -- singleton inductive, whose constructor was Build_Association_OID
  
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
   Build_Package Package_OID ModelElement (List
                                          (Sum (Sum Class PrimitiveDataType)
                                          Association))

type UML =
  List Package
  -- singleton inductive, whose constructor was Build
-}
  
build_UML_INTEGER :: PrimitiveDataType
build_UML_INTEGER =
  Build_PrimitiveDataType O (Build_Classifier (Build_PackageElement
    (Build_ModelElement PERSISTENT (String0 (Ascii True False False True False
    False True False) (String0 (Ascii False True True True False False True
    False) (String0 (Ascii False False True False True False True False)
    (String0 (Ascii True False True False False False True False) (String0
    (Ascii True True True False False False True False) (String0 (Ascii True
    False True False False False True False) (String0 (Ascii False True False
    False True False True False) EmptyString))))))))))

build_UML_STRING :: PrimitiveDataType
build_UML_STRING =
  Build_PrimitiveDataType (S O) (Build_Classifier (Build_PackageElement
    (Build_ModelElement PERSISTENT (String0 (Ascii True True False False True
    False True False) (String0 (Ascii False False True False True False True
    False) (String0 (Ascii False True False False True False True False)
    (String0 (Ascii True False False True False False True False) (String0
    (Ascii False True True True False False True False) (String0 (Ascii True
    True True False False False True False) EmptyString)))))))))

build_UML_Library :: Class
build_UML_Library =
  Build_Class O (Build_Classifier (Build_PackageElement (Build_ModelElement
    PERSISTENT (String0 (Ascii False False True True False False True False)
    (String0 (Ascii True False False True False True True False) (String0
    (Ascii False True False False False True True False) (String0 (Ascii False
    True False False True True True False) (String0 (Ascii True False False
    False False True True False) (String0 (Ascii False True False False True
    True True False) (String0 (Ascii True False False True True True True
    False) EmptyString)))))))))) None Nil

build_UML_Author :: Class
build_UML_Author =
  Build_Class (S (S (S (S O)))) (Build_Classifier (Build_PackageElement
    (Build_ModelElement PERSISTENT (String0 (Ascii True False False False
    False False True False) (String0 (Ascii True False True False True True
    True False) (String0 (Ascii False False True False True True True False)
    (String0 (Ascii False False False True False True True False) (String0
    (Ascii True True True True False True True False) (String0 (Ascii False
    True False False True True True False) EmptyString))))))))) None (Cons
    (Build_Attribute (S O) (Build_ModelElement PERSISTENT (String0 (Ascii
    False True True True False True True False) (String0 (Ascii True False
    False False False True True False) (String0 (Ascii True False True True
    False True True False) (String0 (Ascii True False True False False True
    True False) EmptyString))))) (Inr build_UML_STRING)) Nil)

build_UML_Medium :: Class
build_UML_Medium =
  Build_Class (S O) (Build_Classifier (Build_PackageElement
    (Build_ModelElement PERSISTENT (String0 (Ascii True False True True False
    False True False) (String0 (Ascii True False True False False True True
    False) (String0 (Ascii False False True False False True True False)
    (String0 (Ascii True False False True False True True False) (String0
    (Ascii True False True False True True True False) (String0 (Ascii True
    False True True False True True False) EmptyString))))))))) None (Cons
    (Build_Attribute O (Build_ModelElement PERSISTENT (String0 (Ascii True
    False False False False True True False) (String0 (Ascii True False True
    False True True True False) (String0 (Ascii False False True False True
    True True False) (String0 (Ascii False False False True False True True
    False) (String0 (Ascii True True True True False True True False) (String0
    (Ascii False True False False True True True False) EmptyString)))))))
    (Inl build_UML_Author)) Nil)

build_UML_Book :: Class
build_UML_Book =
  Build_Class (S (S (S O))) (Build_Classifier (Build_PackageElement
    (Build_ModelElement PERSISTENT (String0 (Ascii False True False False
    False False True False) (String0 (Ascii True True True True False True
    True False) (String0 (Ascii True True True True False True True False)
    (String0 (Ascii True True False True False True True False)
    EmptyString))))))) (Some build_UML_Medium) (Cons (Build_Attribute O
    (Build_ModelElement PERSISTENT (String0 (Ascii False True True True False
    True True False) (String0 (Ascii True False True False True True True
    False) (String0 (Ascii True False True True False True True False)
    (String0 (Ascii False True False False False True True False) (String0
    (Ascii True False True False False True True False) (String0 (Ascii False
    True False False True True True False) (String0 (Ascii True True True True
    False False True False) (String0 (Ascii False True True False False True
    True False) (String0 (Ascii False False False False True False True False)
    (String0 (Ascii True False False False False True True False) (String0
    (Ascii True True True False False True True False) (String0 (Ascii True
    False True False False True True False) (String0 (Ascii True True False
    False True True True False) EmptyString)))))))))))))) (Inr
    build_UML_INTEGER)) Nil)

build_UML_NonPersistantClass :: Class
build_UML_NonPersistantClass =
  Build_Class (S (S (S (S (S O))))) (Build_Classifier (Build_PackageElement
    (Build_ModelElement OTHER (String0 (Ascii False True True True False False
    True False) (String0 (Ascii True True True True False True True False)
    (String0 (Ascii False True True True False True True False) (String0
    (Ascii False False False False True False True False) (String0 (Ascii True
    False True False False True True False) (String0 (Ascii False True False
    False True True True False) (String0 (Ascii True True False False True
    True True False) (String0 (Ascii True False False True False True True
    False) (String0 (Ascii True True False False True True True False)
    (String0 (Ascii False False True False True True True False) (String0
    (Ascii True False False False False True True False) (String0 (Ascii False
    True True True False True True False) (String0 (Ascii False False True
    False True True True False) (String0 (Ascii True True False False False
    False True False) (String0 (Ascii False False True True False True True
    False) (String0 (Ascii True False False False False True True False)
    (String0 (Ascii True True False False True True True False) (String0
    (Ascii True True False False True True True False)
    EmptyString))))))))))))))))))))) None Nil

build_UML_LibraryToMedium :: Association
build_UML_LibraryToMedium =
  Build_Association O (Build_PackageElement (Build_ModelElement PERSISTENT
    (String0 (Ascii False False True True False False True False) (String0
    (Ascii True False False True False True True False) (String0 (Ascii False
    True False False False True True False) (String0 (Ascii False True False
    False True True True False) (String0 (Ascii True False False False False
    True True False) (String0 (Ascii False True False False True True True
    False) (String0 (Ascii True False False True True True True False)
    (String0 (Ascii False False True False True False True False) (String0
    (Ascii True True True True False True True False) (String0 (Ascii True
    False True True False False True False) (String0 (Ascii True False True
    False False True True False) (String0 (Ascii False False True False False
    True True False) (String0 (Ascii True False False True False True True
    False) (String0 (Ascii True False True False True True True False)
    (String0 (Ascii True False True True False True True False)
    EmptyString))))))))))))))))) O (S O)

build_UML_DVD :: Class
build_UML_DVD =
  Build_Class (S (S O)) (Build_Classifier (Build_PackageElement
    (Build_ModelElement PERSISTENT (String0 (Ascii False False True False
    False False True False) (String0 (Ascii False True True False True False
    True False) (String0 (Ascii False False True False False False True False)
    EmptyString)))))) (Some build_UML_Medium) Nil

build_UML_MediaLibrary :: UML
build_UML_MediaLibrary =
  Cons (Build_Package O (Build_ModelElement OTHER (String0 (Ascii True False
    True True False True True False) (String0 (Ascii True False False True
    True True True False) (String0 (Ascii False False False False True False
    True False) (String0 (Ascii True False False False False True True False)
    (String0 (Ascii True True False False False True True False) (String0
    (Ascii True True False True False True True False) (String0 (Ascii True
    False False False False True True False) (String0 (Ascii True True True
    False False True True False) (String0 (Ascii True False True False False
    True True False) EmptyString)))))))))) (Cons (Inl (Inr build_UML_INTEGER))
    (Cons (Inl (Inr build_UML_STRING)) (Cons (Inl (Inl build_UML_Library))
    (Cons (Inl (Inl build_UML_Medium)) (Cons (Inl (Inl build_UML_DVD)) (Cons
    (Inl (Inl build_UML_Book)) (Cons (Inl (Inl build_UML_Author)) (Cons (Inl
    (Inl build_UML_NonPersistantClass)) (Cons (Inr build_UML_LibraryToMedium)
    Nil)))))))))) Nil
