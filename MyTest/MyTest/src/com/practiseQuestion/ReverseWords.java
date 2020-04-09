package com.practiseQuestion;

public class ReverseWords {

	public static void main(String[] args) {

		String s = "Welcome to java world";

		String[] sarr = s.split(" ");
		System.out.println(sarr.length);

		for (int i = sarr.length - 1; i >= 0; i--)
			System.out.print(sarr[i]+" ");
	}

}
