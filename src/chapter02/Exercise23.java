package chapter02;

import java.util.Scanner;

public class Exercise23 {
	public static void main(String[] args) {
		/*
		 * 원기둥 밑면의 반지름과 높이를 입력 받아서
		 * 밑면의 넓이와 부피를 계산하는 프로그램을 작성하여 보자.
		 * 원주율은 Math.PI를 사용한다.
		 */
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.print("원기둥의 밑면의 반지름을 입력하세요.(단위: cm): ");
		double radius = scanner.nextDouble();
		System.out.println("원기둥의 높이를 입력하세요.(단위: cm): ");
		double height = scanner.nextDouble();
		// 처리
		double area = Math.PI * radius * radius;
		double volume = area * height;
		// 출력
		System.out.printf("원기둥 밑면의 넓이: %f㎠, 부피: %f㎤이다.", area, volume);
//		System.out.println("원기둥 밑면의 넓이: " + area +"㎠, 부피: " + volume + "㎤이다.");
		scanner.close();
	}
}




