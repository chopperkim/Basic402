package chapter07;

public class Dog extends Animal {

	void eat() {
		super.breath();
		breath();
		System.out.println("사료를 먹는다.");
	}
	void breath() {
		System.out.println("강아지가 숨을 쉰다.");
	}
}
