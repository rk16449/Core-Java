// What the java compiler does to the NodeComparable.java code

public class NodeComparableReplacement {
	private Comparable first;
	private Node next;
	
	public NodeComparableReplacement(Comparable first, Node next) {
		this.first = first;
		this.next = next;
	}
	
	public Comparable getFirst() {
		return first;
	}
	
	public Node getNext() {
		return next;
	}
}
