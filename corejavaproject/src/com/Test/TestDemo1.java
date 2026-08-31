package com.Test;

public class TestDemo1 {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30 };
		int[] b = a;
		b[1] = 100;
		System.out.println(a[1]);

	}

}
