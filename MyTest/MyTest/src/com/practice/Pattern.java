package com.practice;

public class Pattern {

	public static void main(String[] args) {
		printPattern(7);
	}

	private static void printPattern(int n) {
		int place = 3;
		int c = 0;
		for (int i = 0; i < n; i++) {
			place = 3;
			for (int j = 0; j < n; j++) {
				if ((i + j) == place) {
					place = place + 2;
					System.out.print("*");
					c++;
					if(c==(i+1)){
						break;
					}
				} else
					System.out.print(" ");
			}

			System.out.println();
		}
	}

}
