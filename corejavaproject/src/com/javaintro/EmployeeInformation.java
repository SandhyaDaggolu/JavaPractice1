package com.javaintro;

public class EmployeeInformation {
	String name = "Sandhya";
	int Id = 101;
	String Department = "ECE";

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		EmployeeInformation t = new EmployeeInformation();
		t.EmployeeName();
		t.EmployeeId();
		t.Department();
		System.out.println("Main Method Ended");
		

	}
	void EmployeeName() {
		System.out.println("...........Employee Details.........");
		System.out.println("Name of the Employee : " + name);
	}
	void EmployeeId() {
		System.out.println("Employee Id : " + Id);
	}
	void Department() {
		System.out.println("Department : " + Department);
	}

}
