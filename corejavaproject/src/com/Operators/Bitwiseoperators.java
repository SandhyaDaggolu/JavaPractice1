package com.Operators;

// Bitwise operators -> & | ^ ~

public class Bitwiseoperators {

	public static void main(String[] args) {
		System.out.println(true & true);//true
		System.out.println(true & false);//false
		System.out.println(false & true);//false
		System.out.println(false & false);//false
		// If we have a single & then it is not going to give us dead code
		System.out.println("*********************************************");
		System.out.println(1 & 1);// true
		System.out.println(1 & 0);//false
		System.out.println(0 & 1);//false
		System.out.println(0 & 0);// false
		System.out.println("*********************************************");
		int a = 7;
		System.out.println(~a);// ~a = -(a+1) = -(7+1) = -8
		

	}

}
