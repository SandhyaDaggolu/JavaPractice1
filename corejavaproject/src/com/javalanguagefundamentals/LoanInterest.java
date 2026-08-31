package com.javalanguagefundamentals;
import java.util.Scanner;

public class LoanInterest {
	double calculateInterest(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal  : ");
		double principal = sc.nextDouble();
		System.out.println("Enter rate  : ");
		double rate = sc.nextDouble();
		System.out.println("Enter time  : ");
		int time = sc.nextInt();
		double SimpleInterest = (principal * rate * time) / 100;
		return SimpleInterest;
		
	}

	public static void main(String[] args) {
		LoanInterest t = new LoanInterest();
		double interest = t.calculateInterest();
		System.out.println("Simple Interest : " + interest);

	}

}
