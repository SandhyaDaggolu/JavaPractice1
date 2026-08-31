package com.javaintro;

public class Employee1 {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage Collector Called");
	}

	public static void main(String[] args) {
			Employee1 emp = new Employee1();
			System.out.println(emp);
			emp=null;
			System.out.println("Object is eligible for Garbage Collection");
			System.gc();
			
			
			Employee1 emp1 = new Employee1();
			System.out.println(emp1);
			emp1=null;
			System.out.println("Object is eligible for Garbage Collection");
			System.gc();
		

	}

}
