package chapter02;

import java.util.Scanner;

public class InputExample {
	public static void main(String[] args) {
		// Scanner를 이용해서 데이터 입력 받기
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int value1 = scanner.nextInt();
		System.out.print("실수를 입력하세요: ");
		double value2 = scanner.nextDouble();
		System.out.print("문자를 입력하세요: ");
		String next = scanner.next();
		System.out.print("문자를 입력하세요: ");
		String nextLine = scanner.nextLine();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(next);
		System.out.println(nextLine);
		
		
	}
}
