package com.constructors;

// Why...?
// To reduce the data initialization in every constructor and to provide the code reusability 
public class CostructorChaining {
	String model;
	String brand;
	double price;
	int year;
	String color;
	
	CostructorChaining(){
		// By using this() we can call the one arg constructor in a no arg constructor
		this("Classic");
		
	}
	
	CostructorChaining(String model){
		this(model, "RE");
		
	}
	
	CostructorChaining(String model, String brand){
		this(model, brand, 5000000);
		
	}
	
	CostructorChaining(String model, String brand, double price){
		this(model, brand, price, 2026);
		
	}
	
	CostructorChaining(String model, String brand, double price, int year){
		this(model, brand, price, year, "Red");
		
	}
	
	
	CostructorChaining(String model, String brand, double price, int year, String color){
		
		// for this data we cannot get the values why bcz we are taking the variables name as same name as local variables name
		// so we have to ways to get the data like......
		// 1. If you want data then you need to give local variables name is different from the variable name 
		// but here we get some data conflicts like for which variables we give which data like this for ex: model = m;
		// then you get a confusion to know m is related to which data like this....
		// 2. To avoid data conflicts and to invoke the current obj data members we can use this keyword
		/*model=model;
		brand=brand;
		price=price;
		year=year;
		color=color;*/
		
		this.model=model;
		this.brand=brand;
		this.price=price;
		this.year=year;
		this.color=color;
		
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started.............");
		CostructorChaining t = new CostructorChaining();
		t.result();
		System.out.println("Main Method Ended.............");
		System.out.println("...........................................");
	

	}
	void result() {
		System.out.println("Model : " + model);
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
		System.out.println("Year : " + year);
		System.out.println("Color : " + color);
		
	}
	
	
	
	

}
