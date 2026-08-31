package com.javalanguagefundamentals;

import java.util.Scanner;

//No return type + no arguments

public class Student_Information {
	String name;
	int age;
	String course;
	String college;
	String city;
	
	void displayName() {
		System.out.println("Student Name : " + name);
	}
	void displayAge() {
		System.out.println("Age : " + age);
	}
	void displayCourse() {
		System.out.println("course : " + course);
	}
	void displayCollege() {
		System.out.println("Collge Name : " + college);
	}
	void displayCity() {
		System.out.println("City : " + city);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student_Information t = new Student_Information();
		System.out.println("Enter Student Name : ");
		t.name = sc.nextLine();
		System.out.println("Enter Student Age : ");
		t.age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Course Name : ");
		t.course = sc.nextLine();
		System.out.println("Enter College Name : ");
		t.college = sc.nextLine();
		System.out.println("Enter City Name : ");
		t.city = sc.nextLine();
		t.displayName();
		t.displayAge();
		t.displayCourse();
		t.displayCollege();
		t.displayCity();
	}
}
