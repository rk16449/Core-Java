
public class GenericBubbleSort {
	
	
	// Sorts a generic array
	public static <T extends Comparable<Integer>> void sort(T[] arr) {
		
		int len = arr.length;
		T temp = null;
		
		
		for(int i=0; i<len; i++) {
			
			for(int j = 1; j < (len - i); j++) {
				if(arr[j-1].compareTo((Integer) arr[j]) > 0) {
					// Swap values
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	
}
