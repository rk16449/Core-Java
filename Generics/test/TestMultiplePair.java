import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestMultiplePair {

	@Test
	void testCreate() {
		
		
		/**
		 * Legal ways of creating MultiplePair objects
		 */
		
		
		// Due to autoboxing, it is valid to pass a String and an int to the class here
		iPair<String, Integer> p1 = new MultiplePair<String, Integer>("Test", 5);
		
		// Output should be 5
		assertEquals(p1.getKey(), new Integer(5)); 
	}

}
