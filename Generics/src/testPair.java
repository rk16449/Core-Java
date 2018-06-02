
public class testPair {

	public static void main(String[] args) {
		/**
		 * Legal ways of creating MultiplePair objects
		 */
		
		
		// Autoboxing parameters on MultiplePair occurs
		iPair<String, Integer> p1 = new MultiplePair<String, Integer>("Test", 5);
		iPair<Integer, String> p2 = new MultiplePair<>(5, "Hello");
		
		// Output of 5
		System.out.println(p2.getKey());
	}

}
