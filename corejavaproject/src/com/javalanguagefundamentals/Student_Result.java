package com.javalanguagefundamentals;

// Return Type + No Arguments

public class Student_Result {
	double m1 = 10;
	double m2 = 20;
	double m3 = 30; 

	public static void main(String[] args) {
		Student_Result t = new Student_Result();
		double total = t.calculateTotal();
		System.out.println("Total : " + total);
		double average = t.calculateAverage();
		System.out.println("Average : " + average);
		double percentage = t.calculatePercentage();
		System.out.println("Percentage : " + percentage);

	}
	double calculateTotal() {
		double total = m1 + m2 + m3;
		return total;
		
	}
	double calculateAverage() {
		double average = (m1 + m2 + m3)/3;
		return average;
	}
	
	double calculatePercentage() {
		double percentage = ((m1 + m2 + m3) / 300) * 100;
		return percentage;
	}

}
