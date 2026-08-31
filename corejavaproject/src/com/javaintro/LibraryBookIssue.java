package com.javaintro;

public class LibraryBookIssue {

	public static void main(String[] args) {
		System.out.println("..............Library Details..........");
		LibraryBookIssue t = new LibraryBookIssue();
		t.displayname("Central Library");
		t.displayLocation("Gudur");
		t.displayTotalBooks(90);
		t.displayWorkingHours(9);
		t.issueBook("Sandhya", "Java Book");
		

	}
	void displayname(String libraryname) {
		System.out.println("Library Name : " + libraryname);
	}
	void displayLocation(String location) {
		System.out.println("Location : " + location);
	}
	void displayTotalBooks(int totalbooks) {
		System.out.println("Total Books : " + totalbooks);
	}
	void displayWorkingHours(int workinghours) {
		System.out.println("Working Hours : " + workinghours);	
		
	}
	void issueBook(String StudentName, String BookName) {
		System.out.println("Student Name : " + StudentName);
		System.out.println("Book Name : " + BookName);
		System.out.println("Book Issued Successfull........");
		
		
	}

}
