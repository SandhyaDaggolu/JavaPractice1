package com.Operators;

// Ternary operators -> ? :
// syntax : (condition)?stmt1 : stmt2;
// WAP to find the minimum number from a given two numbers...?
// WAP to find even or odd..?
// WAP to find pass or fail based on marks..?
// WAP to find the maximum number from a given three numbers...?

public class TernaryOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 50;

		int min = (a < b) ? a : b;
		System.out.println(min);

		int num = 5;
		String eo = (num % 2 == 0) ? "even" : "odd";
		System.out.println(eo);

		int marks = 100;
		String m = (marks >= 35) ? "Pass" : "Fail";
		System.out.println(m);

		int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(max);

	}

}
