package com.javalanguagefundamentals;

public class Circle {

    double calculateArea() {

        double radius = 7;
        double area = 3.14 * radius * radius;

        return area;
    }

    public static void main(String[] args) {

        Circle c = new Circle();

        double result = c.calculateArea();

        System.out.println("Area of Circle = " + result);
    }
}