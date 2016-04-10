package edu.kit.ipd.sdq.mdsd.qvtrelation2coq

import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Collections
import java.util.Date
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Set
import java.util.Stack
import javax.inject.Inject
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.ocl.examples.pivot.Class
import org.eclipse.ocl.examples.pivot.CollectionLiteralExp
import org.eclipse.ocl.examples.pivot.EnumLiteralExp
import org.eclipse.ocl.examples.pivot.IfExp
import org.eclipse.ocl.examples.pivot.OCLExpression
import org.eclipse.ocl.examples.pivot.OperationCallExp
import org.eclipse.ocl.examples.pivot.PrimitiveLiteralExp
import org.eclipse.ocl.examples.pivot.PrimitiveType
import org.eclipse.ocl.examples.pivot.PropertyCallExp
import org.eclipse.ocl.examples.pivot.StringLiteralExp
import org.eclipse.ocl.examples.pivot.TupleLiteralExp
import org.eclipse.ocl.examples.pivot.Type
import org.eclipse.ocl.examples.pivot.Variable
import org.eclipse.ocl.examples.pivot.VariableExp
import org.eclipse.qvtd.pivot.qvtbase.Function
import org.eclipse.qvtd.pivot.qvtbase.Predicate
import org.eclipse.qvtd.pivot.qvtrelation.Relation
import org.eclipse.qvtd.pivot.qvtrelation.RelationCallExp
import org.eclipse.qvtd.pivot.qvtrelation.RelationDomain
import org.eclipse.qvtd.pivot.qvtrelation.RelationalTransformation
import org.eclipse.qvtd.pivot.qvttemplate.CollectionTemplateExp
import org.eclipse.qvtd.pivot.qvttemplate.ObjectTemplateExp
import org.eclipse.qvtd.pivot.qvttemplate.PropertyTemplateItem
import org.eclipse.qvtd.xtext.qvtrelation.qvtrelationcs.TopLevelCS

// TODO: remove explicit check in source/target domains that a domain�s root variable is contained in AllInstances, this is already checked implicitly (transitively).
//       for example, in Assoc2FKey: 
//       (In a (UML.AllInstances_Association uml)) /\
//       (In fk (RDBMS.AllInstances_ForeignKey rdbms)) /\

class QVTr2Coq {
	
	// We need some helper functions on model elements
	@Inject extension Ecore2Coq EcoreHelpers
	
