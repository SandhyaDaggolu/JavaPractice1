package com.javalanguagefundamentals;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Operations t = new Operations();
		System.out.println("Enter First Number : ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int b = sc.nextInt();
		t.addition(a,b);
		t.subtract(a,b);
		t.Multiplication(a,b);
		t.division(a,b);
			

	}
	int addition(int a, int b) {
		System.out.println("Addition : " + (a + b));
		return a + b;
	}
	int subtract(int a, int b) {
		System.out.println("Subtraction : " + (a - b));
		return a-b;
	}
	int Multiplication(int a, int b) {
		System.out.println("Multiplication : " + (a * b));
		return a*b;
	}
	int division(int a, int b) {
		System.out.println("division : " + (a / b));
		return a/b;
	}
}
