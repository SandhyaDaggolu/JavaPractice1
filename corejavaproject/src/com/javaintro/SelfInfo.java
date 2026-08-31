package com.javaintro;
import java.util.Scanner;

public class SelfInfo {

	public static void main(String[] args) {
		System.out.println("....................Personal Details................");
		Scanner sc = new Scanner(System.in);
		SelfInfo t = new SelfInfo();
		System.out.println("Enter Your Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Gender : ");
		String gender = sc.nextLine();
		System.out.println("Enter Blood Group : ");
		String bloodgroup = sc.nextLine();
		System.out.println("Enter DOB : ");
		String dob = sc.nextLine();
		System.out.println("Enter Your Height : ");
		double height = sc.nextDouble();
		System.out.println("Enter Your weight : ");
		double weight = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Nationality : ");
		String nationality = sc.nextLine();
		System.out.println("Enter Religion : ");
		String religion = sc.nextLine();
		System.out.println("Enter Mother Tongue : ");
		String language = sc.nextLine();
		System.out.println("....................Contact Details.................");
		System.out.println("Enter Phone Number : ");
		long phone = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Your Email : ");
		String email = sc.nextLine();
		System.out.println("Enter City : ");
		String city = sc.nextLine();
		System.out.println("Enter Your District Name : ");
		String district= sc.nextLine();
		System.out.println("Enter State : ");
		String state = sc.nextLine();
		System.out.println("Enter Country : ");
		String country = sc.nextLine();
		System.out.println("....................Family Details..................");
		System.out.println("Enter Father Name : ");
		String fathername = sc.nextLine();
		System.out.println("Enter Mother Name : ");
		String mothername = sc.nextLine();
		System.out.println("Enter Brother Name : ");
		String brothername = sc.nextLine();
		System.out.println("Enter Sister Name : ");
		String sistername = sc.nextLine();
		System.out.println("Enter Guardian Name : ");
		String guardian = sc.nextLine();
		System.out.println("Enter Family Members : ");
		int members = sc.nextInt();
		System.out.println("Enter Contact Number : ");
		long contact = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Father Occupation : ");
		String occupation = sc.nextLine();
		System.out.println("Enter Mother Occupation : ");
		String ocupation = sc.nextLine();
		System.out.println("Enter Family Income : ");
		double income = sc.nextDouble();
		sc.nextLine();
		System.out.println("....................Educational Details..................");
		System.out.println("Enter School Name : ");
		String school = sc.nextLine();
		System.out.println("Enter Inter College Name : ");
		String college = sc.nextLine();
		System.out.println("Enter B.Tech College Name : ");
		String colege = sc.nextLine();
		System.out.println("Enter Branch Name : ");
		String branch = sc.nextLine();
		System.out.println("Enter Roll Number : ");
		String roll = sc.nextLine();
		System.out.println("Enter Your Section : ");
		String section = sc.nextLine();
		System.out.println("Enter Semister : ");
		int semister = sc.nextInt();
		System.out.println("Enter PassedOut Year : ");
		int year = sc.nextInt();
		System.out.println("Enter Your CGPA : ");
		double cgpa = sc.nextDouble();
		System.out.println("Enter Your Percentage : ");
		double percentage = sc.nextDouble();
		System.out.println("....................Skills & Career..................");
		sc.nextLine();
		System.out.println("Enter Your Skills : ");
		String skills = sc.nextLine();
		System.out.println("Enter Coding Language : ");
		String clanguage = sc.nextLine();
		System.out.println("Enter DataBase : ");
		String db = sc.nextLine();
		System.out.println("Enter OS : ");
		String os = sc.nextLine();
		System.out.println("Enter IDE : ");
		String ide = sc.nextLine();
		System.out.println("Enter Your Certificates : ");
		String certificate = sc.nextLine();
		System.out.println("Enter Your Internship : ");
		String internship = sc.nextLine();
		System.out.println("Enter Your Project Name : ");
		String pname = sc.nextLine();
		System.out.println("Enter Your Technology : ");
		String technology = sc.nextLine();
		System.out.println("Enter Your Achievements : ");
		String achievement = sc.nextLine();
		System.out.println("....................Career Goals..................");
		System.out.println("Enter Your goal : ");
		String goal = sc.nextLine();
		System.out.println("Enter Your Company Name : ");
		String company = sc.nextLine();
		System.out.println("Enter Your Salary : ");
		String salary = sc.nextLine();
		System.out.println("Enter Experience : ");
		String experience = sc.nextLine();
		System.out.println("Enter Your Resume Status : ");
		String status = sc.nextLine();
		System.out.println("Enter Your Placement Status : ");
		String pstatus = sc.nextLine();
		System.out.println("Enter Your Interview Date : ");
		String date = sc.nextLine();
		System.out.println("Enter Your Institute Name : ");
		String institute = sc.nextLine();
		System.out.println("Enter Your Course Duration : ");
		String duration = sc.nextLine();
		System.out.println("Enter Location : ");
		String location = sc.nextLine();
	
		t.displayName(name);
		t.displayage(age);
		t.displayGender(gender);
		t.displayBloodGroup(bloodgroup);
		t.displayDateOfBirth(dob);
		t.displayHeight(height);
		t.displayWeight(weight);
		t.displayNationality(nationality);
		t.displayReligion(religion);
		t.displayMotherTongue(language);
		t.displayPhone(phone);
		t.displayEmail(email);
		t.displayCity(city);
		t.displayDistrict(district);
		t.displayState(state);
		t.displayCountry(country);
		t.displalyFatherName(fathername);
		t.displalyMotherName(mothername);
		t.displalyBrotherName(brothername);
		t.displalySisterName(sistername);
		t.displayGuardianName(guardian);
		t.displayFamilyMembers(members);
		t.displayEmergencyContact(contact);
		t.displayFatherOccupation(occupation);
		t.displayMotherOccupation(ocupation);
		t.displayFamilyIncome(income);
		t.diaplaySchool(school);
		t.displayIntermediateCollege(college);
		t.dispalyCollege(colege);
		t.displayBranch(branch);
		t.displayRollNo(roll);
		t.displaySection(section);
		t.displaySemister(semister);
		t.displayYear(year);
		t.displayCGPA(cgpa);
		t.displayPercentage(percentage);
		t.displaySkills(skills);
		t.displayCodingLanguage(clanguage);
		t.displayDatBase(db);
		t.displayOperatingSystem(os);
		t.displayIDE(ide);
		t.displayCertificate(certificate);
		t.displayInternship(internship);
		t.displayProjectName(pname);
		t.displayTechnology(technology);
		t.displayAchievement(achievement);
		t.displayGoal(goal);
		t.displayCompany(company);
		t.displayExpectedSalary(salary);
		t.displayExperience(experience);
		t.displayResumeStatus(status);
		t.displayPlacementStatus(pstatus);
		t.displayInterviewDate(date);
		t.displayTrainingInstitute(institute);
		t.displayTrainingDuration(duration);
		t.displayPreferredLocation(location);
	}
	void displayName(String name) {
		System.out.println("My Name Is : " + name);
	}
	void displayage(int age) {
		System.out.println("My Age Is : " + age);
	}
	void displayGender(String gender) {
		System.out.println("Gender : " + gender);
	}
	void displayBloodGroup(String bloodgroup) {
		System.out.println("Blood Group : " + bloodgroup);
	}
	void displayDateOfBirth(String dob) {
		System.out.println("DOB : " + dob);
	} 
	void displayHeight(double height) {
		System.out.println("Heighth : " + height);
	}
	void displayWeight(double weight) {
		System.out.println("Heighth : " + weight);
	}
	void displayNationality(String nationality) {
		System.out.println("Nationality : " + nationality);
	}
	void displayReligion(String religion) {
		System.out.println("Religion : " + religion);
	}
	void displayMotherTongue(String language) {
		System.out.println("Mother Tongue : " + language);
	}
	
