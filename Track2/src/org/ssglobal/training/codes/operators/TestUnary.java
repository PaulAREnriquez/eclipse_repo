package org.ssglobal.training.codes.operators;

public class TestUnary {

	public static void main(String[] args) {

		Unary sc = new Unary();
		System.out.println("Post Increment");
		sc.loopWithoutCounterVarPost();
		System.out.println();
		sc.loopWithCounterVarPost();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Pre-Increment");
		sc.loopWithoutCounterVarPre();
		System.out.println();
		sc.loopWithCounterVarPre();
	}

}
