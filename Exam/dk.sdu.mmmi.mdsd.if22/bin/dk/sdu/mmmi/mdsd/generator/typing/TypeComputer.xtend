package dk.sdu.mmmi.mdsd.generator.typing

import static extension dk.sdu.mmmi.mdsd.generator.Util.*;

import dk.sdu.mmmi.mdsd.iF22.Exp
import dk.sdu.mmmi.mdsd.iF22.IntConstant
import dk.sdu.mmmi.mdsd.iF22.StringConstant
import dk.sdu.mmmi.mdsd.iF22.BoolConstant
import dk.sdu.mmmi.mdsd.iF22.Not
import dk.sdu.mmmi.mdsd.iF22.Type
import dk.sdu.mmmi.mdsd.iF22.IntType
import dk.sdu.mmmi.mdsd.iF22.StringType
import dk.sdu.mmmi.mdsd.iF22.BooleanType
import dk.sdu.mmmi.mdsd.iF22.This
import org.eclipse.xtext.EcoreUtil2
import dk.sdu.mmmi.mdsd.iF22.Question
import dk.sdu.mmmi.mdsd.iF22.FunctionCall
import dk.sdu.mmmi.mdsd.iF22.VarRef
import dk.sdu.mmmi.mdsd.iF22.Parenthesis
import dk.sdu.mmmi.mdsd.iF22.MulDiv
import dk.sdu.mmmi.mdsd.iF22.Sub
import dk.sdu.mmmi.mdsd.iF22.Concatenation
import dk.sdu.mmmi.mdsd.iF22.LessGreaterThan
import dk.sdu.mmmi.mdsd.iF22.Equality
import dk.sdu.mmmi.mdsd.iF22.BooleanOperation
import dk.sdu.mmmi.mdsd.iF22.AddSub

class TypeComputer {
	public static val INT_TYPE = new IntExpType
	public static val STRING_TYPE = new StringExpType
	public static val BOOL_TYPE = new BooleanExpType
	
	def isIntType(ExpType type) {
		return type == INT_TYPE
	}
	
	def isStringType(ExpType type) {
		return type == STRING_TYPE
	}
	
	def isBoolType(ExpType type) {
		return type == BOOL_TYPE
	}
	
	def toExpType(Type type) {
		if (type instanceof IntType) {
			INT_TYPE
		}
		else if (type instanceof StringType) {
			STRING_TYPE
		}
		else if (type instanceof BooleanType) {
			BOOL_TYPE
		}
	}
	
	def ExpType typeFor(Exp exp) {
		if (exp instanceof IntConstant) {
			return INT_TYPE
		}
		else if (exp instanceof StringConstant) {
			return STRING_TYPE
		}
		else if (exp instanceof BoolConstant) {
			return BOOL_TYPE
		}
		else if (exp instanceof Not) {
			return BOOL_TYPE
		}
		else if (exp instanceof This) {
			return EcoreUtil2.getContainerOfType(exp, Question).returnTypeOfQuestion.toExpType
		}
		else if (exp instanceof FunctionCall) {
			return exp.function.returnType.toExpType
		}
		else if (exp instanceof Type) {
			return exp.toExpType
		}
		else if (exp instanceof VarRef) {
			return exp.variable.type.toExpType
		}
		else if (exp instanceof Parenthesis) {
			return exp.body.typeFor
		}
		else if (exp instanceof MulDiv) {
			return INT_TYPE
		}
		else if (exp instanceof AddSub) {
			return INT_TYPE
		}
		else if (exp instanceof Concatenation) {
			return STRING_TYPE
		}
		else if (exp instanceof LessGreaterThan) {
			return BOOL_TYPE
		}
		else if (exp instanceof Equality) {
			return BOOL_TYPE
		}
		else if (exp instanceof BooleanOperation) {
			return BOOL_TYPE
		}
	}
}