package chapter06;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.deptId = "컴공";
		s1.year = "3";
		s1.studentId = "C1601";
		s1.name = "한영삼";
		s1.idNumber = "000708-3******";
		s1.age = 20;
		s1.displayStudent();
		System.out.println(s1.name);
		
		Student s2 = new Student();
		s2.deptId = "컴공";
		s2.year = "3";
		s2.studentId = "C1602";
		s2.name = "서희경";
		s2.idNumber = "990205-2******";
		s2.displayStudent();
		
		Student s3 = new Student();
		s3.deptId = "컴공";
		s3.year = "2";
		s3.studentId = "C1701";
		s3.name = "이정민";
		s3.idNumber = "011109-4******";
		s3.displayStudent();
		
		
	}
}
