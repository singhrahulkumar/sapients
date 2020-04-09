package com.practice;

public class RemoveFromGivenString {

	public static void main(String[] args) {

		String str = "Geeks For Geeks";
		String word = "For";
		int i = str.indexOf(word);
		System.out.println(i);

		String s = str.substring(0, str.indexOf(word)) + str.substring(str.indexOf(word)+word.length()+1);
		System.out.println(s);
		System.out.println(str);
		String s1 ="";
		if(str.contains(word)) {
			s1=str.replaceAll(word, "");
		}
		System.out.println(s1);
	}

}
