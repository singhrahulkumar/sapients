package com.Task;

import java.util.Calendar;

public class CheckDate {

	public static void main(String[] args) {

		 Calendar cal = Calendar.getInstance();
		 cal.add(Calendar.DAY_OF_YEAR, 1);
		 System.out.println(cal.getTime());
		 cal.add(Calendar.DATE, 2);
		 System.out.println("DOD" +cal.getTime());
		
	}

}
