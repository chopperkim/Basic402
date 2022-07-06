package chapter12;

public class Box<T> {
	private T value;
	public Box() {
	}
	public Box(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("Box [value=%s]", value);
	}
	
}
