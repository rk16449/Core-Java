import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnboundedWildcards {
	
	// input the list of unknown type, null can be inserted here
	static void outputList(List<?> list) {
		if(list == null) return; // stop NullPointerException occuring below
		
		for(Object elem : list) {
			System.out.println(elem);
		}
	}
	
	static void outputObjectList(List<Object> list) {
		// compute something...
	}
	
	public static void main(String[] args) {
		
		
		List<Integer> listOne = Arrays.asList(5, 6, 7);
		List<Character> listTwo = Arrays.asList('a', 'c', 'd');
		
		outputList(listOne);
		outputList(listTwo);
		outputList(null);
	}
}
