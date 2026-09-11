package com.LabTasks;

import java.util.Scanner;

class Student {
	void calculateGrade(int marks) {
		if (marks > 90 && marks <= 100) {
			System.out.println("Grade-A");
		} else if (marks >= 75) {
			System.out.println("Grade-B");
		} else if (marks >= 60) {
			System.out.println("Grade-C");

		} else if (marks >= 40) {
			System.out.println("Grade-D");
		} else {
			System.out.println("Fail");
		}
	}
}

class EngineeringStudent extends Student {
	void calculateGrade(int marks) {
		if (marks > 85 && marks <= 100) {
			System.out.println("Grade-A");
		} else if (marks >= 70) {
			System.out.println("Grade-B");
		} else if (marks >= 55) {
			System.out.println("Grade-C");

		} else if (marks >= 45) {
			System.out.println("Grade-D");
		} else {
			System.out.println("Fail");
		}
	}
}

class MedicalStudent extends Student {
	void calculateGrade(int marks) {
		if (marks > 80 && marks <= 100) {
			System.out.println("Grade-A");
		} else if (marks >= 65) {
			System.out.println("Grade-B");
		} else if (marks >= 50) {
			System.out.println("Grade-C");

		} else if (marks >= 35) {
			System.out.println("Grade-D");
		} else {
			System.out.println("Fail");
		}
	}

}

class ManagementStudent extends Student {
	void calculateGrade(int marks) {
		if (marks > 90 && marks <= 100) {
			System.out.println("Grade-A");
		} else if (marks >= 75) {
			System.out.println("Grade-B");
		} else if (marks >= 60) {
			System.out.println("Grade-C");

		} else if (marks >= 40) {
			System.out.println("Grade-D");
		} else {
			System.out.println("Fail");
		}
	}
}

public class StudentDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("********************************************************");
		System.out.println("        WELCOME TO Student Details");
		System.out.println("********************************************************");
		System.out.println("1. EngineerinStudent");
		System.out.println("2. MedicalStudent");
		System.out.println("3. ManagementStudent");
		System.out.print("Enter Your Choice : ");
		String choice = sc.nextLine();
		System.out.println("Enter your marks : ");
		int marks = sc.nextInt();
		switch (choice) {
		case "1":
			Student s = new EngineeringStudent();
			s.calculateGrade(marks);
			break;

		case "2":
			Student s1 = new MedicalStudent();
			s1.calculateGrade(marks);
			break;

		case "3":
			Student s2 = new ManagementStudent();
			s2.calculateGrade(marks);
			break;
			
		default:
			System.out.println("Invalid");

		}
	}

}

