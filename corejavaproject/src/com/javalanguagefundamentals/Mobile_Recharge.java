package com.javalanguagefundamentals;

import java.util.Scanner;

public class Mobile_Recharge {

	public static void main(String[] args) {
		Mobile_Recharge t = new Mobile_Recharge();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Recharge Plan Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Amount : ");
		double amount = sc.nextDouble();
		System.out.println("Enter GST : ");
		double gst = sc.nextDouble();
		System.out.println("Enter Total : ");
		double total = sc.nextDouble();
		System.out.println("Enter Cashback : ");
		double cashback = sc.nextDouble();
		System.out.println("Enter Final Amount : ");
		double finalamount = sc.nextDouble();
		t.displayCustomer(name); 
		t.calculateGST(amount, gst);
		t.calculateTotal(amount, gst);
		t.cashback(total);
		t.finalAmount(total, cashback);
		

	}
	String displayCustomer(String name) {
		System.out.println("Name : " + name);
		return name;
	}
	double calculateGST(double amount, double gst) {
		System.out.println("GST : " + (amount * gst) / 100);
		return (amount * gst) / 100;
	}
	double calculateTotal(double amount, double gst) {
		System.out.println("Total : " + amount + gst);
		return amount + gst;
	}
	double cashback(double total) {
		System.out.println("Cashback : " + total * 10 / 100);
		return total * 10 / 100;
	}
	double finalAmount(double total, double cashback) {
		System.out.println("Final Amount : " + (total - cashback));
		return (total - cashback);
	}

}
