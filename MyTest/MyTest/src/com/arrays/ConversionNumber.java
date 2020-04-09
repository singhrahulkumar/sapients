package com.arrays;

public class ConversionNumber {

	public static void main(String[] args) {
		convertToBinary(50);
		converToOcta(1000);
		convertToHexa(2000);
	}

	private static void convertToBinary(int num) {
		StringBuffer binary = new StringBuffer();
		while (num > 0) {
			int b = num % 2;
			binary = binary.append(b);
			num = num /2;
		}
		System.out.println(binary.reverse());
	}

	private static void converToOcta(int num) {
		StringBuffer binary = new StringBuffer();
		while (num > 0) {
			int b = num % 8;
			binary = binary.append(b);
			num = num /8;
		}
		System.out.println(binary.reverse());
	}

	private static void convertToHexa(int num) {
		char hexaDecimals[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		StringBuffer binary = new StringBuffer();
		while (num > 0) {
			int b = num % 16;
			binary = binary.append(hexaDecimals[b]);
			num = num /16;
		}
		System.out.println(binary.reverse());
		
	}

}
