package com.javalanguagefundamentals;

import java.util.Scanner;

public class SalarySlipGenerator {

	public static void main(String[] args) {
		SalarySlipGenerator t = new SalarySlipGenerator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name : ");
		String employeename = sc.nextLine();
		System.out.println("Enter Basic Salary : ");
		double basicSalary = sc.nextDouble();
		/*System.out.println("HRA : ");
		double HRA = sc.nextDouble();
		System.out.println("DA : ");
		double DA = sc.nextDouble();
		System.out.println("Gross Salary : ");
		double grossSalary = sc.nextDouble();*/
		t.salarySlip(employeename, basicSalary);
	}
	void salarySlip(String employeename, double basicSalary) {
		double HRA = basicSalary * 20 / 100;
		double DA = basicSalary * 10 / 100;
		double grossSalary = basicSalary + HRA + DA; 
		System.out.println("Employee Name : " + employeename);
		System.out.println("Basic Salary : " + basicSalary);
		System.out.println("HRA : " + HRA);
		System.out.println("DA : " + DA);
		System.out.println("Gross Salary : " + grossSalary);
	}
}
