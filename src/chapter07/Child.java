package chapter07;

public class Child extends Parent {
	String name;

	public Child() {
		this("홍길동");
	}

	public Child(String name) {
		this("홍길동", 10);
		this.name = name;
	}
	public Child(String name, int age) {
	}
	
}
