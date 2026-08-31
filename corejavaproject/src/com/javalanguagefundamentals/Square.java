package com.javalanguagefundamentals;

public class Square {
	int FindSquare() {
		int s = 3;
		int Square = s * s;
		return Square;
		
	}

	public static void main(String[] args) {
		
		Square t = new Square();
		int sr = t.FindSquare();
		System.out.println("Square : " + sr);

	}

}
