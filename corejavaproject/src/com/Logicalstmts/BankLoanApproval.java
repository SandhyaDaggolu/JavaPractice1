package com.Logicalstmts;

import java.util.Scanner;

public class BankLoanApproval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("****************************************");
		System.out.println("      Welcome to Canara Bank Loan Portal");
		System.out.println("****************************************");
		System.out.println("Enter Your Full Name : ");
		String name = sc.nextLine();
		System.out.println("Hello " + name + ", welcome to our loan verification process.");
		System.out.println("Enter your Salary: ");
		double salary = sc.nextDouble();
		if (salary >= 5000000) {
			System.out.println("Your salary verification is completed...");
			System.out.println("Your Credit Score : ");
			int credit = sc.nextInt();
			if (credit >= 750) {
				System.out.println("Your Credit Score verification is completed...");
				System.out.println("Enter Your Age : ");
				int age = sc.nextInt();
				if (age >= 27 && age <= 29) {
					System.out.println("Age Is Verified Successfully..");
					System.out.println("Do you have any existing loan..? (true/false)");
					System.out.println("Enter Existing Loan Details : ");
					boolean exloan = sc.nextBoolean();
					if (exloan == false) {
						System.out.println("Your Exsiting Loan Details are Noted..");
						System.out.println("Enter Your Monthly EMI Details : ");
						double EMI = sc.nextDouble();
						if (EMI <= 20000) {
							System.out.println("EMI Details are Recorded..");
							System.out.println("Please Let Me Know Your Aadhar details..? (true/false)");
							System.out.println("Enter Your Aadhar Number : ");
							boolean aadhar = sc.nextBoolean();
							if (aadhar == true) {
								System.out.println("Aadhar Details are verified successfully...");
								System.out.println("Congratulations!");
								System.out.println("Your loan has been approved.");
								System.out.println("Our representative will contact you shortly.");

							} else {

                                System.out.println("Please complete Aadhaar verification and apply again.");
                            }

                        } else {

                            System.out.println("Your Monthly EMI exceeds our limit.");
                        }

                    } else {

                        System.out.println("Sorry! Please clear your existing loan before applying.");
                    }

                } else {

                    System.out.println("Age is not matched for the loan process...");
                }

            } else {

                System.out.println("Something Went Wrong In Your Credit Score verification");
            }

        } else {

            System.out.println("Something went wrong, Better Luck Next Time");
        }

    }
}