	// Entry point
	def mapTransformation(TopLevelCS topLevelCS) '''
		�val transformation = topLevelCS.transformations.head.pivot as RelationalTransformation�
		(********************************************************************
		   @name A verified implementation of QVT-R transformation �transformation.name�.
		   @date �new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date)�
		   @description Specification has been generated by QVTrelation2Coq.
		   @see QVT-R Specification, Eclipse QVTd project, and the Coq Project.
		 ********************************************************************)
		
		Section �transformation.name�.

		(* Coq libraries *)
		Require Import List.
		(*Require Import ListHelpers.*)
		Require Import Arith.
		Require Import String.
		Require Import Bool.
		Require Import Equivalence.

		(* use ++ operator instead of append, for example: ("a" ++ "b")%string *)
		Delimit Scope string_scope with string.
		Local Open Scope string_scope.
		Bind Scope string_scope with string.
		Open Scope list_scope.
		Open Scope equiv_scope.

		(* Metamodels. *)
		�FOR importCS : topLevelCS.ownedImport /* Libraries and nested packages ignored for now. */�
			Require Import �importCS.namespace.toString.split('\\.').get(0) /* Ignoring uri, only looking at namespace. */�.
		�ENDFOR�
		
		(* Define exists_t similar to exists but on Type (program domain, predicative) rather than Prop (logic domain, impredicative).
		   "Predicativity is a vulnerability to Russell's paradox that the set S of sets that are not members of themselves can neither be a member of S, nor a non-member of S."
		   When extracting a Haskell/Scheme/Ocaml/ML program, Props are removed and thus ignored. Thus we use Type for the root proposition together with exists_t.
		 *)
		Inductive ex_t (X:Type) (P : X->Type) : Type :=
		ex_t_intro : forall (witness:X), P witness -> ex_t X P.
		Notation "'exists_t' x : X , p" := (ex_t _ (fun x:X => p))
		(at level 200, x ident, right associativity) : type_scope.

		(********************************************************************
		 Automatically extracted transformation specification
		 ********************************************************************)

		���	TODO: QVT-R's 'key' concept remains to be supported
		���	TODO: Queries should be sorted by dependencies, and could be even (mutually) recursive
		�val queries = transformation.ownedOperation.filter(Function).filter[queryExpression != null]�
		�FOR query : queries SEPARATOR '\n'�
		�query.mapQuery�
		�ENDFOR�
		
		�val relations = transformation.rule.filter(Relation).sortByDependencies�
		�FOR componentOfRelations : relations SEPARATOR '\n'�
		�componentOfRelations.mapComponentOfRelations�
		�ENDFOR�
		
		Theorem Transform:
			(* All top level relations need to be valid *)
			�FOR modelParameter : transformation.modelParameter��
			/* By convention, the last parameter is expected to be the (single) target model */
			IF modelParameter == transformation.modelParameter.last�exists_t �ELSE�forall �ENDIF��
			modelParameter.usedPackage.head.name.toLowerCase� : �modelParameter.usedPackage.head.name�, �
			ENDFOR�
			�FOR relation : transformation.rule.filter(Relation).filter[isTopLevel] SEPARATOR " /\\" AFTER "."�
			(Top_�relation.name� �transformation.modelParameter.map[name].join(" ")�)
			�ENDFOR�

		(********************************************************************
		 Functional program that is supposed to adhere to the given specification
		 ********************************************************************)

		(* A functional implementation that performs the transformation. *)
		(* A QVT-R engine computes such a solution to the specification. *)
		
		(* TODO: Create a (possibly recursive) function that constructs a target model from a source model. *)

		(********************************************************************
		 Proof that our implementation satisfies the specification.
		 ********************************************************************)
		Proof.
		
		(* TODO: Run proof here! *)
		
		End �transformation.name�.
		
		(********************************************************************
		 Extract program from proof (see Curry-Howard Isomorphism).
		 ********************************************************************)
		Extraction Language  Haskell. (*Ocaml.*)
		Set Extraction Optimize.
		Recursive Extraction �transformation.name�.
		Transform.
	'''
	
	def mapQuery(Function function) '''
		Definition �function.name� �
		FOR parameter : function.ownedParameter SEPARATOR ' '�(�parameter.name� : �parameter.type.mapType�)�
		ENDFOR� : �function.type.mapType� :=
			�function.queryExpression.mapExpression�
		.
	'''
	
