package com.javaIntroduction;

public class Cricketer {
//	Declaration
//	Instance variable or non static 
//	Heap Area when object is created
	int jersyno;
	String cricketerName;

//	Static variable Initialization
//	Method Area when class loaded
	static int countryId = 91;
	static String countryName = "India";

	public static void main(String[] args) {
		System.out.println("Welcome to Cricket");

		System.out.println("*********Object-1 Info***************");
		Cricketer msd = new Cricketer();// Object creation
		msd.jersyno = 7;
		msd.cricketerName = "MS Dhoni";
//		Accessing the static data directly
		System.out.println(countryId);
		System.out.println(countryName);
		System.out.println(msd.jersyno);
		System.out.println(msd.cricketerName);

		System.out.println("*********Object-2 Info***************");
		Cricketer virat = new Cricketer();
//		 Object creation===>for every object we create a new copy with default data
//		Accessing the static data directly
		virat.jersyno = 18;
		virat.cricketerName = "Virat Kohli";

		System.out.println(countryId);
		System.out.println(countryName);
		System.out.println(virat.jersyno);
		System.out.println(virat.cricketerName);

		System.out.println("*********Object-3 Info***************");
		Cricketer rohith = new Cricketer();
//		 Object creation===>for every object we create a new copy with default data
		rohith.jersyno = 45;
		rohith.cricketerName = "Rohith Sharma";

		System.out.println(countryId);
		System.out.println(countryName);
		System.out.println(rohith.jersyno);
		System.out.println(rohith.cricketerName);

		System.out.println("*********Object-4 Info***************");
		Cricketer sri = new Cricketer();
//		 Object creation===>for every object we create a new copy with default data
		countryId = 92;
		countryName = "ABC";
		sri.jersyno = 65;
		sri.cricketerName = "Srikanth";

		System.out.println(countryId);
		System.out.println(countryName);
		System.out.println(sri.jersyno);
		System.out.println(sri.cricketerName);

	}

}
