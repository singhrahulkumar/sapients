package com.designPattern.abstractFactoryPattern;

public class SBI implements Bank {
	private final String BName;

	SBI() {
		this.BName = "SBI";
	}

	@Override
	public String getBank() {
		return BName;
	}
}
