package com.javalanguagefundamentals;
import java.util.Scanner;
public class DetailsStudent {
	String name;
	int age;
	String course;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DetailsStudent t = new DetailsStudent();
		System.out.println("Enter Student Name : ");
		t.name = sc.nextLine();
		System.out.println("Enter age : ");
		t.age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Course Name : ");
		t.course = sc.nextLine();
		t.displayStudent();
		

	}
	void displayStudent() {
		System.out.println("Student Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Course Name : " + course);
	}

}
