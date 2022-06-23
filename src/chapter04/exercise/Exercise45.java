package chapter04.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		/*
		 * 컴퓨터가 1부터 100 사이의 임의의 정수를 생성하면, 그 수를 맞추는 게임을 만들어보자. 사용자가 추측한 수를 입력하면, 컴퓨터가 생성한
		 * 수보다 큰지 작은지를 알려준다. 사용자가 추측한 수가 컴퓨터가 생성한 수와 같을 때까지 반복한다. 1부터 100까지의 랜덤 숫자는 new
		 * Random().nextInt(100) + 1로 구할 수 있다.
		 */

		boolean run = true;

		Random random = new Random();
		int ran = random.nextInt(100) + 1;
		System.out.println("랜덤수: " + ran);

		Scanner scanner = new Scanner(System.in);
		int cnt = 0;
		while (run) {
			cnt++;
			System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");
			int input = scanner.nextInt();
			if (input > 100) {
				System.out.println("1~100까지만");
			} else if (input == ran) {
				run = false;
			} else if (input > ran) {
				System.out.println("더 작은 수 입니다");
			} else if (input < ran) {
				System.out.println("더 큰 수 입니다.");
			}
		}
		System.out.println("정답입니다.");
		System.out.println(cnt + "번 만에 맞추셨습니다.");
		scanner.close();
	}
}
