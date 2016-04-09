-- CoqTypes.hs, extracted from Coq extractions to avoid type clashes (2015-11-29).

-- Modifications:
-- * Added picklers, and derived Show, Eq, etc. for each type
-- * Extracted CoqTypes to separate module

module CoqTypes where

import qualified Prelude
import Data.Char
import Data.Int
import Data.Maybe

import qualified Text.XML.HXT.Core

data Bool =
   True
 | False
 deriving (Prelude.Show, Prelude.Eq, Prelude.Ord, Prelude.Read)

data Nat =
   O
 | S Nat
 deriving ({-Prelude.Show,-} Prelude.Eq, Prelude.Ord, Prelude.Read)
toPreludeInt :: Nat -> Prelude.Int
toPreludeInt O = 0
toPreludeInt (S n) = 1 Prelude.+ (toPreludeInt n)
fromPreludeInt :: Prelude.Int -> Nat
fromPreludeInt n = if n Prelude.> 0 then S (fromPreludeInt (n Prelude.- 1)) else O
instance Prelude.Show Nat where
  show e = Prelude.show (toPreludeInt e)
instance Text.XML.HXT.Core.XmlPickler Nat where
  xpickle = Text.XML.HXT.Core.xpWrap (fromPreludeInt, toPreludeInt) Text.XML.HXT.Core.xpickle

data Option a =
   Some a
 | None
 deriving (Prelude.Show, Prelude.Eq, Prelude.Ord, Prelude.Read)
toPreludeMaybe :: (Option a) -> (Maybe a)
toPreludeMaybe None = Nothing
toPreludeMaybe (Some e) = Just e
fromPreludeMaybe :: (Maybe a) -> (Option a)
fromPreludeMaybe Nothing = None
fromPreludeMaybe (Just e) = Some e
-- data Option2 =
--  Empty
--  deriving (Prelude.Show)
-- instance (Prelude.Show a) => Prelude.Show (Option a) where
--   show None = Prelude.show Empty -- from Data.Maybe, so that 'Nothing' is printed without quotation marks, not '"Nothing"'
--   show (Some e) = Prelude.show e
instance (Text.XML.HXT.Core.XmlPickler a) => Text.XML.HXT.Core.XmlPickler (Option a) where
  xpickle = Text.XML.HXT.Core.xpWrap (fromPreludeMaybe, toPreludeMaybe) Text.XML.HXT.Core.xpickle

data Sum a b =
   Inl a
 | Inr b
 deriving (Prelude.Show, Prelude.Eq, Prelude.Ord, Prelude.Read)
instance (Text.XML.HXT.Core.XmlPickler a, Text.XML.HXT.Core.XmlPickler b) =>
  Text.XML.HXT.Core.XmlPickler (Sum a b) where
  xpickle = Text.XML.HXT.Core.xpAlt tag ps where
    tag (Inl _ ) = 0
    tag (Inr _ ) = 1
    ps = [
      Text.XML.HXT.Core.xpWrap (Inl, \ (Inl x) -> x) Prelude.$ 
      ({-Text.XML.HXT.Core.xpElem "Inl" Prelude.$-} Text.XML.HXT.Core.xpickle),
      Text.XML.HXT.Core.xpWrap (Inr, \ (Inr x) -> x) Prelude.$ 
      ({-Text.XML.HXT.Core.xpElem "Inr" Prelude.$-} Text.XML.HXT.Core.xpickle)]

data List a =
   Nil
 | Cons a (List a)
 deriving ({-Prelude.Show,-} Prelude.Eq, Prelude.Ord, Prelude.Read)
toPreludeList :: (List a) -> [a]
toPreludeList Nil = []
toPreludeList (Cons h t) = h : (toPreludeList t)
fromPreludeList :: [a] -> (List a)
fromPreludeList [] = Nil
fromPreludeList (h : t) = (Cons h (fromPreludeList t)) 
instance (Prelude.Show a) => Prelude.Show (List a) where
  show e = Prelude.show (toPreludeList e)
instance (Text.XML.HXT.Core.XmlPickler a) => Text.XML.HXT.Core.XmlPickler (List a) where
  xpickle = Text.XML.HXT.Core.xpWrap (fromPreludeList, toPreludeList) Text.XML.HXT.Core.xpickle

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
  deriving ({-Prelude.Show,-} Prelude.Eq, Prelude.Ord, Prelude.Read)
ord2chr :: [Prelude.Int] -> Char
ord2chr = chr Prelude.. Prelude.foldl (\a b -> 2 Prelude.* a Prelude.+ b) 0
toPreludeInt2 :: Bool -> Prelude.Int
toPreludeInt2 False = 0
toPreludeInt2 True = 1
fromPreludeBool :: Prelude.Bool -> Bool
fromPreludeBool Prelude.False = False
fromPreludeBool Prelude.True = True
toPreludeChar :: Ascii0 -> Char
toPreludeChar (Ascii a0 a1 a2 a3 a4 a5 a6 a7) = ord2chr (Prelude.map toPreludeInt2 [a7, a6, a5, a4, a3, a2, a1, a0])
fromPreludeChar :: Char -> Ascii0
fromPreludeChar c = Ascii (nThBit 0 c) (nThBit 1 c) (nThBit 2 c) (nThBit 3 c) (nThBit 4 c) (nThBit 5 c) (nThBit 6 c) (nThBit 7 c) where
  nThBit n b = fromPreludeBool (Prelude.odd ((ord b) `Prelude.quot` (2 Prelude.^ n)))
instance Prelude.Show Ascii0 where
  show e = Prelude.show (toPreludeChar e)
instance Text.XML.HXT.Core.XmlPickler Ascii0 where
  xpickle = Text.XML.HXT.Core.xpWrap (fromPreludeChar, toPreludeChar) Prelude.$ Text.XML.HXT.Core.xpPrim

data String =
   EmptyString
 | String0 Ascii0 String
 deriving ({-Prelude.Show,-} Prelude.Eq, Prelude.Ord, Prelude.Read)
toPreludeString :: String -> Prelude.String
toPreludeString EmptyString = []
toPreludeString (String0 a s) = (toPreludeChar a) : (toPreludeString s)
fromPreludeString :: Prelude.String -> String
fromPreludeString [] = EmptyString
fromPreludeString (a : s) = String0 (fromPreludeChar a) (fromPreludeString s)
instance Prelude.Show String where
  show e = Prelude.show (toPreludeString e)
instance Text.XML.HXT.Core.XmlPickler String where
  xpickle = Text.XML.HXT.Core.xpWrap (fromPreludeString, toPreludeString) Text.XML.HXT.Core.xpPrim

-- instance Text.XML.HXT.Core.XmlPickler Prelude.Char where
--   xpickle = Text.XML.HXT.Core.xpPrim
-- instance Text.XML.HXT.Core.XmlPickler Prelude.String where
--   xpickle = Text.XML.HXT.Core.xpText0

append :: String -> String -> String
append s1 s2 =
  case s1 of {
   EmptyString -> s2;
   String0 c s1' -> String0 c (append s1' s2)}
