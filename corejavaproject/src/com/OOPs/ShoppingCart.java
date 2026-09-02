package com.OOPs;

public class ShoppingCart {
	private int cartItems;
	private double totalAmount;

	public void addItem(int price) {
		cartItems++;
		totalAmount = totalAmount + price;
	}

	public void removeItem(double price) {
		if (cartItems > 0) {
			cartItems--;
			totalAmount = totalAmount - price;
		}
	}

	public double getTotal() {
		return totalAmount;

	}

	public static void main(String args[]) {
		System.out.println("Main Method Started");
		ShoppingCart sc = new ShoppingCart();
		sc.addItem(100);
		sc.addItem(500);
		sc.addItem(700);
		System.out.println("Total Items Cost in the cart before insert : " + sc.getTotal());
		sc.removeItem(50);
		System.out.println("Total Items Cost in the cart after insert : " + sc.getTotal());
		System.out.println("Main Method Ended");
	}

}
