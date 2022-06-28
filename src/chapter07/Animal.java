package chapter07;

public abstract class Animal {
	private String kind;

	public Animal(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void breath() {
		System.out.println("숨을 쉰다.");
	}
	public abstract void sound();
}










