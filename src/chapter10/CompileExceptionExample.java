package chapter10;

public class CompileExceptionExample {
	public static void main(String[] args) {
		// 리플렉션(reflection)
		try {
			Class.forName("java.1ang.String");
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.err.println("클래스명이 올바르지 않습니");
		}
		System.out.println("abcd");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("efgh");
	}
}
