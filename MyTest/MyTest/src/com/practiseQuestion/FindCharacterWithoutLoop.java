package com.practiseQuestion;

public class FindCharacterWithoutLoop {

	public static void main(String[] args) {

		String s = "abhisheke";
		
		int n = s.length() - s.replaceAll("h", "").length();
		System.out.println(n);
		
	}

}
