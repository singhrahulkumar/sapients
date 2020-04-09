package com.i18n;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
	public static void main(String[] args) {
		
		Double d = 123456.78;
		NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
		System.out.println(nf.format(d));
		NumberFormat nf1 = NumberFormat.getInstance(Locale.US);
		System.out.println(nf1.format(d));
		
		Locale l = new Locale("hi","IN");
		NumberFormat india = NumberFormat.getCurrencyInstance(l);
		System.out.println(india.format(d));

		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(us.format(d));
		
		NumberFormat uk = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println(uk.format(d));
		
		
		
	}
}
