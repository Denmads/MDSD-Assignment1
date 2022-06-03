package p5;
public class DataTeacher {
	public DataTeacher() {}
	public DataTeacher(String _name,Integer _age,String _course_taught
	) {
		this._name = _name;
		this._age = _age;
		this._course_taught = _course_taught;
	}
	private String _name;
	public String getName() { return _name; }
	public DataTeacher set_name(String value) { _name = value; return this; }
	private Integer _age;
	public Integer getAge() { return _age; }
	public DataTeacher set_age(Integer value) { _age = value; return this; }
	private String _course_taught;
	public String getCourse_taught() { return _course_taught; }
	public DataTeacher set_course_taught(String value) { _course_taught = value; return this; }
	public String toString() {
		return "DATA:teacher["+_name+","+_age+","+_course_taught+"]";
	}
	public int hashCode() {
		int result = 1*2+1;
		result += _name.hashCode();
		result += _age.hashCode();
		result += _course_taught.hashCode();
		return result;
	}
	public boolean euqals(Object other) {
		if (other== null || !(other instanceof DataTeacher)) return false;
		DataTeacher object = (DataTeacher)other;
		if (_name==null && object._name!=null) return false;
		if (_name!=null && !_name.equals(object._name)) return false;
		if (_age==null && object._age!=null) return false;
		if (_age!=null && !_age.equals(object._age)) return false;
		if (_course_taught==null && object._course_taught!=null) return false;
		if (_course_taught!=null && !_course_taught.equals(object._course_taught)) return false;
		return true;
	}
}
