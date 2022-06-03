package p5;
import libx21.*;
import java.util.function.Function;
import java.util.List;
public class P5Main extends GenericMainX21 {
	///
	/// Code for paramter active_course
	///
	private DataCourse _active_course;
	public void setParameterActive_course(DataCourse value) {
		_active_course = value;
	}
	///
	/// Code for input teachers
	///
	private ComputeNode<Object, Object> node_teachers = new InputNode<Object>();
	public void inputTeachers(DataTeacher input) {
		node_teachers.put(input);
	}
	///
	/// Code for node 0
	///
	private ComputeNode<Object, Object> node_0 = new AbstractComputeNode<Object, Object>() {
		protected Object function(Object input) {
			Function<DataTeacher, Object> f = (DataTeacher _t) -> { return new DataTeacher().setName(_t.getName()).setAge(_t.getAge()+1).setCourse_taught(_t.getCourse_taught()); };
			return f.apply((DataTeacher)input);
		}
	};
	///
	/// Code for node filter
	///
	private ComputeNode<Object, Object> node_filter = new AbstractComputeNode<Object, Object>() {
		protected Object function(Object input) {
			Function<DataTeacher, Object> f = (DataTeacher _t) -> { return _t.getCourse_taught().equals(_active_course)?_t:null; };
			return f.apply((DataTeacher)input);
		}
	};
	///
	/// Code for node 1
	///
	private ComputeNode<Object, Object> node_1 = new AbstractComputeNode<Object, Object>() {
		protected Object function(Object input) {
			Function<DataTeacher, Object> f = (DataTeacher _t) -> { return _t.getName(); };
			return f.apply((DataTeacher)input);
		}
	};
	///
	/// Output nodes
	///
	private OutputNode<Object> node_processed_people = new OutputNode<Object>();
	public List<Object> getProcessed_people() { return node_processed_people.getData(); }
	private OutputNode<Object> node_teacher_names = new OutputNode<Object>();
	public List<Object> getTeacher_names() { return node_teacher_names.getData(); }
	///
	/// Let Methods
	///
	///
	/// Initialization of specific nodes
	///
	protected void initializeNodes() {
		super.addNode(node_teachers);
		super.addNode(node_filter);
		super.addNode(node_1);
		super.addNode(node_0);
	}
	///
	/// Initialize network as a whole
	///
	protected void initializeNetwork() {
		node_teachers.addOutputNode(node_0);
		node_0.addOutputNode(node_filter);
		node_filter.addOutputNode(node_processed_people);
		node_teachers.addOutputNode(node_1);
		node_1.addOutputNode(node_teacher_names);
	}
}
