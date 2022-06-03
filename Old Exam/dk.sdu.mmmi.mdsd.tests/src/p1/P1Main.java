package p1;
import libx21.*;
import java.util.function.Function;
import java.util.List;
public class P1Main extends GenericMainX21 {
	///
	/// Code for function add1
	///
	private Object fun_add1(Object arg) {
		return funimpl_add1((Integer)arg);
	}
	private Object funimpl_add1(Integer _x) { return _x+1; }
	///
	/// Code for input number
	///
	private ComputeNode<Object, Object> node_number = new InputNode<Object>();
	public void inputNumber(Integer input) {
		node_number.put(input);
	}
	///
	/// Code for node add1node
	///
	private ComputeNode<Object, Object> node_add1node = new AbstractComputeNode<Object, Object>() {
		protected Object function(Object input) {
			return fun_add1(input);
		}
	};
	///
	/// Code for node add2node
	///
	private ComputeNode<Object, Object> node_add2node = new AbstractComputeNode<Object, Object>() {
		protected Object function(Object input) {
			return fun_add1(input);
		}
	};
	///
	/// Code for node add3node
	///
	private ComputeNode<Object, Object> node_add3node = new AbstractComputeNode<Object, Object>() {
		protected Object function(Object input) {
			return fun_add1(input);
		}
	};
	///
	/// Output nodes
	///
	private OutputNode<Object> node_inc_number_1 = new OutputNode<Object>();
	public List<Object> getInc_number_1() { return node_inc_number_1.getData(); }
	private OutputNode<Object> node_inc_number_2 = new OutputNode<Object>();
	public List<Object> getInc_number_2() { return node_inc_number_2.getData(); }
	private OutputNode<Object> node_inc_number_3 = new OutputNode<Object>();
	public List<Object> getInc_number_3() { return node_inc_number_3.getData(); }
	///
	/// Let Methods
	///
	///
	/// Initialization of specific nodes
	///
	protected void initializeNodes() {
		super.addNode(node_number);
		super.addNode(node_add1node);
		super.addNode(node_add2node);
		super.addNode(node_add3node);
	}
	///
	/// Initialize network as a whole
	///
	protected void initializeNetwork() {
		node_number.addOutputNode(node_add1node);
		node_add1node.addOutputNode(node_inc_number_1);
		node_number.addOutputNode(node_add2node);
		node_add2node.addOutputNode(node_inc_number_2);
		node_add1node.addOutputNode(node_add2node);
		node_add2node.addOutputNode(node_inc_number_3);
	}
}
