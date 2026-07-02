package com.task23_06_2026;
// INSTANCE AND STATIC BLOCKS, METHODS
//Today Task 
//Java
//
//1.Write a Java program to demonstrate the use of Instance Variables and Static Variables using a Cricket Player Management System.
//
//Requirements:
//
//1. Create a class named CricketPlayer.
//
//2. Declare a static variable teamName common to all players.
//
//3. Declare instance variables playerName and runs.
//
//4. Create two objects using object references.
//
//5. Assign values to the instance variables through the objects ref. 
//
//6. Display the details of both players.
//
//7. Show that the static variable is shared by all objects, while the instance variables store different values for each object.

public class CricketPlayer {

	static String teamName="Team pro";
	String PName;
	int Pruns;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("WELCOME TO TASK- STATIC AND INSTANCE\n");
		System.out.println("PLAYER 1 DETAILS");
		CricketPlayer c1= new CricketPlayer();
		c1.PName="Piyush";
		c1.Pruns=12;
		System.out.println("TEAM - "+teamName);
		System.out.println("Name of player is "+c1.PName);
		System.out.println("Number of runs is "+c1.Pruns);
		
		System.out.println("\nPLAYER 2 DETAILS");
		CricketPlayer c2= new CricketPlayer();
		c2.PName="Akash";
		c2.Pruns=44;
		System.out.println("TEAM - "+teamName);
		System.out.println("Name of player is "+c2.PName);
		System.out.println("Number of runs is "+c2.Pruns);
	}

}
