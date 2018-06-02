import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBoundedTypeMethods {

	@Test
	void testCountLessThan() {
		// values must be wrapped into objects
		Integer[] arr = {5, 3, 2, 232, 1, 2, 3, 100};
		Integer value = 5;
		
		// Values less than 5 in the array is: 3, 2, 1, 2, 3
		assertEquals(BoundedTypeMethods.countLessThan(arr, value), 5);
	}

}
