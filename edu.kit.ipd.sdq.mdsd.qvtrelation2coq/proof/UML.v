(********************************************************************
 Coq definitions for metamodel SimpleUML.

 Copyright (c) 2014 Jeffrey Terrell, Steffen Zschaler, Andreas Rentschler
 ********************************************************************)

Add LoadPath "/Users/jeffreyterrell/Dropbox/Research/Writing/Projects/QvtToCoq/Subversion/QVTrv/branches/no-monads/proof".
Add LoadPath "/Users/Andreas/Desktop/UML2RDBMS/proof".

Section UML.

(* Coq libraries *)
Require Import List.
Require Import ListHelpers.
Require Import String.
Require Import Arith.
Require Import Bool.

(********************************************************************)
(* EEnums: need to be defined first. *)
Inductive KIND : Set := 
	| PERSISTENT : KIND
	| OTHER : KIND
.

(********************************************************************)
(* EClasses: defined by constructors of an ID, super classes, local attributes and references. *)

Record Package_OID : Set := Build_Package_OID { 
	Project_Package_OID_nat : nat 
}.
Record Class_OID : Set := Build_Class_OID { 
	Project_Class_OID_nat : nat 
}.
Record Attribute_OID : Set := Build_Attribute_OID { 
	Project_Attribute_OID_nat : nat 
}.
Record PrimitiveDataType_OID : Set := Build_PrimitiveDataType_OID { 
	Project_PrimitiveDataType_OID_nat : nat 
}.
Record Association_OID : Set := Build_Association_OID { 
	Project_Association_OID_nat : nat 
}.

Inductive ModelElement : Set := 
	Build_ModelElement :
		KIND -> 
		string ->
		ModelElement

with PackageElement : Set := 
	Build_PackageElement :
		ModelElement -> 
		(* Package_OID -> *)
		PackageElement

with Classifier : Set := 
	Build_Classifier :
		PackageElement ->
		(* list Attribute_OID -> *)
		Classifier

with Attribute : Set := 
	Build_Attribute :
		Attribute_OID ->
		ModelElement ->
		Class + PrimitiveDataType ->
		(* Class_OID -> *)
		Attribute

with Association : Set := 
	Build_Association :
		Association_OID ->
		PackageElement ->
		Class_OID ->
		Class_OID ->
		Association

with PrimitiveDataType : Set := 
	Build_PrimitiveDataType :
		PrimitiveDataType_OID ->
		Classifier ->
		PrimitiveDataType

with Class : Set := 
	Build_Class :
		Class_OID ->
		Classifier ->
		option Class ->
		list Attribute ->
		(* list Class_OID -> *)
		(* list Association_OID -> *)
		(* list Association_OID -> *)
		Class

with Package : Set := 
	Build_Package :
		Package_OID ->
		ModelElement ->
		list (Class + PrimitiveDataType + Association) ->
		Package.

(********************************************************************)
(* EStructuralFeatures: projections of derived attributes and references. *)

Definition Project_ModelElement_kind (x : ModelElement) : KIND :=
	match x with Build_ModelElement kind _ => kind end.

Definition Project_ModelElement_name (x : ModelElement) : string :=
	match x with Build_ModelElement _ name => name end.

Definition Project_PackageElement_super (x : PackageElement) : ModelElement :=
	match x with Build_PackageElement super (* _ *) => super end.

Definition Project_Classifier_super (x : Classifier) : PackageElement :=
	match x with Build_Classifier super (* _ *) => super end.

Definition Project_Attribute_oid (x : Attribute) : Attribute_OID :=
	match x with Build_Attribute oid _ _ (* _ *) => oid end.

Definition Project_Attribute_super (x : Attribute) : ModelElement :=
	match x with Build_Attribute _ super _ (* _ *) => super end.

Definition Project_Attribute_type (x : Attribute) : Class + PrimitiveDataType :=
	match x with Build_Attribute _ _ type (* _ *) => type end.

Definition Project_Association_oid (x : Association) : Association_OID :=
	match x with Build_Association oid _ _ _ => oid end.

Definition Project_Association_super (x : Association) : PackageElement :=
	match x with Build_Association _ super _ _ => super end.

Definition Project_Association_source (x : Association) : Class_OID :=
	match x with Build_Association oid super source destination => source end.

