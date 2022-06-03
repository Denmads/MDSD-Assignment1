package p2;
import libx21.*;
import java.util.function.Function;
import java.util.List;
public class P2Main extends GenericMainX21 {
	///
	/// Code for paramter z
	///
	private Integer _z;
	public void setParameterZ(Integer value) {
		_z = value;
	}
	///
	/// Code for paramter max
	///
	private Integer _max;
	public void setParameterMax(Integer value) {
		_max = value;
	}
	///
	/// Code for function add1
	///
	private Object fun_add1(Object arg) {
		return funimpl_add1((Integer)arg);
	}
	private Object funimpl_add1(Integer _x) { return _x+1; }
	///
	/// Code for function addzmul
	///
	private Object fun_addzmul(Object arg) {
		return funimpl_addzmul((Integer)arg);
	}
	private Object funimpl_addzmul(Integer _x) { return (_x+_z)*(_x+_z); }
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
	/// Code for node x
	///
	private ComputeNode<Object, Object> node_x = new AbstractComputeNode<Object, Object>() {
		protected Object function(Object input) {
			return fun_add1(input);
		}
	};
	///
	/// Code for node y
	///
	private ComputeNode<Object, Object> node_y = new AbstractComputeNode<Object, Object>() {
		protected Object function(Object input) {
			return fun_add1(input);
		}
	};
	///
	/// Code for node 0
	///
	private ComputeNode<Object, Object> node_0 = new AbstractComputeNode<Object, Object>() {
		protected Object function(Object input) {
			return fun_addzmul(input);
		}
	};
	///
	/// Code for node 1
	///
	private ComputeNode<Object, Object> node_1 = new AbstractComputeNode<Object, Object>() {
		protected Object function(Object input) {
			Function<Integer, Object> f = (Integer _x) -> { return _x<=_max?_x:_max; };
			return f.apply((Integer)input);
		}
	};
	///
	/// Output nodes
	///
	private OutputNode<Object> node_out = new OutputNode<Object>();
	public List<Object> getOut() { return node_out.getData(); }
	private OutputNode<Object> node_ceiling = new OutputNode<Object>();
	public List<Object> getCeiling() { return node_ceiling.getData(); }
	///
	/// Let Methods
	///
	///
	/// Initialization of specific nodes
	///
	protected void initializeNodes() {
		super.addNode(node_number);
		super.addNode(node_add1node);
		super.addNode(node_x);
		super.addNode(node_y);
		super.addNode(node_0);
		super.addNode(node_1);
	}
	///
	/// Initialize network as a whole
	///
	protected void initializeNetwork() {
		node_number.addOutputNode(node_x);
		node_number.addOutputNode(node_y);
		node_x.addOutputNode(node_0);
		node_y.addOutputNode(node_0);
		node_0.addOutputNode(node_out);
		node_number.addOutputNode(node_1);
		node_1.addOutputNode(node_ceiling);
	}
}
