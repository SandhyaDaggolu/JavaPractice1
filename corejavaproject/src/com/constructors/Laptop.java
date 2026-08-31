package com.constructors;

// why..?
// For Code - Reusability

// what...?
// copying one object data from another object will use as a constructor will consider as copy constructor 

public class Laptop {
	String model;
	String brand;
	double price;

	public Laptop() {
		System.out.println("No-arg constructor");
	}

	public Laptop(Laptop l) {
		System.out.println("Parameterized constructor");
		this.model = l.model;
		this.brand = l.brand;
		this.price = l.price;

	}

	public static void main(String[] args) {
		System.out.println("Main Method Started.......");
		Laptop L = new Laptop();
		L.model = "Intel Graphics";
		L.brand = "Dell";
		L.price = 5000000.0;
		L.show();

		Laptop L1 = new Laptop(L);
		L1.show();

		System.out.println("Main Method Ended.......");

	}

	void show() {
		System.out.println("Model of Laptop : " + model);
		System.out.println("Brand of Laptop : " + brand);
		System.out.println("Price of Laptop : " + price);
		System.out.println("**********************************************");
	}

}
