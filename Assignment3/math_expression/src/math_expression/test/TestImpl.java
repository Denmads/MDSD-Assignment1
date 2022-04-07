package math_expression.test;

import java.util.HashMap;
import java.util.Map;

public class TestImpl {
	public int x;
	
	public void compute() { 
		x = computeX();
	}
	
	private int computeX() {
		int x = 5;
		int y = 3;
		int let1 = y * x;
		y = 2;
		int let2 = let1 + y;
		int let3 = let2 + 3;
		return let3 + 76;
	}
}
