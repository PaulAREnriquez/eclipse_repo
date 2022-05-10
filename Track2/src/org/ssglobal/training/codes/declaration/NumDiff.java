package org.ssglobal.training.codes.declaration;

public class NumDiff { // Transactional Class, Solution
	
	public int getNumdiff(int x) {
		int numdiff = getCube(x) - getSquare(x); // caller - calls the method name with the parameter passed
		return numdiff;
	}
	
	public int getSquare(final int x) {
		int square = x*x;
		return square;
	}
	
	public int getCube(final int x) {
		int cube = x*x*x;
		return cube;
	}
}
