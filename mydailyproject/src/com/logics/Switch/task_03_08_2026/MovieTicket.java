package com.logics.Switch.task_03_08_2026;

import java.util.Scanner;

/*
 * Java Assignment
Question:
1.A movie theater offers three types of tickets:
1 → Silver (₹200)
2 → Gold (₹300)
3 → Platinum (₹500)
•Write a Java program that:
•Accepts the ticket type and customer's age as input.
•Uses a switch statement to determine the ticket type and price.
•Uses an if statement inside each case to check whether the customer is a senior citizen (age ≥ 60).
•If the customer is a senior citizen, apply a 10% discount on the ticket price.
•Display the ticket type and the final ticket price.
Output
Select Ticket Type:
1. Silver - Rs.200
2. Gold - Rs.300
3. Platinum - Rs.500
4. Exit
Enter your choice: 2
Enter your age: 65
Gold Ticket Price: Rs.270.0

Select Ticket Type:
1. Silver - Rs.200
2. Gold - Rs.300
3. Platinum - Rs.500
4. Exit
Enter your choice: 4
Thank you! Visit Again.
 */

public class MovieTicket {
	static Scanner sc=new Scanner(System.in);
	static double  price(int tick) {
		System.out.println("enter your age :");
		double age = sc.nextDouble();
		double price,discount=0;
		if(age>=60)
			discount=0.1;
		
		 price=tick-tick*discount;
		 return price;
	}
	public static void main(String[] args) {
		
		boolean exit =false;
	    do {
	    	System.out.println("\nSelect the ticket type :");
	    	System.out.println("1. Silver - Rs.200");
	    	System.out.println("2. Gold - Rs.300");
	    	System.out.println("3. Platinum - Rs.500");
	    	System.out.println("4. Exit");
	    	System.out.println("Enter your choice :");
			int tick=sc.nextInt();
			
			
			switch (tick) {
			case 1-> {
				
//				price=200-200*discount;
				System.out.println("Silver Ticket Price: "+price(200));
				break; 
				//No use even we keep break in -> switch case from java 14
			}
			case 2->{
//				price= 300- 300*discount;
				System.out.println("Gold Ticket Price: "+price(300));
			}
			case 3->{
//				price= 500- 500*discount;
				System.out.println("Platinum Ticket Price: "+price(500));
			}
			case 4->{
				System.out.println("THANK YOU :) , Visit Again.");
				exit=true;
			}
			default->
				System.out.println("NOT A VALID CHOICE");
			}
			
		} while (!exit);
	}

}
