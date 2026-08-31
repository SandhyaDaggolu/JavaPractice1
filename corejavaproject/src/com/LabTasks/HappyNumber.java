package com.LabTasks;

import java.util.Scanner;

public class HappyNumber {

	static int HappyNum(int n) {
		int sum = 0;
		int rem = 0;
		while (n > 0) {
			rem = n % 10;
			n = n / 10;
			sum = sum + rem * rem;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		while (n != 1 && n != 4) {
			n = HappyNum(n);
		}

		if (n == 1) {
			System.out.println("Happy Number");
		} else {
			System.out.println("Not a Happy Number");
		}

	}

}
