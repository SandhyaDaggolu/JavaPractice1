package com.constructors;

public class Employee {
	// Instance Data
	int empId;
	String empName;
	double salary;
	
	// parameterized constructor
	Employee(int empId, String empName, double salary){
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	// copy constructor
	Employee(Employee e){
		this.empId = e.empId;
		this.empName = e.empName;
		this.salary = e.salary;
	}
	
	// salary increment method
	void IncrementSalary(double amount){
		salary = salary + amount;
		
	}
	// creating display method
	void display() {
		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee salary : " + salary);
	}
	
	public static void main(String[] args) {
		System.out.println("Employee-1 Details...............");
		
		// creating emp1 using parameterized constructor
		Employee emp1 = new Employee(101, "Sandy", 60000.0);
		
		// creating emp2 using copy constructor
		Employee emp2 = new Employee(emp1);
		
		// Modify emp2
		emp2.IncrementSalary(700000);
		emp2.empName="Sandhya";
		
		// Display emp1
		emp1.display();
		System.out.println("Employee-2 Details...............");
		
		// Display emp2
		emp2.display();

	}

}
