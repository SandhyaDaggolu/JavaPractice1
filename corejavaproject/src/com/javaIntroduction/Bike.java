package com.javaIntroduction;

public class Bike {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("object destroyed");
	}

	void hello() {
		System.out.println("Hello");
	}

	void show() {
		Bike b = new Bike();// object creation inside the method
	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Bike fz = new Bike();
		Bike re = new Bike();
		Bike hero = new Bike();

		System.out.println(fz);
		System.out.println(re);
		System.out.println(hero);

		fz = null;// nullifying

		Bike tvs = new Bike();
		tvs = hero;// re-assignment

		new Bike().hello();// anonymous obj

		tvs.show();

		System.out.println(fz);
		System.out.println(re);
		System.out.println(hero);
		System.out.println(tvs);

		System.gc();

	}

}
