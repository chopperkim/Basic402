package chapter03.confirm;

import java.util.Random;

public class NullExample {
	public static void main(String[] args) {
		Random random = null;
		System.out.println(random);
		
		random = new Random();
		int ranNum = random.nextInt();
	}
}
