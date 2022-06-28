package chapter07;

public class InstanceofExample {
	public static void main(String[] args) {
		Parent parent1 = new Child();
		method1(parent1);
		method2(parent1);
		
		Parent parent2 = new Parent();
		method1(parent2);
		method2(parent2);
	}
	
	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - child로 변환 성공");
		} else {
			System.out.println("method1 - child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - child로 변환 성공");
	}
}
