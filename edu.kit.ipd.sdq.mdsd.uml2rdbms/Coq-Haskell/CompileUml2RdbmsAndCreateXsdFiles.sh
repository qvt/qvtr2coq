#!/bin/bash
# This script was tested on Apple OSX


echo Compiling UML2RDBMS modules...
ghc -c -O CoqTypes.hs UML2RDBMS.hs MediaLibrary.hs Main.hs

echo Linking UML2RDBMS modules to program...
ghc -o UML2RDBMS Main.o UML2RDBMS.o MediaLibrary.o CoqTypes.o -package 'hxt-9.3.1.15'

echo Extracting DTD schemata UML.dtd and RDBMS.dtd, besides model instances of the 'MediaLibrary' example named 'In.xml' and 'Out.xml'
./UML2RDBMS --helper


# We are using Ruby's powerful regex API (installed on OSX with XCode), because OSX's sed does neither match repeatedly nor across multiple lines
# Note the use of strong quoting (no parsing within string) is done in bash using single quotes. http://wiki.bash-hackers.org/syntax/quoting
# Single quotes in single quoted bash strings are weirdly escaped: A string "Danny's" is written like this: 'Danny'\''s'


# UML.dtd => UML.ecore.xsd

echo Fixup: Merging multiple attrlists of each element inside 'UML.dtd' and writing to 'UML2.dtd'...
ruby -e 's = gets(nil); loop { break unless s.gsub!(/<!ATTLIST (\w+) ([^>]+)>\n<!ATTLIST \1 /,"<!ATTLIST \\1 \\2\n\t") }; print s' UML.dtd > UML2.dtd

# Run tool from http://www.w3.org/2000/04/schema_hack/
# Options -simpletype 'OID' nonNegativeInteger -attrgroup '(OID|kind|name)' don't seem to work below...
echo Deriving XSD Schema 'UML.xsd' from DTD Schema 'UML2.dtd'...
perl dtd2xsd.pl UML2.dtd -ns uml > UML.xsd

echo Fixup: Hint ecore importer at maintaining original class names rather than '<name>Type'
# See http://www.eclipse.org/forums/index.php?t=msg&th=126819/ where this solution is described
# replace	'<schema ' with '<schema xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" '
ruby -e 's = gets(nil); s.gsub!(/<schema/,"<schema xmlns:ecore='\''http://www.eclipse.org/emf/2002/Ecore'\''"); print s' UML.xsd > UML2.xsd
# replace '<element name='ForeignKey'>\n  <complexType>' with '<element name='ForeignKey'>\n  <complexType ecore:name="ForeignKey">'
ruby -e 's = gets(nil); s.gsub!(/<element name='\''([\w\d]*)'\''>(\n\s*)<complexType>/, "<element name='\''\\1'\''>\\2<complexType ecore:name='\''\\1'\''>"); print s' UML2.xsd > UML3.xsd
# remove '<attribute name='xmlns' ... />' which disturbs the Ecore XSD importer
ruby -e 's = gets(nil); s.gsub!(/<attribute name='\''xmlns'\''(.*)\/>/, "<!--attribute name='\''xmlns'\''\\1/-->"); print s' UML3.xsd > UML4.xsd

#rm UML.dtd
#rm UML2.dtd
#rm UML2.xsd
#rm UML3.xsd
mv UML4.xsd UML.ecore.xsd
echo Successfully produced UML.ecore.xsd


# RDBMS.dtd => RDBMS.ecore.xsd

echo Fixup: Merging multiple attrlists of each element inside 'RDBMS.dtd' and writing to 'RDBMS2.dtd'...
ruby -e 's = gets(nil); loop { break unless s.gsub!(/<!ATTLIST (\w+) ([^>]+)>\n<!ATTLIST \1 /,"<!ATTLIST \\1 \\2\n\t") }; print s' RDBMS.dtd > RDBMS2.dtd

# Run tool from http://www.w3.org/2000/04/schema_hack/
# Option -simpletype 'OID' nonNegativeInteger doesn't seem to work below...
echo Deriving XSD Schema 'RDBMS.xsd' from DTD Schema 'RDBMS2.dtd'...
perl dtd2xsd.pl RDBMS2.dtd -ns rdbms > RDBMS.xsd

echo Fixup: Hint ecore importer at maintaining original class names rather than '<name>Type'
# See http://www.eclipse.org/forums/index.php?t=msg&th=126819/ where this solution is described
# replace	'<schema ' with '<schema xmlns:ecore="http://www.eclipse.org/emf/2002/Ecore" '
ruby -e 's = gets(nil); s.gsub!(/<schema/,"<schema xmlns:ecore='\''http://www.eclipse.org/emf/2002/Ecore'\''"); print s' RDBMS.xsd > RDBMS2.xsd
# replace '<element name='ForeignKey'>\n  <complexType>' with '<element name='ForeignKey'>\n  <complexType ecore:name="ForeignKey">'
ruby -e 's = gets(nil); s.gsub!(/<element name='\''([\w\d]*)'\''>(\n\s*)<complexType/, "<element name='\''\\1'\''>\\2<complexType ecore:name='\''\\1'\''"); print s' RDBMS2.xsd > RDBMS3.xsd
# remove '<attribute name='xmlns' ... />' which disturbs the Ecore XSD importer
ruby -e 's = gets(nil); s.gsub!(/<attribute name='\''xmlns'\''(.*)\/>/, "<!--attribute name='\''xmlns'\''\\1/-->"); print s' RDBMS3.xsd > RDBMS4.xsd

#rm RDBMS.dtd
#rm RDBMS2.dtd
#rm RDBMS2.xsd
#rm RDBMS3.xsd
mv RDBMS4.xsd RDBMS.ecore.xsd
echo Successfully produced RDBMS.ecore.xsd

