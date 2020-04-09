package com.designPattern.facade;

import java.sql.Driver;

public class Firefox {

	public static Driver getFirefoxDriver() {
		return null;
	}

	public static void generateHtmlReport(String report) {
		System.out.println("Firefox Html report generated"+report);
	}

	public static void generateJUnitReport(String junit) {
		System.out.println("Firefox Junit Report"+junit);
	}
}
