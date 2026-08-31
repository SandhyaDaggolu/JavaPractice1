package com.constructors;

public class BankAccount {
	String accountHolder;
	long accountnumber;
	double balance;
	
	BankAccount(){
		this("Unknown");
	}
	
	BankAccount(String accountHolder){
		this(accountHolder, 0);
	}
	
	BankAccount(String accountHolder, long accountnumber){
		this(accountHolder, accountnumber, 0.0);
	}
	
	BankAccount(String accountHolder, long accountnumber, double balance){
		this.accountHolder = accountHolder;
		this.accountnumber = accountnumber;
		this.balance = balance;
	}
	
	void display(){
		System.out.println("Account Holder : " + accountHolder);
		System.out.println("Account Number : " + accountnumber);
		System.out.println("Balance : " + balance);
		
		
	}
	public static void main(String[] args) {
		BankAccount t = new BankAccount();
		t.display();
		BankAccount t1 = new BankAccount("Sandhya Subramanyam");
		t1.display();
		BankAccount t2 = new BankAccount("Sandhya Subramanyam", 764939209289847L);
		t2.display();
		BankAccount t3 = new BankAccount("Sandhya Subramanyam", 764939209289847L, 500000);
		t3.display();
		

	}

}
