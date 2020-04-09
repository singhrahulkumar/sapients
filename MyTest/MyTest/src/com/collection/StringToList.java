package com.collection;

import java.util.ArrayList;
import java.util.List;

public class StringToList {

	public static void main(String[] args) {

		// Get the String to be converted
		String str = "Geek";

		// Get the List of Character
		List<Character> chars = convertStringToCharList(str);

		// Print the list of characters
		System.out.println(chars);
	}

	private static List<Character> convertStringToCharList(String str) {
		char[] list = str.toCharArray();
		List<Character> chars = new ArrayList<>();
		
		for (char c : list) {
			chars.add(c);
		}
		return chars;
	}

}
