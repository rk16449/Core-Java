// Invoke Integer methods into T
public class InvokeMethods<T extends Integer> {

	private T value;

	public InvokeMethods(T v) {
		this.value = v;
	}
	
	// isOdd invokes the intValue method defined in Integer class through value
	public boolean isOdd() {
		return value.intValue() % 2 != 0;
	}
}
