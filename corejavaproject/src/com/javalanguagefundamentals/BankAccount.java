package com.javalanguagefundamentals;
import java.util. Scanner;

public class BankAccount {
	String name;
	long account_number;
	String bank_name;
	String branch_name;
	int current_balance;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount t = new BankAccount();
		System.out.println("Enter Account Holder Name : ");
		t.name = sc.nextLine();
		System.out.println("Enter Account Number : ");
		t.account_number = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Bank Name : ");
		t.bank_name = sc.nextLine();
		System.out.println("Enter Branch Name : ");
		t.branch_name = sc.nextLine();
		System.out.println("Enter Current Balance : ");
		t.current_balance = sc.nextInt();
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
