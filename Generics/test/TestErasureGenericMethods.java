import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestErasureGenericMethods {

	@Test
	void testErasedGenericMethods() {
		
		// Test that both methods do exactly the same thing
		Integer[] arr = {3, 4, 2, 1, 2};
		
		
		assertEquals(ErasureGenericMethods.count(arr), arr.length);
		assertEquals(ErasureGenericMethods.countCompilerChange(arr), arr.length);
	}

}
