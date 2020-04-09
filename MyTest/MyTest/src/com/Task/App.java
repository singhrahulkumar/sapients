package com.Task;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();

		String request = "RES01PI5 12000099PGEN    "
				+ "RES01PI5FFFFFFFFXCNCHC8 RES01PI5IMFWWWAV02502I502              "
				+ "N1W  083951098            PIMF   "
				+ "0219Y/ACTBB\\/XVRY\\/ARRY\\/DOD31DEC19/1200\\/PPYY\\"
				+ "/PUD29DEC19/1200\\/SACML\\/DOLEWR\\/PULEWR\\/OWNUS\\/MCPL\\/ATOY\\"
				+ "/SKTY\\/MRBY\\/SCR502\\/SEQ\\/SYSUNISYS\\/TEX033\\@";

		String requestPUD = getRequestDates(request, "PUD");
		String requestDOD = getRequestDates(request, "DOD");
		calendar.add(Calendar.DATE, 1);
		String PUD = setCurrentDates(calendar.getTime());
		calendar.add(Calendar.DATE, 2);
		String DOD = setCurrentDates(calendar.getTime());
		String[][] replacements = { { requestPUD, PUD }, { requestDOD, DOD } };
		for (String[] replacement : replacements) {
			request = request.replace(replacement[0], replacement[1]);
		}

		System.out.println(request);
	}

	public static String getRequestDates(String request, String tag) {
		int tagIndex = request.indexOf(tag);
		System.out.println("Index of " + tag + " is:" + tagIndex);
		int dateIndex = tagIndex + 3;
		System.out.println(tag + " date index in string is:" + dateIndex);
		String requestDate = request.substring(dateIndex, dateIndex + 7);
		System.out.println("Request " + tag + " is:" + requestDate);
		return requestDate;
	}

	public static String setCurrentDates(Date date) {
		DateFormat dateFormat = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
		String formattedDate = dateFormat.format(date);
		String currentDate = formattedDate.substring(5, 7).concat(formattedDate.substring(8, 11).toUpperCase())
				.concat(formattedDate.substring(14, 16));
		return currentDate;
	}

}
