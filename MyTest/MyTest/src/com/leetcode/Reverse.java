package com.leetcode;

public class Reverse {

	public static void main(String[] args) {
		Reverse r = new Reverse();
		Integer r1 = r.reverse(901000);
		System.out.println(r1);
	}

	public Integer reverse(Integer x) {
		Integer backup = x;
		if (x < 0) {
			x = x * -1;
		}
		Integer sb1 = 0;
		try {
			sb1 = Integer.valueOf(new StringBuilder(String.valueOf(x)).reverse().toString().replaceFirst("^0*", ""));
		} catch (Exception e) {
			return 0;
		}
		if (backup < 0)
			return -1 * sb1;
		return sb1;
/*
		int backUp = x;
		StringBuilder sb = new StringBuilder();
		if (x < 0) {
			x = -1 * x;
		}
		while (x > 0) {
			int rem = x % 10;
			if (rem == 0) {
				x = x / 10;
				continue;
			} else {
				x = x / 10;
				sb.append(rem);
			}
		}
		String s = "";
		if (backUp < 0) {
			s = "-";
		}
		s = s + new String(sb);
		Integer i = 0;
		try {
			i = Integer.valueOf(s);
		} catch (Exception e) {
			return 0;
		}
		return i;*/

	}

}
