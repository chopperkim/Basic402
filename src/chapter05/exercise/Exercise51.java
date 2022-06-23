package chapter05.exercise;

public class Exercise51 {
	public static void main(String[] args) {
		/*
		 * 다음 배열에서 최댓값과 최솟값을 구하시오.
		 * {38, 94, 16, 3, 76, 94, 82, 47, 59, 8}
		 */
		int[] array = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<array.length; i++) {
		if(max<array[i]) {
		          
			max = array[i];
		}
		if(min>array[i]) {
			min = array[i];
		}
			
	}
		System.out.println("max : " + max);
		System.out.println("min : " + min); 
	}
}