Definition Project_Association_destination (x : Association) : Class_OID :=
	match x with Build_Association _ _ _ destination => destination end.

Definition Project_PrimitiveDataType_oid (x : PrimitiveDataType) : PrimitiveDataType_OID :=
	match x with Build_PrimitiveDataType oid _ => oid end.

Definition Project_PrimitiveDataType_super (x : PrimitiveDataType) : Classifier :=
	match x with Build_PrimitiveDataType _ super => super end.

Definition Project_Class_oid (x : Class) : Class_OID :=
	match x with Build_Class oid _ _ _ (* _ _ _ *) => oid end.

Definition Project_Class_super (x : Class) : Classifier :=
	match x with Build_Class _ super _ _ (* _ _ _ *) => super end.

Definition Project_Class_general (x : Class) : option Class :=
	match x with Build_Class _ _ general _ (* _ _ _ *) => general end.

Definition Project_Class_attributes (x : Class) : list Attribute :=
	match x with Build_Class _ _ _ attributes (* _ _ _ *) => attributes end.

Definition Project_Package_oid (x : Package) : Package_OID :=
	match x with Build_Package oid _ _ => oid end.

Definition Project_Package_super (x : Package) : ModelElement :=
	match x with Build_Package _ super _ => super end.

Definition Project_Package_elements (x : Package) : 
		list (Class + PrimitiveDataType + Association) :=
	match x with Build_Package _ _ elements => elements end.

(* Model *)

Record UML := Build {
	Content : list Package
}.

(* EAllInstances: Collecting all instances of a certain type in model. *)

Definition AllInstances_Package (uml : UML) : list Package :=
	(Content uml).

Definition ModelElements (uml : UML) : list (Class + PrimitiveDataType + Association) :=
	(flat_map Project_Package_elements (AllInstances_Package uml)).

Fixpoint Filter_Class (lc : list (Class + PrimitiveDataType + Association)) : list Class :=
	match lc with
	| (inl (inl lc_head)) :: lc_tail =>
		lc_head :: (Filter_Class lc_tail)
	| _ :: lc_tail => (Filter_Class lc_tail)
	| nil => nil
	end.
Definition AllInstances_Class (uml : UML) : list Class :=
	(flat_map (fun p => 
		Filter_Class (Project_Package_elements p))
	(AllInstances_Package uml)).

Fixpoint Filter_PrimitiveDataType (lc : list (Class + PrimitiveDataType + Association)) : list PrimitiveDataType :=
	match lc with
	| (inl (inr lc_head)) :: lc_tail =>
		lc_head :: (Filter_PrimitiveDataType lc_tail)
	| _ :: lc_tail => (Filter_PrimitiveDataType lc_tail)
	| nil => nil
	end.
Definition AllInstances_PrimitiveDataType (uml : UML) : list PrimitiveDataType :=
	(Filter_PrimitiveDataType (flat_map Project_Package_elements (AllInstances_Package uml))).

Fixpoint Filter_Association (lc : list (Class + PrimitiveDataType + Association)) : list Association :=
	match lc with
	| (inr lc_head) :: lc_tail =>
		lc_head :: (Filter_Association lc_tail)
	| _ :: lc_tail => (Filter_Association lc_tail)
	| nil => nil
	end.
Definition AllInstances_Association (uml : UML) : list Association :=
	flat_map (fun p: Package => (Filter_Association (Project_Package_elements p))) (AllInstances_Package uml)
.

Definition AllInstances_Attribute (uml : UML) : list Attribute := 
	(flat_map Project_Class_attributes (AllInstances_Class uml)).

(* EReference[containment = false]: Resolving non-containment references. *)

Function Dereference_Class'' (lc : list (Class + PrimitiveDataType + Association)) (c_oid : Class_OID) : option Class :=
	match lc with
	| (inl (inl lc_head)) :: lc_tail => 
		if beq_nat (Project_Class_OID_nat (Project_Class_oid lc_head)) (Project_Class_OID_nat c_oid) 
		then Some lc_head
		else (Dereference_Class'' lc_tail c_oid)
	| _ :: lc_tail => (Dereference_Class'' lc_tail c_oid)
	| nil => None
	end.
