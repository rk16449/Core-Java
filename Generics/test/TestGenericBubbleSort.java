import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestGenericBubbleSort {

	@Test
	void testGenericBubbleSort() {
		// 2 arrays, unsorted and sorted
		Integer[] arr = {3, 1, 2, 5, 4};
		Integer[] sorted = {1, 2, 3, 4, 5};
		
		// Destructively sort arr
		GenericBubbleSort.sort(arr);
		
		
		// Output values for debug
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		// Do the test to check if they are now sorted
		assertArrayEquals(arr, sorted);
	}

}
