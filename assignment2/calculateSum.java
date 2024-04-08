package com.javafullstack.assignment2;

public class calculateSum {

	public static void main(String[] args) {
		int n = 100;
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum += i;
			}
		}

		System.out.printf(
				"Calculate Sum:Sum of first n natural numbers from 1 to %d which are divisible by 3 and 5 is %d", n,
				sum);
	}

}
