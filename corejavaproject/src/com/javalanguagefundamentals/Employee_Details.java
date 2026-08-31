package com.javalanguagefundamentals;

// No Return Type + With Arguments

import java.util.Scanner;

public class Employee_Details {
	
	void displayEmployeeName(String name) {
		System.out.println("Employee Name : " + name);
	}
	void displayEmployeeId(int id) {
		System.out.println("Employee Id : " + id);
	}
	void displayDepartment(String department) {
		System.out.println("Employee Department : " + department);
	}
	void displaySalary(double salary) {
		System.out.println("Employee Salary : " + salary);
	}
	void displayCity(String city) {
		System.out.println("Employee City : " + city);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee_Details t = new Employee_Details();
		System.out.println("Enter Employee Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Employee ID : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Department : ");
		String department = sc.nextLine();
		System.out.println("Enter Employee Salary : ");
		double salary = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Employee City : ");
		String city = sc.nextLine();
		t.displayEmployeeName(name);
		t.displayEmployeeId(id);
		t.displayDepartment(department);
		t.displaySalary(salary);
		t.displayCity(city);
		

	}

}
