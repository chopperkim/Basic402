package chapter07;

public class Cat extends Animal {

	public Cat() {
		super("포유류");
	}
	// 추상클래스를 상속받는 클래스는 반드시 추상메소드를 재정의 해야한다.
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
