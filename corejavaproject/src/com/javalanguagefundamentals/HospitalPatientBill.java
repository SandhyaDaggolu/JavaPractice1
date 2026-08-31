package com.javalanguagefundamentals;

import java.util.Scanner;

public class HospitalPatientBill {
	String Patientname;
	int age;
	double roomchargeperday;
	short daysadmitted;
	static double total;
	
	
	HospitalPatientBill(String Patientname, int age, double roomchargeperday, short daysadmitted, double total) {
		this.Patientname = Patientname;
		this.age = age;
		this.roomchargeperday = roomchargeperday;
		this.daysadmitted = daysadmitted;
		this.total = total;
	}
	

	void displayPatient() {
		total = roomchargeperday * daysadmitted;
		System.out.println("Patient Name : " + Patientname);
		System.out.println("Age : " + age);
		System.out.println("Room Charge Per Day : " + roomchargeperday);
		System.out.println("Days Admitted : " + daysadmitted);
		System.out.println("Total Hospital Bill : " + total);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Patient Name : ");
		String Patientname = sc.nextLine();
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		System.out.println("Enter Room Charge Per Day : ");
		double roomchargeperday = sc.nextDouble();
		System.out.println("Enter Number Of Days Admitted : ");
		short daysadmitted = sc.nextShort();
		
		HospitalPatientBill t = new HospitalPatientBill(Patientname, age, roomchargeperday, daysadmitted, total);
		t.displayPatient();
	}
	

}
