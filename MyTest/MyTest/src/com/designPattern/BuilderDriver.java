package com.designPattern;

public class BuilderDriver {

	public static void main(String[] args) {

		BankAccountDetail details = new BankAccountDetail();
		BuilderDesignPatternDemo builder = BuilderDesignPatternDemo.getInstance(details);
		builder.withName("Abhishek").withAddress("Bangalore").withAccountNumber(2L).build();
		System.out.println(details);

	}

}
