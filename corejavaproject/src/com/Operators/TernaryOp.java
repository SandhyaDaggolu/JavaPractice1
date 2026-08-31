package com.Operators;

public class TernaryOp {

	public static void main(String[] args) {
		int marks = 100;
		
		String a = (marks >= 90)? "A" : (marks >= 75)? "B" : (marks >= 60)? "C" : (marks >= 40)? "D" : "Fail";
		System.out.println("Marks : " + a);
		
		
		

	}

}
