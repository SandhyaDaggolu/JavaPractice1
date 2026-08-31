package com.OOPs;

public class LibraryClass {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Library l1 = new Library();
		l1.setBookId(101);
		l1.setTitle("The Jungle");
		l1.setAuthor("Sandhya");
		l1.setPrice(540);
		System.out.println("Book Id : " + l1.getBookId());
		System.out.println("Book Title : " + l1.getTitle());
		System.out.println("Author Name : " + l1.getAuthor());
		System.out.println("Book Price : " + l1.getprice());
		System.out.println("Main Method Ended");
	}
}
