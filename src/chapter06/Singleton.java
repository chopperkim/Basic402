package chapter06;

public class Singleton {
	// chocojhkim@daum.net
	private static Singleton instance;
	private Singleton() {
	}
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
