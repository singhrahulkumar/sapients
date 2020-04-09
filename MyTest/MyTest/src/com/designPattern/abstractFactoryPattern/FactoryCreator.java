package com.designPattern.abstractFactoryPattern;

public class FactoryCreator {

	public static AbstractFactory getFactory(String factoryType) {
		if (factoryType.equalsIgnoreCase("Bank"))
			return new BankFactory();
		if (factoryType.equalsIgnoreCase("Loan"))
			return new LoanFactory();
		return null;
	}

}


