package com.Arrays;

public class MinMax {

	public static void main(String[] args) {
		
		int[] numbers = { 10, 3, 5, 56, 11, 7 };

		int min = numbers[0];
		int max = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
			else if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		/*for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}

		}*/
		System.out.println("The minimum value is : " + min);
		System.out.println("The maximum value is : " + max);
	}
}
