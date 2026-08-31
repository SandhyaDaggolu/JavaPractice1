package com.LabTasks;

public class SmallestNumber {

	public static void main(String[] args) {
		int[] numbers = { 12, 45, 7, 89, 23 };
		int smallest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}
		System.out.println("The Smallest Number is : " + smallest);
	}

}
