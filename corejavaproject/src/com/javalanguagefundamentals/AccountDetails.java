package com.javalanguagefundamentals;

public class AccountDetails {
	String name = "Sandhya Subramanyam";
	long account_number = 653423788789L;
	String bank_name = "Canara Bank";
	String branch_name = "SBI";
	int current_balance = 70000;

	public static void main(String[] args) {
		AccountDetails t = new AccountDetails();
		t.showBalance();

	}
	void showBalance() {
		System.out.println("Account Holder Name : " + name);
		System.out.println("Account Number : " + account_number);
		System.out.println("Bank Name : " + bank_name);
		System.out.println("Branch Name : " + branch_name);
		System.out.println("Current Balance : " + current_balance);
	}

}
