package com.constructors.task_22_07_2026;

import java.util.Scanner;

/*
 * Java Assignment – Argument Constructor
1.Cricket Player Statistics
Create a class CricketPlayer with the following data members:
Player Name
Matches Played
Total Runs
Initialize all the values using an argument (parameterized) constructor.
Create a method to calculate and display the average runs per match using the formula:
Average Runs = Total Runs / Matches Played
Read the values using the Scanner class, create an object by passing the values to the constructor, and display all the player details along with the average runs.

Sample Input:
Enter Player Name: Virat Kohli
Enter Matches Played: 100
Enter Total Runs: 5000

Expected Output:
Player Name      : Virat Kohli
Matches Played   : 100
Total Runs       : 5000
Average Runs     : 50.0
 */

public class CricketPlayer {
	
	String PlayerName;
	int MatchesPlayed;
	int	TotalRuns;

	CricketPlayer(String n,int m, int r){
		this.PlayerName=n;
		this.MatchesPlayed=m;
		this.TotalRuns=r;
	}
	
	void display() {
		double AverageRuns = TotalRuns / MatchesPlayed;
		System.out.println("Player Name      : "+PlayerName);
		System.out.println("Matches Played   : "+MatchesPlayed);
		System.out.println("Total Runs       : "+TotalRuns);
		System.out.println("Average Runs     : "+AverageRuns);
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter player name");
		String name=sc.nextLine();
		System.out.println("enter matches played");
		int matches=sc.nextInt();
		System.out.println("enter total runs");
		int runs=sc.nextInt();
		
		CricketPlayer c=new CricketPlayer(name,matches,runs);
		c.display();
		
		
	}

}

/**

package com.constructors.task_22_07_2026;

import java.util.Scanner;

/*
 * Java Assignment – Argument Constructor
1.Cricket Player Statistics
Create a class CricketPlayer with the following data members:
Player Name
Matches Played
Total Runs
Initialize all the values using an argument (parameterized) constructor.
Create a method to calculate and display the average runs per match using the formula:
Average Runs = Total Runs / Matches Played
Read the values using the Scanner class, create an object by passing the values to the constructor, and display all the player details along with the average runs.

Sample Input:
Enter Player Name: Virat Kohli
Enter Matches Played: 100
Enter Total Runs: 5000

Expected Output:
Player Name      : Virat Kohli
Matches Played   : 100
Total Runs       : 5000
Average Runs     : 50.0
 */

/*
public class CricketPlayer {
	
	String PlayerName;
	int MatchesPlayed;
	int	TotalRuns;
	double avg;
	
	CricketPlayer(String n,int m, int r){
		this.PlayerName=n;
		this.MatchesPlayed=m;
		this.TotalRuns=r;
	 this. avg = TotalRuns / MatchesPlayed;
	}
	
	void display() {
		
		System.out.println("Player Name      : "+PlayerName);
		System.out.println("Matches Played   : "+MatchesPlayed);
		System.out.println("Total Runs       : "+TotalRuns);
		System.out.println("Average Runs     : "+avg);
		double av=TotalRuns/MatchesPlayed;
		System.out.println(av);
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter player name");
		String name=sc.nextLine();
		System.out.println("enter matches played");
		int matches=sc.nextInt();
		System.out.println("enter total runs");
		int runs=sc.nextInt();
		
		CricketPlayer c=new CricketPlayer(name,matches,runs);
		c.display();
		
		
	}

}

**/
