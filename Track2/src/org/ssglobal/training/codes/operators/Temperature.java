package org.ssglobal.training.codes.operators;

public class Temperature {
	
	public float chooseTemperature (int option) {
		
		float temperature = 0.0f; // local variable should be explicitly initialized
		if (option == 0) {
			temperature = 50.0f;
		} else if ( option == 1 ) {
			temperature = 60.0f;
		} else if (option == 2) {
			temperature = 70.0f;
		} else if (option == 3) {
			temperature = 80.0f;
		}
		
		return temperature;
	}
	
	public float chooseTemperatureSwitch(int option) {
		
		float temperature = 0.0f;
		switch(option) {
		case 0: 
			temperature = 50.0f;
			break;
		case 1:
			temperature = 60.0f;
			break;
		case 2:
			temperature = 70.0f;
			break;
		case 3:
			temperature = 80.0f;
			break;
		}
		return temperature;
	}		
}
