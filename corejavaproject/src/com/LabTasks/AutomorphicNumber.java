package com.LabTasks;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		int square = n * n;
		int temp = n;
		int digit = 0;
		while (temp > 0) {
			digit++;
			temp  = temp / 10;
		}
		int result = square % (int)Math.pow(10, digit);
		System.out.println(result);
		if (result == n) {
			System.out.println("Automorphic Number");
		} else {
			System.out.println("Not a Automorphic Number");
		}

	}

}
