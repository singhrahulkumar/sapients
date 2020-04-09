package com.designPattern.builderDesignPattern;

public class BankAccount {

	private String name;
	private String accountNumber;
	private String email;
	private boolean newsLetter;

	private BankAccount() {
		super();
	}

	private BankAccount(BankAccountBuilder bankAccount) {
		super();
		name = bankAccount.name;
		accountNumber = bankAccount.accountNumber;
		email = bankAccount.email;
		newsLetter = bankAccount.newsLetter;
	}

	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", accountNumber=" + accountNumber + ", email=" + email + ", newsLetter="
				+ newsLetter + "]";
	}

	public static class BankAccountBuilder {
		
		private String name;
		private String accountNumber;
		private String email;
		private boolean newsLetter;

		public BankAccountBuilder() {
			
		}
		
		public BankAccountBuilder withName(String name) {
			this.name = name;
			return this;
		}

		public BankAccountBuilder withAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
			return this;
		}

		public BankAccountBuilder withEmail(String email) {
			this.email = email;
			return this;
		}

		public BankAccountBuilder withNewsLetter(boolean newsLetter) {
			this.newsLetter = newsLetter;
			return this;
		}

		public BankAccount build() {
			return new BankAccount(this);
		}

	}

}
