package com.arrays;

public class Armstrong {

	public static void main(String[] args) {

		double sum = 0;
		int number = 153;
		int fn = number;
		int n = number;
		int count = String.valueOf(number).length();
		System.out.println(count);
		while (n > 0) {
			number = n % 10;
			sum = sum + Math.pow(number, count);
			n /= 10;
		}
		if (sum == fn)
			System.out.println("Armstrong");
		else {
			System.out.println("Not Armstrong");
		}
	}

}
