package com.javalanguagefundamentals;

public class Bank {

	public static void main(String[] args) {
		Bank t = new Bank();
		t.deposit("Sandy");
		t.depositAmount(70000);
		

	}
	void deposit(String accountHolder) {
		System.out.println("Account Holder Name : " + accountHolder);
	}
	void depositAmount(double amount) {
		System.out.println("Deposit Amount : " + amount);
	}
}
