package com.stringtask.assignment;

public class WordCounter {
	public static void main(String[] args) {

		String orgName = "Hi there  I'am using eclipse for java programs.";

		String[] words = orgName.split("\\s+");

		int wordCount = words.length;

		System.out.println("Number of words in the string: " + wordCount);
	}
}
