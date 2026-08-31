package com.javalanguagefundamentals;

public class Product {
	int productid = 101;
	String productname = "Mobile";
	double price = 50000;

	Product(){
		
	}
	
	Product(int productid, String productname, double price ) {
		this.productid = productid;
		this.productname = productname;
		this.price = price;
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method Started.......");
		Product s1 = new Product();
		System.out.println("Product Id : " + s1.productid);
		Product s2 = new Product();
		System.out.println("Product Name : " + s2.productname);
		Product s3 = new Product();
		System.out.println("Product Price : " + s3.price);
		System.out.println("Main Method Ended.......");
		
	}
}