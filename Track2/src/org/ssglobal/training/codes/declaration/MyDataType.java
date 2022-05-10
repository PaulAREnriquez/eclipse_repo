package org.ssglobal.training.codes.declaration;

public class MyDataType {
	//global variables
	public static final double PIE = 3.141617; // constants can be class var
	public static long versiondId = 1L; // global static place holders
	public static String creature = "vertebrate";// place holders
	public static int error_Level = 0; // place holders
	
	public byte counter; // global instance variable
	public short numProducts; // global instance variable
	public int numCells; // global instance variable
	public long numTcells; // global instance variable
	
	public float weight = 0.05f; // global instance variable
	public double billGatesMoney; // global instance variable	
	public char letter;
	public String personName = " ";
	
	public void createVars() {
		// creating a local variable
		int age = 0;
		float salary;
		final float MY_PIE = 90.6F;
		
		System.out.println(counter); // it worked because counter is global (instance)
		System.out.println(age); // why doesn't it work? age is local scope. You have to initialize it! It is an undefined garbage
		System.out.println(letter);
		System.out.println(personName);
	}
	
	public void manageArguments(float weight, byte counter) { // define local parameters, they can be used and their values changed
		// adding final to local parameter makes it a constant
		// final float weight; weight is not capitalized because it still has no initial value
		// until it is called
		weight = 10.0f; // don't declare here again ie. typing float weight again
		System.out.println(weight);
	}
	
	public void createBlockVarsThruIf(int option) {
		//every variable declare here
		// is general local variable
		// if it is declared again inside (same name)
		// you will have a collision error
		if (option == 0 ) {
			int err_val = 10; // block variable, declared inside the if-block, only lives within that block
			option = option + err_val;
			System.out.println(option);
		} else {
			int otherwise_val = -10; // block variable, declared inside the else-block
		}
	}
	
	public void createBlockVarsThruLoop(int[] ids) {
		// try to utilize block variable more than general local variable outside a block
		for(int i = 0; i < ids.length; i++) {
			System.out.println(ids[i]);
		}
		// i also cannot be accessed here, it is already outside the for loop
	}
	
	public void createBlockVarsThruSwitch(int option) {
		
		switch(option) {
		case 1: 
			float amount = 1000.50F; // block variable
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		default:
			System.out.println(-1);
			break;
		}
	}
	
	public void assignLiterals() {
		// integer types
		counter = 12; // within the range of -128 to 127 for byte
		numProducts = 320; // should be within the range of short
		numCells = 7987; // should be within int
		numTcells = 8008l; // default integral type is int, coercion problem - cast to long by putting l
	
		billGatesMoney = 9999.89; // default double type
		weight = 89.5f; // coercion, add f
		
		// character literal types
		//ASCII
		letter = 'a'; 
		System.out.println(letter);
		
		//ASCII numerical value - coercion -prints the ASCII equivalent only (up to 127)
		letter = 127;
		System.out.println(letter);

		// Unicode characters(UTF-8) - in the form of hexadecimal, quoted
		letter = '\u00F1';
		System.out.println(letter);
		
		// string literals
		personName = "Juan Luna";
	}
	
	public void literalConversion() { //Conversion is the algorithm, casting is the trigger mechanism
		
		numProducts = 10; // identity conversion; same type both sides
		
		// widening conversion
		int amount = 32000; // widening
		double salary = 67800.5f;
		
		// narrowing conversion, not at all times gives a correct value
		byte param = (byte) 128; // wrong, results to -128
		System.out.println(param);
		
		// narrowing conversion, but correct
		float price = (float) 89.6;
		System.out.println(price);
	}
}


class TestMyDataType {
	
	public static void main(String[] args) {
		MyDataType mdt = new MyDataType(); //instantiation
		System.out.println(MyDataType.PIE);
		mdt.manageArguments(89.6F, (byte) 0); // instantiation call
		mdt.manageArguments(75.6F, (byte) 7); // with argument passing, casting is needed
		mdt.createBlockVarsThruLoop(new int[] {10, 20, 45, 89});
		System.out.println(mdt.weight); // instance variable
		
		mdt.createVars();
		mdt.assignLiterals();
		mdt.literalConversion();
	}
}