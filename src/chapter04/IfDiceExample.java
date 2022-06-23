package chapter04;

import java.util.Random;

public class IfDiceExample {
	public static void main(String[] args) {
		/*
		 * 랜덤 숫자 만들기
		 * 
		 * 1. 좋지 않은 방식
		 * int randomNum = (int) (Math.random() * 총개수) + 시작숫자;
		 * 
		 * 2. 좋은 방식
		 * Random random = new Random();
		 * int randomNum = random.nextInt(총개수) + 시작숫자;
		 * 
		 * 3. 보안 적용
		 * SecureRandom secureRandom = new SecureRandom();
		 * int randomNum = secureRandom.nextInt(총개수) + 시작숫자;
		 * 
		 * SecureRandom random = SecureRandom.getInstanceStrong();
		 * int randomNum = random.nextInt(총개수) + 1;
		 */
		Random random = new Random();
		for (int i = 0; i < 2; i++) {
			int num1 = random.nextInt(6) + 1;
			System.out.println(num1);
		}

	}
}





