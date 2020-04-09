package com.practice;

public class RemoveTrailling {

	public static void main(String[] args) {

		String str = "  Hello World      ";
		char c[] = str.toCharArray();

		int fi = 0;
		int li = 0;
		int countF = 0;
		int countL = 0;
		boolean flag1 = false;
		boolean flag2 = false;
		for (int i = 0, j = str.length() - 1; i < str.length() - 1 | j >= 0; i++, j--) {
			if (!(str.charAt(i) == ' ')) {
				countF += 1;
				if (countF == 1) {
					flag1 = true;
					fi = i;
				}
			}
			if (!(str.charAt(j) == ' ')) {
				countL += 1;
				if (countL == 1) {
					flag2 = true;
					li = j;
				}
			}
			if (flag1 && flag2)
				break;
		}

		System.out.println(fi);
		System.out.println(li);
		System.out.println(str.substring(fi, li + 1));
	}

}
