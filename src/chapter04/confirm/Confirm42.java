package chapter04.confirm;

public class Confirm42 {
	public static void main(String[] args) {
		/*
		 * for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해보세요.
		 */
		int sum = 0;
		int a;
		for (a = 1; a <= 100; a++) {
			if (a % 3 == 0) {
				sum += a;
				System.out.println(a);
			}
		}
		System.out.println("총합은 :" + sum);
	}
}
