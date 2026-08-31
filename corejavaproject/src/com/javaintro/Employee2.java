package com.javaintro;
public class Employee2 {
	static String companyName;
	static String location;
	
	String employeeName;
	double salary;
	
	static {
		companyName = "Vcube";
		location = "Hyd";
	}
	public static void main(String[] args) {
		Employee2 emp1 = new Employee2();
		emp1.employeeName = "Sandhya";
		emp1.salary = 5000;
		System.out.println("Employee1 Details");
		System.out.println("Employee Name : " + emp1.employeeName);
		System.out.println("Employee Salary : " + emp1.salary);
		System.out.println("Company Name : " + companyName);
		System.out.println("Location : " + location);
		
		
		Employee2 emp2 = new Employee2();
		emp2.employeeName = "Anu";
		emp2.salary = 6000;
		System.out.println("Employee2 Details");
		System.out.println("Employee Name : " + emp2.employeeName);
		System.out.println("Employee Salary : " + emp2.salary);
		System.out.println("Company Name : " + companyName);
		System.out.println("Location : " + location); 
		

	}

}


