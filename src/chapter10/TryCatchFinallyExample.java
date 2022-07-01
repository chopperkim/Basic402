package chapter10;


public class TryCatchFinallyExample {
	public static void main(String[] args) {
		// 1. try catch
		try {
			Class.forName("java.lang.String");
			throw new RuntimeException("나만의 실행 예외");
		} catch (ClassNotFoundException e) {
			System.err.println("클래스가 존재하지 않습니다.");
//		} catch (RuntimeException e) {
//			System.out.println("예외 발생");
		}
//		run();
	}
	
	static void run() throws Exception {
		// 2. throws exception
		Class.forName("java.lang.String2");
	}
}
