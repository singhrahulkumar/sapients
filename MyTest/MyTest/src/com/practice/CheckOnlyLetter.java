package com.practice;

public class CheckOnlyLetter {

	public static void main(String[] args) {

		String s = "Geeks4ForGeeks";
		boolean flag = false;
		//flag = ((!s.equals("") && s!= null &&s.chars().allMatch(Character::isLetter)));
		
		 flag = ((!s.equals("")) && s != null && s.chars().allMatch(Character::isLetter));
		if(flag) 
			System.out.println("only alphabet");
		else
			System.out.println("alpha numeric");

	}
}
