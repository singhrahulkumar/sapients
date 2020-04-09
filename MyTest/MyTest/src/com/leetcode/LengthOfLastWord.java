package com.leetcode;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String s = "avf kkk cc";
		int k =check(s);
		System.out.println(k);
	}

	private static int check(String s) {
		String[] sarr = s.split(" ");
		int l = sarr.length;
		if(l==0) 
			return 0;
		int k = sarr[sarr.length-1].length();
		return k;
	}

}