Function Dereference_Class' (lp : list Package) (c_oid : Class_OID) := 
	match lp with
	| p::tail => 
		match (Dereference_Class'' (Project_Package_elements p) c_oid) with
		| Some c => Some c
		| None => Dereference_Class' tail c_oid
		end
	| nil => None
	end.
Function Dereference_Class (uml : UML) (c_oid : Class_OID) : option Class :=
	(Dereference_Class' (Content uml) c_oid).
Function Dereference_Classes (uml : UML) (lc_oid : list Class_OID) : list (option Class) :=
	map (fun c_oid => (Dereference_Class uml c_oid)) lc_oid.

Function Dereference_PrimitiveDataType'' (lc : list (Class + PrimitiveDataType + Association)) (p_oid : PrimitiveDataType_OID) : option PrimitiveDataType :=
	match lc with
	| (inl (inr lc_head)) :: lc_tail => 
		if beq_nat (Project_PrimitiveDataType_OID_nat (Project_PrimitiveDataType_oid lc_head)) (Project_PrimitiveDataType_OID_nat p_oid) 
		then Some lc_head
		else (Dereference_PrimitiveDataType'' lc_tail p_oid)
	| _ :: lc_tail => (Dereference_PrimitiveDataType'' lc_tail p_oid)
	| nil => None
	end.
Function Dereference_PrimitiveDataType' (lp : list Package) (p_oid : PrimitiveDataType_OID) := 
	match lp with
	| p::tail => 
		match (Dereference_PrimitiveDataType'' (Project_Package_elements p) p_oid) with
		| Some c => Some c
		| None => Dereference_PrimitiveDataType' tail p_oid
		end
	| nil => None
	end.
Function Dereference_PrimitiveDataType (uml : UML) (p_oid : PrimitiveDataType_OID) : option PrimitiveDataType :=
	(Dereference_PrimitiveDataType' (Content uml) p_oid).

Definition Dereference_Association_source (uml : UML) (o : Association) : option Class :=
	(Dereference_Class uml (Project_Association_source o)).

Definition Dereference_Association_destination (uml : UML) (o : Association) : option Class :=
	(Dereference_Class uml (Project_Association_destination o)).

(* EStructuralFeatures: projections of derived attributes and references. *)

Definition Project_Package_kind (o : Package) :=
	Project_ModelElement_kind (Project_Package_super o).
Definition Project_Package_name (o : Package) :=
	Project_ModelElement_name (Project_Package_super o).

Definition Project_Attribute_kind (o : Attribute) :=
	Project_ModelElement_kind (Project_Attribute_super o).
Definition Project_Attribute_name (o : Attribute) :=
	Project_ModelElement_name (Project_Attribute_super o).

Definition Project_PackageElement_kind (o : PackageElement) :=
	Project_ModelElement_kind (Project_PackageElement_super o).
Definition Project_PackageElement_name (o : PackageElement) :=
	Project_ModelElement_name (Project_PackageElement_super o).

Definition Project_Classifier_kind (o : Classifier) :=
	Project_PackageElement_kind (Project_Classifier_super o).
Definition Project_Classifier_name (o : Classifier) :=
	Project_PackageElement_name (Project_Classifier_super o).

Definition Project_Class_kind (o : Class) :=
	Project_Classifier_kind (Project_Class_super o).
Definition Project_Class_name (o : Class) :=
	Project_Classifier_name (Project_Class_super o).

Definition Project_PrimitiveDataType_kind (o : PrimitiveDataType) :=
	Project_Classifier_kind (Project_PrimitiveDataType_super o).
Definition Project_PrimitiveDataType_name (o : PrimitiveDataType) :=
	Project_Classifier_name (Project_PrimitiveDataType_super o).

Definition Project_Association_kind (o : Association) :=
	Project_PackageElement_kind (Project_Association_super o).
Definition Project_Association_name (o : Association) :=
	Project_PackageElement_name (Project_Association_super o).

(* Backward reference on containment hierarchy *)

Definition Dereference_Class_namespace (uml : UML) (o : Class) : option Package :=
	(find 
		(fun p => existsb (fun c => 
			beq_nat (Project_Class_OID_nat (Project_Class_oid c)) 
				(Project_Class_OID_nat (Project_Class_oid o)))
			(Filter_Class (Project_Package_elements p)))
		(AllInstances_Package uml))
.
Definition Dereference_PrimitiveDataType_namespace (uml : UML) (o : PrimitiveDataType) : option Package :=
	(find 
		(fun p => existsb (fun pdt => 
			beq_nat (Project_PrimitiveDataType_OID_nat (Project_PrimitiveDataType_oid pdt)) 
				(Project_PrimitiveDataType_OID_nat (Project_PrimitiveDataType_oid o)))
			(Filter_PrimitiveDataType (Project_Package_elements p)))
		(AllInstances_Package uml))
.
Definition Dereference_Association_namespace (uml : UML) (o : Association) : option Package :=
	(find 
		(fun p => existsb (fun c => 
			beq_nat (Project_Association_OID_nat (Project_Association_oid c)) 
				(Project_Association_OID_nat (Project_Association_oid o)))
			(Filter_Association (Project_Package_elements p)))
		(AllInstances_Package uml))
.
Definition Dereference_Attribute_owner (uml : UML) (o : Attribute) : option Class :=
	(find 
		(fun c => existsb 
			(fun a => 
				beq_nat 
					(Project_Attribute_OID_nat (Project_Attribute_oid a)) 
					(Project_Attribute_OID_nat (Project_Attribute_oid o)))
			(Project_Class_attributes c))
		(AllInstances_Class uml)).

(* Backward reference on association *)

Definition Dereference_Class_typeOpposite (uml : UML) (o : Class) : list Attribute :=
	(filter 
		(fun a => match (Project_Attribute_type a) with
								| inl c => true
			| _ => false
			end)
		(AllInstances_Attribute uml)).

Definition Dereference_PrimitiveDataType_typeOpposite (uml : UML) (o : PrimitiveDataType) : list Attribute :=
	(filter 
		(fun a => match (Project_Attribute_type a) with
			| inr pdt => true
			| _ => false
			end)
		(AllInstances_Attribute uml)).

Definition Dereference_Class_generalOpposite (uml : UML) (o : Class) : list Class :=
	(filter 
		(fun c => match (Project_Class_general c) with
			| Some c' => true
			| _ => false
			end)
		(AllInstances_Class uml)).

Definition Dereference_Class_reverse (uml : UML) (o : Class) : list Association :=
	(filter 
		(fun a => match (Dereference_Class uml (Project_Association_source a)) with
			| Some c => beq_nat 
				(Project_Class_OID_nat (Project_Class_oid c)) 
				(Project_Class_OID_nat (Project_Class_oid o))
			| _ => false
			end)
		(AllInstances_Association uml)).
Definition Dereference_Class_forward (uml : UML) (o : Class) : list Association :=
	(filter 
		(fun a => match (Dereference_Class uml (Project_Association_destination a)) with
			| Some c => beq_nat 
				(Project_Class_OID_nat (Project_Class_oid c)) 
				(Project_Class_OID_nat (Project_Class_oid o))
			| _ => false
			end)
		(AllInstances_Association uml)).

(********************************************************************)
(* Model properties *)

(* Uniqueness constraints *)

Hypothesis ClassOIDsAreUnique:
	forall uml : UML,
	forall c c1 : Class,
		In c (AllInstances_Class uml) /\
		In c1 (AllInstances_Class uml) /\
		((beq_nat (Project_Class_OID_nat (Project_Class_oid c))
			(Project_Class_OID_nat (Project_Class_oid c1))) = true) ->
		 c = c1
.

Hypothesis AssociationOIDsAreUnique:
	forall uml : UML,
	forall a1 a2 : Association,
		In a1 (AllInstances_Association uml) /\
		In a2 (AllInstances_Association uml) /\
		((beq_nat (Project_Association_OID_nat (Project_Association_oid a1))
			(Project_Association_OID_nat (Project_Association_oid a2))) = true) ->
		a1 = a2
.

Hypothesis PackagesContainClasses:
	forall uml : UML,
	forall p1 p2 : Package,
	forall c : Class,
		In c (Filter_Class (Project_Package_elements p1)) /\
		In c (Filter_Class (Project_Package_elements p2)) ->
		p1 = p2
.

(* Consistency of dereferencing functions *)

(* Namespace and package elements will be inverses of each other... *)
Lemma Consistent_Dereference_Class_namespace:
	forall uml : UML,
	forall p : Package,
	forall c : Class,
		In p (AllInstances_Package uml) ->
		In c (AllInstances_Class uml) ->
		Some p = (Dereference_Class_namespace uml c) ->
		In c (Filter_Class (Project_Package_elements p))
.
Proof.
	intros.
	unfold Dereference_Class_namespace in H1.
	apply (UnliftPastFind Package p 
		(fun p : Package => existsb (fun e : Class =>
			beq_nat (Project_Class_OID_nat (Project_Class_oid e))
				(Project_Class_OID_nat (Project_Class_oid c)))
			(Filter_Class (Project_Package_elements p)))
		(AllInstances_Package uml)) in H1.
	destruct H1.
	clear H2. (* We already knew this... *)
	assert (ClassInUML: (forall c : Class, (In c (Filter_Class (Project_Package_elements p))) -> In c (AllInstances_Class uml))).
		intros.
		unfold AllInstances_Class.
		apply (LiftPastFlatMaps Package Class p c0
			(fun p0 : Package => Filter_Class (Project_Package_elements p0))
			(AllInstances_Package uml)).
		assumption.

		assumption.
	induction (Filter_Class (Project_Package_elements p)).
		simpl existsb in H1.
		discriminate.

		simpl existsb in H1.
		case_eq (beq_nat (Project_Class_OID_nat (Project_Class_oid a))
			(Project_Class_OID_nat (Project_Class_oid c))).
		intro.
		left.
		apply (ClassOIDsAreUnique uml a c).
			split.
				apply (ClassInUML a).
				left.
				auto.
 
				split.
				assumption.

				assumption.

		intro.
		right.
		rewrite H2 in H1.
		simpl (false || 
			existsb (fun e : Class =>
				beq_nat (Project_Class_OID_nat (Project_Class_oid e))
					(Project_Class_OID_nat (Project_Class_oid c))) l) 
		in H1.
		apply (IHl H1).
		intros.
		apply (ClassInUML c0).
		right.
		assumption.
Qed.

(* Namespace and association elements will be inverses of each other... *)
(* This is almost exactly the same proof as the one above. *)
Lemma Consistent_Dereference_Association_namespace:
	forall uml : UML,
	forall p : Package,
	forall a : Association,
		In p (AllInstances_Package uml) ->
		In a (AllInstances_Association uml) ->
		Some p = (Dereference_Association_namespace uml a) ->
		In a (Filter_Association (Project_Package_elements p))
.
Proof.
	intros.
	unfold Dereference_Association_namespace in H1.

	apply (UnliftPastFind Package p 
		(fun p0 : Package => existsb
			(fun a0 : Association => beq_nat
				(Project_Association_OID_nat (Project_Association_oid a0))
			(Project_Association_OID_nat (Project_Association_oid a)))
		(Filter_Association (Project_Package_elements p0)))
		(AllInstances_Package uml)) in H1.
	destruct H1.
	clear H2. (* We already knew this... *)
	assert (AssociationInUML: (forall a : Association, (In a (Filter_Association (Project_Package_elements p))) -> In a (AllInstances_Association uml))).
		intros.
		unfold AllInstances_Association.
		apply (LiftPastFlatMaps Package Association p a0
			(fun p0 : Package => Filter_Association (Project_Package_elements p0))
			(AllInstances_Package uml)).
		assumption.

		assumption.
	induction (Filter_Association (Project_Package_elements p)).
		simpl existsb in H1.
		discriminate.

		simpl existsb in H1.
		case_eq (beq_nat (Project_Association_OID_nat (Project_Association_oid a0))
			(Project_Association_OID_nat (Project_Association_oid a))).
		intro.
		left.
		apply (AssociationOIDsAreUnique uml a0 a).
			split.
				apply (AssociationInUML a0).
				left.
				auto.
 
				split.
				assumption.

				assumption.

		intro.
		right.
		rewrite H2 in H1.
		simpl (false || 
			existsb (fun a0 : Association =>
				beq_nat (Project_Association_OID_nat (Project_Association_oid a0))
					(Project_Association_OID_nat (Project_Association_oid a))) l) 
		in H1.
		apply (IHl H1).
		intros.
		apply (AssociationInUML a1).
		right.
		assumption.
Qed.

End UML.