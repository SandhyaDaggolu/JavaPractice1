package com.IOExceptions;

import java.util.Scanner;

public class AgeException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter Your Age : ");
			int age = sc.nextInt();

			if (age < 18) {
				throw new InvalidAgeException("Age is above 18");
			} else {
				System.out.println("registration Successful");
			}
		} catch (InvalidAgeException e) {

		}

	}
}
