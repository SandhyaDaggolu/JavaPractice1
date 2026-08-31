package com.OOPs;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Encapsulated e1 = new Encapsulated();
		e1.setId(78);
		e1.setName("Sandhya Subramanyam");
		e1.setSalary(75000);
		e1.setPassword("Sandhya@143");
		System.out.println(e1.getId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		System.out.println(e1.getPassword());
	}
}