	def mapComponentOfRelations(Iterable<Relation> componentOfRelations) '''
		�IF componentOfRelations.empty�
		(* ERROR: A component of relations should not be empty! *)
		�ELSEIF componentOfRelations.size == 1�
			�val relation = componentOfRelations.head�
			�IF relation.isTopLevel�
				Definition Top_�relation.name� �
				FOR modelParameter : relation.transformation.modelParameter�(�
				modelParameter.usedPackage.head.name.toLowerCase� : �modelParameter.usedPackage.head.name�) �
				ENDFOR�:=
					�relation.mapRelationBody(false)�
				.
				�/* This alternate definition for checking an established relation differs to the version above as follows:
				 * Root variables are now parameters.
				 * Root variable containment propositions are pulled up. */�
				Definition �relation.name� �
				FOR modelParameter : relation.transformation.modelParameter�(�
				modelParameter.usedPackage.head.name.toLowerCase� : �modelParameter.usedPackage.head.name�) �
				ENDFOR��
				/* added > */
				FOR domain : relation.domain.filter(RelationDomain)�(�
				domain.rootVariable.name� : �domain.rootVariable.type.mapType�) �
				/* < added */
				ENDFOR�:=
					�relation.mapRelationBody(true)�
				.
			�ELSE
				/* This is exactly the same as the alternate definition for checking an established relation */�
				Definition �relation.name� �
				FOR modelParameter : relation.transformation.modelParameter�(�
				modelParameter.usedPackage.head.name.toLowerCase� : �modelParameter.usedPackage.head.name�) �
				ENDFOR��
				/* added > */
				FOR domain : relation.domain.filter(RelationDomain)�(�
				domain.rootVariable.name� : �domain.rootVariable.type.mapType�) �
				/* < added */
				ENDFOR�:=
					�relation.mapRelationBody(true)�
				.
			�ENDIF�
		�ELSEIF componentOfRelations.size > 1��
			/* Check that none is defined as top */
			IF componentOfRelations.exists[isTopLevel]�
				(* ERROR: Among cyclic dependent relations �
				componentOfRelations.filter[isTopLevel].map[name].join(", ")
				�, there cannot be a top relation! *)
			�ELSE
				/* Relations in a set of cyclic relations are expected to have the same signature, else Coq will complain. */�
				Inductive �
				FOR relation : componentOfRelations 
				SEPARATOR "\nwith "��
				relation.name� : �
				FOR modelParameter : relation.transformation.modelParameter��
				modelParameter.usedPackage.head.name� -> �
				ENDFOR��
				FOR domain : relation.domain.filter(RelationDomain)��
				domain.rootVariable.type.mapType� -> �
				ENDFOR�Prop :=
				Definition_�relation.name�:
				�FOR modelParameter : relation.transformation.modelParameter�
				forall �modelParameter.usedPackage.head.name.toLowerCase� : �modelParameter.usedPackage.head.name�,
				�ENDFOR�
				�FOR domain : relation.domain.filter(RelationDomain)�
				forall �domain.rootVariable.name� : �domain.rootVariable.type.mapType�,
				�ENDFOR�
				(
					�relation.mapRelationBody(true)�
				) -> (�relation.name� �
				FOR modelParameter : relation.transformation.modelParameter SEPARATOR ' '��
				modelParameter.usedPackage.head.name.toLowerCase��
				ENDFOR��
				FOR domain : relation.domain.filter(RelationDomain) BEFORE ' ' SEPARATOR ' '��
				domain.rootVariable.name��
				ENDFOR�)�
				ENDFOR�
				.
			�ENDIF�
		�ENDIF�
	'''
	
