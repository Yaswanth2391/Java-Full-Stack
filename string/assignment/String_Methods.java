package com.string.assignment;

public class String_Methods {

	public static void main(String[] args) {
		// String methods
		String str1 = "Yaswanth!2001@gmail.com";
		String str2 = "Pemmadi Yaswanth";
		String str3 = "";

		// method charAt()
		char charAt = str1.charAt(5);
		System.out.println(charAt);// Returns the character at the specified index (position)

		// method codePointAt()
		int codePointAt = str1.codePointAt(4);
		System.out.println(codePointAt);// Returns the Unicode of the character at the specified index

		// method codePointBefore()
		int codePointBefore = str1.codePointBefore(1);
		System.out.println(codePointBefore);// Returns the Unicode of the character before the specified index

		// method codePointCount
		int codePointCount = str1.codePointCount(2, 5);
		System.out.println(codePointCount);// Returns the number of Unicode values found in a string.

		// method compareTo()
		System.out.println(str1.compareTo(str2));// Compares two strings lexicographically

		// method compareToIgnoreCase()
		System.out.println(str1.compareToIgnoreCase(str2));// Compares two strings lexicographically, ignoring case
															// differences

		// method concat()
		System.out.println(str1.concat(str2));// Appends a string to the end of another string

		// method contains()
		System.out.println(str1.contains("Yaswanth"));
		System.out.println(str2.contains("@")); // Checks whether a string contains a sequence of characters

		// method contentEquals()
		System.out.println(str1.contentEquals("gmail"));
		System.out.println(str1.contentEquals("@")); // Checks whether a string contains the exact same sequence of
														// characters of the specified CharSequence or StringBuffer

		// method endsWith()
		System.out.println(str1.endsWith(".com"));
		System.out.println(str1.endsWith("th"));// Checks whether a string ends with the specified character()

		// method equals()
		System.out.println(str1.equals(str2));// Compares two strings. Returns true if the strings are equal, and false
												// if not

		// method equalsIgnoreCase()
		System.out.println(str1.equalsIgnoreCase(str2));

		// method format()
		String format = String.format(str1, "Yaswanth", 1024);
		System.out.println(format);// Returns a formatted string using the specified locale, format string, and
									// arguments

		// method getBytes()
		byte[] getBytes = str1.getBytes();
		System.out.println(getBytes[7]);// Converts a string into an array of bytes

		// method getChars()
		char[] myArray = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		System.out.println(myArray);
		str1.getChars(7, 12, myArray, 4);
		System.out.println(myArray);// Copies characters from a string to an array of chars

		// method hashCode()
		System.out.println(str2.hashCode());// Returns the hash code of a string

		// method indexOf()
		System.out.println(str2.indexOf("Pemmadi"));// Returns the position of the first found occurrence of specified
													// characters in a string

		// method isEmpty()
		System.out.println(str3.isEmpty());// Checks whether a string is empty or not

		// method join()
		String names = String.join(" ", "Yash", "raj", "pavan");
		System.out.println(names);// Joins one or more strings with a specified separator

		// method lastIndexOf()
		System.out.println(str1.lastIndexOf(".com"));// Returns the position of the last found occurrence of specified
														// characters in a string

		// method length()
		System.out.println(str1.length()); // Returns the length of a specified string

		// method offsetByCodePoints()
		int offsetByCodePoints = str2.offsetByCodePoints(3, 2);
		System.out.println(offsetByCodePoints);// Returns the index within this String that is offset from the given
												// index by codePointOffset code points

		// method regionMatches()
		System.out.println(str1.regionMatches(7, str2, 4, 5));
		System.out.println(str1.regionMatches(0, str2, 0, 5));// Tests if two string regions are equal

		// method replace()
		System.out.println(str1.replace('Y', 'p'));// Searches a string for a specified value, and returns a new string
													// where the specified values are replaced

		//

		// method replaceFirst()
		String myStr = "This is javaeclipse";
		String str = "is";
		System.out.println(myStr.replaceFirst(str, "at"));// Replaces the first occurrence of a substring that matches
															// the given regular expression with the given replacement

		// method startsWith()
		System.out.println(myStr.startsWith("Thi"));
		System.out.println(myStr.startsWith("java")); // Checks whether a string starts with specified characters

		// method subSequence()
		System.out.println(str2.subSequence(6, 12));// Returns a new character sequence that is a subsequence of this
													// sequence

		// method substring()
		System.out.println(str1.substring(7, 11));// Returns a new string which is the substring of a specified string

		// method toCharArray()
		char[] toCharArray = str1.toCharArray();
		System.out.println(toCharArray[3]);// Converts this string to a new character array

		// method toLowerCase()
		System.out.println(str2.toLowerCase());// Converts a string to lower case letters

		// method toUpperCase()
		System.out.println(str1.toUpperCase());// Converts a string to upper case letters

		// method toString()
		System.out.println(str1.toString());// Returns the value of a String object

		// method trim()
		String str4 = "       Pemmadi_Yawanth       ";
		System.out.println(str4);
		System.out.println(str4.trim());// Removes whitespace from both ends of a string

		// method valueOf()
		char[] str5 = { 'Y', 'A', 'S', 'H' };
		System.out.println(String.valueOf(str5));
		System.out.println(String.valueOf('A'));
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf(4.5f));
		System.out.println(String.valueOf(5.2));
		System.out.println(String.valueOf(17));
		System.out.println(String.valueOf(1100L));
		// Returns the string representation of the specified value
	}
}
