package com.javaIntroduction;

public class Employee {

	int eid;
	String name;

	static int orgId;
	static String orgName;

	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.eid);
		System.out.println(e.name);
		System.out.println(orgId);
		System.out.println(orgName);
	}

}