	def mapRelationBody(Relation relation, boolean nonTopAlternative) '''
		�/* nonTopAlternative? Then, containment of root variables is already defined here */
		IF nonTopAlternative�
		(* Root variables *)
		�FOR variable : relation.rootVariables.filter[type.package.name != "ocl"]�
			(In �variable.name� �variable.type.mapTypeToAllInstancesFunction�) /\
		�ENDFOR�
		�ENDIF�
		(* When clause *)
		�val whenBoundVariables = relation.whenConstraints.map[referredVariables].flatten
			/* nonTopAlternative? Then, root variables are filtered out as they have been defined above */
			.filter(e | !nonTopAlternative || !relation.rootVariables.contains(e))
			.toSet�
		�FOR variable : whenBoundVariables�
		forall �variable.name� : �variable.type.mapType�,
		�ENDFOR�
		�IF !relation.whenConstraints.empty�
		(
			�FOR constraint : relation.whenConstraints SEPARATOR ' /\\'�
				�constraint?.mapExpression�
			�ENDFOR�
		) ->
		�ENDIF�
		(* Source domain *)
		�val sourceBoundVariables = relation.sourceBoundVariables.filter(e | !whenBoundVariables.contains(e))
			/* nonTopAlternative? Then, root variables are filtered out as they have been defined as parameters */
			.filter(e | !nonTopAlternative || !relation.rootVariables.contains(e))
			.toSet�
		�FOR variable : sourceBoundVariables�
		forall �variable.name� : �variable.type.mapType�,
		�ENDFOR�
		(* Source constraints *)
		�IF !relation.sourceTemplateItems.empty || (!relation.sourceRootVariables.empty && !nonTopAlternative)�
		(
			�/* nonTopAlternative? Then, root variable containment is commented out as it has been defined above */
			IF !nonTopAlternative��
			FOR variable : relation.sourceRootVariables.filter[type.package.name != "ocl"] SEPARATOR ' /\\'
			AFTER (if (!relation.sourceTemplateItems.empty) ' /\\' else '')�
				(In �variable.name� �variable.type.mapTypeToAllInstancesFunction�)�
			ENDFOR�
			�ENDIF�
			�FOR sourceTemplateItem : relation.sourceTemplateItems SEPARATOR ' /\\'�
				�sourceTemplateItem?.mapTemplateItem�
			�ENDFOR�
		) ->
		�ENDIF�
		(* Target domain *)
		�val targetBoundVariables = relation.targetBoundVariables
			.filter(e | !whenBoundVariables.contains(e) && !sourceBoundVariables.contains(e))
			/* nonTopAlternative? Then, root variables are filtered out as they have been defined as parameters */
			.filter(e | !nonTopAlternative || !relation.rootVariables.contains(e))
			.toSet�
		�FOR variable : targetBoundVariables�
		exists �variable.name� : �variable.type.mapType�,
		�ENDFOR�
		�IF !relation.targetTemplateItems.empty || (!relation.targetRootVariables.empty && !nonTopAlternative)�
		(* Target constraints *)
		(
			�/* nonTopAlternative? Then, root variable containment is commented out as it has been defined above */
			IF !nonTopAlternative��
			FOR variable : relation.targetRootVariables.filter[type.package.name != "ocl"] SEPARATOR ' /\\'
			AFTER (if (!relation.targetTemplateItems.empty) ' /\\' else '')�
				(In �variable.name� �variable.type.mapTypeToAllInstancesFunction�)�
			ENDFOR�
			�ENDIF�
			�FOR targetTemplateItem : relation.targetTemplateItems SEPARATOR ' /\\'�
				�targetTemplateItem?.mapTemplateItem�
			�ENDFOR�
		)�
		ENDIF��
		IF !relation.whereConstraints.empty��IF !relation.targetTemplateItems.empty � /\�ENDIF�
		(* Where clause *)
		�val whereBoundVariables = relation.whereConstraints.map[referredVariables].flatten
			.filter(e | !whenBoundVariables.contains(e) && !sourceBoundVariables.contains(e) && !targetBoundVariables.contains(e))
			/* nonTopAlternative? Then, root variables are filtered out as they have been defined as parameters */
			.filter(e | !nonTopAlternative || !relation.rootVariables.contains(e))
			.toSet�
		�FOR variable : whereBoundVariables�
		exists �variable.name� : �variable.type.mapType�,
		�ENDFOR�
		(
			�/* nonTopAlternative? Then, root variable containment is commented out as it has been defined above */
			FOR variable : whereBoundVariables.filter[type.package.name != "ocl"] SEPARATOR ' /\\'
			AFTER (if (!relation.whereConstraints.empty) ' /\\' else '') + (if (nonTopAlternative) '*)' else '')�
				�IF (nonTopAlternative && variable == whereBoundVariables.head)�(*�ENDIF
				�(In �variable.name� �variable.type.mapTypeToAllInstancesFunction�)�
			ENDFOR�
			�FOR constraint : relation.whereConstraints SEPARATOR ' /\\'�
				�constraint?.mapExpression�
			�ENDFOR�
		)
		�ENDIF�
	'''
	
