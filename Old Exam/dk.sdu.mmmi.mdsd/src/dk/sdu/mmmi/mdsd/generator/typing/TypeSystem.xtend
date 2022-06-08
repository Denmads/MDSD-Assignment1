package dk.sdu.mmmi.mdsd.generator.typing

import dk.sdu.mmmi.mdsd.x21.Exp
import dk.sdu.mmmi.mdsd.x21.Plus
import dk.sdu.mmmi.mdsd.x21.Minus
import dk.sdu.mmmi.mdsd.x21.Mul
import dk.sdu.mmmi.mdsd.x21.Div
import dk.sdu.mmmi.mdsd.x21.Int
import dk.sdu.mmmi.mdsd.x21.Parenthesis
import dk.sdu.mmmi.mdsd.x21.LetStatement
import dk.sdu.mmmi.mdsd.x21.DataAccess
import dk.sdu.mmmi.mdsd.x21.None
import dk.sdu.mmmi.mdsd.x21.IfStatement
import dk.sdu.mmmi.mdsd.x21.NewStatement
import dk.sdu.mmmi.mdsd.x21.LogicExp
import dk.sdu.mmmi.mdsd.x21.MulDiv
import dk.sdu.mmmi.mdsd.x21.Equals
import dk.sdu.mmmi.mdsd.x21.Parameter
import dk.sdu.mmmi.mdsd.x21.Type
import dk.sdu.mmmi.mdsd.x21.IntType
import dk.sdu.mmmi.mdsd.x21.StringType
import dk.sdu.mmmi.mdsd.x21.CustomType
import dk.sdu.mmmi.mdsd.x21.Lambda

class TypeSystem {
	
	public static val INT_TYPE = new IntExpType()
	public static val STRING_TYPE = new StringExpType()
	public static val CUSTOM_TYPE = new CustomExpType()
	
	def isIntType(ExpressionType type) {
		type === INT_TYPE
	}
	
	def isStringType(ExpressionType type) {
		type === STRING_TYPE
	}
	
	def isCustomType(ExpressionType type) {
		type === CUSTOM_TYPE
	}
	
	def dispatch typeFor(LogicExp exp) {
		switch exp {
			Int: INT_TYPE,
			NewStatement: CUSTOM_TYPE,
			LetStatement: INT_TYPE,
			MulDiv: INT_TYPE,
			Minus: INT_TYPE,
			Plus: INT_TYPE
		}
	}
	
	def dispatch typeFor(DataAccess da) {
		switch da.ref {
			Parameter: (da.ref as Parameter).type.convert_type,
			LetStatement: (da.ref as LetStatement).value.typeFor,
			Lambda: (da.ref as Lambda).type.convert_type
		}
	}
	
	def convert_type(Type type) {
		switch type {
			IntType: INT_TYPE,
			StringType: STRING_TYPE,
			CustomType: CUSTOM_TYPE
		}
	}
}