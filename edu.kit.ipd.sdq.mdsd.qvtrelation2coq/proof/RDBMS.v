(********************************************************************
 Coq definitions for metamodel SimpleRDBMS.

 Copyright (c) 2014 Jeffrey Terrell, Steffen Zschaler, Andreas Rentschler
 ********************************************************************)

Section RDBMS.

Add LoadPath "/Users/jeffreyterrell/Dropbox/Research/Writing/Projects/QvtToCoq/Subversion/QVTrv/branches/no-monads/proof".
Add LoadPath "/Users/Andreas/Desktop/UML2RDBMS/proof".

(* Coq libraries *)
Require Import List.
Require Import ListHelpers.
Require Import String.
Require Import Arith.
Require Import Bool.

(********************************************************************)
(* EEnums: need to be defined first. *)

Inductive TYPE : Set := 
	| NUMBER : TYPE
	| BOOLEAN : TYPE
	| VARCHAR : TYPE
.

(********************************************************************)
(* EClasses: defined by constructors of an ID, super classes, local attributes and references. *)

Record Schema_OID : Set := Build_Schema_OID { 
	Project_Schema_OID_nat : nat 
}.
Record Table_OID : Set := Build_Table_OID { 
	Project_Table_OID_nat : nat 
}.
Record Column_OID : Set := Build_Column_OID { 
	Project_Column_OID_nat : nat 
}.
Record Key_OID : Set := Build_Key_OID { 
	Project_Key_OID_nat : nat 
}.
Record ForeignKey_OID : Set := Build_ForeignKey_OID { 
	Project_ForeignKey_OID_nat : nat 
}.

Record ModelElement : Set := Build_ModelElement {
	Project_ModelElement_name : string;
	Project_ModelElement_kind : string
}.

Record ForeignKey : Set := Build_ForeignKey {
	Project_ForeignKey_oid : ForeignKey_OID;
	Project_ForeignKey_super : ModelElement;
	Project_ForeignKey_owner : Table_OID;
	Project_ForeignKey_refersTo : Key_OID;
	Project_ForeignKey_columns : list Column_OID
	(*Project_ForeignKey_schema : Schema_OID;*)
}.

Record Key : Set := Build_Key {
	Project_Key_oid : Key_OID;
	Project_Key_super : ModelElement;
	(*Project_Key_owner : Table_OID;*)
	(*Project_Key_refersToOpposite : list ForeignKey_OID;*)
	Project_Key_columns : list Column_OID
}.

Record Column : Set := Build_Column {
	Project_Column_oid : Column_OID;
	Project_Column_super : ModelElement;
	Project_Column_type : TYPE;
	(*Project_Column_owner : Table_OID*)
	Project_Column_hasKeys : list Key_OID;
	Project_Column_hasForeignKeys : list ForeignKey_OID
}.

Record Table : Set := Build_Table {
	Project_Table_oid : Table_OID;
	Project_Table_super : ModelElement;
	Project_Table_columns : list Column;
	Project_Table_hasKey : option Key
	(*Project_Table_schema : Schema_OID*)
	(*Project_Table_hasForeignKeys : list ForeignKey_OID;*)
}.

Record Schema : Set := Build_Schema {
	Project_Schema_oid : Schema_OID;
	Project_Schema_super : ModelElement;
	Project_Schema_tables : list Table;
	Project_Schema_foreignKeys : list ForeignKey
}.

Record RDBMS := Build {
	Content : list Schema
}.

(********************************************************************)
(* EStructuralFeatures: projections of derived attributes and references. *)

Definition Project_Schema_name (o : Schema) :=
	Project_ModelElement_name (Project_Schema_super o).
Definition Project_Schema_kind (o : Schema) :=
	Project_ModelElement_kind (Project_Schema_super o).

Definition Project_Table_name (o : Table) :=
	Project_ModelElement_name (Project_Table_super o).
Definition Project_Table_kind (o : Table) :=
	Project_ModelElement_kind (Project_Table_super o).