	// Depending on the reference direction, we must use a suitable dereferencing/projection function
	// Depending on the property's multiplicity, different assignments are possible
	def mapTemplateItem(PropertyTemplateItem item) '''�
		var lhsFeature = item.referredProperty.ETarget as EStructuralFeature/* either an EAttribute or an EReference */��
		var lhsParentObject = item.objContainer��
		var rhsValue = item.value /* either an EnumLiteralExp or an ObjectTemplateExp */��
		lhsFeature.mapFeatureComparison(lhsParentObject, rhsValue)
	�'''

	def dispatch String mapExpression(OCLExpression expression) '''(* ERROR: Unsupported OCL expression '�expression.toString�' *)'''
	def dispatch String mapExpression(VariableExp variable) '''�variable.referredVariable.name�'''
	def dispatch String mapExpression(ObjectTemplateExp variable) /*'''�(variable.bindsTo.eContainer as Relation).name�_*/'''�variable.bindsTo.name�'''
	def dispatch String mapExpression(RelationCallExp exp) '''(�exp.referredRelation.name� �
		FOR modelParameter : exp.referredRelation.transformation.modelParameter SEPARATOR ' '��modelParameter.usedPackage.head.name.toLowerCase��ENDFOR� �
		FOR argument : exp.argument SEPARATOR ' '��argument.mapExpression��ENDFOR
	�)'''
	def dispatch String mapExpression(OperationCallExp exp) '''�
		IF exp.referredOperation.name == "+"
			// String concatenation
			// TODO: Support other types as well
			�(�exp.source.mapExpression� ++ �exp.argument.head.mapExpression�)%string�
		ELSEIF exp.referredOperation.name == "=" && exp.argument.head instanceof PropertyCallExp
			// Feature comparison
			��var lhsFeature = (exp.argument.head as PropertyCallExp).referredProperty.ETarget as EStructuralFeature
			��var lhsParentObject = (exp.argument.head as PropertyCallExp).source
			��var rhsValue = exp.source
			��lhsFeature.mapFeatureComparison(lhsParentObject, rhsValue)��
		ELSEIF exp.referredOperation.name == "="
			// Variable comparison
			�(�exp.source.mapExpression� = �exp.argument.head.mapExpression�)�
		ELSEIF exp.transformation.ownedOperation.filter(Function).map[name].toSet.contains(exp.referredOperation.name)
			// Query function is called that is locally defined
			�(�exp.referredOperation.name��
			FOR argument : exp.argument BEFORE ' ' SEPARATOR ' '��argument.mapExpression��ENDFOR�)�
		ELSE
			�(* ERROR: Unsupported operation '�exp.referredOperation.name�' *)�
		ENDIF�'''
	def dispatch String mapExpression(IfExp exp) '''
		�IF exp.condition.name == "="�
		�val comparison = exp.condition as OperationCallExp�
		match (�comparison.source.mapExpression�) with
		| �comparison.argument.head.mapExpression� => �exp.thenExpression.mapExpression�
		| _ =>
			�exp.elseExpression.mapExpression�
		end
		�ELSE�
		(* Unsupported operation '�exp.name�' in if condition *)
		�ENDIF�
	'''	

	def dispatch String mapExpression(EnumLiteralExp constant) '''�constant.referredEnumLiteral.name�'''
	def dispatch String mapExpression(PrimitiveLiteralExp constant) '''�constant.name�'''
	def dispatch String mapExpression(StringLiteralExp constant) '''"�constant.stringSymbol�"'''
	def dispatch String mapExpression(TupleLiteralExp constant) '''(* ERROR: Unsupported literal OCL expression '�constant.eClass.name�' *)'''
	def dispatch String mapExpression(CollectionLiteralExp constant) '''(* ERROR: Unchecked literal OCL expression following '�constant.kind.literal�' *)'''

