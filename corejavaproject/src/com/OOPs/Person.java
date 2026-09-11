package com.OOPs;

class Person {
	String name;
	int age;

	void displayPersonDetails() {
		System.out.println("Name of the person : " + name);
		System.out.println("Age of the person : " + age);
	}
}

class Student extends Person {
	String collegeName;

	void displayStudentDetails() {
		displayPersonDetails();
		System.out.println("College name : " + collegeName);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Student s = new Student();
		s.name = "Sandhya Subramanyam";
		s.age = 20;
		s.collegeName = "NECG";
		// s.displayPersonDetails();
		s.displayStudentDetails();
		System.out.println("main method ended");

	}

}
