package com.Arrays;

import java.util.Arrays;

public class SumOfArrays {

	public static void main(String[] args) {

		int[] a1 = { 10, 20, 30 };// 3
		int[] a2 = { 40, 50, 60, 70, 80 };// 5
		int len = 0;

		// 3>5 -> false
		if (a1.length > a2.length) {
			len = a1.length;
		} else {
			len = a2.length;// len={ 40, 50, 60, 70, 80 }
		}
		int[] c = new int[len];
		for (int i = 0; i < len; i++) { // 0 to { 40, 50, 60, 70, 80 }==> 5
			if (a1.length <= i) { // c=10 20 30
				c[i] = a2[i];
			} else if (a2.length <= i) { //
				c[i] = a1[i];
			} else {
				c[i] = a1[i] + a2[i];
			}

		}
		System.out.println(Arrays.toString(c));

	}

}
