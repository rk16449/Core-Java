
public class LegalNaming {

	public static void main(String[] args) {
		// Legal variable types
		int test_a = 0;
		int test_1 = 1;
		int $34343 = 2;
		
		
		// Lower precision type byte can be assigned to higher precision type int
		byte test = 4;
		int lol = test;
		
		 
		// Variables cannot start with a number
		/** int 1_asdajkada is illegal */
		
		boolean a = false;
		char c;
		int i;
		c = 'A';		// 1
		i = c;		//2
		//c = i + 1;	//3 - compilation error here
		c++;		//4
		
		
		// Valid creation of arrays
		int[] []x[]; 
		
		
		// Keywords
		// transient 
	}
	
}
