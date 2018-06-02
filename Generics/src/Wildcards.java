import java.util.List;

public class Wildcards {

	// ? represents the unknown type
	// it is never used in:
	//  - type argument for a generic method invocation
	//  - generic class instance creation
	//  - supertype
	
	// Upper-Bounded Wildcards
	static <E> int countLowerValues(List<? extends Comparable<Number>> list, E elem) {
		// calculate stuff here
		int count = 0;
		
		for(Comparable<Number> e : list) {
			if(e.compareTo((Number) elem) < 0) {
				++count;
			}
		}
		
		return count;
	}
}
