package com.javalanguagefundamentals;
import java.util.Scanner;

public class LibraryBook {
	String bname;
	String Aname;
	int price;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LibraryBook t = new LibraryBook();
		System.out.println("Enter Book Name : ");
		t.bname = sc.nextLine();
		System.out.println("Enter Author Name : ");
		t.Aname = sc.nextLine();
		System.out.println("Enter Book Price : ");
		t.price = sc.nextInt();
		t.displayBook();
		
	}
	void displayBook() {
		System.out.println("Book Name : " + bname);
		System.out.println("Author Name : " + Aname);
		System.out.println("Price : " + price);

	}
}
