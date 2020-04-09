package com.prepare;

public class LengthOfString {

	public static void main(String[] args) {
		String s = "Abhishek";
		char[] c = s.toCharArray();
		int l = 0;
		for (char d : s.toCharArray()) {
			l++;
		}
		System.out.println(l);

		for (int i = 0; i < s.length(); i++) {
			boolean flag = false;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					flag = true;
					System.out.print(s.charAt(i) + " ");
				}
			}
			if(!flag){
				System.out.println(s.charAt(i));
				break;
			}
		}
	}

}
