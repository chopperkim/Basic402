package chapter07.exercise;

public class Student extends Human {
	private String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
//		return String.format("%s, 전공: %s", super.toString(), major);
		return super.toString() + ", 전공: " + major;
	}
	
}
