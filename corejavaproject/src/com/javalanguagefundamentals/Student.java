package com.javalanguagefundamentals;

public class Student {
	int id;
	String name;
	String course;
	
	Student(){
		System.out.println("Constructor Calling...");
		
	}
	Student(int id){
		this();
		
	}
	
	Student(int id, String name){
		this(id);
		this.id = id;
		this.name = name;
		
		
	}
	Student(int id, String name, String course){
		this(id,name);
		this.name = name;
		this.course = course;
		System.out.println("Student id : " + id);
		System.out.println("Student name : " + name);
		System.out.println("Course name : " + course);
		System.out.println("...............................................");
		
	}
	
	
	public static void main(String[] args) {
		Student t = new Student(101,"Sandhya","CSE");
	}

}
