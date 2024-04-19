package com.stringtask.assignment;

public class WordCapitalizer {
	public static void main(String[] args) {

		String s = "b.v.raju college";

		String[] words = s.split("\\s+");

		for (int i = 0; i < words.length; i++) {

			if (words[i].equalsIgnoreCase("raju")) {

				words[i] = "RAJU";
			}
		}

		String result = String.join(" ", words);
		System.out.println(result);
	}
}
