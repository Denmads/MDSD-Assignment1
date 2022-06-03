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
import dk.sdu.mmmi.mdsd.x21.Stream
import dk.sdu.mmmi.mdsd.x21.NodeOrInput
import dk.sdu.mmmi.mdsd.x21.Element
import dk.sdu.mmmi.mdsd.x21.NodeRef
import java.util.List
import dk.sdu.mmmi.mdsd.x21.FunctionReference
import dk.sdu.mmmi.mdsd.x21.Lambda

class MainFileGenerator {
	
	String packageName
	String className
	X21 program
	
	List<ExpressionGenerator> expressionGens = newArrayList
	
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
			«genLetMethods»
			«genInitializeNodesFunc»
			«genInitializeNetworkFunc»
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
		var expGen = new ExpressionGenerator(func.body.logic)
		expressionGens.add(expGen)
		'''
		///
		/// Code for function «func.name»
		///
		private Object fun_«func.name»(Object arg) {
			return funimpl_«func.name»((«func.body.type.javaType»)arg);
		}
		private Object funimpl_«func.name»(«func.body.type.javaType» _«func.body.name») { return «expGen.genExpCode»; }
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
				«node.body.genNodeLogic»
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
				«node.body.genNodeLogic»
			}
		}
		'''
		anonymousNodeCounter += 1
		return code
	}
	
	def dispatch genNodeLogic(FunctionReference funcRef) {
		'''return fun_«funcRef.ref.name»(input);'''
	}
	
	def dispatch genNodeLogic(Lambda lambda) {
		var expGen = new ExpressionGenerator(lambda.logic)
		expressionGens.add(expGen)
		'''
		Function<«lambda.type.javaType», Object> f = («lambda.type.javaType» _«lambda.name») -> { return «expGen.genExpCode»; };
		return f.apply((«lambda.type.javaType»)input);
		'''
	}
	
	def dispatch genCode(Output output) {
		'''
		private OutputNode<Object> node_«output.name» = new OutputNode<Object>();
		public List<Object> get«output.name.toFirstUpper»() { return node_«output.name».getData(); }
		'''
	}
	
	def genLetMethods() {
		'''
		///
		/// Let Methods
		///
		«FOR expGen : expressionGens»
			«expGen.genLetCode»
		«ENDFOR»
		'''
	}
	
	def genInitializeNodesFunc() {
		'''
		///
		/// Initialization of specific nodes
		///
		protected void initializeNodes() {
			«FOR n : program.eAllContents.filter[it instanceof Input || it instanceof Node].toIterable»
				super.addNode(node_«n.toName»)
			«ENDFOR»
			«FOR i : anonymousNodes.values»
				super.addNode(node_«i»)
			«ENDFOR»
		}
		'''
	}
	
	def genInitializeNetworkFunc() {
		'''
		///
		/// Initialize network as a whole
		///
		protected void initializeNetwork() {
			«FOR stream : program.declarations.filter(Stream)»
				«stream.genInitialization»
			«ENDFOR»
		}
		'''
	}
	
	def genInitialization(Stream stream) {
		var code = new StringBuilder()
		
		//First node
		for (NodeOrInput startNode : stream.startNodes) {
			for (Element element : stream.points.get(0).elements) {
				code.append('''node_«startNode.toName».addOutputNode(node_«element.toName»);''').append("\n");
			}
		}
		
		// Rest nodes
		for (var i = 0; i < stream.points.size-1; i++) {
			for (Element node1 : stream.points.get(i).elements) {
				for (Element node2 : stream.points.get(i+1).elements) {
					code.append('''node_«node1.toName».addOutputNode(node_«node2.toName»);''').append("\n");
				}
			}
		}
		
		return code.toString
	}
	
	def toName(EObject obj) {
		if (obj instanceof NodeRef) {
			return obj.ref.name
		}
		else if (obj instanceof Node) {
			return obj.name
		}
		else if (obj instanceof Input) {
			return obj.name
		}
		else if (obj instanceof AnonymousElement) {
			return anonymousNodes.get(obj) + ""
		}
		else if (obj instanceof Output) {
			return obj.name
		}

	}
}