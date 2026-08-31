package com.Logicalstmts;

import java.util.Scanner;

// WAP to validation checks for Marriage like matrimonial conditional checks

public class NestedIf {

	public static void main(String[] args) {
		System.out.println("Welcome To Vcube Matrimonial..........");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name : ");
		String name = sc.nextLine();
		System.out.println("Nice to meet you Mr." + name);
		System.out.println("Can you add your asserts value here");
		double assets = sc.nextDouble();
		System.out.println("Enter Your Salary : ");
		double salary = sc.nextDouble();
		if (assets >= 5000000.0 && salary >= 25000000.0) {
			System.out.println("Ok good to go");
			System.out.println("Enter your age : ");
			int age = sc.nextInt();
			if (age >= 27 && age <= 29) {
				System.out.println("Lets continue");
				System.out.println("Enter your Height : ");
				float height = sc.nextFloat();
				System.out.println("Enter your Weight : ");
				double weight = sc.nextDouble();
				if ((height >= 5.6 && height <= 6.0) && weight >= 65 && weight <= 70) {
					System.out.println("Ok, continue the discussion");

					System.out.println("Do you smoke or drink");
					boolean habstatus = sc.nextBoolean();

					if (!habstatus) {
						System.out.println("Great to know");
					} else {
						System.out.println("Sorry!....");
						System.out.println("Do you have siblings");
						boolean sibstatus = sc.nextBoolean();
						if (!sibstatus) {
							System.out.println("Ok good to know! we will back soon");
						} else {
							System.out.println("Oh My God");
						}

					}
				} else {
					System.out.println("You must need to join gym or your height is not matching");
				}
			} else {
				System.out.println("Age is not eligible.");
			}

		} else {
			System.out.println("You can Leave for the day!! Focus on your studies..");
		}

		sc.close();
	}
}