
public class BoundedBox<T> extends Box<T>{
	// Bounded type parameter
	public <U extends Number> void output(U u) {
		System.out.println("T: " + getBox().getClass().getName());
		System.out.println("U: " + u.getClass().getName());
	}
}
