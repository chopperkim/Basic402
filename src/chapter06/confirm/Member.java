package chapter06.confirm;

public class Member {
	String name;
	String id;
	String password;
	int age;
	// Default Constructor(기본 생성자)
	Member() {
		
	}
	// 매개값(매개변수)이 있는 생성자
	Member(String name, int age) {
		// this: 메모리에 위치한 객체 자기 자신을 가리킨다.
		this.name = name;
		this.age = age;
	}
	Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	void run() {
		System.out.println(this.name);
	}
	
}