	def dispatch mapType(Type type) '''(* Unknown type '�type.name�' *)'''
	def dispatch mapType(Class cls) '''�cls.package.name�.�cls.name�'''
	def dispatch mapType(PrimitiveType type) {
		switch type.name {
			case 'String' : 'string'
			default: '(* ERROR: Unsupported type in Coq: ' + type.name + ' *)'
		}
	}
	
	def dispatch mapTypeToAllInstancesFunction(Type type) '''(* Cannot compute all instances for type '�type.name�' *)'''
	def dispatch mapTypeToAllInstancesFunction(Class cls) '''(�
		cls.package.name�.AllInstances_�cls.name� �
		cls.package.name.toLowerCase�)'''

	// Map equations in the form "lhsParentObject.lhsFeature = rhsValue" to the Coq equivalent
	def mapFeatureComparison(EStructuralFeature lhsFeature, OCLExpression lhsParentObject, OCLExpression rhsValue) '''(�
		IF lhsFeature.containmentReference || lhsFeature.crossReference��
			// Can be a list N..M with M > 1
			IF lhsFeature.many�In (�
			// Can be an optional type, 0..1. Only for containment references.
			// Cross references are either attributes (always defined as optional in Ecore but not in Coq) or real cross references.
			// Real cross references are always optional in Coq (Some C, (Some C + Some D)), thus an enclosing option would be redundant.
			ELSEIF !lhsFeature.required && (lhsFeature.containmentReference)�Some �ENDIF��
			// Support composed types
			IF lhsFeature instanceof EReference��
			val actualType = rhsValue.type.ETarget��
			val referencedType = (lhsFeature as EReference).EReferenceType��
			val referencedClasses = lhsFeature.allClasses.concreteClasses.filter(e | e == referencedType || e.inherits(referencedType)).toList��
			val inls = (referencedClasses.size - 1 - referencedClasses.indexOf(actualType))��
			val inrs = if (referencedClasses.indexOf(actualType) > 0) 1 else 0��
			/*"(*" + referencedClasses.map[name].join(", ") + "*) "*/��
			(if (inls > 0) (1..inls).map["inl ("].join else "") + (if (inrs > 0) "inr (" else "")��
			// Cross references are in the end always optional
			IF lhsFeature.crossReference
			�Some �
			ENDIF��
			rhsValue.mapExpression��
			(if (inls + inrs > 0) (1..(inls + inrs)).map[')'].join)��
			ELSE /* lhsFeature instanceof EAttribute */��
			rhsValue.mapExpression��
			ENDIF��
			IF lhsFeature.many�) �ELSE� = �ENDIF��
			IF lhsFeature.containmentReference || lhsFeature instanceof EAttribute��
			�(�lhsFeature.package.name�.Project_�(lhsParentObject.type as Class).name�_�lhsFeature.name� �lhsParentObject.mapExpression�)�
			ELSE��
			�(�lhsFeature.package.name�.Dereference_�(lhsParentObject.type as Class).name�_�lhsFeature.name� �lhsFeature.package.name.toLowerCase� �lhsParentObject.mapExpression�)�
			ENDIF��
		ELSEIF lhsFeature.oppositeContainmentReference��
			// TODO: Support composed types
			// Is always exactly one optional element
			�Some �
			rhsValue.mapExpression� = �
			�(�lhsFeature.package.name�.Dereference_�(lhsParentObject.type as Class).name�_�lhsFeature.name� �lhsFeature.package.name.toLowerCase� �lhsParentObject.mapExpression�)�
		ELSEIF lhsFeature.oppositeCrossReference��
			// TODO: Support composed types
			IF lhsFeature.many�In �rhsValue.mapExpression� �ELSE��rhsValue.mapExpression� = �ENDIF��
			�(�lhsFeature.package.name�.Dereference_�(lhsParentObject.type as Class).name�_�lhsFeature.name� �lhsFeature.package.name.toLowerCase� �lhsParentObject.mapExpression�)�
		ELSE�(* ERROR: Reference '�lhsFeature.name�' is of unsupported type *)�
		ENDIF
	�)'''

