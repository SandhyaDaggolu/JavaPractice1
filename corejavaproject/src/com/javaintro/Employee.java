package com.javaintro;

public class Employee {
		String employeeName;
		static int count = 0;
		
		{
			count++;
		}
		public static void main(String[] args) {
			Employee emp1 = new Employee();
			emp1.employeeName = "Sandhya";
			System.out.println("Employe Name : " + emp1.employeeName);
			
			Employee emp2 = new Employee();
			emp2.employeeName = "Anu";
			System.out.println("Employe Name : " + emp2.employeeName);
			
			Employee emp3 = new Employee();
			emp3.employeeName = "Queen";
			System.out.println("Employe Name : " + emp3.employeeName);

			System.out.println("No of objects in a class: " + count);
			
			

		}

	}
