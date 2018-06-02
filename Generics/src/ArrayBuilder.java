import java.util.*;

public class ArrayBuilder {
	public static <T> void addToList(List<T> list, T...elements) {
		for(T x: elements) {
			list.add(x);
		}
	}
	
	public static void faultyMethod(List<String>...lists) {
		Object[] objectArr = lists;
		objectArr[0] = Arrays.asList(73);
		String s = lists[0].get(0); // ClassCastException thrown here
		
	}
}
