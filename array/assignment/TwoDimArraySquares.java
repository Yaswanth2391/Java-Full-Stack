package com.array.assignment;

public class TwoDimArraySquares {

	public static void main(String[] args) {

		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.println("Original Array:");
		displayArray(array);

		System.out.println("\nSquares of the elements:");
		displaySquares(array);
	}

	public static void displayArray(int[][] array) {
		for (int[] row : array) {
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

	public static void displaySquares(int[][] array) {
		for (int[] row : array) {
			for (int num : row) {
				System.out.print(num * num + " ");
			}
			System.out.println();
		}
	}
}