	// Relations a relation depends upon to be triggered (as defined in section 'when')
	def List<Relation> whenRelations(Relation relation) { 
		relation?.when
			?.predicate?.filter(Predicate)
			?.map[conditionExpression]
			?.filter(RelationCallExp)
			?.map[referredRelation]
			?.toList ?: emptyList
	}
	// Relations a relation calls (as defined in section 'where')
	def List<Relation> whereRelations(Relation relation) { 
		relation?.where
			?.predicate?.filter(Predicate)
			?.map[conditionExpression]
			?.filter(RelationCallExp)
			?.map[referredRelation]
			?.toList ?: emptyList
	}
	// OCL constraints a relation requires to be true to be triggered
	def List<OCLExpression> whenConstraints(Relation relation) {
		relation?.when
			?.predicate?.filter(Predicate)
			?.map[conditionExpression]
			?.toList ?: emptyList
	}
	// OCL constraints a relation enforces if triggered
	def List<OCLExpression> whereConstraints(Relation relation) {
		relation?.where
			?.predicate?.filter(Predicate)
			?.map[conditionExpression]
			?.toList ?: emptyList
	}

	// Render all variables defined within this pattern, e.g.
	// <code>
	// checkonly domain source s : Persons::Root {
	//   persons = sourcePerson : Persons::Person { }
	// };
	// </code>
	// would result in variables "s" : Persons::Root, "sourcePerson" : Persons::Person
	def getSourceBoundVariables(Relation relation) { 
		relation?.domain
			?.filter(RelationDomain)
			?.filter[isCheckable]
			?.map[pattern]
			?.map[templateExpression]
			?.map[referredVariables]
			?.flatten
			?.toSet ?: emptySet

	}
	def getTargetBoundVariables(Relation relation) { 
		relation?.domain
			?.filter(RelationDomain)
			?.filter[isEnforceable]
			?.map[pattern]
			?.map[templateExpression]
			?.map[referredVariables]
			?.flatten
			?.toSet ?: emptySet
	}
	
	// Render only the root variables of source/target domains, e.g.
	// <code>
	// checkonly domain source s : Persons::Root {
	//   persons = sourcePerson : Persons::Person { }
	// };
	// </code>
	// would result in variable "s" : Persons::Root
	def getSourceRootVariables(Relation relation) { 
		relation?.domain
			?.filter(RelationDomain)
			?.filter[isCheckable]
			?.map[rootVariable]
			?.toList ?: emptyList
	}
	def getTargetRootVariables(Relation relation) { 
		relation?.domain
			?.filter(RelationDomain)
			?.filter[isEnforceable]
			?.map[rootVariable]
			?.toList ?: emptyList
	}
	def getRootVariables(Relation relation) { 
		relation?.domain
			?.filter(RelationDomain)
			?.map[rootVariable]
			?.toList ?: emptyList
	}

