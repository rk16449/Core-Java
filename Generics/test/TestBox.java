import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBox {

	@Test
	void testCreate() {
		// Create a box that holds ints, set its value to  5
		Box<Integer> intBox = new Box<Integer>();
		intBox.setBox(5);
		
		assertEquals(intBox.getBox(), Integer.valueOf(5));
	}
	
	@Test
	void testRawType() {
		// Create a box that holds ints
		Box<Integer> intBox = new Box<>();
		
		// Create a raw box, and set it to alias intBox
		Box rawBox = intBox;
		
		
		// Check that they alias the same object
		assertEquals(rawBox, intBox);
	}

}
