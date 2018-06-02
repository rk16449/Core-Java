// If these are the following classes defined, the generic static method below would change
class Vehicle{
	
}
class Car extends Vehicle{
	
}
class SportsCar extends Car{
	
}

public class ErasureGenericMethodsClasses {
	// This method would change by the compiler 
	public static <T extends Vehicle> void start(T vehicle) {
		
	}
	
	// The compiler changes the above method to this
	public static void startCompilerChanged(Vehicle vehicle) {
		
	}
}
