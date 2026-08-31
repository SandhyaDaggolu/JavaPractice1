package com.Arrays;

import java.util.Scanner;

public class LeaderElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Leader Elements Length : ");
		int n = sc.nextInt();
		int[] leadelem = new int[n];
		System.out.println("Enter Leader Elements : ");
		for (int i = 0; i < n; i++) {
			leadelem[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {

		}
		int max = leadelem[n - 1];
		System.out.println("Max value : " + max);
		for (int i = n - 2; i >= 0; i--) {
			if (leadelem[i] > max) {
				max = leadelem[i];
				System.out.println(max);
			}
		}

	}

}
