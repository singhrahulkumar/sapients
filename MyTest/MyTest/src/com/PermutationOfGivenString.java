package com;

import java.util.ArrayList;

public class PermutationOfGivenString {

	static ArrayList<String> result = new ArrayList<>();

	public static void main(String[] args) {
		String f = "";
		String u = "ABC";
		ArrayList<String> result = permutation(f, u);
		for (String string : result) {
			System.out.print(string + " ");
		}
	}

	private static ArrayList<String> permutation(String f, String u) {

		if (u.length() == 0) {
			result.add(f);
			return result;
		}

		for (int i = 0; i < u.length(); i++) {
			String fixed = f + u.charAt(i);
			String unfixed = u.substring(0, i) + u.substring(i + 1);
			permutation(fixed, unfixed);

		}
		return result;

	}

}
