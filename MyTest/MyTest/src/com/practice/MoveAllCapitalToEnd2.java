
package com.practice;

public class MoveAllCapitalToEnd2 {

	public static void main(String[] args) {
		
		String str = "Geeksforgeeks A Computer Science Portal for Geeks!!";
		String l ="";
		String u ="";
		for(int i = 0 ; i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch> 'A' && ch<'Z') {
				u +=ch;
			}else {
				l +=ch;
			}
		}
		System.out.println(l+u);	
		
		
	}
}
