package p4;
public class DataInt_pair {
	public DataInt_pair() {}
	public DataInt_pair(Integer _i1,Integer _i2
	) {
		this._i1 = _i1;
		this._i2 = _i2;
	}
	private Integer _i1;
	public Integer getI1() { return _i1; }
	public DataInt_pair setI1(Integer value) { _i1 = value; return this; }
	private Integer _i2;
	public Integer getI2() { return _i2; }
	public DataInt_pair setI2(Integer value) { _i2 = value; return this; }
	public String toString() {
		return "DATA:int_pair["+_i1+","+_i2+"]";
	}
	public int hashCode() {
		int result = 0*2+1;
		result += _i1.hashCode();
		result += _i2.hashCode();
		return result;
	}
	public boolean equals(Object other) {
		if (other== null || !(other instanceof DataInt_pair)) return false;
		DataInt_pair object = (DataInt_pair)other;
		if (_i1==null && object._i1!=null) return false;
		if (_i1!=null && !_i1.equals(object._i1)) return false;
		if (_i2==null && object._i2!=null) return false;
		if (_i2!=null && !_i2.equals(object._i2)) return false;
		return true;
	}
}
