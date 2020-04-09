package com.hacker;


public class GFGPract {

	public static void main(String[] args) {
		String s = "GeeksForGeeks";
		int k = 3;
		checkString(s, k);
	}

	private static void checkString(String s, int k) {

		String crrstr = s.substring(0, k);
		String largest = crrstr;
		String smallest = crrstr;

		for (int i = k; i < s.length(); i++) {
			crrstr = crrstr.substring(1, k) + s.charAt(i);			
			if(crrstr.compareTo(largest)>0) {
				largest= crrstr;
			}
			if(crrstr.compareTo(smallest)<0) {
				smallest = crrstr;
			}
		}
		System.out.println(smallest + " " +largest);

	}

}
