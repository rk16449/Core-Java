import java.util.List;

public class WildCards {

	// ? represents the unknown type
	// it is never used in:
	//  - type argument for a generic method invocation
	//  - generic class instance creation
	//  - supertype
	
	// Upper-Bounded Wildcards
	static void calculate(List<? extends Number> list) {
		// calculate stuff here
	}
}
