package dk.sdu.mmmi.mdsd.generator

import dk.sdu.mmmi.mdsd.x21.X21
import dk.sdu.mmmi.mdsd.x21.Function
import static extension dk.sdu.mmmi.mdsd.generator.Utility.*;
import dk.sdu.mmmi.mdsd.x21.Parameter
import dk.sdu.mmmi.mdsd.x21.Input
import dk.sdu.mmmi.mdsd.x21.Node
import dk.sdu.mmmi.mdsd.x21.Output
import org.eclipse.emf.ecore.EObject
import java.util.Map
import dk.sdu.mmmi.mdsd.x21.AnonymousElement

class MainFileGenerator {
	
	String packageName
	String className
	X21 program
	
	Map anonymousNodes = newHashMap
	int anonymousNodeCounter = 0
	
	new(String packageName, String className, X21 program) {
		this.program = program
		this.packageName = packageName
		this.className = className
	}
	
	def genJavaCode() {
		'''
		package «packageName»;
		import libx21.*;
		import java.util.function.Function;
		import java.util.List;
		public class «className» extends GenericMainX21 {
			«FOR parameter : program.declarations.filter(Parameter)»
				«parameter.genCode»
			«ENDFOR»
			«FOR function : program.declarations.filter(Function)»
				«function.genCode»
			«ENDFOR»
			«FOR input : program.declarations.filter(Input)»
				«input.genCode»
			«ENDFOR»
			«FOR node : program.eAllContents.filter[it instanceof Node || it instanceof AnonymousElement].toIterable»
				«node.genCode»
			«ENDFOR»
			///
			/// Output nodes
			///
			«FOR output : program.eAllContents.filter(Output).toIterable»
				«output.genCode»
			«ENDFOR»
			///
			/// Initialization of specific nodes
			///
			protected void initializeNodes() {
				«FOR n : program.eAllContents.filter[it instanceof Input || it instanceof Node].toIterable»
					super.addNode(node_«n.toName»)
				«ENDFOR»
			}
			««« Initialize network
		}
		'''
	}
	
	def dispatch genCode(Parameter param) {
		'''
		///
		/// Code for paramter «param.name»
		///
		private «param.type.javaType» «param.name.memberName»;
		public void setParameter«param.name.toFirstUpper»(«param.type.javaType» value) {
			«param.name.memberName» = value;
		}
		'''
	}
	
	def dispatch genCode(Function func) {
		'''
		///
		/// Code for function «func.name»
		///
		private Object fun_«func.name»(Object arg) {
			return funimpl_«func.name»((«func.body.type.javaType»)arg);
		}
		private Object funimpl_«func.name»(«func.body.type.javaType» _«func.body.name») { return ???; }
		'''
	}
	
	def dispatch genCode(Input input) {
		'''
		///
		/// Code for input «input.name»
		///
		private ComputeNode<Object, Object> node_«input.name» = new InputNode<Object>();
		public void input«input.name.toFirstUpper»(«input.type.javaType» input) {
			node_«input.name».put(input);
		}
		'''
	}
	
	def dispatch genCode(Node node) {
		'''
		///
		/// Code for node «node.name»
		///
		private ComputeNode<Object, Object> node_«node.name» = new AbstractComputeNode<Object, Object>() {
			protected Object function(Object input) {
				return ???;
			}
		}
		'''
	}
	
	def dispatch genCode(AnonymousElement node) {
		anonymousNodes.put(node, anonymousNodeCounter)
		var code = '''
		///
		/// Code for node «anonymousNodeCounter»
		///
		private ComputeNode<Object, Object> node_«anonymousNodeCounter» = new AbstractComputeNode<Object, Object>() {
			protected Object function(Object input) {
				return ???;
			}
		}
		'''
		anonymousNodeCounter += 1
		return code
	}
	
	def dispatch genCode(Output output) {
		'''
		private OutputNode<Object> node_«output.name» = new OutputNode<Object>();
		public List<Object> get«output.name.toFirstUpper»() { return node_«output.name».getData(); }
		'''
	}
	
	def toName(EObject obj) {
		switch obj {
			Input: obj.name,
			Node: obj.name
		}
	}
}