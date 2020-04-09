package com.arrays;

import java.text.DecimalFormat;

public class Test {

	public static void main(String[] args) {

		String s = "12.10";
		// 12.12
		Double d = Double.parseDouble(s);
		System.out.println(d);
		DecimalFormat dec = new DecimalFormat("0.00");
	//	Double d1 = Double.parseDouble(dec.parse(s)));
	//	System.out.println(d1);

	}

}
