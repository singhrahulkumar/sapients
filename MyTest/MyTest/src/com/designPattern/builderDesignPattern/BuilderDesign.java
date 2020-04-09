package com.designPattern.builderDesignPattern;

public class BuilderDesign {

	public static void main(String[] args) {

		BankAccount bank = new BankAccount.BankAccountBuilder().withName("Abhishek").withAccountNumber("112345678")
				.withNewsLetter(true).build();
		System.out.println(bank.toString());
	}
}
