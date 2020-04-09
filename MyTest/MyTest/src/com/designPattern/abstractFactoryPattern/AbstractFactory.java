package com.designPattern.abstractFactoryPattern;

public abstract class AbstractFactory {
	
	public abstract Bank getBank(String bankType);
	public abstract Loan getLoan(String loanType);
	
	
}
