package org.ssglobal.training.codes.operators;

public class Conditionals {
	
	public void createConditions() {
	
		float amount1 = 100.2f;
		float amount2 = 56.2f;
		boolean ce1 = amount1 == (amount2 - 5);
		System.out.println(ce1);
		
		if (ce1) {
			System.out.println("amount1 is equal to amount2");			
		} else {
			System.out.println("amount 2 is equal to amount 1");
		}
		
		char test1 = 'a';
		char test2 = 'b';
		boolean ce2 = test1 >= test2; //test1 comes after test2
		
		if(ce1) {
			System.out.println("test1 comes after test2");
		}else {
			System.out.println("test1 comes first before test2");
		}
	
	}
	// <, >=, <=, !=, == (for primitive only)
	
	public void createComplexCondition() {
		
		byte data = 10; //within 50 and 100
		boolean le1 = data >= 50 & data <=100; //bitwise AND
		if(le1) {
			System.out.println("within the range");
		} else {
			System.out.println("invalid");
		}
		
		// Problem: sickLeave (boolean) renderOT (boolean)
		// bitwise OR vs ShortCircuit OR
		// evaluates all vs evaluates the first, and once a statement results true, it stops
		// bitwise AND vs ShortCircuit AND
		// evaluates all (must be all true) vs checks and until one becomes false, it stops
		char sickLeave = 'S'; // S = sickLeave, V = vacation leave, X = no leave
		char withOT = 'Y';  // Y = OT , N = no OT
		
		boolean le2 = sickLeave == 'S' | withOT == 'Y'; //bitwise OR

		System.out.println(le2);
		
	}
	// Ternary example
	// if-else is still faster
	// complicated
	
	public void createTernary() {
		
		int choice = 15;
		// 0 to 10 is red
		// 10 to 20 is blue
		// 20 to 30 is green
		// otherwise, it is invalid
		
		String color = (choice >= 0 && choice <= 10)? "RED" : 
					   (choice > 10 && choice <= 20)? "BLUE" :
					   (choice > 20 && choice <= 30)? "GREEN": "INVALID";  										; 

					   System.out.println(color);
	
	}
	// shift operators
	
	public void applyShiftOps() {
		// << left shift
		// exponential
		
		int count = 2;
		int se1 = count << 5;
		
		// 1 = 1* 2^0 = 0001
		// 2 = 1* 2^1 = 0010
		// 4 = 1* 2^2 = 0100
		// 8 = 1* 2^3 = 1000
		// 16 = 1* 2^4  = 10000
		// 32 = 1* 2^5 = 100000
		System.out.println(se1);
		
		count = se1;
		
		// >> right shift ops
		// divisibility
		int se2 = count >> 5;
		
		// 16 = 32 / 2^0 = 010000
		// 8 = 32 / 2^1 = 001000
		// 4 = 32 / 2^3 = 00100
		// 2 = 32 / 2^4 = 00010
		// 1 = 32 / 2^5 = 00001
		System.out.println(se2);
	}
}
