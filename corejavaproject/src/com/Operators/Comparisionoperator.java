package com.Operators;                              ;

// comparision operators -> will give the resulted values as boolean
// comparision operators -> == <= >= > < !=

public class Comparisionoperator {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 10;
		
		String s1 = "Sandhya";// It stores in a string constant pool
		String s2 = new String("Sandhya");// It stores in a heap memory
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println("******************************");
		System.out.println(a==b);//false
		System.out.println(b==c);//true
		System.out.println(a>b);//false
		System.out.println(a<b);//true
		System.out.println(a <= b);//true
		System.out.println(a >= b);//false
		System.out.println(a != b);//true
		System.out.println("******************************");
		System.out.println(67 & 54);//2
		System.out.println(86 & 39);//6
		System.out.println(91 & 47);//11
		System.out.println(88 & 66);//64
		System.out.println("******************************");
		System.out.println(67 | 55);// 119

	}

}
