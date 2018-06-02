
public class GenericClass<X> {

	private X val;

	<T> GenericClass(T t) {
		this.val = (X) t;
	}

	public X getVal() {
		return val;
	}
}
