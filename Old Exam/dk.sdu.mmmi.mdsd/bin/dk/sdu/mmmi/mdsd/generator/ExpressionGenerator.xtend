package dk.sdu.mmmi.mdsd.generator

import dk.sdu.mmmi.mdsd.x21.Exp
import dk.sdu.mmmi.mdsd.x21.LetStatement
import java.util.Map
import dk.sdu.mmmi.mdsd.x21.Plus
import dk.sdu.mmmi.mdsd.x21.Minus
import dk.sdu.mmmi.mdsd.x21.Mul
import dk.sdu.mmmi.mdsd.x21.Div
import dk.sdu.mmmi.mdsd.x21.Int
import dk.sdu.mmmi.mdsd.x21.Parenthesis
import dk.sdu.mmmi.mdsd.x21.DataAccess
import dk.sdu.mmmi.mdsd.x21.None
import dk.sdu.mmmi.mdsd.x21.IfStatement
import dk.sdu.mmmi.mdsd.x21.NewStatement
import dk.sdu.mmmi.mdsd.x21.LogicExp
import dk.sdu.mmmi.mdsd.x21.Equals
import dk.sdu.mmmi.mdsd.x21.LessThan
import dk.sdu.mmmi.mdsd.x21.GreaterThan
import dk.sdu.mmmi.mdsd.x21.LessThanOrEquals
import dk.sdu.mmmi.mdsd.x21.GreaterThanOrEquals
import dk.sdu.mmmi.mdsd.x21.Parameter
import dk.sdu.mmmi.mdsd.x21.Lambda
import static extension dk.sdu.mmmi.mdsd.generator.Utility.*;

class ExpressionGenerator {
	
	Exp exp
	
	int letStatementCount = 0
	Map<LetStatement, String> letStatementNames = newHashMap
	
	new(Exp exp) {
		this.exp = exp
		
		for (stmt : exp.eContainer.eAllContents.filter(LetStatement).toIterable) {
			letStatementNames.put(stmt, "let" + letStatementCount)
			letStatementCount++
		}
	}
	
	def genExpCode() {
		return exp.genCode
	}
	
	def genLetCode() {
		'''
		«FOR entry : letStatementNames.entrySet»
			private int «entry.value»(int _«entry.key.name») {
				return «entry.key.body.genCode»;
			}
		«ENDFOR»
		'''
	}
	
	private def dispatch genCode(Plus exp) {
		'''«exp.left.genCode»+«exp.right.genCode»'''
	}
	
	private def dispatch genCode(Minus exp) {
		'''«exp.left.genCode»-«exp.right.genCode»'''
	}
	
	private def dispatch genCode(Mul exp) {
		'''«exp.left.genCode»*«exp.right.genCode»'''
	}
	
	private def dispatch genCode(Div exp) {
		'''«exp.left.genCode»/«exp.right.genCode»'''
	}
	
	private def dispatch genCode(Int exp) {
		'''«exp.value»'''
	}
	
	private def dispatch genCode(Parenthesis exp) {
		'''(«exp.body.genCode»)'''
	}
	
	private def dispatch genCode(LetStatement exp) {
		exp.genLetStatementCode
	}
	
	private def dispatch genCode(DataAccess exp) {
		exp.genDataAccessCode
	}
	
	private def dispatch genCode(None exp) {
		'''null'''
	}
	
	private def dispatch genCode(IfStatement exp) {
		'''«exp.condition.genConditionCode»?«exp.trueExp.genCode»:«exp.falseExp.genCode»'''
	}
	
	private def dispatch genCode(NewStatement exp) {
		exp.genNewStatementCode
	}
	
	private def dispatch genConditionCode(Equals exp) {
		'''«exp.left.genCode».equals(«exp.right.genCode»)'''
	}
	
	private def dispatch genConditionCode(LessThan exp) {
		'''«exp.left.genCode»<«exp.right.genCode»'''
	}
	
	private def dispatch genConditionCode(LessThanOrEquals exp) {
		'''«exp.left.genCode»<=«exp.right.genCode»'''
	}
	
	private def dispatch genConditionCode(GreaterThan exp) {
		'''«exp.left.genCode»>«exp.right.genCode»'''
	}
	
	private def dispatch genConditionCode(GreaterThanOrEquals exp) {
		'''«exp.left.genCode»>=«exp.right.genCode»'''
	}
	
	private def genLetStatementCode(LetStatement stmt) {
		'''«letStatementNames.get(stmt)»(«stmt.value.genCode»)'''
		
	}
	
	private def String genDataAccessCode(DataAccess access) {
		'''_«access.ref.dataAccessName»«IF access.varRefs.size > 0»«FOR varRef : access.varRefs».get«varRef.name.toFirstUpper»()«ENDFOR»«ENDIF»'''
	}
	
	private def dispatch dataAccessName(Parameter access) {
		access.name
	}
	
	private def dispatch dataAccessName(Lambda access) {
		access.name
	}
	
	private def dispatch dataAccessName(LetStatement access) {
		access.name
	}
	
	private def genNewStatementCode(NewStatement stmt) {
		'''new Data«stmt.type.name.toFirstUpper»()«FOR variable : stmt.variables».set«variable.variable.name.toFirstUpper»(«variable.value.genCode»)«ENDFOR»'''	
	}
	
}