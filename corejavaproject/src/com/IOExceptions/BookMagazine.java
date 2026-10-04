package com.IOExceptions;

class Book {
	void BookDetails() {
		System.out.println("This is a Book");
	}
}

class Magazine {
	void MagazineDetails() {
		System.out.println("This is a Magazine");
	}
}

public class BookMagazine {

	public static void main(String[] args) {
		Object ob = new Magazine();
		try {
			Book b = (Book) ob;
			b.BookDetails();
		} catch (ClassCastException e) {
			System.out.println("Class Cast Exception occurred");
		}

	}

}
