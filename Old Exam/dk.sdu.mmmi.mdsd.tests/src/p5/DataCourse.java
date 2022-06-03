package p5;
public class DataCourse {
	public DataCourse() {}
	public DataCourse(String _name,Integer _ects
	) {
		this._name = _name;
		this._ects = _ects;
	}
	private String _name;
	public String getName() { return _name; }
	public DataCourse setName(String value) { _name = value; return this; }
	private Integer _ects;
	public Integer getEcts() { return _ects; }
	public DataCourse setEcts(Integer value) { _ects = value; return this; }
	public String toString() {
		return "DATA:course["+_name+","+_ects+"]";
	}
	public int hashCode() {
		int result = 0*2+1;
		result += _name.hashCode();
		result += _ects.hashCode();
		return result;
	}
	public boolean euqals(Object other) {
		if (other== null || !(other instanceof DataCourse)) return false;
		DataCourse object = (DataCourse)other;
		if (_name==null && object._name!=null) return false;
		if (_name!=null && !_name.equals(object._name)) return false;
		if (_ects==null && object._ects!=null) return false;
		if (_ects!=null && !_ects.equals(object._ects)) return false;
		return true;
	}
}
