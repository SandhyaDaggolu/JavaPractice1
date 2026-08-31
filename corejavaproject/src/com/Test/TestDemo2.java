package com.Test;

public class TestDemo2 {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30 };
		for (int x : a) {
			x = x + 5;
			System.out.println(a[0]);
		}

	}

}
