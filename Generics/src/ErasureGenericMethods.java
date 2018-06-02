// The Java compiler will erase type parameters in a generic method arguments
public class ErasureGenericMethods {

	// counts how many elements in the arr
	public static <T> int count(T[] arr) {
		int count = 0;
		for(T e : arr) {
			++count;
		}
		return count;
	}
	
	// compiler will change it to
	public static <Object> int countCompilerChange(Object[] arr) {
		int count = 0;
		for(Object e : arr) {
			++count;
		}
		return count;
	}
	
}
