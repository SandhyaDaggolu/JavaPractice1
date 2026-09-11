package com.OOPs;

class OrderDetails1 {
	int orderId;
	String customerName;
	double price;

	OrderDetails1(int orderId, String customerName, double price) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.price = price;
	}

	void displayDetails() {
		System.out.println("Order Id : " + orderId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Price : " + price);
	}
}

class PizzaOrder extends OrderDetails1 {
	PizzaOrder(int orderId, String customerName, double price) {
		super(orderId, customerName, price);
		System.out.println("Pizza Order Details");
	}
}

class BurgerOrder extends OrderDetails1 {
	BurgerOrder(int orderId, String customerName, double price) {
		super(orderId, customerName, price);
		System.out.println("Burger Order Details");
	}
}

public class OrderDetails {

	public static void main(String[] args) {
		System.out.println("main method started");
		OrderDetails1 oi = new BurgerOrder(101, "abc", 50000.0);
		oi.displayDetails();
		System.out.println("main method ended");
	}
}
