package com.javaIntroduction;

public class Friend {

//	Declaration
//	Instance variables or non static
//	Heap area when an object is created
	String frndName;
	int age;

//	static variable
//	Method Area when the class is loaded
	static String collegeName = "NECG";
	static String city = "GUDUR";

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("***********Object-1 Info*************");
//		Object creation
		Friend sandy = new Friend();
		sandy.frndName = "Sandhya Subramanyam";
		sandy.age = 22;
		System.out.println("Friend Name : " + sandy.frndName);
		System.out.println("Friend Age : " + sandy.age);
		System.out.println("College Name : " + collegeName);
		System.out.println("City Name : " + city);

		System.out.println("***********Object-2 Info*************");
		Friend ammu = new Friend();
//		whenever we create a new object for that object we create a new space with default data 
		ammu.frndName = "Amrutha Sai";
		ammu.age = 12;
		System.out.println("Friend Name : " + ammu.frndName);
		System.out.println("Friend Age : " + ammu.age);
		System.out.println("College Name : " + collegeName);
		System.out.println("City Name : " + city);

		System.out.println("***********Object-3 Info*************");
		Friend mokshi = new Friend();
//		whenever we create a new object for that object we create a new space with default data 
		mokshi.frndName = "Mokshitha Pavani";
		mokshi.age = 11;
		System.out.println("Friend Name : " + mokshi.frndName);
		System.out.println("Friend Age : " + mokshi.age);
		System.out.println("College Name : " + collegeName);
		System.out.println("City Name : " + city);
		System.out.println("main method ended");

		System.out.println("***********Object-4 Info*************");
		Friend hyndhavi = new Friend();
//		whenever we create a new object for that object we create a new space with default data 
		hyndhavi.frndName = "hyndhavi Sri";
		hyndhavi.age = 1;
//		For static data we can re-assign the data.
		collegeName = "Nursery";
		city = "Nellore";
		System.out.println("Friend Name : " + hyndhavi.frndName);
		System.out.println("Friend Age : " + hyndhavi.age);
		System.out.println("College Name : " + collegeName);
		System.out.println("City Name : " + city);

		System.out.println("***********Object-5 Info*************");
		Friend anu = new Friend();
		anu.frndName = "Anuradha";
		anu.age = 42;
		System.out.println("Friend Name : " + anu.frndName);
		System.out.println("Friend Age : " + anu.age);
		System.out.println("College Name : " + collegeName);
		System.out.println("City Name : " + city);

	}

}
