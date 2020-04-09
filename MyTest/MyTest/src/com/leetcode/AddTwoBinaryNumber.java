package com.leetcode;

public class AddTwoBinaryNumber {

	public static void main(String[] args) {
		long binary1, binary2;
		int i = 0, carry = 0;
		int[] sum = new int[20];

		binary1 = 1101l;
		binary2 = 1100l;

		while (binary1 != 0 || binary1 != 0) {

			sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + carry) % 2);
			carry = (int) ((binary1 % 10 + binary2 % 10 + carry) / 2);
			binary1 = binary1 / 10;
			binary2 = binary2 / 10;

		}
		if (carry != 0) {
			sum[i++] = carry;
		}
		--i;
		while (i >= 0)
			System.out.print(sum[i--]);

	}

}
