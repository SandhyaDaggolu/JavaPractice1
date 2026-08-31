package com.javalanguagefundamentals;
import java.util.Scanner;

public class StudentResult {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentResult t = new StudentResult();
		System.out.println("Enter Student Name : ");
		String name = sc.nextLine();
		System.out.println("Enter m1 Marks : ");
		int m1 = sc.nextInt();
		System.out.println("Enter m2 Marks : ");
		int m2 = sc.nextInt();
		System.out.println("Enter m3 Marks : ");
		int m3 = sc.nextInt();
		System.out.println("Enter Total Marks : ");
		int total = sc.nextInt();
		t.displayStudent(name);
		t.calculateTotal(m1,m2,m3);
		
	}
	void displayStudent(String name) {
		System.out.println("Student Name : " + name);
	}
	void calculateTotal(int m1, int m2, int m3) {
		int total = m1+m2+m3;
		System.out.println("Calculate Total : " + total);
	}
}
