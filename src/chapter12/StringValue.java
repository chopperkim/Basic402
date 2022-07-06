package chapter12;

public class StringValue {
	private String value;
	public StringValue(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return String.format("StringValue [value=%s]", value);
	}
}
