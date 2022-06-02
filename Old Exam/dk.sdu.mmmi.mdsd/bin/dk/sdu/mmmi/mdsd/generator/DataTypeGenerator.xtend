package dk.sdu.mmmi.mdsd.generator

import dk.sdu.mmmi.mdsd.x21.DataDecl
import dk.sdu.mmmi.mdsd.x21.DataVariable

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
				this.«variable.javaName» = «variable.javaName»;
			«ENDFOR»
		}
		'''
	}
	
	def genConstructorArgs() {
		'''
		«FOR variable : declaration.variables SEPARATOR "," AFTER ""»«Utility.getJavaType(variable.type)» «variable.javaName»«ENDFOR»
		'''
	}
	
	def genGetterAndSetter(DataVariable dvar) {
		'''
		private «Utility.getJavaType(dvar.type)» «dvar.javaName»;
		public «Utility.getJavaType(dvar.type)» get«dvar.name.toFirstUpper»() { return «dvar.javaName»; }
		public «currentClass» set«dvar.javaName»(«Utility.getJavaType(dvar.type)» value) { «dvar.javaName» = value; return this; }
		'''
	}
	
	def genToStringFunc() {
		'''
		public String toString() {
			return "DATA:«declaration.name»["«FOR variable : declaration.variables SEPARATOR '","'»+«variable.javaName»+«ENDFOR»"]";
		}
		'''
	}
	
	def genHashCodeFunc() {
		'''
		public int hashCode() {
			int result = «counter»*2+1;
			«FOR variable : declaration.variables»
				result += «variable.javaName».hashCode();
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
				if («variable.javaName»==null && object.«variable.javaName»!=null) return false;
				if («variable.javaName»!=null && !«variable.javaName».equals(object.«variable.javaName»)) return false;
			«ENDFOR»
			return true;
		}
		'''
	}
	
	def String javaName(DataVariable dvar) {
		'''_«dvar.name»'''
	}
}