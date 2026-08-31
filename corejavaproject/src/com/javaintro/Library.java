package com.javaintro;
//no return type + no arguments
public class Library {
	String libraryname = "Central Library";
	String location = "Gudur";
	int totalbooks = 279;
	short workinghours = 9;
	

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Library t = new Library();
		t.display();
		System.out.println("Main Method Ended");
		

	}
	void display() {
		System.out.println("Library Name : " + libraryname);
		System.out.println("Location : " + location);
		System.out.println("Total Books : " + totalbooks);
		System.out.println("Working Hours : " + workinghours);
	}

}
