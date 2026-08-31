package com.javalanguagefundamentals;

public class EmployeeDetails {
	
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
		EmployeeDetails t = new EmployeeDetails();
		t.displayEmployeeName("Sandhya Subramanyam");
		t.displayEmployeeId(78);
		t.displayDepartment("CSE");
		t.displaySalary(500000);
		t.displayCity("Nellore");
		

	}

}
