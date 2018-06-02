// Type erasure can sometimes cause an unanticipated situation
// Consider the following classes

class TopNode<T> {
	private T first;

	public TopNode(T first) {
		this.first = first;
	}

	public void setFirst(T first) {
		this.first = first;
	}
	
	public T getFirst() {
		return this.first;
	}
}
class ExtendedNode extends TopNode<Integer> {

	public ExtendedNode(Integer first) {
		super(first);
	}

	public void setFirst(Integer first) {
		super.setFirst(first);
	}
}


public class TypeErasureBridgeMethods {
	public static void main(String[] args) {
		
		// Consider:
		ExtendedNode en = new ExtendedNode(10);
		TopNode n = en; // compiler will throw an unchecked warning (raw type)
		n.setFirst("Test"); // will cause a ClassCastException throw
		Integer x = en.getFirst();
		
		
		// After type erasure the compiler will change the above code to
		/*
			ExtendedNode en2 = new ExtendedNode(10);
			TopNode n2 = (ExtendedNode)en2;
			n2.setFirst("Test");
			Integer x2 = (String)en2.getFirst();
		*/
		
		// And so the ClassCastException is thrown
	}
}