	void displayPhone(long phone) {
		System.out.println("Phone : " + phone);
	}
	void displayEmail(String email) {
		System.out.println("Email : " + email);
	}
	void displayCity(String city) {
		System.out.println("City : " + city);
	}
	void displayDistrict(String district) {
		System.out.println("District : " + district);
	}
	void displayState(String state) {
		System.out.println("State : " + state);
	}
	void displayCountry(String country) {
		System.out.println("Country : " + country);
	}
	void displalyFatherName(String fathername) {
		System.out.println("Father Name : " + fathername);
	}
	void displalyMotherName(String mothername) {
		System.out.println("Father Name : " + mothername);
	}
	void displalyBrotherName(String brothername) {
		System.out.println("Father Name : " + brothername);
	}
	void displalySisterName(String sistername) {
		System.out.println("Father Name : " + sistername);
	}
	void displayGuardianName(String guardian) {
		System.out.println("Guardian Name : " + guardian);
	}
	void displayFamilyMembers(int members) {
		System.out.println("Family Members : " + members);
	}
	void displayEmergencyContact(long contact) {
		System.out.println("Emergency Contact : " + contact);
	}
	void displayFatherOccupation(String occupation) {
		System.out.println("Father Occupation : " + occupation);
	}
	void displayMotherOccupation(String ocupation) {
		System.out.println("Mother Occupation : " + ocupation);
	}
	void displayFamilyIncome(double income) {
		System.out.println("Family Income : " + income);
	}
	void diaplaySchool(String school) {
		System.out.println("School Name : ");
	}
	void displayIntermediateCollege(String college) {
		System.out.println("Inter College Name : " + college);
	}
	void dispalyCollege(String colege) {
		System.out.println("B.Tech College Name : " + colege);
	}
	void displayBranch(String branch) {
		System.out.println("Branch : " + branch);
	}
	void displayRollNo(String roll) {
		System.out.println("Roll Number : " + roll);
	}
	void displaySection(String section) {
		System.out.println("Section : " + section);
	}
	void displaySemister(int semister) {
		System.out.println("Semister : " + semister);
	}
	void displayYear(int year) {
		System.out.println("Year : " + year);
	}
	void displayCGPA(double cgpa) {
		System.out.println("CGPA : " + cgpa);
	}
	void displayPercentage(double percentage) {
		System.out.println("Percentage : " + percentage);
	}
	void displaySkills(String skills) {
		System.out.println("Skills : " + skills);
	}
	void displayCodingLanguage(String clanguage) {
		System.out.println("Coding Language : " + clanguage);
	}
	void displayDatBase(String db) {
		System.out.println("DataBase : " + db);
	}
	void displayOperatingSystem(String os) {
		System.out.println("Operating System : " + os);
	}
	void displayIDE(String ide) {
		System.out.println("IDE : " + ide);
	}
	void displayCertificate(String certificate) {
		System.out.println("Certificate : " + certificate);
	}
	void displayInternship(String internship) {
		System.out.println("Intership : " + internship);
	}
	void displayProjectName(String pname) {
		System.out.println("Project Name : " + pname);
	}
	void displayTechnology(String technology) {
		System.out.println("Technology : " + technology);
	}
	void displayAchievement(String achievement) {
		System.out.println("Achievement : " + achievement);
	}
	void displayGoal(String goal) {
		System.out.println("Goal : " + goal);
	}
	void displayCompany(String company) {
		System.out.println("Company : " + company);
	}
	void displayExpectedSalary(String salary) {
		System.out.println("Salry : " + salary);
	}
	void displayExperience(String experience) {
		System.out.println("Experience : " + experience);
	}
	void displayResumeStatus(String status) {
		System.out.println("Resume Status : " + status);
	}
	void displayPlacementStatus(String pstatus) {
		System.out.println("Placement Status : " + pstatus);
	}
	void displayInterviewDate(String date) {
		System.out.println("Interview Date : " + date);
	}
	void displayTrainingInstitute(String institute) {
		System.out.println("Interview Status : " + institute);
	}
	void displayTrainingDuration(String duration) {
		System.out.println("Training Duration : " + duration);
	}
	void displayPreferredLocation(String location) {
		System.out.println("Preferred Location is : " + location);
	}
		
	}
	

