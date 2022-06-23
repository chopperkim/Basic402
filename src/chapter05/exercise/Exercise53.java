package chapter05.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {
	public static void main(String[] args) {
		/*
		 * 인공지능 컴퓨터와 게이머(사람)가 가위바위보 게임을 할 수 있도록 프로그램을 작성하시오.
		 */
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String gamer; // 입력 받을 값
		int aiNum = random.nextInt(3); // 0~2까지 랜덤수
		int gamStr = 0; // 입력값을 정수로
		System.out.println("가위 바위 보 게임");
		System.out.print("게이머 :");
		gamer = scanner.nextLine();

		// 사용자 가위,바위,보 문자를 0~2로 결정
		if (gamer.equals("가위")) {
			gamStr = 0;

		} else if (gamer.equals("바위")) {
			gamStr = 1;
		} else if (gamer.equals("보")) {
			gamStr = 2;
		}

		if (aiNum == 0) {
			System.out.println("인공지능 컴퓨터 : 가위");
		} else if (aiNum == 1) {
			System.out.println("인공지능 컴퓨터 : 바위");
		} else if (aiNum == 2) {
			System.out.println("인공지능 컴퓨터 : 보");
		}

		// 입력 받은 gamStr 값을 랜덤수랑 비교
		switch (gamStr) {
		case 0:
			if (aiNum == 0) {
				System.out.println("비겼습니다.");
			} else if (aiNum == 1) {
				System.out.println("결과 : 컴퓨터 승리!");
			} else if (aiNum == 2) {
				System.out.println("게이머 승리");
			}
			break;
		case 1:
			if (aiNum == 0) {
				System.out.println("비겼습니다.");
			} else if (aiNum == 1) {
				System.out.println("게이머 승리");
			} else if (aiNum == 2) {
				System.out.println("결과 : 컴퓨터 승리!");
			}
			break;
		case 2:
			if (aiNum == 0) {
				System.out.println("결과 : 컴퓨터 승리!");
			} else if (aiNum == 1) {
				System.out.println("결과 : 게이머 승리!");
			} else if (aiNum == 2) {
				System.out.println("비겼습니다.");
			}
			break;
		}

	}
}
