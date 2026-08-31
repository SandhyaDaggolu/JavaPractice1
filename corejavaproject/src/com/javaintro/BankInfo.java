package com.javaintro;

public class BankInfo {
	float Balance = 10000.0f;

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		BankInfo t = new BankInfo();
		t.CheckBalance();
		t.deposit(5000);
		t.Withdraw(20000);
		System.out.println("Main Method Ended");

	}
	void CheckBalance() {
		System.out.println(".......Check Your Bank Balance..........");
		System.out.println("Current Balance : " + Balance);
	}
	void deposit(float Amount) {
		Balance = Balance + Amount;
		System.out.println("Deposited Amount : " + Amount);
		System.out.println("Updated Amount : " + Balance);
	}
	void Withdraw(float withdrawAmount) {
		Balance = Balance - withdrawAmount;
		System.out.println("Withdraw Amount : " + withdrawAmount);
		System.out.println("Remaining Balance : " + Balance);
		
	}
	

}

