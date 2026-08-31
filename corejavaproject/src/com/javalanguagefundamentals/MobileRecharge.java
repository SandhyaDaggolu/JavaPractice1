package com.javalanguagefundamentals;
import java.util.Scanner;
public class MobileRecharge {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MobileRecharge t = new MobileRecharge();
		System.out.println("Enter Plan Name : ");
		String planName = sc.nextLine();
		System.out.println("Enter Amount : ");
		int amount = sc.nextInt();
		t.showPlan(planName);
		t.recharge(amount);
	}
	void showPlan(String planName) {
		System.out.println("Plan Name : " + planName);
	}
	void recharge(double amount) {
		System.out.println("Amount : " + amount);
		
	}

}
