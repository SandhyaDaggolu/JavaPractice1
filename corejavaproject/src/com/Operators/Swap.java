package com.Operators;

public class Swap {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("A Value Before Swapping : " + a);
		System.out.println("B Value Before Swapping : " + b);
		
		a = a + b; 
		b = a - b; 
		a = a - b; 
		
		System.out.println("A Value After Swapping : " + a);
		System.out.println("B Value After Swapping : " + b);
		
		

	}

}
