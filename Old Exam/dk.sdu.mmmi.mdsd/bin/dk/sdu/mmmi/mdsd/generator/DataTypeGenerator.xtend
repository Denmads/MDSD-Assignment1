package dk.sdu.mmmi.mdsd.generator

import dk.sdu.mmmi.mdsd.x21.DataDecl
import dk.sdu.mmmi.mdsd.x21.DataVariable
import static extension dk.sdu.mmmi.mdsd.generator.Utility.*;

class DataTypeGenerator {
	
	int counter = 0
	String currentClass = ""
	DataDecl declaration = null
	
	def setDeclaration(DataDecl decl) {
		declaration = decl
		currentClass = '''Data«decl.name.toFirstUpper»'''
	}
	
	def String genJavaCode(String packageName) {
		var code = '''
		package «packageName»;
		public class «currentClass» {
			«genConstructors»
			«FOR variable : declaration.variables»
				«genGetterAndSetter(variable)»
			«ENDFOR»
			«genToStringFunc»
			«genHashCodeFunc»
			«genEqualsFunc»
		}
		'''
		
		counter += 1
		return code
	}
	
	def genConstructors() {
		'''
		public «currentClass»() {}
		public «currentClass»(«genConstructorArgs») {
			«FOR variable : declaration.variables»
				this.«variable.name.memberName» = «variable.name.memberName»;
			«ENDFOR»
		}
		'''
	}
	
	def genConstructorArgs() {
		'''
		«FOR variable : declaration.variables SEPARATOR "," AFTER ""»«Utility.getJavaType(variable.type)» «variable.name.memberName»«ENDFOR»
		'''
	}
	
	def genGetterAndSetter(DataVariable dvar) {
		'''
		private «Utility.getJavaType(dvar.type)» «dvar.name.memberName»;
		public «Utility.getJavaType(dvar.type)» get«dvar.name.toFirstUpper»() { return «dvar.name.memberName»; }
		public «currentClass» set«dvar.name.toFirstUpper»(«Utility.getJavaType(dvar.type)» value) { «dvar.name.memberName» = value; return this; }
		'''
	}
	
	def genToStringFunc() {
		'''
		public String toString() {
			return "DATA:«declaration.name»["«FOR variable : declaration.variables SEPARATOR '","'»+«variable.name.memberName»+«ENDFOR»"]";
		}
		'''
	}
	
	def genHashCodeFunc() {
		'''
		public int hashCode() {
			int result = «counter»*2+1;
			«FOR variable : declaration.variables»
				result += «variable.name.memberName».hashCode();
			«ENDFOR»
			return result;
		}
		'''
	}
	
	def genEqualsFunc() {
		'''
		public boolean euqals(Object other) {
			if (other== null || !(other instanceof «currentClass»)) return false;
			«currentClass» object = («currentClass»)other;
			«FOR variable : declaration.variables»
				if («variable.name.memberName»==null && object.«variable.name.memberName»!=null) return false;
				if («variable.name.memberName»!=null && !«variable.name.memberName».equals(object.«variable.name.memberName»)) return false;
			«ENDFOR»
			return true;
		}
		'''
	}
	
	
}