package com.designPattern.facade;

public class FacadeDesignPattern {

	public static void main(String[] args) {
		
		HelperFacade f = new HelperFacade();
		f.getReport("firefox", "html", "test");
		f.getReport("chrome", "junit", "test");
		
	}

}
