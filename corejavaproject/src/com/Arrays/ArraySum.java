package com.Arrays;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the matrix length : ");
		//int n = sc.nextInt();

		int[][] matrix = new int[3][3];
		System.out.println("Enter matrix elements : ");
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = sc.nextInt();
				sum+=matrix[i][j];
			}
		}
		System.out.println("matrix : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Sum of the matrix : " + sum);
	}

}
