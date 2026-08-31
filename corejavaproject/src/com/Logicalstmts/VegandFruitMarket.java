package com.Logicalstmts;

import java.util.Scanner;

public class VegandFruitMarket {
	static String bill = "";
	static double grandTotal = 0;
	static char choice;
	double totalprice = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("********************************************************");
		System.out.println("        WELCOME TO VEGETABLES & FRUITS MARKET");
		System.out.println("********************************************************");
		System.out.println("1. Vegetables");
		System.out.println("2. Fruits");
		System.out.println("3. Exit");
		System.out.print("Enter Your Choice : ");
		int menu = sc.nextInt();
		sc.nextLine();

		if (menu == 1) {
			do {

				System.out.println("\n*********** VEGETABLES MENU ***********");
				System.out.println("1.  Potato (ptp) - ₹30/Kg");
				System.out.println("2.  Tomato (tmt) - ₹40/Kg");
				System.out.println("3.  Onion (on) - ₹35/Kg");
				System.out.println("4.  Carrot (cart) - ₹60/Kg");
				System.out.println("5.  Brinjal (brnj) - ₹50/Kg");
				System.out.println("6.  Cabbage (cab) - ₹45/Piece");
				System.out.println("7.  Cauliflower (cf) - ₹55/Piece");
				System.out.println("8.  Spinach (spin) - ₹20/Bundle");
				System.out.println("9.  Lady's Finger (Okra) - ₹70/Kg");
				System.out.println("10. Cucumber (cu) - ₹35/Kg");
				System.out.println("***************************************");

				System.out.println("You can select your vegetable by:");
				System.out.println("1. Item Number");
				System.out.println("2. Item Name");
				System.out.println("3. Shortcut Key");

				System.out.print("\nEnter Vegetable Number/Name/Shortcut : ");
				String veg = sc.nextLine().toLowerCase();

				switch (veg) {

				case "1":
				case "potato":
				case "ptp":

					System.out.println("\nYou Selected : Potato");
					System.out.print("Enter Quantity (Kg): ");
					int quantity = sc.nextInt();
					System.out.println("Quantity : " + quantity + " Kg");
					double price = 30;
					double totalprice = quantity * price;
					grandTotal += totalprice;
					break;

				case "2":
				case "tomato":
				case "tmt":

					System.out.println("\nYou Selected : Tomato");
					System.out.print("Enter Quantity (Kg): ");
					quantity = sc.nextInt();
					System.out.println("Quantity : " + quantity + " Kg");
					price = 40;
					totalprice = quantity * price;
					grandTotal += totalprice;
					break;

				case "3":
				case "onion":
				case "on":

					System.out.println("\nYou Selected : Onion");
					System.out.print("Enter Quantity (Kg): ");
					quantity = sc.nextInt();
					System.out.println("Quantity : " + quantity + " Kg");
					price = 35;
					totalprice = quantity * price;
					grandTotal += totalprice;
					break;

				case "4":
				case "carrot":
				case "cart":

					System.out.println("\nYou Selected : Carrot");
					System.out.print("Enter Quantity (Kg): ");
					quantity = sc.nextInt();
					System.out.println("Quantity : " + quantity + " Kg");
					price = 60;
					totalprice = quantity * price;
					grandTotal += totalprice;
					break;

				case "5":
				case "brinjal":
				case "brnj":

					System.out.println("\nYou Selected : Brinjal");
					System.out.print("Enter Quantity (Kg): ");
					quantity = sc.nextInt();
					System.out.println("Quantity : " + quantity + " Kg");
					price = 50;
					totalprice = quantity * price;
					grandTotal += totalprice;
					break;

				case "6":
				case "cabbage":
				case "cab":

					System.out.println("\nYou Selected : Cabbage");
					System.out.print("Enter Quantity (Piece): ");
					quantity = sc.nextInt();
					System.out.println("Quantity : " + quantity + " Piece");
					price = 45;
					totalprice = quantity * price;
					grandTotal += totalprice;
					break;

				case "7":
				case "cauliflower":
				case "cf":

					System.out.println("\nYou Selected : Cauliflower");
					System.out.print("Enter Quantity (Piece): ");
					quantity = sc.nextInt();
					System.out.println("Quantity : " + quantity + " Piece");
					price = 55;
					totalprice = quantity * price;
					grandTotal += totalprice;
					break;

				case "8":
				case "spinach":
				case "spin":

					System.out.println("\nYou Selected : Spinach");
					System.out.print("Enter Quantity (Bundle): ");
					quantity = sc.nextInt();
					System.out.println("Quantity : " + quantity + " Bundle");
					price = 20;
					totalprice = quantity * price;
					grandTotal += totalprice;
					break;

				case "9":
				case "lady's finger":
				case "okra":

					System.out.println("\nYou Selected : Lady's Finger (Okra)");
					System.out.print("Enter Quantity (Kg): ");
					quantity = sc.nextInt();
					System.out.println("Quantity : " + quantity + " Kg");
					price = 70;
					totalprice = quantity * price;
					grandTotal += totalprice;
					break;

				case "10":
				case "cucumber":
				case "cu":

					System.out.println("\nYou Selected : Cucumber");
					System.out.print("Enter Quantity (Kg): ");
					quantity = sc.nextInt();
					System.out.println("Quantity : " + quantity + " Kg");
					price = 35;
					totalprice = quantity * price;
					grandTotal += totalprice;
					break;

				default:
					System.out.println("Invalid Vegetable Selection!");
				}

				System.out.print("\nDo you want to buy another item? (Y/N): ");
				choice = sc.next().charAt(0);
				sc.nextLine();
			} while (choice == 'Y' || choice == 'y');
			
		} else if (menu == 2) {
			
			do {
				System.out.println("\n*********** FRUITS MENU ***********");
				System.out.println("1. Apple (app) - ₹180/Kg");
				System.out.println("2. Banana (ban) - ₹60/Dozen");
				System.out.println("3. Mango (man) - ₹120/Kg");
				System.out.println("4. Orange (org) - ₹90/Kg");
				System.out.println("5. Grapes (grp) - ₹100/Kg");
				System.out.println("6. Watermelon (wat) - ₹40/Piece");
				System.out.println("7. Pineapple (pin) - ₹80/Piece");
				System.out.println("8. Papaya (pap) - ₹50/Piece");
				System.out.println("9. Guava (gua) - ₹70/Kg");
				System.out.println("10. Pomegranate (pom) - ₹150/Kg");
				System.out.println("***********************************");

				System.out.print("Enter Fruit Number/Name/Shortcut : ");
				String fruit = sc.nextLine().toLowerCase();

				switch (fruit) {

				case "1":
				case "apple":
				case "app":

					System.out.println("\nYou Selected : Apple");
					System.out.print("Enter Quantity (Kg): ");
					int quantity = sc.nextInt();
					double price = 180;
					double totalprice = quantity * price;
					grandTotal += totalprice;
					break;

				case "2":
				case "banana":
				case "ban":

					System.out.println("\nYou Selected : Banana");
					System.out.print("Enter Quantity (Dozen): ");
					quantity = sc.nextInt();
					price = 60;
					totalprice = quantity * price;
					grandTotal += totalprice;
					break;

				case "3":
				case "mango":
				case "man":

					System.out.println("\nYou Selected : Mango");
					System.out.print("Enter Quantity (Kg): ");
					quantity = sc.nextInt();
					price = 120;
					totalprice = quantity * price;
					grandTotal += totalprice;
					break;

				case "4":
				case "orange":
				case "org":

					System.out.println("\nYou Selected : Orange");
					System.out.print("Enter Quantity (Kg): ");
					quantity = sc.nextInt();
					price = 90;
					totalprice = quantity * price;
					grandTotal += totalprice;
					break;

				case "5":
				case "grapes":
				case "grp":

					System.out.println("\nYou Selected : Grapes");
					System.out.print("Enter Quantity (Kg): ");
					quantity = sc.nextInt();
					price = 100;
					totalprice = quantity * price;
					grandTotal += totalprice;
					break;

				case "6":
				case "watermelon":
				case "wat":

					System.out.println("\nYou Selected : Watermelon");
					System.out.print("Enter Quantity (Piece): ");
					quantity = sc.nextInt();
					price = 40;
					totalprice = quantity * price;
					grandTotal += totalprice;
					break;

				case "7":
				case "pineapple":
				case "pin":

					System.out.println("\nYou Selected : Pineapple");
					System.out.print("Enter Quantity (Piece): ");
					quantity = sc.nextInt();
					price = 80;
					totalprice = quantity * price;
					grandTotal += totalprice;
					break;

				case "8":
				case "papaya":
				case "pap":

					System.out.println("\nYou Selected : Papaya");
					System.out.print("Enter Quantity (Piece): ");
					quantity = sc.nextInt();
					price = 50;
					totalprice = quantity * price;
					grandTotal += totalprice;
					break;

				case "9":
				case "guava":
				case "gua":

					System.out.println("\nYou Selected : Guava");
					System.out.print("Enter Quantity (Kg): ");
					quantity = sc.nextInt();
					price = 70;
					totalprice = quantity * price;
					grandTotal += totalprice;
					break;

				case "10":
				case "pomegranate":
				case "pom":

					System.out.println("\nYou Selected : Pomegranate");
					System.out.print("Enter Quantity (Kg): ");
					quantity = sc.nextInt();
					price = 150;
					totalprice = quantity * price;
					grandTotal += totalprice;
					break;

				default:
					System.out.println("Invalid Fruit Selection!");
				}
				System.out.print("\nDo you want to buy another item? (Y/N): ");
				choice = sc.next().charAt(0);
				sc.nextLine();
			} while (choice == 'Y');
		}
		else {
			System.out.println("Exit");
		}
		System.out.println("**********************************");
		System.out.println("          FINAL BILL");
		System.out.println("**********************************");
		System.out.println("----------------------------------------");
		System.out.println("Grand Total : ₹" + grandTotal);
		System.out.println("----------------------------------------");
		System.out.println("Thank You For Shopping!");
		System.out.println("Visit Again");

	}

}
