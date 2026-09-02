package com.OOPs;

public class Cart {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		ShoppingCart1 sc = new ShoppingCart1();
		sc.setcartItems(5);
		sc.settotalAmount(5000);
		sc.addItem(2);
		sc.removeItem(3);
		sc.settotalAmount(4000);
		System.out.println(sc.getcartItems());
		System.out.println(sc.gettotalAmount());
		System.out.println("Main Method Endeed");

	}

}
