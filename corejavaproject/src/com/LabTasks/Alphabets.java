package com.LabTasks;

import java.util.Scanner;

public class Alphabets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabet : ");
		char ch = sc.nextLine().charAt(0);
		for (char i = 'Z'; i >= 'A'; i--) {
			System.out.println(i);

		}

	}

}
