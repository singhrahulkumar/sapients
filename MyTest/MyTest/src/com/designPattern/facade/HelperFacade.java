package com.designPattern.facade;

public class HelperFacade {

	public void getReport(String explorer, String report, String junit) {

		switch (explorer) {
		case "firefox":
			switch (report) {
			case "html": 
				Firefox.generateHtmlReport(report);
				break;

			case "junit":
				Firefox.generateJUnitReport(junit);
				break;
			}
			break;

		case "chrome":
			switch (report) {
			case "html": 
				Chrome.generateHtmlReport(report);
				break;

			case "junit":
				Chrome.generateJUnitReport(junit);
				break;
			}
			break;

		}

	}

}
