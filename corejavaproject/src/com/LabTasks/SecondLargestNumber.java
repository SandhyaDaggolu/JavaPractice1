package com.LabTasks;

import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;
		int rem = 0;
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		while (n > 0) {
			rem = n % 10;
			n = n / 10;
			if (rem > max) {
				secondmax = max;
				max = rem;
			} else if (rem < max && rem != max) {
				secondmax = max;
			}
		}
		System.out.println(secondmax);
	}

}
