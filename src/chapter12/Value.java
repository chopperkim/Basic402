package chapter12;

public class Value {
	private Object value;
	public Value(Object value) {
		this.value = value;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return String.format("Value [value=%s]", value);
	}
}
