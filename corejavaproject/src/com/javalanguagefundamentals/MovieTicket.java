package com.javalanguagefundamentals;
import java.util.Scanner;

public class MovieTicket {
	String name;
	int snumber;
	int tp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MovieTicket t = new MovieTicket();
		System.out.println("Enter Movie Name : ");
		t.name = sc.nextLine();
		System.out.println("Enter Seat Number : ");
		t.snumber = sc.nextInt();
		System.out.println("Enter Ticket Price : ");
		t.tp = sc.nextInt();
		t.showTicket();		

	}
	void showTicket() {
		System.out.println("Movie Name : " + name);
		System.out.println("Seat Number : " + snumber);
		System.out.println("Ticket price : " + tp);
	}

}
