package com.stringtask.assignment;

public class CapitalLetters {

	public static void main(String[] args) {

		String Sentence = "Hi This Is Yaswanth From Java Full Stack Batch 2 in odigoS.";

		for (int i = 0; i < Sentence.length(); i++) {
			char ch = Sentence.charAt(i);

			if (Character.isUpperCase(ch)) {

				System.out.print(ch + " ");
			}
		}
	}
}