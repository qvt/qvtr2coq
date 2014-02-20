(********************************************************************
   @name Coq definitions for metamodel RDBMS
   @date 2014/01/09 00:20:08
   @description Automatically generated by QVTrelation2Coq transformation.
   @see QVT-R Specification, Eclipse QVTd project, and the Coq Project.
 ********************************************************************)

Section RDBMS.

(* Coq libraries *)
Require Import List.
Require Import String.
Require Import Arith.
Require Import Bool.

(********************************************************************)
(* EEnums: need to be defined first. *)

(********************************************************************)
(* EClasses: defined by constructors of an ID, local attributes and references. *)

Record Column_OID : Set := Build_Column_OID { 
	Project_Column_OID_nat : nat 
}.
Record Key_OID : Set := Build_Key_OID { 
	Project_Key_OID_nat : nat 
}.
Record ForeignKey_OID : Set := Build_ForeignKey_OID { 
	Project_ForeignKey_OID_nat : nat 
}.
Record Table_OID : Set := Build_Table_OID { 
	Project_Table_OID_nat : nat 
}.
Record Schema_OID : Set := Build_Schema_OID { 
	Project_Schema_OID_nat : nat 
}.

Record Column : Set := Build_Column {
	Project_Column_oid : Column_OID;
	Project_Column_name : string;
	Project_Column_type : string;
	Project_Column_hasKey : list Key_OID;
	Project_Column_hasForeignKey : list ForeignKey_OID
	(*Project_Column_owner : Table_OID;*)
}.
Record Key : Set := Build_Key {
	Project_Key_oid : Key_OID;
	Project_Key_name : string;
	Project_Key_column : list Column_OID
	(*Project_Key_owner : Table_OID;*)
	(*Project_Key_referredBy : list ForeignKey_OID;*)
}.
Record ForeignKey : Set := Build_ForeignKey {
	Project_ForeignKey_oid : ForeignKey_OID;
	Project_ForeignKey_refersTo : Key_OID;
	Project_ForeignKey_name : string;
	Project_ForeignKey_owner : Table_OID;
	Project_ForeignKey_column : list Column_OID
	(*Project_ForeignKey_schema : Schema_OID;*)
}.
Record Table : Set := Build_Table {
	Project_Table_oid : Table_OID;
	Project_Table_name : string;
	Project_Table_column : list Column;
	Project_Table_hasKey : option Key
	(*Project_Table_schema : Schema_OID;*)
	(*Project_Table_hasForeignKey : list ForeignKey_OID;*)
}.
Record Schema : Set := Build_Schema {
	Project_Schema_oid : Schema_OID;
	Project_Schema_name : string;
	Project_Schema_table : list Table;
	Project_Schema_foreignKey : list ForeignKey
}.

Record RDBMS := Build {
	Content : list Schema
}.

(********************************************************************)
(* EStructuralFeatures: projections of inherited attributes. *)


(********************************************************************)
(* EAllInstances: Collecting all instances of a certain type in a model. *)

Definition AllInstances_Schema (rdbms : RDBMS) : list Schema :=
	(Content rdbms).

Definition AllInstances_Table (rdbms : RDBMS) : list Table :=
	(flat_map Project_Schema_table
		(AllInstances_Schema rdbms)
	).

Definition AllInstances_ForeignKey (rdbms : RDBMS) : list ForeignKey :=
	(flat_map Project_Schema_foreignKey
		(AllInstances_Schema rdbms)
	).
Function Filter_Key (o : option Key) : list Key :=
	match o with
	| Some o' => o'::nil
	| None => nil
	end.

Definition AllInstances_Key (rdbms : RDBMS) : list Key :=
	(flat_map (fun o =>
			Filter_Key (Project_Table_hasKey o)
		)
		(AllInstances_Table rdbms)
	).

Definition AllInstances_Column (rdbms : RDBMS) : list Column :=
	(flat_map Project_Table_column
		(AllInstances_Table rdbms)
	).

(********************************************************************)
(* EReference[containment = false]: Resolving forward cross references (=> resolve OID). *)

Function Find_Column (l : list Column) (oid : Column_OID) : option Column := 
	match l with
	| l_head::l_tail => 
		if beq_nat (Project_Column_OID_nat (Project_Column_oid l_head)) (Project_Column_OID_nat oid) 
		then Some l_head
		else (Find_Column l_tail oid)
	| nil => None
	end.
Function Dereference_Column (rdbms : RDBMS) (oid : Column_OID) : option Column :=
	(Find_Column (AllInstances_Column rdbms) oid).
