public class MultiplePair <K, V> implements iPair<K, V> {

	private K key;
	private V value;
	
	// Constructor
	public MultiplePair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}
