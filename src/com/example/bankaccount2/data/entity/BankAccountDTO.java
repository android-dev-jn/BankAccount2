package com.example.bankaccount2.data.entity;

public class BankAccountDTO {

	private String accountNumber;
	private double balance;

	public BankAccountDTO(String accountNumber2, double balance) {
		this.accountNumber = accountNumber2;
		this.balance = balance;
	}

	public BankAccountDTO() {
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return this.balance;
	}

}
