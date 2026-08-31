package com.constructors;

// super or parent
public class Vehicle {
// Instance Data
	String model = "Classic";
	String brand = "Re";
	double price = 500000;

	public static void main(String[] args) {
		System.out.println("Main Method Started From Vehicle");

	}

}

//sub or child or derived
class Bike extends Vehicle {
	String model = "FZ";
	String brand = "Yamaha";
	double price = 200000;

	public static void main(String[] args) {
		System.out.println("Main Method Started From Bike");

//By using child class obj and child class obj reference we can access both parent and child class functionalities
		Bike b = new Bike();
		b.vehicleInnfo();
		b.vehicleInnfo2();
		
// Cannot use this in a static context
		//System.out.println(this.model);

// Cannot use super in a static context
		//System.out.println(super.model);

		System.out.println("Main Method Ended From Bike");

		System.out.println("*********************************************");
	}

	// sub class is used to access the child class data
	void vehicleInnfo() {
		System.out.println("Model of the Vehicle : " + this.model);
		System.out.println("Brand of the Vehicle : " + this.brand);
		System.out.println("Price of the Vehicle : " + this.price);
		System.out.println("*********************************************");

	}

	// super class is used to access the parent class data
	void vehicleInnfo2() {
		System.out.println("Model of the Vehicle : " + super.model);
		System.out.println("Brand of the Vehicle : " + super.brand);
		System.out.println("Price of the Vehicle : " + super.price);

	}

}

// this and super are the keywords to invoke object data members
// this and super we cannot use in a static context
// this is used to access the current class data
// super is used to access the parent class data
// this and super we can use in methods and constructors
// this() and super() we can use only in a constructors















