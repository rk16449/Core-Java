/**
 * Generic class of Box
 * @param <T> the type of value being boxed
 */
public class Box <T> {
	// T stands for Type
	private T box;
	
	public void setBox(T newbox) {
		this.box = newbox;
	}
	
	public T getBox() {
		return box;
	}
}
