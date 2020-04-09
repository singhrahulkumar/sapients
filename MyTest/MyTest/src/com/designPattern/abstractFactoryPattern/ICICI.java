package com.designPattern.abstractFactoryPattern;

public class ICICI implements Bank {

	private final String BName;

	ICICI() {
		this.BName = "ICICI";
	}

	@Override
	public String getBank() {
		return BName;
	}

}
