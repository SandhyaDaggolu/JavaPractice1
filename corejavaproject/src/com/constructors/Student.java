package com.constructors;

public class Student {
	String name;
	int rollNo;
	double marks;

	Student() {
		this("Unknown");
	}

	Student(String name) {
		this(name, 0);

	}

	Student(String name, int rollNo) {
		this(name, rollNo, 0.0);

	}

	Student(String name, int rollNo, double marks) {
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;

	}

	void result() {
		System.out.println("Name of a student : " + name);
		System.out.println("Roll Number of a student : " + rollNo);
		System.out.println("Marks of a student : " + marks);
		System.out.println("***********************************");

	}

	public static void main(String[] args) {
		System.out.println("Main Method Started.............");
		System.out.println("***********************************");
		Student t = new Student();
		t.result();
		Student t1 = new Student("Sandhya Subramanyam");
		t1.result();
		Student t2 = new Student("Sandhya Subramanyam", 578);
		t2.result();
		Student t3 = new Student("Sandhya Subramanyam", 578, 5000000.0);
		t3.result();
		System.out.println("Main Method Ended...............");
	}

}
