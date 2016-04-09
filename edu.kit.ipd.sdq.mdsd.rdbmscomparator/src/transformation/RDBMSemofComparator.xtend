package transformation

import org.eclipse.emf.ecore.EObject
import java.util.Map
import org.eclipse.emf.mwe.core.issues.Issues
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory

/**
 * Analyzes two RDBMS.emof models (the variant from the ModelMorf example) for differences.
 * This is realized by a recursive decent on the containment tree. Differences are output as strings.
 * * We assume that names are unique IDs, so we must not check for duplicates.
 * * We assume that opposite references are consistent (for each reference there is exactly one reverse reference), 
 *   so we must not check opposite references as long as the forward references have a match.
 * 
 * @author Andreas Rentschler
 * @date 2015-12-26
 */
class RDBMSemofComparator {
	private val output = new StringBuffer()
	private var Issues issues = null
	private var differences = 0
	private Log log = LogFactory.getLog(getClass())
	 
	def transform(EObject input1, EObject input2, Map<String, String> config, Issues issues) {
		this.issues = issues
		log("Comparing " + input1.eResource.URI.segments.last + " and " + input2.eResource.URI.segments.last)
		if (input1 instanceof rdbmsMM.dummy && input2 instanceof rdbmsMM.dummy) {
			compareDummy2Dummy(input1 as rdbmsMM.dummy, input2 as rdbmsMM.dummy)
		} else if (input1 instanceof rdbmsMM.dummy && ((input1 as rdbmsMM.dummy).containsSchema.length == 1) && input2 instanceof rdbmsMM.Schema) {
			log("WARNING: Root element is of type dummy only on left-hand side, delegating to single contained schema in list dummy.containsSchema!")
			compareSchema2Schema((input1 as rdbmsMM.dummy).containsSchema.get(0), input2 as rdbmsMM.Schema)
		} else if (input2 instanceof rdbmsMM.dummy && ((input2 as rdbmsMM.dummy).containsSchema.length == 1) && input1 instanceof rdbmsMM.Schema) {
			log("WARNING: Root element is of type dummy only on right-hand side, delegating to single contained schema in list dummy.containsSchema!")
			compareSchema2Schema(input1 as rdbmsMM.Schema, (input2 as rdbmsMM.dummy).containsSchema.get(0))
		} else {
			logDifference("ERROR: Root element is not of type dummy on both sides!")
		}
		//input1.filter(rdbmsMM.dummy).map[mapRdbms2Dummy]
		if (differences == 0) log("Models are equal.") else log("Found " + differences + " differences.")
		
		output
	}
	
	def compareDummy2Dummy(rdbmsMM.dummy dummy1, rdbmsMM.dummy dummy2) {
		// 1..* Schema
		if (dummy1.containsSchema.length != dummy2.containsSchema.length)
			logDifference("ERROR: Models have different number of dummy.containsSchema: " + dummy1.containsSchema.length + " <> " + dummy2.containsSchema.length)
		for (schema1 : dummy1.containsSchema) {
			val schema2 = dummy2.containsSchema.findFirst[s | s.name.equals(schema1.name)]
			if (schema2 == null)
				logDifference("ERROR: Right-hand side does not contain a dummy.schema with name '" + schema1.name + "'")
			else
				compareSchema2Schema(schema1, schema2)
		}
	}
	
	def compareSchema2Schema(rdbmsMM.Schema schema1, rdbmsMM.Schema schema2) {
		// 1..* Table
		if (schema1.table.length != schema2.table.length)
			logDifference("ERROR: Models have different number of schema.table specified for schema with name '" + schema1.name + "': " + schema1.table.length + " <> " + schema2.table.length)
		for (table1 : schema1.table) {
			val table2 = schema2.table.findFirst[t | t.name.equals(table1.name)]
			if (table2 == null)
				logDifference("ERROR: Right-hand side does not contain a schema.table with name '" + table1.name + "' specified for schema with name '" + schema1.name + "'")
			else
				compareTable2Table(table1, table2)
		}
		// 1..* ForeignKey
		if (schema1.foreignKey.length != schema2.foreignKey.length)
			logDifference("ERROR: Models have different number of schema.foreignKey specified for schema with name '" + schema1.name + "': " + schema1.foreignKey.length + " <> " + schema2.foreignKey.length)
		for (foreignKey1 : schema1.foreignKey) {
			val foreignKey2 = schema2.foreignKey.findFirst[t | t.name.equals(foreignKey1.name)]
			if (foreignKey2 == null)
				logDifference("ERROR: Right-hand side does not contain a schema.foreignKey with name '" + foreignKey1.name + "' specified for schema with name '" + schema1.name + "'")
			else
				compareForeignKey2ForeignKey(foreignKey1, foreignKey2)
		}
	}
	