Definition Project_Column_name (o : Column) :=
	Project_ModelElement_name (Project_Column_super o).
Definition Project_Column_kind (o : Column) :=
	Project_ModelElement_kind (Project_Column_super o).

Definition Project_Key_name (o : Key) :=
	Project_ModelElement_name (Project_Key_super o).
Definition Project_Key_kind (o : Key) :=
	Project_ModelElement_kind (Project_Key_super o).

Definition Project_ForeignKey_name (o : ForeignKey) :=
	Project_ModelElement_name (Project_ForeignKey_super o).
Definition Project_ForeignKey_kind (o : ForeignKey) :=
	Project_ModelElement_kind (Project_ForeignKey_super o).

(* EAllInstances: Collecting all instances of a certain type in a model. *)

Definition AllInstances_Schema (rdbms : RDBMS) : list Schema :=
	(Content rdbms).

Definition AllInstances_Table (rdbms : RDBMS) : list Table :=
	(flat_map Project_Schema_tables
		(AllInstances_Schema rdbms)
	).

Definition AllInstances_ForeignKey (rdbms : RDBMS) : list ForeignKey :=
	(flat_map Project_Schema_foreignKeys
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
	(flat_map Project_Table_columns
		(AllInstances_Table rdbms)
	).

(* EReference[containment = false]: Resolving forward cross references (=> resolve OID). *)

Function Find_Column (l : list Column) (oid : Column_OID) : option Column := 
	find (fun oid' => beq_nat 
		(Project_Column_OID_nat (Project_Column_oid oid')) 
		(Project_Column_OID_nat oid))
		l.
Function Dereference_Column (rdbms : RDBMS) (oid : Column_OID) : option Column :=
	(Find_Column (AllInstances_Column rdbms) oid).
Function Find_Key (l : list Key) (oid : Key_OID) : option Key := 
	find (fun oid' => beq_nat 
		(Project_Key_OID_nat (Project_Key_oid oid')) 
		(Project_Key_OID_nat oid))
		l.
Function Dereference_Key (rdbms : RDBMS) (oid : Key_OID) : option Key :=
	(Find_Key (AllInstances_Key rdbms) oid).
Function Find_ForeignKey (l : list ForeignKey) (oid : ForeignKey_OID) : option ForeignKey := 
	find (fun oid' => beq_nat 
		(Project_ForeignKey_OID_nat (Project_ForeignKey_oid oid')) 
		(Project_ForeignKey_OID_nat oid))
		l.
Function Dereference_ForeignKey (rdbms : RDBMS) (oid : ForeignKey_OID) : option ForeignKey :=
	(Find_ForeignKey (AllInstances_ForeignKey rdbms) oid).
Function Find_Table (l : list Table) (oid : Table_OID) : option Table := 
	find (fun oid' => beq_nat 
		(Project_Table_OID_nat (Project_Table_oid oid')) 
		(Project_Table_OID_nat oid))
		l.
Function Dereference_Table (rdbms : RDBMS) (oid : Table_OID) : option Table :=
	(Find_Table (AllInstances_Table rdbms) oid).
Function Find_Schema (l : list Schema) (oid : Schema_OID) : option Schema := 
	find (fun oid' => beq_nat 
		(Project_Schema_OID_nat (Project_Schema_oid oid')) 
		(Project_Schema_OID_nat oid))
		l.
Function Dereference_Schema (rdbms : RDBMS) (oid : Schema_OID) : option Schema :=
	(Find_Schema (AllInstances_Schema rdbms) oid).

Definition Dereference_Column_hasKey (rdbms : RDBMS) (o : Column) : list (option Key) := 
	map (fun oid => (
		Dereference_Key rdbms oid
	)) (Project_Column_hasKeys o).
Definition Dereference_Column_hasForeignKey (rdbms : RDBMS) (o : Column) : list (option ForeignKey) := 
	map (fun oid => (
		Dereference_ForeignKey rdbms oid
	)) (Project_Column_hasForeignKeys o).
Definition Dereference_Key_column (rdbms : RDBMS) (o : Key) : list (option Column) := 
	map (fun oid => (
		Dereference_Column rdbms oid
	)) (Project_Key_columns o).
Definition Dereference_ForeignKey_refersTo (rdbms : RDBMS) (o : ForeignKey) : option Key := 
	let oid := (Project_ForeignKey_refersTo o) in
	(Dereference_Key rdbms oid).
Definition Dereference_ForeignKey_owner (rdbms : RDBMS) (o : ForeignKey) : option Table := 
	let oid := (Project_ForeignKey_owner o) in
	(Dereference_Table rdbms oid).
Definition Dereference_ForeignKey_column (rdbms : RDBMS) (o : ForeignKey) : list (option Column) := 
	map (fun oid => (
		Dereference_Column rdbms oid
	)) (Project_ForeignKey_columns o).

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
Definition Dereference_Table_hasForeignKeys (rdbms : RDBMS) (o : Table) : list ForeignKey := 
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

(* EReference[containment = true]: Backward reference on containment hierarchy *)

Definition Dereference_Column_owner (rdbms : RDBMS) (o : Column) : option Table := 
	(find 
		(fun o' => 
			let contained := 
			(Project_Table_columns o') in
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
			(Project_Schema_foreignKeys o') in
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
		(fun s => existsb 
			(fun t => beq_nat 
				(Project_Table_OID_nat (Project_Table_oid t)) 
				(Project_Table_OID_nat (Project_Table_oid o)))
			(Project_Schema_tables s))
		(AllInstances_Schema rdbms)).

(********************************************************************)
(* Model properties *)

(* Uniqueness constraints *)

(* We need to keep this as a hypothesis rather than an axiom, because whether it is valid
   depends on the implementation of the transformation. *)
Hypothesis SchemaOIDsAreUnique:
	forall rdbms : RDBMS,
	forall s1 s2,
		In s1 (AllInstances_Schema rdbms) /\
		In s2 (AllInstances_Schema rdbms) /\
		((beq_nat (Project_Schema_OID_nat (Project_Schema_oid s1))
			(Project_Schema_OID_nat (Project_Schema_oid s2))) = true) ->
		s1 = s2
.

(* We need to keep this as a hypothesis rather than an axiom, because whether it is valid
   depends on the implementation of the transformation. *)
Hypothesis TableOIDsAreUnique:
	forall rdbms : RDBMS,
	forall t1 t2,
		In t1 (AllInstances_Table rdbms) /\
		In t2 (AllInstances_Table rdbms) /\
		((beq_nat (Project_Table_OID_nat (Project_Table_oid t1))
			(Project_Table_OID_nat (Project_Table_oid t2))) = true) ->
		t1 = t2
.

(* We need to keep this as a hypothesis rather than an axiom, because whether it is valid
   depends on the implementation of the transformation. *)
Hypothesis SchemasContainTables:
	forall rdbms : RDBMS,
	forall s1 s2 : Schema,
	forall t : Table,
		In s1 (AllInstances_Schema rdbms) /\ In s2 (AllInstances_Schema rdbms) /\
		In t (Project_Schema_tables s1) /\
		In t (Project_Schema_tables s2) ->
		s1 = s2
.

(* We need to keep this as a hypothesis rather than an axiom, because whether it is valid
   depends on the implementation of the transformation. *)
Hypothesis TablesContainColumns:
	forall rdbms : RDBMS,
	forall t1 t2 : Table,
	forall c : Column,
		In t1 (AllInstances_Table rdbms) /\ In t2 (AllInstances_Table rdbms) /\
		In c (Project_Table_columns t1) /\
		In c (Project_Table_columns t2) ->
		t1 = t2
.

(* Consistency of dereferencing functions *)

Lemma Consistent_Dereference_ForeignKey_schema:
	forall rdbms: RDBMS,
	forall s : Schema,
	forall fk : ForeignKey,
	forall SchemasContainFksInRDBMS: (
		forall s1 s2 : Schema, forall fk : ForeignKey,
			In s1 (AllInstances_Schema rdbms) /\ In s2 (AllInstances_Schema rdbms) /\
			In fk (Project_Schema_foreignKeys s1) /\
			In fk (Project_Schema_foreignKeys s2) ->
			s1 = s2
	),
	forall FkOIDsAreUniqueInRDBMS: (
		forall fk1 fk2 : ForeignKey, 
			In fk1 (AllInstances_ForeignKey rdbms) /\ In fk2 (AllInstances_ForeignKey rdbms) /\
			((beq_nat (Project_ForeignKey_OID_nat (Project_ForeignKey_oid fk1))
			(Project_ForeignKey_OID_nat (Project_ForeignKey_oid fk2))) = true) ->
			fk1 = fk2
	),
	In s (AllInstances_Schema rdbms) ->
	In fk (AllInstances_ForeignKey rdbms) ->
	In fk (Project_Schema_foreignKeys s) ->
	Some s = (Dereference_ForeignKey_schema rdbms fk)
.
Proof.
	intros.
	unfold Dereference_ForeignKey_schema.
	apply (WeakLiftPastFind Schema s 
		(fun s0 : Schema =>
			existsb (fun fk0 : ForeignKey =>
				beq_nat (Project_ForeignKey_OID_nat (Project_ForeignKey_oid fk0))
					(Project_ForeignKey_OID_nat (Project_ForeignKey_oid fk)))
				(Project_Schema_foreignKeys s0))
			(AllInstances_Schema rdbms)).
		induction (Project_Schema_foreignKeys s).
			elim H1.

			destruct H1.
				rewrite H1.
				simpl existsb.
				apply orb_true_intro.
				left.
				apply (beq_nat_over_functions ForeignKey fk fk (fun fk : ForeignKey => (Project_ForeignKey_OID_nat (Project_ForeignKey_oid fk)))).
				reflexivity.

				simpl existsb.
				apply orb_true_intro.
				right.
				apply (IHl H1).

		intros.
		assert (In fk (Project_Schema_foreignKeys a1)).
			assert (forall fk: ForeignKey, In fk (Project_Schema_foreignKeys a1) -> In fk (AllInstances_ForeignKey rdbms)).
				intros.
				unfold AllInstances_ForeignKey.
				apply (LiftPastFlatMaps Schema ForeignKey a1 fk0
					Project_Schema_foreignKeys
					(AllInstances_Schema rdbms)).
					assumption.

					assumption.
			induction (Project_Schema_foreignKeys a1).
				unfold existsb in H3.
				discriminate.

				unfold existsb in H3.
				case_eq (beq_nat (Project_ForeignKey_OID_nat (Project_ForeignKey_oid a))
						(Project_ForeignKey_OID_nat (Project_ForeignKey_oid fk))).
					intros.
					left.
					apply (FkOIDsAreUniqueInRDBMS a fk).
					split.
						apply H4.
						left.
						reflexivity.

						split.
							assumption.

							assumption.

					intros.
					right.
					rewrite H5 in H3.
					simpl (false || (fix existsb (l : list ForeignKey) : bool :=
						match l with
						| nil => false
						| a :: l0 => beq_nat (Project_ForeignKey_OID_nat (Project_ForeignKey_oid a))
							(Project_ForeignKey_OID_nat (Project_ForeignKey_oid fk)) || existsb l0
						end) l) in H3.
					apply (IHl H3).
					intros.
					apply H4.
					right.
					assumption.
		apply (SchemasContainFksInRDBMS s a1 fk).
		split.
			assumption.

			split.
				assumption.

				split.
					assumption.

					assumption.
		assumption.
Qed.

Lemma Consistent_Dereference_Column_owner:
	forall rdbms: RDBMS,
	forall t : Table,
	forall c : Column,
	forall TablesContainColumnsInRDBMS: (
		forall t1 t2 : Table, forall c : Column,
			In t1 (AllInstances_Table rdbms) /\ In t2 (AllInstances_Table rdbms) /\
			In c (Project_Table_columns t1) /\
			In c (Project_Table_columns t2) ->
			t1 = t2
	),
	forall ColumnOIDsAreUniqueInRDBMS: (
		forall c1 c2,
			In c1 (AllInstances_Column rdbms) /\
			In c2 (AllInstances_Column rdbms) /\
			((beq_nat (Project_Column_OID_nat (Project_Column_oid c1))
			(Project_Column_OID_nat (Project_Column_oid c2))) = true) ->
			c1 = c2
	),
	In t (AllInstances_Table rdbms) ->
	In c (AllInstances_Column rdbms) ->
	In c (Project_Table_columns t) ->
	Some t = (Dereference_Column_owner rdbms c)
.
Proof.
	intros.
	unfold Dereference_Column_owner.
	apply (WeakLiftPastFind Table t 
		(fun o' : Table => existsb 
			(fun o'' : Column =>
				beq_nat (Project_Column_OID_nat (Project_Column_oid o''))
					(Project_Column_OID_nat (Project_Column_oid c)))
				(Project_Table_columns o'))
			(AllInstances_Table rdbms)).
		3:assumption.

		(* There must be table t for a column c, so that c.owner = t *)
		induction (Project_Table_columns t).
		elim H1.

		destruct H1.
			rewrite H1.
			simpl existsb.
			apply orb_true_intro.
			left.
			apply beq_nat_true_iff.
			congruence.

			simpl existsb.
			apply orb_true_intro.
			right.
			apply (IHl H1).

		intros.
		assert (In c (Project_Table_columns a1)).
			assert (forall c: Column, In c (Project_Table_columns a1) -> In c (AllInstances_Column rdbms)).
				intros.
				unfold AllInstances_Column.
				apply (LiftPastFlatMaps Table Column a1 c0
					Project_Table_columns
					(AllInstances_Table rdbms)).
					assumption.

					assumption.
			induction (Project_Table_columns a1).
				unfold existsb in H3.
				discriminate.

				unfold existsb in H3.
				case_eq (beq_nat (Project_Column_OID_nat (Project_Column_oid a))
					(Project_Column_OID_nat (Project_Column_oid c))).
					intros.
					left.
					apply (ColumnOIDsAreUniqueInRDBMS a c).
					split.
						apply H4.
						left.
						reflexivity.

						split.
							assumption.

							assumption.

					intros.
					right.
					rewrite H5 in H3.
					simpl (false || (fix existsb (l : list Column) : bool :=
						match l with
						| nil => false
						| a :: l0 => beq_nat (Project_Column_OID_nat (Project_Column_oid a))
							(Project_Column_OID_nat (Project_Column_oid c)) || existsb l0
						end) l) in H3.
					apply (IHl H3).
					intros.
					apply H4.
					right.
					assumption.
		apply (TablesContainColumnsInRDBMS t a1 c).
		split.
			assumption.

			split.
				assumption.

				split.
					assumption.

					assumption.
Qed.

(* dereferencing table schemas is the inverse of schemas table projection... *)
(* We really should be able to generalise this proof... *)
Lemma Consistent_Dereference_Table_schema:
	forall rdbms : RDBMS,
	forall s : Schema,
	forall t : Table,
	forall SchemasContainTablesInRDBMS: (
		forall s1 s2 : Schema, forall t : Table,
		In s1 (AllInstances_Schema rdbms) /\ In s2 (AllInstances_Schema rdbms) /\
		In t (Project_Schema_tables s1) /\
		In t (Project_Schema_tables s2) ->
		s1 = s2
	),
	forall TableOIDsAreUniqueInRDBMS: (
		forall t1 t2,
        In t1 (AllInstances_Table rdbms) /\ In t2 (AllInstances_Table rdbms) /\
        ((beq_nat (Project_Table_OID_nat (Project_Table_oid t1))
        (Project_Table_OID_nat (Project_Table_oid t2))) = true) ->
        t1 = t2
	),
	In s (AllInstances_Schema rdbms) ->
	In t (AllInstances_Table rdbms) ->
	In t (Project_Schema_tables s) ->
	Some s = (Dereference_Table_schema rdbms t)
.
Proof.
	intros.
	unfold Dereference_Table_schema.
	apply (WeakLiftPastFind Schema s
		(fun s : Schema => existsb (fun t0 : Table =>
			beq_nat (Project_Table_OID_nat (Project_Table_oid t0))
				(Project_Table_OID_nat (Project_Table_oid t)))
			(Project_Schema_tables s))
		(AllInstances_Schema rdbms)).
		induction (Project_Schema_tables s).
			elim H1.

			destruct H1.
				simpl existsb.
				rewrite H1.
				apply orb_true_intro.
				left.
				apply (beq_nat_over_functions Table t t (fun t : Table => (Project_Table_OID_nat (Project_Table_oid t)))).
				reflexivity.

				simpl existsb.
				apply orb_true_intro.
				right.
				apply (IHl H1).

		intros.
		assert (In t (Project_Schema_tables a1)).
			assert (forall t1: Table, In t1 (Project_Schema_tables a1) -> In t1 (AllInstances_Table rdbms)).
				intros.
				unfold AllInstances_Table.
				apply (LiftPastFlatMaps Schema Table a1 t1
					Project_Schema_tables
					(AllInstances_Schema rdbms)).
					assumption.

					assumption.
			induction (Project_Schema_tables a1).
				unfold existsb in H3.
				discriminate.

				unfold existsb in H3.
				case_eq (beq_nat (Project_Table_OID_nat (Project_Table_oid a))
					(Project_Table_OID_nat (Project_Table_oid t))).
					intros.
					left.
					apply (TableOIDsAreUniqueInRDBMS a t).
					split.
						apply H4.
						left.
						reflexivity.

						split.
							assumption.

							assumption.

					intros.
					right.
					rewrite H5 in H3.
					simpl (false || (fix existsb (l : list Table) : bool :=
						match l with
						| nil => false
						| a :: l0 => beq_nat (Project_Table_OID_nat (Project_Table_oid a))
							(Project_Table_OID_nat (Project_Table_oid t)) || existsb l0
						end) l) in H3.
					apply (IHl H3).
					intros.
					apply H4.
					right.
					assumption.
		apply (SchemasContainTablesInRDBMS s a1 t).
		split.
			assumption.

			split.
				assumption.

				split.
					assumption.

					assumption.
		assumption.
Qed.

(* Helpers *)

Lemma ColumnOIDsAreEqual:
	forall x y,
	Project_Column_OID_nat x = Project_Column_OID_nat y ->
	x = y
.
Proof.
	intros.
	destruct x, y.
	simpl Project_Column_OID_nat in H.
	rewrite H.
	reflexivity.
Qed.

Lemma ColumnsAreEqual:
	forall x y,
	Project_Column_OID_nat (Project_Column_oid x) = Project_Column_OID_nat (Project_Column_oid y) /\
	Project_Column_super x = Project_Column_super y /\
	Project_Column_type x = Project_Column_type y /\
	Project_Column_hasKeys x = Project_Column_hasKeys y /\
	Project_Column_hasForeignKeys x = Project_Column_hasForeignKeys y ->
	x = y
.
Proof.
	intros.
	destruct H. destruct H0. destruct H1. destruct H2.
	destruct x, y.
	simpl Project_Column_oid in H. apply ColumnOIDsAreEqual in H.
	simpl Project_Column_super in H0.
	simpl Project_Column_type in H1.
	simpl Project_Column_hasKeys in H2.
	simpl Project_Column_hasForeignKeys in H3.
	rewrite H, H0, H1, H2, H3.
	trivial.
Qed.

End RDBMS.