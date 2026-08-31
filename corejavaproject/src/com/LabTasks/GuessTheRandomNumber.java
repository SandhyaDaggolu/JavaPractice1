package com.LabTasks;

import java.util.Random;
import java.util.Scanner;

public class GuessTheRandomNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chances = 3;
		Random rn = new Random();
		int n = rn.nextInt(1, 11);
		for (int i = 1; i <= chances; i++) {
			System.out.println("Enter you guessed value : ");
			int guess = sc.nextInt();
			if (guess == n) {
				System.out.println("You Won!");
				break;
			} else if (i <= 2) {
				System.out.println("Try Again... You Have");
			} else {
				System.out.println("Better Luck Next Time!");
			}
		}

	}

}
