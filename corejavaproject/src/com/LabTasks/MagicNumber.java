package com.LabTasks;

import java.util.Scanner;

public class MagicNumber {

	static int MagicNum(int n) {
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
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		while (n > 9) {
			n = MagicNum(n);
		}
		
		if (n == 1) {
			System.out.println("Magic Number");
		} else {
			System.out.println("Not a Magic Number");
		}
		
	}
}
