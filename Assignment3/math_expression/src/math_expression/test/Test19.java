package math_expression.test;

public class Test19 {
	
	public int x;

	
	public void compute() {
		x = computeX();
	}
	
	private int computeX() {
		int y = 2;
		int z = 3;
		int let2 = y * z;
		int let1 = let2 + y;
		return let1 + 79;
	}
}

