package com.javalanguagefundamentals;

//No return type + No arguments 
public class StudentDetails {
	String name = "Sandhya Subramanyam";
	int age = 22;
	String course = "JFS";
	
	public static void main(String[] args) {
		StudentDetails t = new StudentDetails();
		t.displayStudent();	
		
	}
	void displayStudent() {
		System.out.println("Name of the Student : " + name);
		System.out.println("Age : " + age);
		System.out.println("Course Name : " + course);		
	}
}