	// Collect all variables used in an OCL expression
	def dispatch Set<Variable> getReferredVariables(OCLExpression exp) { 
		(#{exp} + exp?.eAllContents.toIterable)
			?.filter(VariableExp)
			?.map[referredVariable]
			?.filter(Variable)
			?.toSet ?: emptySet
	}
	// Collect directly bound variable and all variables referred to by template expressions in sub patterns
	def dispatch Set<Variable> getReferredVariables(ObjectTemplateExp exp) { 
		(#{exp.bindsTo} + 
			(exp?.part
				?.map[value]
				?.map[getReferredVariables]
				?.flatten
				?.toSet ?: emptySet
			)
		).toSet
	}
	def dispatch Set<Variable> getReferredVariables(CollectionTemplateExp exp) { 
		(#{exp.bindsTo} + 
			(exp?.member
				?.map[getReferredVariables]
				?.flatten
				?.toSet ?: emptySet
			)
		).toSet
	}

	// Return all template expressions in the source domains.
	// @return:	Returns a list of <code>PropertyTemplateItems</code> 
	// 			with <code>referredProperty</code>'s <code>name</code> and <code>target</code>, 
	// 			and the OCL expression <code>value</code> to be assigned
	def getSourceTemplateItems(Relation relation) { 
		relation?.domain
			?.filter(RelationDomain)
			?.filter[isCheckable]
			?.map[pattern]
			?.map[templateExpression]
			// Collect all template expressions part of this domain
			?.map[eAllContents.toIterable]?.flatten 
			?.filter(PropertyTemplateItem)
			?.toList ?: emptyList
	}
	def getTargetTemplateItems(Relation relation) { 
		relation?.domain
			?.filter(RelationDomain)
			?.filter[isEnforceable]
			?.map[pattern]
			?.map[templateExpression]
			// Collect all template expressions part of this domain
			?.map[eAllContents.toIterable]?.flatten 
			?.filter(PropertyTemplateItem)
			?.toList ?: emptyList
	}

	// Create a list of sets of relations, so that cyclic dependent relations are grouped into a set.
	// We use Tarjan's Strongly Connected Components Algorithm to produce for a DAG sets of cyclic vertices.
	// As a side effect, sets happen to be in reverse topological order. That is exactly what we need.
	// @see http://en.wikipedia.org/wiki/Tarjan%27s_strongly_connected_components_algorithm
	def List<Iterable<Relation>> sortByDependencies(Iterable<Relation> relations) {
		var indexDictionary = new HashMap<Relation, Integer>
		var lowlinkDictionary = new HashMap<Relation, Integer>
		var stack = new Stack<Relation>
		var result = new ArrayList<Iterable<Relation>>
		for (relation : relations)
			if (indexDictionary.get(relation) == null) relation.stronglyConnect(indexDictionary, lowlinkDictionary, stack, result)
		result
	}
	def void stronglyConnect(Relation relation, 
		HashMap<Relation,Integer> indexDictionary, 
		HashMap<Relation,Integer> lowlinkDictionary, 
		Stack<Relation> stack, 
		ArrayList<Iterable<Relation>> result
	) {
		// Set the depth index for this vertex to the smallest unused index
		val index = if (indexDictionary.empty) 0 else Collections.max(indexDictionary.values) + 1 
		indexDictionary.put(relation, index)
		lowlinkDictionary.put(relation, index)
		stack.push(relation)
		// Consider successors of this vertex
		for (relation2 : relation.whenRelations + relation.whereRelations) {
			if (indexDictionary.get(relation2) == null) {
				// Successor has not yet been visited; recurse on it
				relation2.stronglyConnect(indexDictionary, lowlinkDictionary, stack, result)
				lowlinkDictionary.put(relation, 
					Collections.min(#{lowlinkDictionary.get(relation), lowlinkDictionary.get(relation2)})
				)
			} else if (stack.contains(relation2)) {
				// Successor is in stack and hence in the current SCC
				lowlinkDictionary.put(relation, 
					Collections.min(#{lowlinkDictionary.get(relation), indexDictionary.get(relation2)})
				)
			}
		}
		// If v is a root node, pop the stack and generate an SCC
		if (lowlinkDictionary.get(relation) == indexDictionary.get(relation)) {
			// Start a new strongly connected component
			var component = new HashSet<Relation>
			var Relation relation2 = null
			do {
				relation2 = stack.pop()
				// Add to current strongly connected component
				component += relation2
			} while (relation2 != relation)
			// Output the current strongly connected component
			result += component
		}
	}

	// On any element contained in a transformation, find the containing transformation object
	def RelationalTransformation getTransformation(EObject object) {
		if (object instanceof RelationalTransformation) (object as RelationalTransformation) else object.eContainer.getTransformation
	}
}
