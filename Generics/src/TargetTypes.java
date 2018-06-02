import java.util.Collections;
import java.util.List;

public class TargetTypes {
	public static void main(String[] args) {
		
		// Collections has this method:
		// static <T> List<T> emptyList();
		
		// This data type is the target type because the method emptyList returns a value type List<T>
		// The compiler infers that the type argument T must be the value String
		List<String> listOne = Collections.emptyList();
		
		
		// Alternatively we could use a type witness and specify T (not necessary)
		List<Integer> listTwo = Collections.<Integer>emptyList();
		
		
		// Wouldn't compile in SE 7, but does in SE 8+
		processIntegerList(Collections.emptyList());
		
		// Works in SE 7+
		processIntegerList(Collections.<Integer>emptyList());
	}
	
	static void processIntegerList(List<Integer> intList) {
		// process list here
	}
}
