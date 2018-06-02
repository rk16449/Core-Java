
public class BoundedTypeMethods {
	// Imagine trying to have a generic method which allows all sorts of number types
	// We want to count the number of elements in an array the value is less than
	
	
	// T type is now bounded by Comparable<T> interface
	public static <T extends Comparable<T>> int countLessThan(T[] arr, T elem) {
		int count = 0;
		for(T e : arr) {
			if(e.compareTo(elem) < 0) // < operator only applies to certain primitive types
				++count;
		}
		return count;
	}
}
