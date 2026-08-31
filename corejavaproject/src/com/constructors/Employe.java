package com.constructors;

public class Employe {
	String empName;
	int empId;
	double salary;
	
	Employe(){
		this("Unknown");
		
	}
	Employe(String empName){
		this(empName, 0);
		
	}
	Employe(String empName, int empId){
		this(empName, empId, 0.0);
		
	}
	Employe(String empName, int empId, double salary){
		this.empName = empName;
		this.empId = empId;
		this.salary = salary;
		
	}
	
	void show() {
		System.out.println("Name of the Employee : "  + empName);
		System.out.println("Id of the Employee : "  + empId);
		System.out.println("Salary of the Employee : "  + salary);
		System.out.println("*********************************************");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started...................");
		Employe t = new Employe();
		t.show();
		Employe t1 = new Employe("Sandhya Subramanyam");
		t1.show();
		Employe t2 = new Employe("Sandhya Subramanyam", 107);
		t2.show();
		Employe t3 = new Employe("Sandhya Subramanyam", 107, 15000);
		t3.show();
		System.out.println("Main Method Ended...................");
	}

}
