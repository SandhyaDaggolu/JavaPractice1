package com.javaIntroduction;

public class Hello {

	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("main methd strated");
		//Bootsrap class loaders
		Class.forName("java.lang.System");
		Class.forName("java.lang.String");
		
		//Application class loader
		Class.forName("com.mysql.cj.jdbc.Driver");
		Class.forName("com.javaIntroduction.Employee");
		System.out.println("main methd ended");

	}

}
