package com.stringtask.assignment;

public class StringMatcher {
	public static void main(String[] args) {

		String inputString = "welcome to carrertuner";

		String sequence = "to";

		boolean containsSequence = inputString.matches(".*" + sequence + ".*");

		if (containsSequence) {
			System.out.println("The input string contains the specified sequence of characters.");
		} else {
			System.out.println("The input string does not contain the specified sequence of characters.");
		}
	}
}
