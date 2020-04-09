package com.designPattern.abstractFactoryPattern;

public class BankFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bankType) {
		if(bankType.equalsIgnoreCase("HDFC"))
			return new HDFC();
		else if(bankType.equalsIgnoreCase("ICICI"))
			return new ICICI();
		else if(bankType.equalsIgnoreCase("SBI"))
			return new SBI();
		return null;
	}

	@Override
	public Loan getLoan(String loanType) {
		return null;
	}

}
