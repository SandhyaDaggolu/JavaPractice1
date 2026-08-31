package com.Logicalstmts;

import java.util.Scanner;

public class JobRecruitment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("****************************************");
		System.out.println("   Welcome To Job Recruitment Process");
		System.out.println("****************************************");
		System.out.println("Enter Your Name : ");
		String name = sc.nextLine();
		System.out.println("Hello! " + name + " Welcome...");
		System.out.println("Have You Completed Your Degree? (true/false)");
		System.out.println("Enter Your Degree Details : ");
		boolean degree = sc.nextBoolean();
		if(degree == true) {
			System.out.println("Your Degree Completion Details are Recorded...");
			System.out.println("Enter Your CGPA : ");
			double CGPA = sc.nextDouble();
			if(CGPA >= 7.5) {
				System.out.println("Your CGPA is Matched to Our Requirements...");
				System.out.println("Have You Completed Your Technical Round..? (true/false)");
				System.out.println("Enter Your Technical Round Details : ");
				boolean TechnicalRound = sc.nextBoolean();
				if(TechnicalRound == true) {
					System.out.println("Your Technical Round Details are Recorded...");
					System.out.println("Have You Completed Your HR Round..? (true/false)");
					System.out.println("Enter Your HR Round Details : ");
					boolean HRRound = sc.nextBoolean();
					if(HRRound == true) {
						System.out.println("Your Technical Round Details are Recorded...");
						System.out.println("Have You Completed Your Medical Test..? (true/false)");
						System.out.println("Enter your Madical Test Details : ");
						boolean MadicalTest = sc.nextBoolean();
						if(MadicalTest == true) {
							System.out.println("Your Madical Test Details are Verified...");
							System.out.println("You are Selected");
							System.out.println("Congractulations");
							System.out.println("Welcome To Our Company");
						}
						else {
							System.out.println("Sorry! Your Medical condition is not fit for our Job...");
						}
					}
					else {
						System.out.println("We are sorry! you are not completed your HR Round...");
					}
				}
				else {
					System.out.println("Sorry! You are not Completed Your Technical Round So you can leave for the day...");
				}
			}
			else {
				System.out.println("Your CGPA is not in our Requirements So You are not Eligible for this Recruitment Process...");
			}
		}
		else {
			System.out.println("Your Degree Details are not Matched to Our Requirements...");
		}
		

	}

}
