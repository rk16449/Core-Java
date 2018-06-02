import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestGenericClass {

	@Test
	void testConstructor() {
		GenericClass<Integer> intObject = new GenericClass<>("Constructor");
		System.out.println(intObject.getVal()); 
	}

}
