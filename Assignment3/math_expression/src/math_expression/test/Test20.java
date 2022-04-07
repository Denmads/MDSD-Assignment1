package math_expression.test;

public class Test20 {
	
	public int x;

	
	public void compute() {
		x = computeX();
	}
	
	private int computeX() {
		int y = 3;
		int let2 = y * y;
		y = 2;
		int let1 = let2 + y;
		return let1 + 76;
	}
}

