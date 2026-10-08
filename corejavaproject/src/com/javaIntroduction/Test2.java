package com.javaIntroduction;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Test2 t = new Test2();
		hello();
		t.welcome();

	}

	public static void hello() {
		System.out.println("Hello...!");
		System.out.println("Hello...!");
		System.out.println("Hello...!");
		System.out.println("Hello...!");
		System.out.println("Hello...!");
	}

	void welcome() {
		System.out.println("Welcome java...!");
	}

}