	def compareTable2Table(rdbmsMM.Table table1, rdbmsMM.Table table2) {
		// 1 hasKey
		if ((table1.hasKey == null && table2.hasKey != null) || (table1.hasKey != null && table2.hasKey == null))
			logDifference("ERROR: One side does not have table.hasKey specified specified for table with name '" + table1.name + "': " + (if (table1.hasKey == null) "null" else table1.hasKey.name) + " <> " + (if (table2.hasKey == null) "null" else table2.hasKey.name))
		if (!table1.hasKey.name.equals(table2.hasKey.name))
			logDifference("ERROR: Sides have different table.hasKey specified specified for table with name '" + table1.name + "': " + table1.hasKey.name + " <> " + table2.hasKey.name)
		// -> 1..* hasForeignKey
		if (table1.hasForeignKey.length != table2.hasForeignKey.length)
			logDifference("ERROR: Models have different number of table.hasForeignKey specified for table with name '" + table1.name + "': " + table1.hasForeignKey.length + " <> " + table2.hasForeignKey.length)
		for (foreignKey1 : table1.hasForeignKey) {
			val foreignKey2 = table2.hasForeignKey.findFirst[f | f.name.equals(foreignKey1.name)]
			if (foreignKey2 == null)
				logDifference("ERROR: Right-hand side does not contain a table.foreignKey with name '" + foreignKey1.name + "' specified for table with name '" + table1.name + "'")
			else
				compareForeignKey2ForeignKey(foreignKey1, foreignKey2)
		}
		// 1..* columns
		if (table1.column.length != table2.column.length)
			logDifference("ERROR: Models have different number of table.column specified for table with name '" + table1.name + "': " + table1.column.length + " <> " + table2.column.length)
		for (column1 : table1.column) {
			val column2 = table2.column.findFirst[c | c.name.equals(column1.name)]
			if (column2 == null)
				logDifference("ERROR: Right-hand side does not contain a table.column with name '" + column1.name + "' specified for table with name '" + table1.name + "'")
			else
				compareColumn2Column(column1, column2)
		}
	}	
		
	def compareColumn2Column(rdbmsMM.Column column1, rdbmsMM.Column column2) {
		// 1 type
		if (!column1.type.equals(column2.type))
			logDifference("ERROR: Sides have different column.type specified for column with name '" + column1.name + "': " + column1.type + " <> " + column2.type)
		// -> 1..* hasKey
		if (column1.hasKey.length != column2.hasKey.length)
			logDifference("ERROR: Models have different number of column.hasKey specified for column with name '" + column1.name + "': " + column1.hasKey.length + " <> " + column2.hasKey.length)
		for (key1 : column1.hasKey) {
			val key2 = column2.hasKey.findFirst[k | k.name.equals(key1.name)]
			if (key2 == null)
				logDifference("ERROR: Right-hand side does not contain a column.hasKey with name '" + key1.name + "' specified for column with name '" + column1.name + "'")
			else
				compareKey2Key(key1, key2)
		}
		// -> 1..* hasForeignKey
		if (column1.hasForeignKey.length != column2.hasForeignKey.length)
			logDifference("ERROR: Models have different number of column.hasForeignKey specified for column with name '" + column1.name + "': " + column1.hasForeignKey.length + " <> " + column2.hasForeignKey.length)
		for (foreignKey1 : column1.hasForeignKey) {
			val foreignKey2 = column2.hasForeignKey.findFirst[k | k.name.equals(foreignKey1.name)]
			if (foreignKey2 == null)
				logDifference("ERROR: Right-hand side does not contain a column.hasForeignKey with name '" + foreignKey1.name + "' specified for column with name '" + column1.name + "'")
			else
				compareForeignKey2ForeignKey(foreignKey1, foreignKey2)
		}
	}	

	def compareKey2Key(rdbmsMM.Key key1, rdbmsMM.Key key2) {
		// all inferred, nothing to check
	}	

	def compareForeignKey2ForeignKey(rdbmsMM.ForeignKey foreignKey1, rdbmsMM.ForeignKey foreignKey2) {
		// -> 1 refersTo
		if ((foreignKey1.refersTo == null && foreignKey2.refersTo != null) || (foreignKey1.refersTo != null && foreignKey2.refersTo == null))
			logDifference("ERROR: One side does not have table.hasKey specified specified for foreignKey with name '" + foreignKey1.name + "': " + (if (foreignKey1.refersTo == null) "null" else foreignKey1.refersTo.name) + " <> " + (if (foreignKey2.refersTo == null) "null" else foreignKey2.refersTo.name))
		if (!foreignKey1.refersTo.name.equals(foreignKey2.refersTo.name))
			logDifference("ERROR: Sides have different table.hasKey specified specified for foreignKey with name '" + foreignKey1.name + "': " + foreignKey1.refersTo.name + " <> " + foreignKey2.refersTo.name)
	}
	
	def log(String s) {
		issues.addInfo(s)
		log.info(s)
		output.append(s + "\n")
	}
	def logDifference(String s) {
		log(s)
		differences++
	}	
}
