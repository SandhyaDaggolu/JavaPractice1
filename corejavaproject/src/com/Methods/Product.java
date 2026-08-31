package com.Methods;

public class Product {
	String productname;
	double price;
	int quantity;
	
	Product(){
		this("Laptop");
	}
	Product(String productname){
		this(productname, 550000);
		
	}
	Product(String productname, double price){
		this(productname, price, 2);
	}
	Product(String productname, double price, int quantity){
		this.productname = productname;
		this.price = price;
		this.quantity = quantity;
		double totalcost = price * quantity;
		System.out.println("Product Name : " + productname);
		System.out.println("Price : " + price);
		System.out.println("Quantity : " + quantity);
		System.out.println("Total Cost : " + totalcost);
	}

	public static void main(String[] args) {
		Product t = new Product();
	}

}
