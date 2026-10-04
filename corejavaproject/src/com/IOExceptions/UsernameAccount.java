package com.IOExceptions;

import java.util.Scanner;

public class UsernameAccount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String usernamealreadyexists="Sandhya";
		System.out.println("Enter User name : ");
		String username=sc.nextLine();
		try {
			if(username.equals(usernamealreadyexists)) {
				throw new DuplicateUsernameException("User name already exists!!!...");	
			}
			else {
				System.out.println("Create the account successfull...");
			}
		}
		catch(DuplicateUsernameException e) {
			System.out.println(e.getMessage());
			
		}

	}

}
