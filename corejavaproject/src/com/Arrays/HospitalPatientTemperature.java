package com.Arrays;

import java.util.Scanner;

public class HospitalPatientTemperature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of patients : ");
		int n = sc.nextInt();

		double[] temperature = new double[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter patient temperature : ");
			temperature[i] = sc.nextDouble();
		}

		double highesttemp = temperature[0];
		double lowesttemp = temperature[0];
		double fevercount = 0;
		double sum = 0;
		double avg = 0;
		for (int i = 0; i < n; i++) {
			if (temperature[i] > highesttemp) {
				highesttemp = temperature[i];
			}
			if (temperature[i] < lowesttemp) {
				lowesttemp = temperature[i];
			}
			sum = sum + temperature[i];
			if (temperature[i] > 100) {
				fevercount++;
			}
			avg = sum / n;
		}
		System.out.println("Highest : " + highesttemp);
		System.out.println("Lowest : " + lowesttemp);
		System.out.println("Average : " + avg);
		System.out.println("Fever Count : " + fevercount);
	}

}
