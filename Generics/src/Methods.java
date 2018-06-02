
public class Methods {
	/** Generic static method for comparing if two Pair objects share the same value
	 * 
	 * @param p1
	 * @param p2
	 * @return true if values the same
	 */
	public static <K, V> boolean compareValues(iPair<K, V> p1, iPair<K, V> p2) {
		return p1.getValue().equals(p2.getValue());
	}
	
	public static <K, V> boolean compareKeys(iPair<K, V> p1, iPair<K, V> p2) {
		return p1.getKey().equals(p2.getKey());
	}
}
