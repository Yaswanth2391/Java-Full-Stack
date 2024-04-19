package com.stringtask.assignment;

public class CapitalizeFirstLetter {
	public static void main(String[] args) {

		String s = "java standard edition";

		String[] words = s.split("\\s++");

		StringBuilder result = new StringBuilder();

		for (String word : words) {

			String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);

			result.append(capitalizedWord).append(" ");
		}

		String capitalizedString = result.toString().trim();

		System.out.println("Original string: " + s);
		System.out.println("Capitalized string: " + capitalizedString);
	}
}