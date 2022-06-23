package chapter06;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton1 == singleton2);
//		Singleton singleton2 = new Singleton();
//		Singleton singleton3 = new Singleton();
//		Singleton singleton4 = new Singleton();
//		Singleton singleton5 = new Singleton();
	}
}
