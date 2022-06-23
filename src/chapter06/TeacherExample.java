package chapter06;

public class TeacherExample {
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.salary = 100;
		t1.balance = 200;
		Teacher t2 = new Teacher();
		t2.salary = 200;
		t2.balance = 600;
		Teacher t3 = new Teacher();
		t3.salary = 300;
//		t3.balance = 900;
		System.out.println(t1.salary);
		System.out.println(t1.balance);
		
	}
}
