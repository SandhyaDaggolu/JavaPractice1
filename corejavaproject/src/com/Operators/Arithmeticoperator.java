package com.Operators;

/* Operators - operators are the symbols used to perform specific tasks based on our requirements.
 * operators are doing some operations on variables and values
 * ex : int a=10;
 *      int b=20;
 *      sop(a+b);
 *      here, a & b are the variables(operands)
 *            10 and 20 are the values(operators)
 *            = is Assignment operator
 *            + is Arithmetic operator
 *            
 * In java, we have 9 operators
 * 1. Arithmetic operator -> + - * / % 
 * 2. Assignment operator -> = += -+ *= /= %=
 * 3. Unary operators -> + - ++ --
 * 4. comparision operators -> == <= >= > < !=
 * 5. Logical operators -> && || !
 * 6. Bitwise operators -> & | ^ ~
 * 7. Shift operators -> << >> >>>
 * 8. Ternary operators -> ? :
 * 9. InstanceOf operator
 *           
 */
// Arithmetic operator -> + - * / %
public class Arithmeticoperator {

	public static void main(String[] args) {
		System.out.println("Main Method Started.............");
		int a = 10;
		int b = 20;
		
		int x = 97;
		int y = 4;
		
		
		// String + anything is String only, here first + is working like a concatenation
		//System.out.println("Addition of two numbers : " + a + b);//1020
		System.out.println("Addition of two numbers : " + (a + b));//30
		// The operator - is undefined for the argument type(s) String, int
		// System.out.println("Subtraction of two numbers : " + a - b);// CE
		System.out.println("Subtraction of two numbers : " + (a - b));// -10
		System.out.println("Multiplication of two numbers : " + a * b);// 200
		// Division -> quotient
		System.out.println("Division of two numbers : " + a / b);// 24
		// Modulus -> remainder
		System.out.println("Modulus of two numbers : " + x % y);// 1
		
		System.out.println(5*2/3);//3
		
		
		
		
		System.out.println("Main Method Ended...............");

	}

}
