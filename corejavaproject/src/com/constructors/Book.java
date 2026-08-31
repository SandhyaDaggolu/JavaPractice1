package com.constructors;

public class Book {
	// Instance Data
	int bookId;
	String bookName;
	double price;

	// parameterized constructor to initialize the objects
	Book(int bookId, String bookName, double price) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}

	// copy constructor - to copy one object data from another object data use in
	// constructors will consider as copy constructor
	Book(Book b) {
		this.bookId = b.bookId;
		this.bookName = b.bookName;
		this.price = b.price;
	}

	// Display Method
	void display() {
		System.out.println("Book Id : " + bookId);
		System.out.println("Book Name : " + bookName);
		System.out.println("Book Price : " + price);
	}

	// Price Increment Method
	void IncresePrice(double amount) {
		price = price + amount;
	}

	public static void main(String[] args) {
		// creating object-1 using parameterized constructor
		Book b1 = new Book(201, "Python Basics", 1000.0);

		// creating object-2 using copy constructor
		Book b2 = new Book(b1);
		
		// Modify b2
		b2.IncresePrice(500);
		b2.bookName = "Java Programming";
		
		// Display both
		System.out.println("Book-1 Details...................");
		b1.display();
		
		System.out.println("Book-2 Details...................");
		b2.display();

	}

}
