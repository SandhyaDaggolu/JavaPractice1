package com.LabTasks;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		int n1 = FindFactor(n);
		System.out.println("The Factorial of Given Number is : " + n1);
	}

	static int FindFactor(int n) {
		int fact = 1;

		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}

		return fact;
	}
}