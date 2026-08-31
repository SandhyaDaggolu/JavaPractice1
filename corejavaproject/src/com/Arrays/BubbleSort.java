package com.Arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 12, 34, 57, 89, 32, 3, 4, 7 };
		int temp = 0;
		int count = 0;
		int count1 = 0;
		System.out.println("Before Swapping : ");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				count1++;
			}
			count++;
		}
		System.out.println("Count : " + count);
		System.out.println("Count1 : " + count1);
		System.out.println("After Swapping : ");
		System.out.println(Arrays.toString(arr));

	}
}
