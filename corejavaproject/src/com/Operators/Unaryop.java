package com.Operators;

public class Unaryop {
// Unary operators -> + - ++ --
/* + unary +
 * - unary -
 * ++ pre or post increment
 * -- pre or post decrement
 */
	
	
	public static void main(String[] args) {
		/*int a = 5;
		int b = 6;
		System.out.println(+a);//5
		System.out.println(-b);//-6
		
		System.out.println(++a);//6
		System.out.println(--a);//5
		System.out.println(a++);//5 -> 6
		System.out.println(++a);//7
		System.out.println(a++);//7 -> 8
		System.out.println(++a);//9
		System.out.println(a--);//9 -> 8
		System.out.println("A value is : " + a);
		System.out.println(++b);
		System.out.println(b++);
		System.out.println(--b);
		System.out.println(b--);*/
		
		
		
		int a = 5;
		int b = 3;
		int c = ++a + b++ + --a + ++b;// 6+4+5+4=19
		System.out.println(a);//5
		System.out.println(b);//5
		System.out.println(c);//19
	}

}
