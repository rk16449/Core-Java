// What happens to the Node class by the Java compiler

public class NodeReplacement<Object> {

	private Object first;
	private Node<Object> next;

	public NodeReplacement(Object first, Node<Object> next) {
		this.first = first;
		this.next = next;
	}

	public Object getFirst() {
		return first;
	}

	public Node<Object> getNext() {
		return next;
	}
}