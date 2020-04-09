package com.Task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateDate {

	public static void main(String[] args) throws ParseException {

		Date date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2019-08-01 08:05:05");
		System.out.println(date);
	}

}
