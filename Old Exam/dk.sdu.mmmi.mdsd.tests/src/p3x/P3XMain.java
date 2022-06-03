package p3x;
import libx21.*;
import java.util.function.Function;
import java.util.List;
public class P3XMain extends GenericMainX21 {
	///
	/// Code for paramter p
	///
	private Integer _p;
	public void setParameterP(Integer value) {
		_p = value;
	}
	///
	/// Code for function x
	///
	private Object fun_x(Object arg) {
		return funimpl_x((Integer)arg);
	}
	private Object funimpl_x(Integer _x) { return let0(_x*_p); }
	///
	/// Code for input i
	///
	private ComputeNode<Object, Object> node_i = new InputNode<Object>();
	public void inputI(Integer input) {
		node_i.put(input);
	}
	///
	/// Code for node x
	///
	private ComputeNode<Object, Object> node_x = new AbstractComputeNode<Object, Object>() {
		protected Object function(Object input) {
			return fun_x(input);
		}
	};
	///
	/// Code for node 0
	///
	private ComputeNode<Object, Object> node_0 = new AbstractComputeNode<Object, Object>() {
		protected Object function(Object input) {
			return fun_x(input);
		}
	};
	///
	/// Code for node 1
	///
	private ComputeNode<Object, Object> node_1 = new AbstractComputeNode<Object, Object>() {
		protected Object function(Object input) {
			Function<Integer, Object> f = (Integer _x) -> { return _x+_x; };
			return f.apply((Integer)input);
		}
	};
	///
	/// Output nodes
	///
	private OutputNode<Object> node_y = new OutputNode<Object>();
	public List<Object> getY() { return node_y.getData(); }
	///
	/// Let Methods
	///
	private int let0(int _x) {
		return _x+_x;
	}
	///
	/// Initialization of specific nodes
	///
	protected void initializeNodes() {
		super.addNode(node_i);
		super.addNode(node_x);
		super.addNode(node_1);
		super.addNode(node_0);
	}
	///
	/// Initialize network as a whole
	///
	protected void initializeNetwork() {
		node_i.addOutputNode(node_x);
		node_x.addOutputNode(node_0);
		node_0.addOutputNode(node_1);
		node_1.addOutputNode(node_y);
	}
}
