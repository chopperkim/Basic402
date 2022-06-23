package chapter04.confirm;

import java.util.Random;
import java.util.Scanner;

public class Confirm47 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;// 잔고, 잔액
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				System.out.print("예금액>");
				balance += scanner.nextInt();
				break;
			case 2:
				System.out.print("출금액>");
				balance -= scanner.nextInt();
				break;
			case 3:
				System.out.println("잔고>" + balance);
				break;
			case 4:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
