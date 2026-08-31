package com.constructors;

import java.util.Scanner;

public class ConstructorsPractice {
	int id;
	String name;
	int age;
	
	ConstructorsPractice(){
		System.out.println("No-arg Constructor Called");
	}
	
	ConstructorsPractice(int id, String name, int age){
		System.out.println("parameterized Constructor Called");
		//For this data we can't get values why bcz the variable name id is same as local variables
		//So We need to do this with the "this" class 
		/*id = id;
		name = name;
		age = age;*/	
		this.id = id;
		this.name = name;
		this.age = age;
		
	}

	public static void main(String[] args) {
		// For Scanner We cannot create any object why bcz we do not have no-arg constructor
		//Scanner sc = new Scanner();
		System.out.println("Main Method Started...............");
		Scanner sc = new Scanner(System.in);
		ConstructorsPractice t = new ConstructorsPractice();
		t.show();
		/*System.out.println(t.id);//0
		System.out.println(t.name);//null
		System.out.println(t.age);//0*/
		
		
		ConstructorsPractice t1 = new ConstructorsPractice();
		t1.id = 101;
		t1.name = "Sandhya Subramanyam";
		t1.age = 22;
		t1.show();
		
		/*System.out.println(t1.id);//101
		System.out.println(t1.name);//Sandhya Subramanyam
		System.out.println(t1.age);//22*/
		
		ConstructorsPractice t2 = new ConstructorsPractice();
		t2.show();
		/*System.out.println(t2.id);//0
		System.out.println(t2.name);//null
		System.out.println(t2.age);//0*/
		
		ConstructorsPractice t3 = new ConstructorsPractice();
		
		System.out.println("Main Method Ended...............");
	}
	//Here we go Why we are using methods is for no duplicates and code reuse for the same functionality
	void show() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}

}
