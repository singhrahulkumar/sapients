package com.String;

public class ReverseWholeString {

	public static void main(String[] args) {
		String sentense = "Java Concept Of The Day";
		sentense = reverse(sentense);
		System.out.println(sentense);

	}

	private static String reverse(String string) {
		String[] arr = string.split(" ");
		String rSentense = "";
		for (String s : arr) {
			rSentense = rSentense + reverseWord(s)+" ";
		}
		return rSentense;
	}

	private static String reverseWord(String s) {
		String word = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			word = word + s.charAt(i);
		}
		return word;
	}

}
