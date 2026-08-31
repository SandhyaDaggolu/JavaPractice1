package com.javaintro;

public class Rectangle {
	void calculateArea() {
		int length = 10;
		int breadth = 20;
		int area = length * breadth;
		int perimeter = 2 * length * breadth;
		System.out.println("Length of the Rectangle : " + length);
		System.out.println("Breadth of the Rectangle : " + breadth);
		System.out.println("area : " + area);
		System.out.println("perimeter : " + perimeter);
		
	}
	
	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		obj.calculateArea();
		
		
		
		

	}

}
