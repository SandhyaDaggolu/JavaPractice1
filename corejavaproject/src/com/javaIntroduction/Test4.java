package com.javaIntroduction;

public class Test4 {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called");
	}
	
	void method1() {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		System.out.println("main method strated");

		new Test4().method1();//anonymous obj
		
		System.gc();

	}

}
