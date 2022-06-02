package tests;

import java.util.Arrays;
import java.util.List;

import p1.P1Main;

public class TestP1 {
	public static void main(String argv[]) throws InterruptedException {
		P1Main p = new P1Main();
		// Start the network
		p.compute();
		// Generate inputs
		p.inputNumber(1);
		p.inputNumber(2);
		p.inputNumber(3);
		p.inputNumber(4);
		// Wait for computations to finish
		Thread.sleep(1000);
		// Print outputs
		System.out.println("inc_number_1="+p.getInc_number_1());
		System.out.println("inc_number_2="+p.getInc_number_2());
		System.out.println("inc_number_3="+p.getInc_number_3());
		// Check outputs
		List<Integer> x1 = Arrays.asList(2,3,4,5);
		List<Integer> x2 = Arrays.asList(3,4,5,6);
		if(p.getInc_number_1().equals(x1) 
				&& p.getInc_number_2().equals(x1)
				&& p.getInc_number_3().equals(x2))
			System.out.println("OK");
		else
			System.out.println("FAIL");
	}
}
