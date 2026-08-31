package com.javaintro;

public class BankDetails {
	float Balance = 10000.0f;
	float Amount = 5000;
	float withdrawAmount = 20000;

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		BankDetails t = new BankDetails();
		t.CheckBalance();
		t.deposit();
		t.Withdraw();
		System.out.println("Main Method Ended");	

	}
	void CheckBalance() {
		System.out.println(".......Check Your Bank Balance..........");
		System.out.println("Current Balance : " + Balance);
	}
	void deposit() {
		Balance = Balance + Amount;
		System.out.println("Deposited Amount : " + Amount);
		System.out.println("Updated Amount : " + Balance);
	}
	void Withdraw() {
		Balance = Balance - withdrawAmount;
		System.out.println("Withdraw Amount : " + withdrawAmount);
		System.out.println("Remaining Balance : " + Balance);
		
	}
	

}
