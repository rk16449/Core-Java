// Generic Node in a singly-linked list
// Because T is unbounded, the Java compiler will replace it with Object
// See NodeReplacement.java for how the compiler will change the above code

public class Node<T> {

	private T first;
	private Node<T> next;

	public Node(T first, Node<T> next) {
		this.first = first;
		this.next = next;
	}

	public T getFirst() {
		return first;
	}

	public Node<T> getNext() {
		return next;
	}
}