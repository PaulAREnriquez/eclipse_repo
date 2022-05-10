package org.ssglobal.training.code.answers;

import org.ssglobal.training.codes.operators.Conditionals;

public class Fraction {
		
		public Conditionals cond = new Conditionals();
	
	// Hi just trying git commit
		public static long id = 90L; // class level
		public int numerator;
		public int denominator;
		
		public int getNumerator() {
			return numerator;
		}
		
		public int getDenominator() {
			return denominator;
		}
		
		public void toFractionString() {
			
			System.out.println(numerator + "/" + denominator);
			
		}
		
		public Fraction add(Fraction summand) {
			numerator = numerator + summand.denominator + summand.numerator * denominator;			
			denominator = denominator * summand.denominator;
		
			Fraction f = new Fraction();
			f.numerator = numerator;
			f.denominator = denominator;
			return f;
		
		}
		
		public Fraction multiply(Fraction factor) {
			numerator = numerator * factor.numerator;
			denominator = denominator * factor.denominator;
		
			Fraction f = new Fraction();
			f.numerator = numerator;
			f.denominator = denominator;
			return f;
		}
		
		public boolean  greaterEqual(Fraction fraction) {
			
			int numer1 = numerator * fraction.denominator;
			int numer2 = fraction.numerator * denominator;
			
			if (numer1 >= numer2 ) {
				return true;
			}else {
				return false;
			}				
		}
}

