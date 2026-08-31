package com.javalanguagefundamentals;
import java.util.Scanner;

public class EmployeeInfo {
	int empid;
	String empname;
	int salary;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeInfo t = new EmployeeInfo();
		System.out.println("Enter Employee Id : ");
		t.empid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name : ");
		t.empname = sc.nextLine();
		System.out.println("Enter Employee Salary : ");
		t.salary = sc.nextInt();
		t.displayEmployee();
		
	}
	void displayEmployee() {
		System.out.println("Employee ID : " + empid);
		System.out.println("Employee Name : " + empname);
		System.out.println("Salary : " + salary);
	}

	
}