Function Find_Key (l : list Key) (oid : Key_OID) : option Key := 
	match l with
	| l_head::l_tail => 
		if beq_nat (Project_Key_OID_nat (Project_Key_oid l_head)) (Project_Key_OID_nat oid) 
		then Some l_head
		else (Find_Key l_tail oid)
	| nil => None
	end.
Function Dereference_Key (rdbms : RDBMS) (oid : Key_OID) : option Key :=
	(Find_Key (AllInstances_Key rdbms) oid).
Function Find_ForeignKey (l : list ForeignKey) (oid : ForeignKey_OID) : option ForeignKey := 
	match l with
	| l_head::l_tail => 
		if beq_nat (Project_ForeignKey_OID_nat (Project_ForeignKey_oid l_head)) (Project_ForeignKey_OID_nat oid) 
		then Some l_head
		else (Find_ForeignKey l_tail oid)
	| nil => None
	end.
Function Dereference_ForeignKey (rdbms : RDBMS) (oid : ForeignKey_OID) : option ForeignKey :=
	(Find_ForeignKey (AllInstances_ForeignKey rdbms) oid).
Function Find_Table (l : list Table) (oid : Table_OID) : option Table := 
	match l with
	| l_head::l_tail => 
		if beq_nat (Project_Table_OID_nat (Project_Table_oid l_head)) (Project_Table_OID_nat oid) 
		then Some l_head
		else (Find_Table l_tail oid)
	| nil => None
	end.
Function Dereference_Table (rdbms : RDBMS) (oid : Table_OID) : option Table :=
	(Find_Table (AllInstances_Table rdbms) oid).
Function Find_Schema (l : list Schema) (oid : Schema_OID) : option Schema := 
	match l with
	| l_head::l_tail => 
		if beq_nat (Project_Schema_OID_nat (Project_Schema_oid l_head)) (Project_Schema_OID_nat oid) 
		then Some l_head
		else (Find_Schema l_tail oid)
	| nil => None
	end.
Function Dereference_Schema (rdbms : RDBMS) (oid : Schema_OID) : option Schema :=
	(Find_Schema (AllInstances_Schema rdbms) oid).

Definition Dereference_Column_hasKey (rdbms : RDBMS) (o : Column) : list (option Key) := 
	map (fun oid => (
		Dereference_Key rdbms oid
	)) (Project_Column_hasKey o).
Definition Dereference_Column_hasForeignKey (rdbms : RDBMS) (o : Column) : list (option ForeignKey) := 
	map (fun oid => (
		Dereference_ForeignKey rdbms oid
	)) (Project_Column_hasForeignKey o).
Definition Dereference_Key_column (rdbms : RDBMS) (o : Key) : list (option Column) := 
	map (fun oid => (
		Dereference_Column rdbms oid
	)) (Project_Key_column o).
Definition Dereference_ForeignKey_refersTo (rdbms : RDBMS) (o : ForeignKey) : option Key := 
	let oid := (Project_ForeignKey_refersTo o) in
	(Dereference_Key rdbms oid).
Definition Dereference_ForeignKey_owner (rdbms : RDBMS) (o : ForeignKey) : option Table := 
	let oid := (Project_ForeignKey_owner o) in
	(Dereference_Table rdbms oid).
Definition Dereference_ForeignKey_column (rdbms : RDBMS) (o : ForeignKey) : list (option Column) := 
	map (fun oid => (
		Dereference_Column rdbms oid
	)) (Project_ForeignKey_column o).

(********************************************************************)
(* EReference[containment = false]: Resolving backward cross references *)

Definition Dereference_Key_referredBy (rdbms : RDBMS) (o : Key) : list ForeignKey := 
	(filter 
		(fun o' => match (Dereference_ForeignKey_refersTo rdbms o') with
			| Some o'' =>
				beq_nat 
					(Project_Key_OID_nat (Project_Key_oid o'')) 
					(Project_Key_OID_nat (Project_Key_oid o))
			| _ => false
			end)
		(AllInstances_ForeignKey rdbms)
	).
Definition Dereference_Table_hasForeignKey (rdbms : RDBMS) (o : Table) : list ForeignKey := 
	(filter 
		(fun o' => match (Dereference_ForeignKey_owner rdbms o') with
			| Some o'' =>
				beq_nat 
					(Project_Table_OID_nat (Project_Table_oid o'')) 
					(Project_Table_OID_nat (Project_Table_oid o))
			| _ => false
			end)
		(AllInstances_ForeignKey rdbms)
	).

