package com.LabTasks;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();

		int square = n * n;
		int sum = 0;
		int n1 = square;

		// n*n = 9*9=81
	   // 8+1=9
		while (n1 > 0) {
			int digit = n1 % 10;
			sum = sum + digit;
			n1 = n1 / 10;

		}
		if (sum == n) {
			System.out.println("Neon Number");
		} else {
			System.out.println("Not a Neon Number");
		}
	}

}
