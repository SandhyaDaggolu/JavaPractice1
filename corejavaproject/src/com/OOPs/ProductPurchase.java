package com.OOPs;

class Product {
	int id;
	String productname;
	double price;

	void displayProductDetails() {
		System.out.println("Product id : " + id);
		System.out.println("Product Name : " + productname);
		System.out.println("Product Price : " + price);

	}

	void calculateDiscount() {
		System.out.println("No Discount");

	}
}

class Electronics extends Product {
	String brand;

	void calculateDiscount() {
		double discount = price * 10 / 100;
		double finalprice = price - discount;
		System.out.println("Discount : " + discount);
		System.out.println("Final Price : " + finalprice);
	}

}

class Clothing extends Product {
	String size;

	void calculateDiscount() {
		double discount = price * 20 / 100;
		double finalprice = price - discount;
		System.out.println("Discount : " + discount);
		System.out.println("Final Price : " + finalprice);
	}
}

class Furniture extends Product {
	String material;

	void calculateDiscount() {
		double discount = price * 30 / 100;
		double finalprice = price - discount;
		System.out.println("Discount : " + discount);
		System.out.println("Final Price : " + finalprice);
	}
}

public class ProductPurchase {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("******************************************************");
		Electronics e = new Electronics();
		e.id = 101;
		e.productname = "Laptop";
		e.price = 500000.0;
		e.displayProductDetails();
		e.calculateDiscount();
		System.out.println("******************************************************");
		Clothing c = new Clothing();
		c.id = 102;
		c.productname = "Shirt";
		c.price = 2000;
		c.size = "M";
		c.displayProductDetails();
		System.out.println("Size : " + c.size);
		c.calculateDiscount();
		System.out.println("******************************************************");
		Furniture f = new Furniture();
		f.id = 103;
		f.productname = "Table";
		f.price = 5000;
		f.material = "Wood";
		f.displayProductDetails();
		f.calculateDiscount();
		System.out.println("Material : " + f.material);
		System.out.println("******************************************************");
		System.out.println("main method ended");

	}

}
