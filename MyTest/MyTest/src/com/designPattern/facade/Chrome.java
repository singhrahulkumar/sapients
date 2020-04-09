package com.designPattern.facade;

import java.sql.Driver;

public class Chrome {

	public static Driver getChromeDriver() {
		return null;
	}

	public static void generateHtmlReport(String report) {
		System.out.println("Chrome Html report generated"+report);
	}

	public static void generateJUnitReport(String junit) {
		System.out.println("Chrome Junit Report"+junit);
	}

}
