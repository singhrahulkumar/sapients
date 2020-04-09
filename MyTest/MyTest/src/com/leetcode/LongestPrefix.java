package com.leetcode;

public class LongestPrefix {

	public static void main(String[] args) {
		String[] strArr = { "java2blog", "javaworld", "javabean", "javatemp" };
		String longestPrefix = getLongestCommonPrefix(strArr);
	//	String longestPrefix1 =  getLongestCommonPrefix1(strArr);
		System.out.println("Longest Prefix : " + longestPrefix);
	}


	public static String getLongestCommonPrefix(String[] strArr) {
		if(strArr.length == 0)
			return "";

		String minString = getMinimumStringLength(strArr);
		int minStringLength = minString.length();
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < minString.length(); j++) {
				if (strArr[i].charAt(j) != minString.charAt(j)) {
					minStringLength = j;
					break;
				}
			}
		}
		return minString.substring(0,minStringLength);
	}

	private static String getMinimumStringLength(String[] strArr) {
		int length = strArr[0].length();
		String s = "";
		for (int i = 1; i < strArr.length; i++) {
			if (strArr[i].length() < length) {
				s = strArr[i];
			}
		}

		return s;
	}

}
