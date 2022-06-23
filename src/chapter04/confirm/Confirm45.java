package chapter04.confirm;

public class Confirm45 {
	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {// row
			for(int j=1; j<=i; j++) {// column
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
