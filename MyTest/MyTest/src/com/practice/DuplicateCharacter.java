package com.practice;

public class DuplicateCharacter {

	public static void main(String[] args) {

		String a = "Abhisheikke";
		for (int i = 0; i < a.length() - 1; i++) {
			for (int j = i + 1; j <= a.length() - 1; j++) {
				if (a.charAt(i) == a.charAt(j)) {
					System.out.print(a.charAt(i) + " ");
					break;
				}
			}
		}

	}

}
