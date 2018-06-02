/*
 * Heap pollution occurs when a variable of a parameterized type refers to an object 
 * that is not of that parameterized type.
 * 
 * This situation occurs if the program performed some operation that gives rise to an
 * unchecked warning at compile time.
 * 
 * An unchecked warning is generated if either at compile time (within the limits of the compile-time
 * type-checking rules) or at runtime the correctness of an operation involving a parameterized type
 * (e.g. cast or method call) cannot be verified.
 * 
 * Example of Heap pollution is in the class below:
 */

import java.util.*;

public class HeapPollution {

	
	public static void main(String[] args) {
		List<String> stringListA = new ArrayList<>();
		List<String> stringListB = new ArrayList<>();
		
		ArrayBuilder.addToList(stringListA, "One", "Two", "Three");
		ArrayBuilder.addToList(stringListB, "Four", "Five", "Six");
		
		List<List<String>> listOfStringsLists = new ArrayList<List<String>>();
		
		ArrayBuilder.addToList(listOfStringsLists, stringListA, stringListB);
		
		ArrayBuilder.faultyMethod(Arrays.asList("Hello"), Arrays.asList("World!"));
	}
}
