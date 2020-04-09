package com.practice;

// number of word using hashmap
public class CountWord {

	public static void main(String[] args) {
		boolean flag = true;
		int n = 51;
		for (int i = 2; i <= n / 2; i++) {
			if (n % 2 == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("prime");
		else
			System.out.println("Not prime");

	}

}
