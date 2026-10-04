package com.javaIntroduction;

public class Student {
//	 Declaration 	
//	 instance variables or non static 
	int sid;
	String sname;
	
//	 static variables
	static int collegeId;
	static String collegeName;

	public static void main(String[] args) {
		System.out.println("main methos started");
		System.out.println("Student Information from Vcube.......");
//		Accessing the static data 
		System.out.println(collegeId);// zero or default or garbage value provided by the jvm 
		System.out.println(collegeName);// null
		
		
//		Accessing the instance data
//		we cannot access instance data in static area directly.
//		if you want to access instance data in static area, we must need to create object
//		CE : Cannot make a static reference to the non-static field sname
//		System.out.println(sid);
//		System.out.println(sname);
		
//		Object creation
//		LHS : student is a class name and s is a object reference variable.
//		= is assignment operator
//		RHS : new is a keyword to create object in java
//		Student() is a constructor calling
//		constructor :  
		Student s = new Student();
//		
		System.out.println(s.sid);
		System.out.println(s.sname);
		System.out.println("main method ended");

	}

}
