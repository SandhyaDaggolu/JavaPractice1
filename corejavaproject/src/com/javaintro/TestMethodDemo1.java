package com.javaintro;

public class TestMethodDemo1 {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		TestMethodDemo1 t = new TestMethodDemo1();
		t.hello();
		t.show();
		System.out.println("Main Method Ended");

	}
	void show() {
		System.out.println("Show Method Called");
	}
	void hello() {
		System.out.println("Good Morning"); 
	}

}
 