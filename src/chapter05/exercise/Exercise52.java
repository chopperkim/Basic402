package chapter05.exercise;

import java.util.Random;

public class Exercise52 {
	public static void main(String[] args) {
		/*
		 * 로또번호를 생성하는 프로그램을 작성하시오.
		 * (로또 번호는 1 ~ 45번까지 있으며
		 * 이 중에서 중복되지 않는 6개의 숫자를 추출하여
		 * 결과를 출력한다.)
		 */
		/* numbers
		 * -----------------------------------------------------
		 * | 0 | 1 | 2 | 3 | 4 | 5 | . | . | . | . | 42| 43| 44|
		 * -----------------------------------------------------
		 * | 1 | 2 | 3 | 4 | 5 | 6 |   |   |   |   | 43| 44| 45|
		 * -----------------------------------------------------
		 * 
		 * -------
		 * | num |
		 * -------
		 * |  41 |
		 * -------
		 */
		int[] numbers = new int[45];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			int ranNum = random.nextInt(45);
			
			int temp = numbers[i];
			numbers[i] = numbers[ranNum];
			numbers[ranNum] = temp;
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(numbers[i] + " ");
		}
		
	}
}
