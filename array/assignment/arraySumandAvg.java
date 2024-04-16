package com.array.assignment;

public class arraySumandAvg {
	public static void main(String[] args) {

		int[] array = { 5, 10, 15, 20, 25 };

		int sum = 0;
		double average;

		for (int num : array) {
			sum += num;
		}

		average = (double) sum / array.length;

		System.out.println("Sum of elements in the array: " + sum);
		System.out.println("Average of elements in the array: " + average);
	}
}
