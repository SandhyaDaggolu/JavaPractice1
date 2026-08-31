package com.javaintro;

public class Student {
	int studentId;
	String studentName;
	
	static int Age = 22;
	static String Address = "Nellore";


	public static void main(String[] args) {
		System.out.println("Welcome to student Data");
		System.out.println("object Info1..................");
		Student sandy = new Student();
		sandy.studentId = 78;
		sandy.studentName = "Sandhya";
		System.out.println("Student Id : " + sandy.studentId);
		System.out.println("Student Name : " + sandy.studentName);
		System.out.println("Student age : " + Age);
		System.out.println("Student Address : " + Address );
		
		System.out.println("object Info2..................");
		Student siri = new Student();
		siri.studentId = 18;
		siri.studentName = "Sireesha";
		System.out.println("Student Id : " + siri.studentId);
		System.out.println("Student Name : " + siri.studentName);
		System.out.println("Student age : " + Age);
		System.out.println("Student Address : " + Address );

	}

}
