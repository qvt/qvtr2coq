(********************************************************************
 Coq definitions to ease proves on list properties.

 Copyright (c) 2014 Steffen Zschaler, Jeffrey Terrell, Andreas Rentschler
 ********************************************************************)

Require Import List.
Require Import Arith.

(********************************************************************)
(* List concatenation *)

Lemma SplitList :
	forall T : Set,
	forall t : T,
	forall l : list T,
	forall l' : list T,
		In t (l ++ l') ->
		In t l \/ In t l'.
Proof.
	intros.
	induction l.
		simpl (nil ++ l') in H.
		right.
		assumption.

		simpl ((a :: l) ++ l') in H.
		unfold In in H.
		destruct H.
			left.
			left.
			assumption.

			unfold In.
			destruct IHl.
				assumption.

				left.
				right.
				assumption.

				right.
				assumption.
Qed.

Lemma LeftExpandList :
	forall T : Set,
	forall t : T,
	forall l : list T,
	forall l' : list T,
		In t l -> In t (l ++ l').
Proof.
	intros.
	induction l.
		elim H.

		destruct H.
			rewrite <- H.
			left.
			reflexivity.

			right.
			apply (IHl H).
Qed.

Lemma RightExpandList :
	forall T : Set,
	forall t : T,
	forall l : list T,
	forall l' : list T,
		In t l' -> In t (l ++ l').
Proof.
	intros.
	induction l.
		simpl.
		assumption.

		simpl.
		right.
		assumption.
Qed.

(********************************************************************)
(* Mapping between lists *)

Lemma LiftPastFlatMaps :
	forall A B : Set,
	forall a : A,
	forall b : B,
	forall f : A -> list B,
	forall l : list A,
		In b (f a) ->
		In a l ->
		In b (flat_map f l)
.
Proof.
	intros.
	induction l.
		elim H0.

		simpl.
		destruct H0.
			apply (LeftExpandList B b (f a0) (flat_map f l)).
			rewrite H0.
			assumption.

			apply (RightExpandList B b (f a0) (flat_map f l)).
			apply (IHl H0).
Qed.

Lemma UnliftPastFlatMaps :
	forall A B : Set,
	forall b : B,
	forall f : A -> list B,
	forall l : list A,
		In b (flat_map f l) -> 
		exists a : A,
			In b (f a) /\ In a l 
.
Proof.
	(* That one actually already existed :-) *)
	intros.
	assert (exists a: A, In a l /\ In b (f a)).
		apply (in_flat_map f l b).
		assumption.
	destruct H0.
	exists x.
	tauto.
Qed.


Lemma LiftPastMaps :
	forall A B : Set,
	forall a : A,
	forall b : B,
	forall f : A -> B,
	forall l : list A,
		b = (f a) ->
		In a l ->
		In b (map f l)
.
Proof.
	intros.
	induction l.
		elim H0.

		destruct H0.
			left.
			rewrite H0.
			auto.
		
			right.
			apply (IHl H0).
Qed.

Lemma UnliftPastMaps :
	forall A B : Set,
	forall b : B,
	forall f : A -> B,
	forall l : list A,
		In b (map f l) -> 
		exists a : A,
			b = (f a) /\ In a l
.
Proof. 
	(* This already exists, too. *)
	intros.
	assert (exists a : A, (f a) = b /\ In a l).
		apply (in_map_iff f l b).
		assumption.
	destruct H0.
	destruct H0.
	exists x.
	split.
		auto.

		assumption.
Qed.

(********************************************************************)
(* Finding in lists *)

Lemma LiftPastFind :
	forall A : Set,
	forall a : A,
	forall f : A -> bool,
	forall l : list A,
		((f a) = true) ->
		(forall a1 : A, ((f a1) = true) -> a = a1) ->
		(In a l) ->
		Some a = (find f l)
.
Proof.
	intros.
	unfold find.
	induction l.
		elim H1.

		destruct H1.
			rewrite H1.
			rewrite H.
			auto.

			case_eq (f a0).
				intro.
				assert (a = a0).
					apply (H0 a0 H2).
				rewrite H3.
				auto.

				intro.
				apply (IHl H1).
Qed.

Lemma UnliftPastFind :
	forall A : Set,
	forall a : A,
	forall f : A -> bool,
	forall l : list A,
		Some a = (find f l) ->
		((f a) = true) /\ (In a l)
.
Proof.
	intros.
	induction l.
		simpl find in H.
		discriminate.

		case_eq (f a0).
			intro.
			simpl find in H.
			rewrite H0 in H.
			assert (a = a0).
				congruence.

			split.
				rewrite H1.
				apply H0.

				left.
				rewrite H1.
				reflexivity.

		intro.
		simpl find in H.
		rewrite H0 in H.
		assert (f a = true /\ In a l).
			apply (IHl H).
		destruct H1.
		split.
			assumption.

			right.
			assumption.
Qed.

Lemma WeakLiftPastFind :
	forall A : Set,
	forall a : A,
	forall f : A -> bool,
	forall l : list A,
		((f a) = true) ->
		(forall a1 : A, (**)In a1 l ->(**) ((f a1) = true) -> a = a1) ->
		(In a l) ->
		Some a = (find f l)
.
Proof.
	intros.
	unfold find.
	induction l.
		elim H1.

		destruct H1.
			rewrite H1.
			rewrite H.
			auto.

			case_eq (f a0).
				intro.
				assert (a = a0).
					apply (H0 a0).
						left.
						reflexivity.

						assumption.
				rewrite H3.
				auto.

				intro.
				assert (forall a1 : A, In a1 l -> f a1 = true -> a = a1).
					intros.
					assert (In a1 (a0::l)).
						right.
						assumption.
					apply (H0 a1 H5 H4).
				apply (IHl H3 H1).
Qed.

(********************************************************************)
(* Miscellaneous helper functions *)

Lemma beq_nat_over_functions:
	forall A : Set, 
	forall a b : A, 
	forall f: A -> nat,
		(a = b) -> (beq_nat (f a) (f b)) = true
.
Proof.
	intros.
	apply (beq_nat_true_iff).
	congruence.
Qed.
