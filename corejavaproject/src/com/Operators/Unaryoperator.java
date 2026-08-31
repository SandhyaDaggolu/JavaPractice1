package com.Operators;

public class Unaryoperator {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a value Before Swapping : " + a);
		System.out.println("b value Before Swapping : " + b);
		
		/*int temp = a;
		a = b;
		b = temp;*/
		
		a = a + b;//30
		b = a - b;//10
		a = a - b;//20
		
		System.out.println("a value After Swapping : " + a);
		System.out.println("b value After Swapping : " + b);

	}

}
