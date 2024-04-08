package com.javafullstack.assignment2;

public class powerOfTwo {

	public static void checkNumber(int n) {
		boolean isPowerOfTwo = true;
		int num = n;
		while (n > 1) {
			if (n % 2 != 0)
				isPowerOfTwo = false;
			n = n / 2;
		}
		if (isPowerOfTwo)
			System.out.println("Given number " + num + " is power of 2");
		else
			System.out.println("Given number " + num + " is not power of 2");
	}

	public static void main(String[] args) {
		int n = 6;
		checkNumber(n);
		n = 8;
		checkNumber(n);
		n = 24;
		checkNumber(n);
		n = 512;
		checkNumber(n);
	}
}
