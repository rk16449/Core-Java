import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestMultiplePair {

	@Test
	void testCreate() {
		
		
		/**
		 * Legal ways of creating MultiplePair objects
		 */
		
		
		// Autoboxing parameters on MultiplePair occurs
		iPair<String, Integer> p1 = new MultiplePair<String, Integer>("Test", 5);
		iPair<Integer, String> p2 = new MultiplePair<>(5, "Hello");
		
		// Output should be 5
		assertEquals(p2.getKey(), new Integer(5)); 
	}

}
