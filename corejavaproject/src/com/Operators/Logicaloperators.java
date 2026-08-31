package com.Operators;

// Logical operators -> && || ! 
// will give the resulted values as boolean expressions

public class Logicaloperators {

	public static void main(String[] args) {
		System.out.println("Main Method Started..................");
		int a = 100;
		int b = 150;
		int c = 50;
		System.out.println("******************&&********************");
		System.out.println(true && true);// true
		System.out.println(true && false);// false
		// whenever the first condition is false, the remaining conditions will not
		// check
		// Dead code
		System.out.println(false && true);// false
		System.out.println(false && false);// false
		// System.out.println(10 && 10);// CE : && will check the conditions only not
		// values
		System.out.println("**************************************");
		System.out.println(a < b && b > c);// true && true -> true
		System.out.println(a < b && b < c);// true && false ->false
		System.out.println(a > b && b > c);// false && true -> false
		System.out.println(a > b && b < c);// false && false -> false
		System.out.println("**************************************");

		int x = 5;
		int y = 6;
		System.out.println(x++ > --y && ++x < ++y);// 5 > 5 && 7 < 6 // false
		System.out.println("x Value : " + x);
		System.out.println("y Value : " + y);
		System.out.println("**************************************");
		System.out.println("*******************||*******************");
		System.out.println(true || true);//true -> 2nd part is dead code
		System.out.println(true || false);//true -> 2nd part is dead code
		System.out.println(false || true);//true 
		System.out.println(false || false);//false
		System.out.println("*******************!*******************");
		System.out.println(!true);//false
		System.out.println(!(a>c));//false
		
		

	}

}
