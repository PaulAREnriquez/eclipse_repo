package org.ssglobal.training.codes.declaration;


public class TestNumDiff { // Testing, entry point

	public static void main(String[] args) {
		
		String num = args[0];
		int numVal = Integer.parseInt(num); // wrapping string to int

		NumDiff diff = new NumDiff(); // instantiation, diff is the reference variable, 
		int result = diff.getNumdiff(numVal); 
		System.out.println(result);
		
		double test = 123.4567;
		System.out.printf("The number is %f", test);
	}
}
