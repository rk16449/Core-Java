import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMethods {

	@Test
	void testDifferentKeys() {
		iPair<String, Integer> p1 = new MultiplePair<>("Five", 5);
		iPair<String, Integer> p2 = new MultiplePair<>("Six", 6);
		boolean sameKeys = Methods.compareKeys(p1, p2);
		assertEquals(sameKeys, false);
	}
	
	
	@Test
	void testSameKeys() {
		iPair<String, Integer> p1 = new MultiplePair<>("Five", 5);
		iPair<String, Integer> p2 = new MultiplePair<>("Five", 6);
		boolean sameKeys = Methods.compareKeys(p1, p2);
		assertEquals(sameKeys, true);
	}
	
	@Test
	void testDifferentValues() {
		iPair<String, Integer> p1 = new MultiplePair<>("Five", 5);
		iPair<String, Integer> p2 = new MultiplePair<>("Ten", 10);
		boolean sameKeys = Methods.compareValues(p1, p2);
		assertEquals(sameKeys, false);
	}
	
	@Test
	void testSameValues() {
		iPair<String, Integer> p1 = new MultiplePair<>("Five", 5);
		iPair<String, Integer> p2 = new MultiplePair<>("Ten", 5);
		boolean sameKeys = Methods.compareValues(p1, p2);
		assertEquals(sameKeys, true);
	}

}
