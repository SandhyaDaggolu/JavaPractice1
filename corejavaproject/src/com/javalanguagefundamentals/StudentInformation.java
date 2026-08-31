package com.javalanguagefundamentals;

// No return type + no arguments

public class StudentInformation {
	String name = "Sandhya";
	int age = 22;
	String course = "CSE";
	String college = "NECG";
	String city = "Nellore";
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
		StudentInformation t = new StudentInformation();
		t.displayName();
		t.displayAge();
		t.displayCourse();
		t.displayCollege();
		t.displayCity();
	}
}
