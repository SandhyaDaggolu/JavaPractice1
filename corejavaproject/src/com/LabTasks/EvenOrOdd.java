package com.LabTasks;

public class EvenOrOdd {

	public static void main(String[] args) {
		int[] numbers = { 2, 5, 8, 9, 12 };
		int even = 0;
		int odd = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Even number is : " + even);
		System.out.println("Odd number is : " + odd);
	}
}
