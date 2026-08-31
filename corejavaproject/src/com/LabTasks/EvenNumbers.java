package com.LabTasks;

public class EvenNumbers {

	public static void main(String[] args) {

		int n = 1;
		int sum = 0;

		while (n <= 100) {
			if (n % 2 == 0) {
				sum = sum + n;
			}
			n++;
		}
		System.out.println("The Sum Of Even Numbers is : " + sum);
	}

}
