
package com.constructors;

public class Movie {
	String director;
	String producer;
	String hero;
	String heroine;
	double budget;
	String name;
	double price;

	Movie() {
		System.out.println("No-arg constrtuctor");
	}

	Movie(String director) {
		this.director = director;

	}

	Movie(Movie m, String producer, String hero) {
		this.director = m.director;
		this.producer = producer;
		this.hero = hero;

	}
	Movie(Movie m, String heroine){
		this.director = m.director;
		this.producer = m.producer;
		this.hero = m.hero;
		this.heroine = heroine;
		
	}
	Movie(Movie m, double budget){
		this.director = m.director;
		this.producer = m.producer;
		this.hero = m.hero;
		this.heroine = m.heroine;
		this.budget = budget;
		
	}
	Movie(Movie m, String name, double price){
		this.director = m.director;
		this.producer = m.producer;
		this.hero = m.hero;
		this.heroine = m.heroine;
		this.budget = m.budget;
		this.name = name;
		this.price = price;
		
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started.................");
		Movie m = new Movie("S S RaajaMouli");
		m.show();
		Movie m1 = new Movie(m, "D V V", "Mahesh Babu");
		m1.show();
		Movie m2 = new Movie(m1,"Deepika Padhukone");
		m2.show();
		Movie m3 = new Movie(m2, 5000000000.0);
		m3.show();
		Movie m4 = new Movie(m3, "vaaranasi", 500);
		m4.show();
		System.out.println("Main Method Ended....................");

	}

	void show() {
		System.out.println("**************************************");
		System.out.println("Movie Director Name : " + director);
		System.out.println("Movie Producer Name : " + producer);
		System.out.println("Movie Hero Name : " + hero);
		System.out.println("Movie Heroine Name : " + heroine);
		System.out.println("Movie Budget : " + budget);
		System.out.println("Movie Name : " + name);
		System.out.println("Ticket Price : " + price);
		System.out.println("**************************************");
	}
}

// Rules
// 1. name of the constructor and class name must be same
// By mistake if we give wrong name we will get CE please add return type for the method

// 2. Constructor should not return anything not even void
// By mistake if we give any return type, we will not get any CE or RE but the compiler will consider it as method

// 3. For constructors we can use below 4 access modifiers
/* 1. public
 * 2. private
 * 3. <default>
 * 4. protected
 * other than these 4 we can't we any modifiers static, abstract......like this
 * important : static is loading whenever the class is loaded
 * constructor is loading whenever the object is creating
 * Note : if we use private, we can't create objects outside of the class
 * 
 * 
 * default constructor means object scope is within the package.
 * public constructor means object scope is within the project.
 * protected constructor means object scope is within the package and outside of the sub classes. 
 * 
 * 4. By default java compiler will create a default constructor whenever a class does not contain any other constructors.
 * - The scope of default constructor is class scope.
 * - If the class is public, default constructor scope is also public.
 * - If the class is default, default constructor scope is also default.
 * 
 * 
 * 5. this, super we will use in constructors as well as methods also but this, super can use only in instance context.
 * 
 * 6. this(), super() we can use only in constructors not in methods.
 * 
 * 7. this() or super() must be the first line of any constructor.
 * 
 * 8. this() and super() can't use in a same constructor.
 * 
 * 9. Recursive constructor calling is not allowed.
 * 
 * 10. If the child class extends parent class, if parent class contains only parameterized constructor we will get CE
 * - if we want to extends parent class must contains no-arg constructor
 * 
 * 11. By default child class constructor calls the super() whether we called or not.
 * 
 */

































 