(********************************************************************)
(* EReference[containment = true]: Backward reference on containment hierarchy *)

Definition Dereference_Column_owner (rdbms : RDBMS) (o : Column) : option Table := 
	(find 
		(fun o' => 
			let contained := 
			(Project_Table_column o') in
			existsb (fun o'' => 
				beq_nat 
					(Project_Column_OID_nat (Project_Column_oid o'')) 
					(Project_Column_OID_nat (Project_Column_oid o))
			) contained
		)
		(AllInstances_Table rdbms)
	).
Definition Dereference_Key_owner (rdbms : RDBMS) (o : Key) : option Table := 
	(find 
		(fun o' => 
			let contained := 
			(Project_Table_hasKey o') in
			match contained with
			| Some o'' =>
				beq_nat 
					(Project_Key_OID_nat (Project_Key_oid o'')) 
					(Project_Key_OID_nat (Project_Key_oid o))
			| None => false
			end 
		)
		(AllInstances_Table rdbms)
	).
Definition Dereference_ForeignKey_schema (rdbms : RDBMS) (o : ForeignKey) : option Schema := 
	(find 
		(fun o' => 
			let contained := 
			(Project_Schema_foreignKey o') in
			existsb (fun o'' => 
				beq_nat 
					(Project_ForeignKey_OID_nat (Project_ForeignKey_oid o'')) 
					(Project_ForeignKey_OID_nat (Project_ForeignKey_oid o))
			) contained
		)
		(AllInstances_Schema rdbms)
	).
Definition Dereference_Table_schema (rdbms : RDBMS) (o : Table) : option Schema := 
	(find 
		(fun o' => 
			let contained := 
			(Project_Schema_table o') in
			existsb (fun o'' => 
				beq_nat 
					(Project_Table_OID_nat (Project_Table_oid o'')) 
					(Project_Table_OID_nat (Project_Table_oid o))
			) contained
		)
		(AllInstances_Schema rdbms)
	).

(********************************************************************)
(* Hypotheses *)
(* OIDs are unique within an instance of this model per type. *)
(* Note that, if we are being given this as an input model, we can 
   declare this an axiom. For models we are generating, we will 
   need to keep this as a hypothesis, so that we will keep it
   as a proof obligation for the transformation proof. *)

Axiom SchemaOIDsAreUnique:
	forall rdbms : RDBMS,
	forall o1 o2 : Schema,
		In o1 (AllInstances_Schema rdbms) /\
		In o2 (AllInstances_Schema rdbms) /\
		((beq_nat (Project_Schema_OID_nat (Project_Schema_oid o1))
			(Project_Schema_OID_nat (Project_Schema_oid o2))) = true) ->
		o1 = o2.
Axiom TableOIDsAreUnique:
	forall rdbms : RDBMS,
	forall o1 o2 : Table,
		In o1 (AllInstances_Table rdbms) /\
		In o2 (AllInstances_Table rdbms) /\
		((beq_nat (Project_Table_OID_nat (Project_Table_oid o1))
			(Project_Table_OID_nat (Project_Table_oid o2))) = true) ->
		o1 = o2.
Axiom ForeignKeyOIDsAreUnique:
	forall rdbms : RDBMS,
	forall o1 o2 : ForeignKey,
		In o1 (AllInstances_ForeignKey rdbms) /\
		In o2 (AllInstances_ForeignKey rdbms) /\
		((beq_nat (Project_ForeignKey_OID_nat (Project_ForeignKey_oid o1))
			(Project_ForeignKey_OID_nat (Project_ForeignKey_oid o2))) = true) ->
		o1 = o2.
Axiom KeyOIDsAreUnique:
	forall rdbms : RDBMS,
	forall o1 o2 : Key,
		In o1 (AllInstances_Key rdbms) /\
		In o2 (AllInstances_Key rdbms) /\
		((beq_nat (Project_Key_OID_nat (Project_Key_oid o1))
			(Project_Key_OID_nat (Project_Key_oid o2))) = true) ->
		o1 = o2.
Axiom ColumnOIDsAreUnique:
	forall rdbms : RDBMS,
	forall o1 o2 : Column,
		In o1 (AllInstances_Column rdbms) /\
		In o2 (AllInstances_Column rdbms) /\
		((beq_nat (Project_Column_OID_nat (Project_Column_oid o1))
			(Project_Column_OID_nat (Project_Column_oid o2))) = true) ->
		o1 = o2.

End RDBMS.
