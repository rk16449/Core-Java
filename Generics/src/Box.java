/**
 * Generic class of Box
 * @param <T> the type of value being boxed
 */
public class Box <T> {
	// T stands for Type
	private T box;
	
	public void setBox(T newbox) {
		this.box = newbox;
	}
	
	public T getBox() {
		return box;
	}
	
	
	public static void main(String[] args) {
		// T in Box<T> is called the type parameter
		// Integer in Box<Integer> is called type argument
		
		
		
		Box<Integer> boxInteger = new Box<Integer>();
		Box<String> boxString = new Box<String>();
		
		// This cannot work, as they are not the same type argument
		// boxInteger.setBox("");
		
		// This can work
		boxInteger.setBox(5);
	}
}
