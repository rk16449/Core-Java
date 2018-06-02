import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBoundedBox {

	@Test
	void testOutput() {
		BoundedBox<Integer> integerBox = new BoundedBox<Integer>();
		integerBox.setBox(new Integer(10)); // Integer passed in
		integerBox.output(new Double(10.5)); // check vs Double 
	}

}
