package com.Logicalstmts;

import java.util.Scanner;

public class DecimalToBinary {

	void DecimalToBinary(int n) {
		int rem = 0;
		String binVal = " ";
		while (n > 0) {
			rem = n % 2;
			n = n / 2;
			binVal = rem + binVal;
		}
		System.out.println(binVal);

	}

	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		DecimalToBinary(n);
	}

}
