package com.practice;

public class ReverseString {

	public static void main(String[] args) {

		String a = "Abhishek";
		char c[] = a.toCharArray();

	/*	for (int i = 0, k = a.length() - 1; i < k; i++, k--) {
			char temp = c[k];
			c[k] = c[i];
			c[i] = temp;
		}
		System.out.println(new String(c));*/
		String r ="";
		for(int i = a.length()-1;i>=0;i--) {
			r = r + c[i];
		}
		System.out.println(r);
		
		

	}

}
