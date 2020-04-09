package com.String;

public class CheckAlphabetOnly {
	public static void main(String[] args) {

		String s = "A1hishek1rasad";

		char[] c = s.toCharArray();
		boolean flag = true;

		boolean allLetters = s.chars().allMatch(Character::isLetter);
		System.out.println(allLetters);

		String sd = "45789";
		boolean allDigit = sd.chars().allMatch(Character::isDigit);
		System.out.println(allDigit);

		/*
		 * for (char ch : c) { if (!Character.isLetter(ch)) { flag = false; } }
		 * 
		 * if (flag) System.out.println("Only alphabet"); else
		 * System.out.println("alpha numeric");
		 */

	}

}
