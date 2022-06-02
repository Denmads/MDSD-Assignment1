package test;

import java.util.Arrays;
import java.util.List;

import p3x.P3XMain;

public class TestP3X {
	public static void main(String argv[]) throws InterruptedException {
		P3XMain p = new P3XMain();
		// Set parameters and start network
		p.setParameterP(3);
		p.compute();
		// Generate inputs
		p.inputI(1);
		p.inputI(2);
		p.inputI(3);
		p.inputI(4);
		p.inputI(5);
		// Wait for computations to finish
		Thread.sleep(1000);
		// Print outputs
		System.out.println("y="+p.getY());
		// Check outputs
		List<Integer> v = Arrays.asList(72, 144, 216, 288, 360);
		if(v.equals(p.getY()))
			System.out.println("OK");
		else
			System.out.println("FAIL");
	}
}
