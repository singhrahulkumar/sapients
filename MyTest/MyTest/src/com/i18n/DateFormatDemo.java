package com.i18n;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {

	public static void main(String[] args) {

		// default date format
		DateFormat df = DateFormat.getInstance();
		System.out.println(df.format(new Date()));

		// default date format
		DateFormat dfD = DateFormat.getDateInstance();
		System.out.println(dfD.format(new Date()));
		
		//locale specific date format
		DateFormat df0 = DateFormat.getDateInstance(0);
		System.out.println(df0.format(new Date()));
		
		//locale specific date format
		DateFormat df1 = DateFormat.getDateInstance(1);
		System.out.println(df1.format(new Date()));
		
		//locale specific date format
		DateFormat df2 = DateFormat.getDateInstance(2);
		System.out.println(df2.format(new Date()));
		
		//locale specific date format
		DateFormat df3 = DateFormat.getDateInstance(3);
		System.out.println(df3.format(new Date()));
		
		
		DateFormat dfIn = DateFormat.getDateInstance(0,Locale.ITALY);
		System.out.println(dfIn.format(new Date()));
		
	}

}
