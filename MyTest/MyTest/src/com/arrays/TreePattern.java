package com.arrays;

public class TreePattern {

	public static void main(String[] args) {

		int noOfRows = 9;
		int rowCount = 1;

		for (int i = noOfRows; i > 0; i--) {

			// for space
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for(int k = 1 ; k<= rowCount; k++) {
				System.out.print("* ");
			}
			rowCount++;
			System.out.println();

		}

	}

}
