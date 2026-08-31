package com.Logicalstmts;

import java.util.Scanner;

public class ifelseif {
	int num;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		if(num >= 10 && num <= 99) {
			System.out.println("Two Digit Number");
		}
		else if(num >= 100 && num <= 999) {
			System.out.println("Three Digit Number");
		}
		else if(num >= 1000) {
			System.out.println("More than Three Digit Number");
		}
		else {
			System.out.println("Less than two digits");
		}
	}

}
