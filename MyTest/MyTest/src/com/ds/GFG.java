package com.ds;

public class GFG {
	static final int NO_OF_CHARS = 256;

	public static void main(String args[]) {
		String str = "aaGeeksforGeeks";
		printDistinct(str);
	}

	private static void printDistinct(String str) {
		int[] arr = new int[256];
		int i = 0;
		for (char c : str.toCharArray()) {
			arr[c]++;
			i++;
		}
		for (int k = 0; k < i; k++) {
			if (arr[str.charAt(k)] == 1) {
				System.out.println(str.charAt(k));
			}
		}

	}
}