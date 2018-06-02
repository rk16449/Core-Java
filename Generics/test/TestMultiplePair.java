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
	
	
	@Test
	void testCreateParameterisedTypes() {
		
		// Java compiler can infer the K and V types so we can use Diamond notation
		iPair<String, Box<Integer>> p1 = new MultiplePair<>("Test", new Box<Integer>());
		
		// Set the value of the box to 5
		p1.getValue().setBox(5);
		
		// value of the box should be '5'
		assertEquals(p1.getValue().getBox(), new Integer(5)); 
	}

}
