package com.Operators;

// Assignment operator -> = += -+ *= /= %=
public class Assignmentoperator {

	public static void main(String[] args) {
		int result = 10;
		// Type mismatch: cannot convert from double to int : CE
		// result = result + 5.5;
		result += 5.5;// Narrowing - converting from big to small
		
		
		
		System.out.println("Result is : " + result);
		
		// result = result - 4.5;
		 result = (int)(result - 4.5);
		 System.out.println("Result is : " + result);
		 
		 //result = result * 4.3;
		 result *= 4.3;
		 System.out.println("Result is : " + result);
		 
		 // result = result / 4.3;
		 result /= 4.2;
		 System.out.println("Result is : " + result);
		 
		 // result = result % 2.5;
		 result %= 2.5;
		 System.out.println("Result is : " + result);

	}

}
