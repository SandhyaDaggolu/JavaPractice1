package com.javaintro;

public class MyInfo {

	public static void main(String[] args) {
		System.out.println("Method Method Started");
		System.out.println(".............Personal Information.........");
		MyInfo t = new MyInfo();
		t.MyName("Sandhya Subramanyam");
		t.MyAge(22);
		t.MyGender("Female");
		t.MyCity("Nellore");
		t.CollegeName("Narayana Engineering College");
		t.Branch("CSE");
		t.Year(2026);
		t.Cgpa(9.4f);
		t.Email("sandhyadaggolu1@gmail.com");
		t.PhoneNumber(8712412141L);
		t.Address("Gudur");
		t.Name("Sandhya Subramanyam");
		t.MyEducation("B.Tech CSE");
		t.MySkills("Java, SQL, HTML, CSS");
		t.MyGoal("Software Developer");
		t.FatherName("Subramanyam Daggolu");
		t.MotherName("Anuradha Daggolu");
		t.BrotherName("Jagadeesh Daggolu");
		t.Languages("Telugu, English, Hindi");
		t.ProjectName("Cloud Computing");
		t.Technology("Java, MySQL");
		t.Role("Developer");
		System.out.println("Method Method Ended");

	}
	void MyName(String name) {
		System.out.println("My Name Is : " + name);
	}
	void MyAge(int age) {
		System.out.println("My Age : " + age);
	}
	void MyGender(String gender) {
		System.out.println("Gender : " + gender);
	}
	void MyCity(String city) {
		System.out.println("City : " + city);
		System.out.println(".........Educational Information...........");
	}
	void CollegeName(String cname) {
		System.out.println("College Name : " + cname);
	}
	void Branch(String branch) {
		System.out.println("Branch : " + branch);
	}
	void Year(int year) {
		System.out.println("Year of PassedOut : " + year);
	}
	void Cgpa(float cgpa) {
		System.out.println("CGPA : " + cgpa);
		System.out.println("..........Contact Information............");
	}
	void Email(String email) {
		System.out.println("Email Address : " + email);
	}
	void PhoneNumber(long number) {
		System.out.println("Phone Number : " + number);
	}
	void Address(String address) {
		System.out.println("Address : " + address);
		System.out.println(".............My Profile....................");
	}
	void Name(String name) {
		System.out.println("My Name : " + name);
	}
	void MyEducation(String education) {
		System.out.println("Education : " + education);
	}
	void MySkills(String skills) {
		System.out.println("Skills : " + skills);
	}
	void MyGoal(String goal) {
		System.out.println("Goal : " + goal);
		System.out.println("..............Family Information...............");
	}
	void FatherName(String fname) {
		System.out.println("Father Name : " + fname);
	}
	void MotherName(String mname) {
		System.out.println("Mother Name : " + mname);
	}
	void BrotherName(String bname) {
		System.out.println("Brother Name : " + bname);
		System.out.println(".................Language Details...............");
	}
	void Languages(String languages) {
		System.out.println("Languages Known : " + languages);
		System.out.println("...............Project Details..............");
	}
	void ProjectName(String pname) {
		System.out.println("Project Name : " + pname);
	}
	void Technology(String technology) {
		System.out.println("Technology : " + technology);
	}
	void Role(String role) {
		System.out.println("Role : " + role);
	}

}


/*myName()
myEducation()
mySkills()
myGoal()*/
	
 