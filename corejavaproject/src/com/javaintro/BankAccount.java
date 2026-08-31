package com.javaintro;

public class BankAccount {
	int Accountnumber = 2686778;
	String Accountholdername = "Sandhya";
	String Accounttype = "Savings Account";
	double balance = 500000.0;
	void displayAccount() {
		System.out.println("Account Number = " + Accountnumber);
		System.out.println("Account Holder Name = " + Accountholdername);
		System.out.println("Account Type = " + Accounttype);
		System.out.println("Balance = " + balance);
		
		
	}

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		account.displayAccount();

	}

}
