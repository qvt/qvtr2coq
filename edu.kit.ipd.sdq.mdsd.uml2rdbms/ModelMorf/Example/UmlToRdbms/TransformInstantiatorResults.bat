@echo off
@echo Running ModelMorf transformation RDBMS2UML in enforced mode on all files *.emof.umlmm, producing *.emof.rdbmsmm...

for %%f in (.\models\*.emof.umlmm) do (
  @echo 
  @echo ===============================================================================
  @echo %time%: Transforming input model "%%~nf.umlmm" into output model "%%~nf.rdbmsmm"
  call ..\..\modelmorf.bat -m umlMM -mf umlMM.xml -m rdbmsMM -mf rdbmsMM.xml -c UmlToRdbms.qvt -u uml -f .\models\%%~nf.umlmm -u rdbms -f .\models\%%~nf.rdbmsmm -t UmlToRdbms -d rdbms -q enforce
)

@echo %time%: No more files, transformation job finished.
pause
