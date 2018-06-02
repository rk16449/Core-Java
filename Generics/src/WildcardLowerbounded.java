import java.util.*;

public class WildcardLowerbounded {

	
	// lower-bounded wildcard restricts the unknown type to be a specific type or a supertype of that type
	
	
	// add values 1 to 1000 into a list that can also be a super type of List<Integer>
	
	public static void addNums(List<? super Integer> list) {
		for(int i=0; i<1000; i++) {
			list.add(i);
		}
	}
}
