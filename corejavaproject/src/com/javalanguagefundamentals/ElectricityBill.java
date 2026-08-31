package com.javalanguagefundamentals;

public class ElectricityBill {

	public static void main(String[] args) {
		ElectricityBill t = new ElectricityBill();
		t.displayConsumer("sandy");
		t.calculateBill(40);

	}
	void displayConsumer(String name) {
		System.out.println("Consumer Name : " + name);
	}
	void calculateBill(int units) {
		System.out.println("Units : " + units);
	}

}
