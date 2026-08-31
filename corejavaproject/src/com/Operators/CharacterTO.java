package com.Operators;

import java.util.Scanner;

public class CharacterTO {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character : ");
		char ch = sc.next().charAt(0);
		
		
		String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')?"Vowel" : "Constant";
		System.out.println(result);
		

	}

}
