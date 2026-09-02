package com.WeeklyTestTasks;

public class Demo1 {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40 };
		for (int i = a.length - 1; i >= 0; i--) {
			if (i == 1) {
				continue;
			}
			System.out.println(a[i] + " ");
		}

	}

}
