package com.javalanguagefundamentals;

import java.util.Scanner;

public class StudentCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentCalculator t = new StudentCalculator();
		System.out.println("Enter m1 marks : ");
		int m1 = sc.nextInt();
		System.out.println("Enter m2 marks : ");
		int m2 = sc.nextInt();
		System.out.println("Enter m3 marks : ");
		int m3 = sc.nextInt();
		System.out.println("Enter Total : ");
		int total = sc.nextInt();
		System.out.println("Enter Average  : ");
		double average = sc.nextDouble();
		System.out.println("Enter Percentage  : ");
		double percentage = sc.nextDouble();
		t.calculateTotal(m1, m2, m3);
		t.calculateAverage(total);
		t.calculatePercentage(total);
		
	}
	int calculateTotal(int m1, int m2, int m3) {
		System.out.println("Total : " + (m1+m2+m3));
		return m1+m2+m3;
	}
	double calculateAverage(int total) {
		System.out.println("Average : " + total/3);
		return total;
	}
	double calculatePercentage(int total) {
		System.out.println("Percentage : " + (total/300.0)*100);
		return total;
	}

}
