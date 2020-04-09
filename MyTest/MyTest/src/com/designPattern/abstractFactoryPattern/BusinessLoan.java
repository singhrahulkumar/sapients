package com.designPattern.abstractFactoryPattern;

public class BusinessLoan extends Loan {

	@Override
	void getInterestRate(double r) {
		rate = r;
	}

}
