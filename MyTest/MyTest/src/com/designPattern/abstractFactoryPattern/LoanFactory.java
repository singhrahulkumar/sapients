package com.designPattern.abstractFactoryPattern;

public class LoanFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bankType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loan getLoan(String loanType) {
		if (loanType.equalsIgnoreCase("EducationLoan"))
			return new EducationLoan();
		else if (loanType.equalsIgnoreCase("BusinessLoan"))
			return new BusinessLoan();
		else if (loanType.equalsIgnoreCase("HomeLoan"))
			return new HomeLoan();
		return null;
	}

}
