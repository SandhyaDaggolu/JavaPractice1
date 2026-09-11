package com.OOPs;

class Employee {
	void display() {
		System.out.println("Working");
	}
}

class Doctor extends Employee {
	void display() {
		System.out.println("Doctor giving treatment to patients");
	}
}

class Nurse extends Employee {
	void display() {
		System.out.println("Nurse is taking care of patients");
	}

}

class Receptionist extends Employee {
	void display() {
		System.out.println("Receptionist is taking details of patients");
	}

}

public class HospitalDetails {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Employee e = new Doctor();
		e.display();
		Employee e1 = new Nurse();
		e1.display();
		Employee e2 = new Receptionist();
		e2.display();
		System.out.println("Main method ended");

	}

}
