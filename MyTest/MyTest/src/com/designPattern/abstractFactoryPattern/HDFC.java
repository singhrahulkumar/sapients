package com.designPattern.abstractFactoryPattern;

public class HDFC implements Bank {

	private final String BName;

	HDFC() {
		this.BName = "HDFC";
	}

	@Override
	public String getBank() {
		return BName;
	}

}
