package com.i18n;

import java.text.NumberFormat;

public class NumberFormatSetMaxAndMin {

	public static void main(String[] args) {

		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);
		System.out.println(nf.format(123456.789));
		nf.setMinimumFractionDigits(2);
		System.out.println(nf.format(123456.7));
		
		
	}

}
