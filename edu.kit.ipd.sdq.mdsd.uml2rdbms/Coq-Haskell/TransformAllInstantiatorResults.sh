#!/bin/bash
# This script was tested on Apple OSX
time {
  echo Transforming UML instances *.uml.xml into *.rdbms.xml using the HXT-wrapped Haskell transformation UML2RDBMS extracted from Coq...
  for file in $(find ./models -name "*1.uml.xml") ; do
    time {
      #now=$( TIMEFORMAT="%2lR"; { time; } 2>&1 )
      #echo ${now}: This time is always zero

      echo Transforming "${file}" to "${file%.uml.xml}.rdbms.xml"
      runhaskell Main.hs "${file}" "${file%.uml.xml}.rdbms.xml"
      
      TIMEFORMAT='It took %2lR to complete this transformation.'
    }
  done

  echo No more files, transformation job finished.
  TIMEFORMAT='It took %2lR to complete this job.'
}