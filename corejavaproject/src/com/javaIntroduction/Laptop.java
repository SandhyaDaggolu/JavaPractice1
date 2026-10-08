package com.javaIntroduction;

public class Laptop {
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	public static void main(String[] args) {
		Laptop dell = new Laptop();
//		Address of an obj--->com.javaIntroduction.Laptop@27716f4
		System.out.println(dell);

//		com.javaIntroduction.Laptop@8efb846
		Laptop len = new Laptop();
		System.out.println(len);

//		com.javaIntroduction.Laptop@2a84aee7
		Laptop as = new Laptop();
		System.out.println(as);

		dell = null;
		len = null;

		System.out.println(dell);
		System.out.println(len);
		System.out.println(as);

	}

}
