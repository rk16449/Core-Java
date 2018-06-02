// The Java compiler will erase type parameters in a generic method arguments
public class ErasureGenericMethods {

	// counts how many elements in the arr
	public static <T> int count(T[] arr, T elem) {
		int sum = 0;
		for(T e : arr) {
			++sum;
		}
		return sum;
	}
	
	
}
