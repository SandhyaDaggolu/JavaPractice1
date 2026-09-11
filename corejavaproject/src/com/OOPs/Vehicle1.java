package com.OOPs;

class Vehicles {
	int speed = 50;

	void display() {
		System.out.println("Vehicle method called");
	}
}

class Cars extends Vehicles {
	int speed = 100;
	void display() {
		System.out.println("car method called");
	}
}

public class Vehicle1 {
	public static void main(String[] args) {
		System.out.println("main method startetd");
		Cars cars1 = new Cars();
		
		System.out.println("speed of car" + cars1.speed);
		
		cars1.display();
		
		System.out.println("main method ended");

	}

}
