package dk.sdu.mmmi.mdsd.generator

import dk.sdu.mmmi.mdsd.iF22.And
import dk.sdu.mmmi.mdsd.iF22.Or
import dk.sdu.mmmi.mdsd.iF22.Concatenation
import dk.sdu.mmmi.mdsd.iF22.Parenthesis
import dk.sdu.mmmi.mdsd.iF22.Not
import dk.sdu.mmmi.mdsd.iF22.VarRef
import dk.sdu.mmmi.mdsd.iF22.Equals
import dk.sdu.mmmi.mdsd.iF22.NotEquals
import dk.sdu.mmmi.mdsd.iF22.LessThan
import dk.sdu.mmmi.mdsd.iF22.GreaterThan
import dk.sdu.mmmi.mdsd.iF22.LessThanOrEquals
import dk.sdu.mmmi.mdsd.iF22.GreaterThanOrEquals
import dk.sdu.mmmi.mdsd.iF22.Add
import dk.sdu.mmmi.mdsd.iF22.Sub
import dk.sdu.mmmi.mdsd.iF22.Mul
import dk.sdu.mmmi.mdsd.iF22.Div
import dk.sdu.mmmi.mdsd.iF22.Exp
import dk.sdu.mmmi.mdsd.iF22.BoolConstant
import dk.sdu.mmmi.mdsd.iF22.True
import dk.sdu.mmmi.mdsd.iF22.FunctionCall
import dk.sdu.mmmi.mdsd.iF22.Keyword
import dk.sdu.mmmi.mdsd.iF22.Constant
import dk.sdu.mmmi.mdsd.iF22.IntConstant
import dk.sdu.mmmi.mdsd.iF22.StringConstant
import dk.sdu.mmmi.mdsd.iF22.This
import dk.sdu.mmmi.mdsd.iF22.IntType
import dk.sdu.mmmi.mdsd.iF22.StringType
import dk.sdu.mmmi.mdsd.iF22.BooleanType

class ExpParser {
	
	static def dispatch parse(Exp exp) {
		exp.parse
	}
	
	static def dispatch parse(And exp) {
		'''«exp.left.parse» && «exp.right.parse»'''
	}
	
	static def dispatch parse(Or exp) {
		'''«exp.left.parse» || «exp.right.parse»'''
	}
	
	static def dispatch parse(Equals exp) {
		'''«exp.left.parse» == «exp.right.parse»'''
	}
	
	static def dispatch parse(NotEquals exp) {
		'''«exp.left.parse» != «exp.right.parse»'''
	}
	
	static def dispatch parse(LessThan exp) {
		'''«exp.left.parse» < «exp.right.parse»'''
	}
	
	static def dispatch parse(GreaterThan exp) {
		'''«exp.left.parse» > «exp.right.parse»'''
	}
	
	static def dispatch parse(LessThanOrEquals exp) {
		'''«exp.left.parse» <= «exp.right.parse»'''
	}
	
	static def dispatch parse(GreaterThanOrEquals exp) {
		'''«exp.left.parse» >= «exp.right.parse»'''
	}
	
	static def dispatch parse(Concatenation exp) {
		'''«exp.left.parse» + «exp.right.parse»'''
	}
	
	static def dispatch parse(Add exp) {
		'''«exp.left.parse» + «exp.right.parse»'''
	}
	
	static def dispatch parse(Sub exp) {
		'''«exp.left.parse» - «exp.right.parse»'''
	}
	
	static def dispatch parse(Mul exp) {
		'''«exp.left.parse» * «exp.right.parse»'''
	}
	
	static def dispatch parse(Div exp) {
		'''«exp.left.parse» / «exp.right.parse»'''
	}
	
	static def dispatch parse(Parenthesis exp) {
		'''(«exp.body.parse»)'''
	}
	
	static def dispatch parse(Not exp) {
		'''!«exp.body.parse»'''
	}
	
	static def dispatch parse(Constant exp) {
		if (exp instanceof BoolConstant) {
			if (exp instanceof True) {
				'''true'''
			}
			else {
				'''false'''
			}
		}
		else if (exp instanceof IntConstant) {
			'''«exp.value»'''
		}
		else if (exp instanceof StringConstant) {
			'''«exp.value»'''
		}
	}
	
	static def dispatch parse(Keyword exp) {
		if (exp instanceof This) {
			'''this'''
		}
		else if (exp instanceof IntType) {
			'''int'''
		}
		else if (exp instanceof StringType) {
			'''String'''
		}
		else if (exp instanceof BooleanType) {
			'''boolean'''
		}
	}
	
	static def dispatch parse(VarRef exp) {
		'''«exp.variable.name»'''
	}
	
	static def dispatch parse(FunctionCall exp) {
		'''external.«exp.function.name»(«FOR ep : exp.arguments SEPARATOR ", "»«ep.parse»«ENDFOR»)'''
	}
}