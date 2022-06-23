package chapter02;

public class VariableExchangeExample {
	public static void main(String[] args) {
		double d = 10;
		int x = 30000;
		int y = 5;
//		System.out.println("x: " + x + ", y: " + y);
		System.out.printf("x: %,d, y: %,5d %s %.3f\n", x, y, "가나다", 3.14);
		
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("x: " + x + ", y: " + y);
	}
}
