package com.javaintro;
import java.util.Scanner;

public class StudentResultCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentResultCalculator  t = new StudentResultCalculator();
		System.out.println("Enter Student Name : ");
		String name = sc.nextLine();
		System.out.println("Enter m1 Marks : ");
		int m1 = sc.nextInt();
		System.out.println("Enter m2 Marks : ");
		int m2 = sc.nextInt();
		System.out.println("Enter m3 Marks : ");
		int m3 = sc.nextInt();
		System.out.println("Enter total value : ");
		int total = sc.nextInt();
		System.out.println("Enter Average : ");
		double Average = sc.nextDouble();
		t.displayStudent(name);
		t.calculateTotal(m1,m2,m3);
		t.calculateAverage(m1,m2,m3);

		
	}
	void displayStudent(String name) {
		System.out.println("Name of the student : " + name);
	}
	void calculateTotal(int m1, int m2, int m3) {
		int total = m1+m2+m3;
		System.out.println("Calculate Total : " + total);
	}
	void calculateAverage(int m1, int m2, int m3) {
		double Average = (m1+m2+m3)/3.0;
		System.out.println("Calculate Average : " + Average);
	}

}
