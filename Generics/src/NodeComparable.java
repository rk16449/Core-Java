// Consider the following generic class of a singly-linked list
// The java compiler will replace the bounded type parameter T with the first bound class Comparable
// See NodeComparableReplacement for changes by the compiler

public class NodeComparable<T extends Comparable<T>>{

	private T first;
	private Node<T> next;
	
	public NodeComparable(T first, Node<T> next) {
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
