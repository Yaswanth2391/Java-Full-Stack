package com.javafullstack.assignment2;

public class calculateDifference {
	public static int squareDiff(int n) {
		int sumOfSquares = 0;
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sumOfSquares += Math.pow(i, 2);
			sum += i;
		}

		int squareOfSum = (int) Math.pow(sum, 2);
		int absDifference = Math.abs(sumOfSquares - squareOfSum);
		return absDifference;
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println(squareDiff(n));
	}
}
