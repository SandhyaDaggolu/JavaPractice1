package com.OOPs;

public class BankAccount {
	private long AccountNumber;
	private String HolderName;
	private double balance;

	public void setAccountNumber(long AccountNumber) {
		this.AccountNumber = AccountNumber;
	}

	public long getAccountNumber() {
		return AccountNumber;
	}

	public void setHolderName(String HolderName) {
		this.HolderName = HolderName;
	}

	public String getHolderName() {
		return HolderName;
	}

	public void setbalance(double balance) {
		this.balance = balance;

	}

	public double getbalance() {
		return balance;
	}

	public BankAccount(double balance) {
		this.balance = balance;
		this.balance = 5000;
	}

	public void Deposit(double amount) {
		amount = balance + amount;
		System.out.println("Deposit Amount : " + amount);
	}

	public void withdraw(double amount) {
		if (amount < balance) {
			balance = balance - amount;
			System.out.println("Withdraw Amount : " + balance);
		}
	}
}
