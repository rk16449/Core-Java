import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnboundedWildcards {
	
	// input the list of unknown type
	static void outputList(List<?> list) {
		for(Object elem : list) {
			System.out.println(elem);
		}
	}
	
	public static void main(String[] args) {
		
		
		List<Integer> listOne = Arrays.asList(5, 6, 7);
		List<Character> listTwo = Arrays.asList('a', 'c', 'd');
		
		outputList(listOne);
		outputList(listTwo);
	}
}
