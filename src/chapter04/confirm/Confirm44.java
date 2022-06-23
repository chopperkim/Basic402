package chapter04.confirm;

public class Confirm44 {
	public static void main(String[] args) {
		for (int x=1; x<=10; x++) {
			for (int y =1 ; y<=10; y++) {
				int num1 = 4 * x;
				int num2 = 5 * y;
				
				if(num1 + num2 == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
	}
}
