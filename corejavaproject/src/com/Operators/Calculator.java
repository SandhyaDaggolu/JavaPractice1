package com.Operators;

import java.util.Scanner;

public class Calculator {
	int num1;
	int num2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Operator (+ or -) : ");
		char op = sc.next().charAt(0);

		int result = (op == '+') ? num1 + num2 : num1 - num2;
		System.out.println("The result : " + result);
	}

}
