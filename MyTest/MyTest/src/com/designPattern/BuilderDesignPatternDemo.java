package com.designPattern;

class BankAccountDetail {
	private String name;
	private Long accountNumber;
	private String email;
	private String adderss;

	public BankAccountDetail() {
		super();
	}

	public BankAccountDetail(String name, Long accountNumber, String email, String address) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.email = email;
		this.adderss = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdderss() {
		return adderss;
	}

	public void setAdderss(String adderss) {
		this.adderss = adderss;
	}

	@Override
	public String toString() {
		return "BankAccountDetail [name=" + name + ", accountNumber=" + accountNumber + ", email=" + email
				+ ", adderss=" + adderss + "]";
	}

}

public class BuilderDesignPatternDemo {

	private BankAccountDetail details;

	public BuilderDesignPatternDemo(BankAccountDetail details) {
		this.details = details;
	}

	public static BuilderDesignPatternDemo getInstance(BankAccountDetail details) {
		return new BuilderDesignPatternDemo(details);
	}

	public BuilderDesignPatternDemo withEmail(String email) {
		this.details.setEmail(email);
		return this;
	}

	public BuilderDesignPatternDemo withAddress(String address) {
		this.details.setAdderss(address);
		return this;
	}

	public BuilderDesignPatternDemo withName(String name) {
		this.details.setName(name);
		return this;
	}

	public BuilderDesignPatternDemo withAccountNumber(Long accNo) {
		this.details.setAccountNumber(accNo);
		return this;
	}

	public BankAccountDetail build() {
		return new BankAccountDetail(this.details.getName(), this.details.getAccountNumber(), this.details.getEmail(),
				this.details.getAdderss());
	}
}
