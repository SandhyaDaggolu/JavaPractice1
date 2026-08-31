package com.javalanguagefundamentals;
import java.util.Scanner;
public class Shopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shopping t = new Shopping();
		System.out.println("Enter Product Name : ");
		String productName = sc.nextLine();
		System.out.println("Enter Product Price : ");
		double price = sc.nextDouble();
		System.out.println("Enter Product quantity : ");
		int quantity = sc.nextInt();
		t.displayProduct(productName);
		t.calculatePrice(price, quantity);

	}
	void displayProduct(String productName) {
		System.out.println("Product Name : " + productName);
	}
	void calculatePrice(double price, int quantity) {
		System.out.println("Price : " + price);
		System.out.println("Quantity : " + quantity);
	}

}
