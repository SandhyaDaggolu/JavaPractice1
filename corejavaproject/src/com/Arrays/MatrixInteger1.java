package com.Arrays;

import java.util.Scanner;

public class MatrixInteger1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] matrix = new int[n][m];
		System.out.println("Enter matrix elements : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] % 2 == 0) {
					matrix[i][j] = 0;
				} else {
					matrix[i][j] = -1;
				}
				System.out.print(matrix[i][j] + " ");
			}
			
		}
		

	}

}
