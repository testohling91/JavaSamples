package testEnumReturn;

public enum LiftLevel {
	GROUND(5.5), 
	FIRST(12.34), 
	SECOND(24.1);
	
	double dPotReading;
	LiftLevel(double dRead) {
		dPotReading = dRead;
	}
	
	double calcPotReading () {
		return dPotReading;
	}
}
//hi there