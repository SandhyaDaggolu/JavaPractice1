package com.Arrays;

import java.util.Arrays;

public class Matrix {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int left = 0;
		int right = matrix.length - 1;
		int temp = 0;
		System.out.println("Enter matrix elements : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i % 2 == 0) {
					while (left < right) {
						temp = matrix[i][left];
						matrix[i][left] = matrix[i][right];
						matrix[i][right] = temp;
						left++;
						right--;
					}
				} else if (i % 2 != 0 && i != j) {
					matrix[i][j] *= 2;

				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					matrix[i][j] *= matrix[i][j];
				}
			}
		}
		System.out.println(Arrays.deepToString(matrix));
	}

}
