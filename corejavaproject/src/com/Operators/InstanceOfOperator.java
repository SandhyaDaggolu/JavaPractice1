package com.Operators;

// InstanceOf operator

public class InstanceOfOperator {

	public static void main(String[] args) {
		Integer i = 10;
		System.out.println(i instanceof Integer);// true
		System.out.println(i instanceof Number);// true
		System.out.println(i instanceof Object);// true
		// CE : Incompatible conditional operand types Integer and String
		//System.out.println(i instanceof String);
		System.out.println(null instanceof Integer);//false
		System.out.println(null instanceof Number);//false
		System.out.println(null instanceof Object);// false
		System.out.println(null instanceof String);// false
		
		

	}

}
