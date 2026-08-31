package com.Operators;

public class Increment12 {

	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		int c = 6;
		int d = 8;
		a = a++ + ++b + c++ + ++d + ++a + b++ + ++c;
		System.out.println(+a);
		System.out.println(+b);
		System.out.println(+c);
		System.out.println(+d);

	}

}
