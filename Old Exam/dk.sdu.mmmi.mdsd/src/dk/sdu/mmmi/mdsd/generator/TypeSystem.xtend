package dk.sdu.mmmi.mdsd.generator

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

class TypeSystem {
	
	//types: int, string, custom, none, undefined
	
	// int + int = int
	// int + string = string
	// else undefined
	def static dispatch resolveType(Plus exp) {
		
	}
	
	// int - int = int
	// else undefined
	def static dispatch resolveType(Minus exp) {
		
	}
	
	// int * int = int
	// else undefined
	def static dispatch resolveType(Mul exp) {
		
	}
	
	// int / int = int
	// else undefined
	def static dispatch resolveType(Div exp) {
		
	}
	
	def static dispatch resolveType(Int exp) {
		"Integer"
	}
	
	def static dispatch resolveType(Parenthesis exp) {
		exp.body.resolveType
	}
	
	def static dispatch resolveType(LetStatement exp) {
		exp.body.resolveType
	}
	
	def static dispatch resolveType(DataAccess exp) {
		
	}
	
	def static dispatch resolveType(None exp) {
		"None"
	}
	
	def static dispatch resolveType(IfStatement exp) {
		
	}
	
	def static dispatch resolveType(NewStatement exp) {
		
	}
}