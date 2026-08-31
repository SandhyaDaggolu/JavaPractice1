package com.LabTasks;

import java.util.Scanner;

public class SumOfDigits {

	static int SumOfDigits(int n) {
		int sum = 0;
		int rem = 0;

		while (n > 0) {
			rem = n % 10;
			n = n / 10;
			sum = sum + rem;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();

		int sum = SumOfDigits(n);
		System.out.println("The Sum Of Digits Is : " + sum);

	}
}
