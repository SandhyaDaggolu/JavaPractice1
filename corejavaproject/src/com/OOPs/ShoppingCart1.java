package com.OOPs;

public class ShoppingCart1 {
	private int cartItems;
	private double totalAmount;
	
	public void setcartItems(int cartItems) {
		this.cartItems=cartItems;
	}
	public int getcartItems() {
		return cartItems;
	}
	public void settotalAmount(double totalAmount) {
		this.totalAmount=totalAmount;
	}
	public double gettotalAmount() {
		return totalAmount;
	}

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

}