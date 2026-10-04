package com.IOExceptions;

class BookDetails {
	transient int bookId;
	String title;
	String author;
	double price;

	BookDetails(int bookId, String title, String author, double price) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.price = price;

	}

}
