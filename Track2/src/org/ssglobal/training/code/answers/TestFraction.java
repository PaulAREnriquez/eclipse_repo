package org.ssglobal.training.code.answers;

public class TestFraction {

	public static void main(String[] args) {
		
		Fraction f1 = new Fraction();
		f1.numerator= 1;
		f1.denominator = 2;
		
		Fraction f2 = new Fraction();
		f2.numerator = 3;
		f2.denominator = 4;
		
		Fraction f3 = new Fraction();
		f3.numerator = 2;
		f3.denominator = 3;
		
		//add () method
		f1.add(f2).add(f3).toFractionString();
		
		//multiply method
		f1.multiply(f2).multiply(f3).toFractionString();
	
		// Properties of an object
		// criteria: identity property
		
		int id1 = f1.hashCode();
		System.out.println(id1);
		int id2 = f2.hashCode();
		System.out.println(id2);
		int id3 = f3.hashCode();
		System.out.println(id3);
		
		// Criteria: state property
		
		System.out.println(f1.numerator);
		System.out.println(f1.id); // 90
		System.out.println(f2.numerator);
		System.out.println(f2.id); // 90
		System.out.println(f3.numerator);
		System.out.println(f3.id); // 90
	}

}
