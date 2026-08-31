package com.javalanguagefundamentals;

public class RectangleCalculator {

	public static void main(String[] args) {
		RectangleCalculator t = new RectangleCalculator();
		t.area(10,20);
		t.perimeter(20,30);
	
	}
	int area(int length, int breadth) {
		System.out.println("Area of Rectangle : " + (length*breadth));
		return length*breadth;
	}
	int perimeter(int length, int breadth) {
		System.out.println("Perimeter of Rectangle : " + 2*(length+breadth));
		return 2*(length+breadth);
	}

}
