package chapter04.exercise;

public class ArrayInArrayExampe {
	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		/*      0     1     2
		 *   -------------------
		 * 0 |     |     |     |
		 *   -------------------
		 * 1 |     |     |     |
		 *   -------------------
		 */
		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.printf("mathScores[%d][%d]=%d\n", i, j, mathScores[i][j]);
			}
		}
		int[][] javaScores = {{95, 80}, {92, 96, 80}};
		for (int i = 0; i < javaScores.length; i++) {
			for (int j = 0; j < javaScores[i].length; j++) {
				System.out.printf("%d\n", javaScores[i][j]);
			}
		}
		/*
		 * 향상된 for문(enhanced for loop) => foreach문
		 */
		System.out.println();
		int[][] scores = {{95, 80}, {92, 96, 80}};
		for (int[] score : scores) {
			for (int s : score) {
				System.out.println(s);
			}
		}
		
	}
}
