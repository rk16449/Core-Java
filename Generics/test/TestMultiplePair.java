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
		
		
		// key should be 'Test'
		assertEquals(p1.getKey(), "Test"); 
		
		// value should be '5'
		assertEquals(p1.getValue(), new Integer(5)); 
	}
	
	@Test
	void testCreateDiamond() {
		
		// Java compiler can infer the K and V types so we can use Diamond notation
		iPair<String, Integer> p1 = new MultiplePair<>("Test", 5);
		
		// key should be 'Test'
		assertEquals(p1.getKey(), "Test"); 
		
		// value should be '5'
		assertEquals(p1.getValue(), new Integer(5)); 
	}

}
