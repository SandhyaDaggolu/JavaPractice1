package com.javaIntroduction;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		method1();

	}

	static void method1() {
		method2();
		System.out.println("Hello method1");
	}

	static void method2() {
		Test3 t = new Test3();
		t.method3();
		System.out.println("Hello method2");
	}

	void method3() {
		method4();
		System.out.println("Hello method3");
	}

	void method4() {
		method5();
		System.out.println("Hello method4");
	}
	static void method5() {
		System.out.println("Hello method5");
	}

}
