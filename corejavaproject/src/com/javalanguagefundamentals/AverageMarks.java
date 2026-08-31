package com.javalanguagefundamentals;
import java.util.Scanner;
public class AverageMarks {
	
	double calculateAverage() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m1 Marks : " );
		double m1 = sc.nextDouble();
		System.out.println("Enter m2 Marks : " );
		double m2 = sc.nextDouble();
		System.out.println("Enter m3 Marks : " );
		double m3 = sc.nextDouble();
		double average = (m1 + m2 + m3)/3;
		return average;
	}

	public static void main(String[] args) {
		AverageMarks t = new AverageMarks();
		double avg = t.calculateAverage();
		System.out.println("Average Marks : " + avg);
		

	}

}
