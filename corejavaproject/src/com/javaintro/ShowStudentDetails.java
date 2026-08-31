package com.javaintro;

public class ShowStudentDetails {
	String name = "Sandhya";
	String rollnumber = "22F11A0578";
	static String course = "CSE";
	
	public static void main(String[] args) {
		System.out.println(".......Student Details.........");
		ShowStudentDetails t = new ShowStudentDetails();
		t.StudentName();
		t.RollNumber();
		
	}
	void StudentName() {
		System.out.println("student Name : " + name);	
		
	}
	
	void RollNumber() {
		System.out.println("Roll Number : " + rollnumber);
		Course();
	}
	
	void Course() {
		System.out.println("Course Name : " + course);
	}

}
