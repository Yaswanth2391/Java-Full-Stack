package com.stringtask.assignment;

public class CharAtIndex {

	public static void main(String[] args) {

		String orgname = "Yaswanth@gmail.com";

		int index = 8;

		if (index >= 0 && index < orgname.length()) {

			char charAtIndex = orgname.charAt(index);
			System.out.println("Character at index " + index + " is: " + charAtIndex);
		} else {
			System.out.println("Index out from string is:");
		}
	}
}