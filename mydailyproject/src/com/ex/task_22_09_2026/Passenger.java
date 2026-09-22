package com.ex.task_22_09_2026;

import java.util.Scanner;

/*
 * Today’s Assignment:-

JAVA
1.Develop a Java program to process a passenger booking.
The system receives:
Passenger ID and age as String
Seat number as String
Number of passengers

Passenger details in an array

Different passenger data using Object[]
Perform these operations using multiple separate try-catch blocks:
Convert passenger ID and age to numbers.

Calculate average baggage: Total Baggage / Number of Passengers.

Search a passenger using an array index.
Cast an Object value to the expected type.
Perform an operation on passenger data that may be null.

Calculate booking average: Total Amount / Number of Seats.
Handle: NumberFormatException, ArithmeticException, ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException, ClassCastException, and NullPointerException.
Condition: Use separate try-catch blocks and ensure the program continues after an exception.

 */
public class Passenger {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of passengers");
	    int n=sc.nextInt();
		
	    Object[][] ob =new Object[n][3];
	    
		
		try {
			for(int i=0;i<n;i++) {
			System.out.println("Enter the " + (i+1) + " passenger Id");
			String passID = sc.nextLine();
			int passengerId = Integer.parseInt(passID);

			System.out.println("Enter the " + (i+1) + " passenger name");
			String name = sc.nextLine();
			
			System.out.println("Enter the " + (i+1) + " passenger age");
			String age = sc.nextLine();
			int passengerAge = Integer.parseInt(age);
			
			ob[i][0]=passengerId;
			ob[i][1]= name;
			ob[i][2]=passengerAge;
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("Enter the total baggage");
			int baggage = sc.nextInt();

			System.out.println("Average of baggage : "+(baggage/n));
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
}
