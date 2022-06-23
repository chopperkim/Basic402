package chapter06;

public class HumanExample {
	public static void main(String[] args) {
		Human human = new Human();
		HumanExample2 example2 = new HumanExample2();
		// 9번째 라인보다 나중에 실행된다고 가정
		example2.testHuman(human);
//		human.age = 10;
		human.setAge(10);
//		System.out.println(human.age);
		System.out.println(human.getAge());
	}
}
