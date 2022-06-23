package chapter04.confirm;

import java.util.Random;

public class Confirm43 {
	public static void main(String[] args) {
		Random random = new Random();
		
		while (true) {
			int  i = random.nextInt(6) + 1;
			int  o = random.nextInt(6) + 1;
			System.out.println("(" + i + "," + o + ")");
			if((i + o)==5) {
				break;
			}
		}
	}
}
