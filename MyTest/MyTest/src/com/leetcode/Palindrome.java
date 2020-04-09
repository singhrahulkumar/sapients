package com.leetcode;

public class Palindrome {

	public static void main(String[] args) {
		boolean flag = palindrome(-121);
		System.out.println(flag);
	}

    public static boolean palindrome(int x) {
        
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        sb.reverse();
        if(String.valueOf(x).equals(sb.toString()))
            return true;
        else
            return false;
        
        
    }
	
}
