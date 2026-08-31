package com.Logicalstmts;

import java.util.Scanner;

public class CollegeAdmissionValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("************************************************");
		System.out.println("       Welcome To NECG Engineering College");
		System.out.println("************************************************");
		System.out.println("Enter Your name : ");
		String name = sc.nextLine();
		System.out.println("Hello! " + name + " Welcome");
		System.out.println("Enter Your 12th Percentage : ");
		double percentage = sc.nextDouble();
		if(percentage >= 75) {
			System.out.println("Your Percentage is Recorded...");
			System.out.println("Enter your Entrance Rank : ");
			double rank = sc.nextDouble();
			if(rank <= 50000) {
				System.out.println("Your Rank is Noted...");
				System.out.println("Enter Your Age : ");
				int age = sc.nextInt();
				if(age >= 17 && age <= 22) {
					System.out.println("Your Age is Verified...");
					System.out.println("Have you submitted all documents? (true/false)");
					System.out.println("Eneter Your Document Details : ");
					boolean document = sc.nextBoolean();
					if(document == true) {
						System.out.println("your Documents Submission is completed...");
						System.out.println("Have you paid the admission fee? (true/false)");
						System.out.println("Enter your Fee Details : ");
						boolean fee = sc.nextBoolean();
						if(fee == true) {
							System.out.println("Thanks for Paying Admission Fee...");
							System.out.println("Processing your admission...");
							System.out.println("Congratulations!");
							System.out.println("You are Eligible for Admission.");
							System.out.println("Welcome To NECG Engineering College.");
						}
						else {
							System.out.println("Your Fee Due is Pending...");
						}
					}
					else {
						System.out.println("Sorry! Your Documents are not verified...");
					}
				}
				else {
					System.out.println("Your Age is Does not Match for the eligibility Criteria...");
				}
			}
			else {
				System.out.println("Your Rank is Not Matching for our required Limit...");
			}
		}
		else {
			System.out.println("Your Percentage is below the Eligible criteria...");
		}

	}

}
