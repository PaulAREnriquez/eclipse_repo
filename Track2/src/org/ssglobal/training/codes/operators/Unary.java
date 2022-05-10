package org.ssglobal.training.codes.operators;

public class Unary {

		public void loopWithoutCounterVarPost() {
		
		int counter = 0;
			System.out.print(counter);
			counter ++;
		}

		public void loopWithCounterVarPost() {
			
			int counter = 0;
			int counterVar = 0;
			while(counterVar < 10) {
				System.out.print(counterVar);
				counterVar = counter ++;
			}
		}
		
		public void loopWithoutCounterVarPre() {
			
			int counter = 0;
			while(counter < 10) {
				System.out.print(counter);
				++counter;
			}
		}
		
		public void loopWithCounterVarPre() {
			
			int counter = 0;
			int counterVar = 0;
			while(counterVar < 10) {
				System.out.print(counterVar);
				counterVar = ++counter;
			}
		}
		
}
