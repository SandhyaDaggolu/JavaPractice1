package com.OOPs;

public class Vehicle {
	void start() {
		System.out.println("Vehicle class is started");

	}
	//public static void main(String[] args) {
		
	//}
}

class Car extends Vehicle {
	void drive() {
		System.out.println("Car class extends");
	}


	public static void main(String[] args) {
		System.out.println("main method started");
		Car c = new Car();
		c.start();
		c.drive();
		System.out.println("main method ended");

	}

	}
