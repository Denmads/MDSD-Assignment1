package p4;
import libx21.*;
import java.util.function.Function;
import java.util.List;
public class P4Main extends GenericMainX21 {
	///
	/// Code for paramter z
	///
	private Integer _z;
	public void setParameterZ(Integer value) {
		_z = value;
	}
	///
	/// Code for function add_it
	///
	private Object fun_add_it(Object arg) {
		return funimpl_add_it((DataInt_pair)arg);
	}
	private Object funimpl_add_it(DataInt_pair _t) { return _t.getI1()+_t.getI2(); }
	///
	/// Code for input number2
	///
	private ComputeNode<Object, Object> node_number2 = new InputNode<Object>();
	public void inputNumber2(DataInt_pair input) {
		node_number2.put(input);
	}
	///
	/// Code for input number
	///
	private ComputeNode<Object, Object> node_number = new InputNode<Object>();
	public void inputNumber(Integer input) {
		node_number.put(input);
	}
	///
	/// Code for node 0
	///
	private ComputeNode<Object, Object> node_0 = new AbstractComputeNode<Object, Object>() {
		protected Object function(Object input) {
			return fun_add_it(input);
		}
	};
	///
	/// Code for node 1
	///
	private ComputeNode<Object, Object> node_1 = new AbstractComputeNode<Object, Object>() {
		protected Object function(Object input) {
			Function<Integer, Object> f = (Integer _x) -> { return _x.equals(_z)?null:new DataInt_pair().setI1(_x).setI2(_z); };
			return f.apply((Integer)input);
		}
	};
	///
	/// Output nodes
	///
	private OutputNode<Object> node_number2added = new OutputNode<Object>();
	public List<Object> getNumber2added() { return node_number2added.getData(); }
	private OutputNode<Object> node_not_duplicates = new OutputNode<Object>();
	public List<Object> getNot_duplicates() { return node_not_duplicates.getData(); }
	///
	/// Let Methods
	///
	///
	/// Initialization of specific nodes
	///
	protected void initializeNodes() {
		super.addNode(node_number2);
		super.addNode(node_number);
		super.addNode(node_1);
		super.addNode(node_0);
	}
	///
	/// Initialize network as a whole
	///
	protected void initializeNetwork() {
		node_number2.addOutputNode(node_0);
		node_0.addOutputNode(node_number2added);
		node_number.addOutputNode(node_1);
		node_number.addOutputNode(node_1);
		node_1.addOutputNode(node_not_duplicates);
	}
}
