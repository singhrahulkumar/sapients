package com.String;

public class RemoveLeadingZero {

	public static void main(String[] args) {
		String n = "000012345";
		int i = 0;
		while(i<n.length() && n.charAt(i) == '0') {
			i++;
		}
		String finalS = n.substring(i,n.length());
		System.out.println(finalS);
	}
}
