package com.practice;

public class ReverseTheGivenString {

	public static void main(String[] args) {

		String s = "Abhishek";

		char[] c = s.toCharArray();

		for (int i = 0, j = c.length - 1; i < j; i++, j--) {

			char temp = c[j];
			c[j] = c[i];
			c[i] = temp;

		}

		s = new String(c);
		System.out.println(s);

		String r = "Ramchandra";
		char t[] = r.toCharArray();

		for (int i = 0; i < t.length / 2; i++) {
			char temp = t[i];
			t[i] = t[t.length-1-i];
			t[t.length-1-i] = temp;
		}
		
		System.out.println(new String(t));

	}

}
