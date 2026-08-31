package com.OOPs;

public class BAccount {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		BankAccount b = new BankAccount(50000);
		b.setAccountNumber(254551718872L);
		b.setHolderName("Sandhya Subramanyam");
		b.setbalance(1500);
		System.out.println("Account Number : " + b.getAccountNumber());
		System.out.println("Account Holder Name : " + b.getHolderName());
		System.out.println("Balance : " + b.getbalance());
		b.Deposit(500);
		b.withdraw(2000);
		System.out.println("Main Method Ended");
	}

}
