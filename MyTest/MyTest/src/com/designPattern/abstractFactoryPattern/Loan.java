package com.designPattern.abstractFactoryPattern;

public abstract class Loan {

	protected double rate;

	abstract void getInterestRate(double rate);

	public void calculateBill(double loanAmount, int year) {

		double emi;
		emi = loanAmount * 0.1;
		System.out.println("Your emi " + emi);
	}

}
