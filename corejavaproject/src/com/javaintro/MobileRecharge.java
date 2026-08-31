package com.javaintro;

public class MobileRecharge {
	void showplandetails() {
		System.out.println("Current Recharge Plan");
		System.out.println("plan Name : Unlimited 299");
		System.out.println("Validity : 28 Days");
		System.out.println("Data : 1.5 GB/Day");
		System.out.println("Calls : Unlimited");
	}
	void Recharge(double amount){
		System.out.println("Recharge Successful...");
		System.out.println("Recharge Amount : " + amount);	
	}
		
	public static void main(String[] args) {
		MobileRecharge obj = new MobileRecharge();
		obj.showplandetails();
			
		}

	}

