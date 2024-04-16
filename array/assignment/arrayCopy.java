package com.array.assignment;

public class arrayCopy {
	public static void main(String[] args) {

		int[] originalArray = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int[] copiedArray = new int[8];

		for (int i = 0; i < originalArray.length; i++) {
			copiedArray[i] = originalArray[i];
		}

		System.out.println("Elements in copiedArray:");
		for (int num : copiedArray) {
			System.out.print(num + " ");
		}
	}
}