-- Main.hs, command line tool to run transformation (and output reference files).

-- TODO:
-- * Certain parts of the Coq models seem to differ from the OMG models, cf. _NOTREALLY, _ONLYONE
--   => Adapt OMG models, or Coq models
-- * Transformations in Java/Ecore
--   UML.ecore -> UML.dtd
--   RDBMS.dtd -> RDBMS.ecore
--   RDBMS.ecore RDBMS.ecore -> differences between two instances

-- Note:
-- * Made ready for GHC (minor modifications required to module structure)
-- * Added show instances to all types for better debug output
-- * Added XML serialization based on HXT library
--   XmlPickler is explained at
--   https://wiki.haskell.org/HXT/Conversion_of_Haskell_data_from/to_XML

-- Howto:
-- 1. Install GHC from https://www.haskell.org/downloads
-- 2. Install XML Toolbox, show if/where HXT is installed and which version
--    > cabal update
--    > cabal install HXT
--    > ghc-pkg list
-- 3. To run transformation from command line interpreter as follows:
--    > runhaskell UML2RDBMS.hs
-- 4. To compile and link to executable as follows:
--    > ghc -c -O CoqTypes.hs UML2RDBMS.hs MediaLibrary.hs Main.hs
--    > ghc -o UML2RDBMS Main.o UML2RDBMS.o MediaLibrary.o CoqTypes.o -package 'hxt-9.3.1.15'
--    > ./UML2RDBMS In.xml Out.xml

module Main where

import qualified Prelude

import System.IO
import System.Environment
import System.Exit

import Data.Maybe

import Text.XML.HXT.Core

import CoqTypes
import UML2RDBMS
import MediaLibrary

-- Main program: Read model from XML, write transformed model to XML.
main :: IO ()
main = do
  putStrLn "===================================================================="
  putStrLn "UML2RDBMS transformation extracted from Coq."
  putStrLn "===================================================================="
  args <- getArgs
  case args of
    ["--helper"] -> do
      putStrLn "Generating instances of MediaLibrary for reference, as well as XML schemata."
      putStrLn "--------------------------------------------------------------------"
      runHelper
    [arg1, arg2] -> do
      putStrLn ("Running the transformation on the given input file '" Prelude.++ arg1 Prelude.++ "', producing output file '" Prelude.++ arg2 Prelude.++ "'")
      putStrLn "--------------------------------------------------------------------"
      runTransformation arg1 arg2
    otherwise -> do
      putStrLn "In order to run this transformation, use the following arguments:"
      putStrLn "  > UML2RDBMS <UML instance file name to read> <RDBMS instance file name to write>"
      putStrLn "To generate reference files, use these arguments:"
      putStrLn "  > UML2RDBMS --helper"
      putStrLn "WARNING: Arguments were missing, using default arguments 'In.xml Out.xml'!"
      putStrLn "--------------------------------------------------------------------"
      runTransformation "In.xml" "Out.xml"
  putStrLn "--------------------------------------------------------------------"
  Prelude.return ()

runTransformation :: Prelude.String -> Prelude.String -> IO ()
runTransformation src dst = do
  putStrLn ("Deserializing UML instance from '" Prelude.++ src Prelude.++ "'")
  umlInstances <- runX Prelude.$
    readDocument [ withValidate no
                 , withInputEncoding isoLatin1
                 , withTrace 1
                 , withRemoveWS yes
                 , withPreserveComment yes
                 ] src
    >>>
    errorMsgStderrAndCollect
    >>>
    arrL (maybeToList Prelude.. unpickleDoc xpUML)
  case umlInstances of
    [] -> do
      putStrLn "Error!"
      exitFailure
    _ -> putStrLn "Success."
    
  putStrLn "Running transformation UML2RDBMS..."
  [rdbmsInstance] <- runX Prelude.$
    constA (Prelude.head umlInstances)
    >>>
    arr (transform)
    
  putStrLn ("Serializing RDBMS instance to '" Prelude.++ dst Prelude.++ "'")
  errorCodes <- runX Prelude.$
    constA rdbmsInstance
    >>>
    arr (pickleDoc xpRDBMS)
    >>>
    writeDocument [ withIndent yes
                  , withOutputEncoding isoLatin1
                  ] dst
    >>>
    errorMsgStderrAndCollect
    >>>
    getErrStatus
  case errorCodes of
    [] -> putStrLn "Success."
    0:_ -> putStrLn "Success."
    errorCode:_ -> do
      putStrLn ("Error " Prelude.++ (Prelude.show errorCode) Prelude.++ " occurred!")
      exitWith (if errorCode Prelude.>= c_err then ExitFailure 1 else ExitSuccess)

-- Helper program: Serialize XML reference models and XML schemas, validate picklers
-- Syntax examples, documentation, whitespace handling example:
-- https://hackage.haskell.org/package/hxt-8.3.1/src/examples/arrows/pickle/PickleTest.hs
-- https://hackage.haskell.org/package/hxt-9.3.1.15/docs/Text-XML-HXT-Arrow-Pickle.html
-- https://gist.github.com/tonymorris/7019076
runHelper :: IO ()
runHelper = do
  let [src, dst, uml, rdbms] = ["In.xml", "OutReference.xml", "UML.dtd", "RDBMS.dtd"]

  putStrLn ("Generating '" Prelude.++ src Prelude.++ "'")
  runX Prelude.$
    -- Write haskell reference model to XML
    constA (build_UML_MediaLibrary)
    >>>
    arr (pickleDoc xpUML)
    >>>
    writeDocument [withIndent yes
                  ,withOutputEncoding isoLatin1
                  ] src

  putStrLn ("Generating '" Prelude.++ dst Prelude.++ "'")
  runX Prelude.$
    -- Write transformed haskell model to XML
    constA (transform build_UML_MediaLibrary)
    >>>
    arr (pickleDoc xpRDBMS)
    >>>
    writeDocument [withIndent yes
                  ,withOutputEncoding isoLatin1
                  ] dst

  putStrLn ("Generating '" Prelude.++ uml Prelude.++ "'")
  runX Prelude.$
    -- Derive DTD file from UML pickler
    constA Prelude.undefined
    >>>
    xpickleWriteDTD xpUML [withIndent yes
                 ,withOutputEncoding isoLatin1
                 ] uml

  putStrLn ("Generating '" Prelude.++ rdbms Prelude.++ "'")
  runX Prelude.$
    -- Derive DTD file from RDBMS pickler
    constA Prelude.undefined
    >>>
    xpickleWriteDTD xpRDBMS [withIndent yes
                 ,withOutputEncoding isoLatin1
                 ] rdbms
                 
  Prelude.return ()
