package com.javaintro;

public class CricketPlayer {
static String teamName = "India";
	
	String playerName;
	int runs;

	public static void main(String[] args) {
		CricketPlayer player1 = new CricketPlayer();
		player1.playerName = "MSD";
		player1.runs = 50;
		player1.teamName = "South Africa";
		System.out.println(".......Player1 Details.......");
		System.out.println("Team Name : " + player1.teamName);
		System.out.println("player1 Name : " + player1.playerName);
		System.out.println("player1 runs : " + player1.runs);
		
		
		CricketPlayer player2 = new CricketPlayer();
		player2.playerName = "Virat";
		player2.runs = 100;
		System.out.println(".......Player2 Details.......");
		System.out.println("Team Name : " + teamName);
		System.out.println("player2 Name : " + player2.playerName);
		System.out.println("player2 runs : " + player2.runs);
		
		CricketPlayer player3 = new CricketPlayer();
		player3.playerName = "Rahul";
		player3.runs = 120;
		System.out.println(".......Player3 Details.......");
		System.out.println("Team Name : " + teamName);
		System.out.println("player3 Name : " + player3.playerName);
		System.out.println("player3 runs : " + player3.runs);
		

	}

}
