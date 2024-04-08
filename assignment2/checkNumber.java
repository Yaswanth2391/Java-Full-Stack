package com.javafullstack.assignment2;

import java.util.Scanner;

public class checkNumber {
	public static void main(String args[]) {

		int num;
		boolean isIncreasing = true;

		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("Enter a number : ");
			num = scanner.nextInt();

			int currentDigit = num % 10;
			num = num / 10;

			while (num > 0) {

				if (currentDigit <= num % 10) {
					isIncreasing = false;
					break;
				}

				currentDigit = num % 10;
				num = num / 10;
			}

			if (!isIncreasing) {
				System.out.println("Digits are not in increasing order.");
			} else {
				System.out.println("Digits are in increasing order.");
			}
		}

	}
}
