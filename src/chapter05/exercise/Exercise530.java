package chapter05.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise530 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 바위 보 게임");

		// 입력
		System.out.print("게이머:");
		String player = scanner.nextLine();
		
		String[] computerArr = {"가위", "바위", "보"};
		Random random = new Random();
		int ranNum = random.nextInt(3); // 0부터 2까지
		String computer = computerArr[ranNum];
		
		// 처리
		String result = "";
		if (player.equals(computer)) {
			result = "비김";
		} else if (player.equals("가위") && computer.equals("보") || player.equals("바위") && computer.equals("가위")
				|| player.equals("보") && computer.equals("바위")) {
			result = "플레이어 승리";
		} else {
			result = "컴퓨터 승리";
		}
		// 출력
		System.out.println("플레이어: " + player);
		System.out.println("컴퓨터: " + computer);
		System.out.println("결과: " + result);
	}
}
