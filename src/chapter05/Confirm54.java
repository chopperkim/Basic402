package chapter05;

public class Confirm54 {
	public static void main(String[] args) {
		// int max = Integer.MAX_VALUE;
		// int min = Integer.MIN_VALUE;
		int max = 0;// 최소값
		int[] array = { 1, 5, 3, 8, 2, 10 };
		int min = array[0];// 최대값

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}
}
