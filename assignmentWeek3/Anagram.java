package assignmentWeek3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		//To Check length of both the strings
		if(text1.length() != text2.length()) {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
			return; 
		}
		//Converting strings to arrays
		char[] array1 = text1.toCharArray();
		char[] array2 = text2.toCharArray();

		//Sorting arrays
		Arrays.sort(array1);
		Arrays.sort(array2);
		//Printing two array value after sorting
		System.out.println(array1);
		System.out.println(array2);
		//IfElse Condition To Check the given string is an anagram or not
		if(Arrays.equals(array1, array2)) {
			System.out.println("The given strings are Anagram");
		}
		else {
			System.out.println("The given strings are not an Anagram");
		}
	}

}
