package org.ssglobal.training.codes.declaration;

public class TestColor {

	public static void main(String[] args) { // entry point, main looks clean
		
		//byte i = 0;
		//for (i = 0; i < args.length; i++) {
			//System.out.println(args[i]);
		//	}
		
		// should have 1 item as input to avoid handling exception
		String color = args[0];
		int colorNum = Integer.parseInt(color); // wrapping from string to int
		
		Color c = new Color(); // instantiation
		c.guessColor(colorNum);// instantiation call
		
	}
	
}

class Color { // method or transactional class
	
	public void guessColor(int color) {
		
		if (color > 0 & color < 10 ) {
			System.out.println("blue");
		} else if (color >= 10 & color <= 20 ) {
			System.out.println("red");
		} else if (color > 20 & color <= 30) {
			System.out.println("green");
		} else {
			System.out.println("Invalid color input");
		}
	}
}