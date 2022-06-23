package chapter02;

import java.util.Scanner;

public class Exercise24 {
	public static void main(String[] args) {
		/*
		 * 사용자로부터 500원, 100원, 50원, 10원짜리
		 * 동전의 갯수를 입력 받아
		 * 저금통 안에 총 얼마가 들어 있는지
		 * 출력하는 프로그램을 만들어 보자.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("500원짜리 동전의 개수: ");
		int coin500 = scanner.nextInt();
		System.out.print("100원짜리 동전의 개수: ");
		int coin100 = scanner.nextInt();
		System.out.print("50원짜리 동전의 개수: ");
		int coin50 = scanner.nextInt();
		System.out.print("10원짜리 동전의 개수: ");
		int coin10 = scanner.nextInt();
		
		int totalCoin = 500 * coin500 + 100 * coin100 + 50 * coin50 + 10 * coin10;
		System.out.println("동전의 총 금액: " + totalCoin);
		scanner.close();
	}
}
