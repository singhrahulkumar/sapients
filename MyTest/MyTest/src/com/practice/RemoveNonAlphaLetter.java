package com.practice;

public class RemoveNonAlphaLetter {

	public static void main(String[] args) {

		String str = "Hello, how are you ?";
		String str1 = "";
		for (Character s : str.toCharArray()) {
			if (s >= 'A' && s <= 'Z' || s >= 'a' && s <= 'z' || s == ' ')
				str1 = str1 + s;
		}
		System.out.println(str1);
	}

}
