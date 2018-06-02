import java.util.*;

public class Subtyping {

	
	interface AccomodationList<E, P> extends List<E>{
		void setAccomodation(int index, P val);
	}
	
	public static void main(String[] args) {
		
		// The following parameterizations of AccomodationList are subtypes of List<String>
		
		// AccomodationList<String, String>
		// AccomodationList<String, Integer>
		// AccomodationList<String, Exception>
	}
}
