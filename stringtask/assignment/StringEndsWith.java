package com.stringtask.assignment;

public class StringEndsWith {
	public static void main(String[] args) {

		String mainString = "Yaswanth@gmail.com";
		String endingString = ".com";

		boolean endsWith = mainString.endsWith(endingString);

		if (endsWith) {
			System.out.println("The main string ends with the ending string.");
		} else {
			System.out.println("The main string does not end with the ending string.");
		}
	}
}
