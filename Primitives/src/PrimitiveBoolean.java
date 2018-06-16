
public class PrimitiveBoolean {
	
	
	
	public static void main(String[] args) {
		// A boolean is one of the eight primitive data types in Java
		
		// It is 1 bit in size meaning it can be either be (1) true or (0) false 
		
		// 1 for true, 0 for false
		
		// It has a default value of false
		boolean test = false;
		
		
		System.out.println(test);
		// In java, it would output true or false, not 1 or 0
		
	
		// The following statement would not work as the operator == is undefined for type arguments boolean, int
		/** if(false == 0) */
		
		// Boolean is not explicitly or implicitly converted with casts to any other type
		// However the programmer can write conversion code on assignment like below:
		
		boolean convertToBoolean = 65>0 ? true : false;
		System.out.println(convertToBoolean);
	}
	
	
}
