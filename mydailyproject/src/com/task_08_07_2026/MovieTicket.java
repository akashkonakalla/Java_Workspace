package com.task_08_07_2026;

/*
Today Task
Java

Movie Ticket Details
1.Write a Java program to store the following movie ticket details in appropriate variables:
Ticket ID
Screen Number
Ticket Price
Online Booking Status
Viewer Age
Number of Tickets
Contact Number
GST Amount
2.Print all the ticket details in a clear and readable format.

Mysql
1.Doctor and Patients
Create two tables:
1.Doctor with:
Doctor ID
Doctor Name
Specialization

2.Patient with:
Patient ID
Patient Name
Age
Doctor ID

Requirements:
3.Use appropriate Primary Keys.
4.Create a Foreign Key relationship between the tables.
5.Insert 5 records into each table.
*/

public class MovieTicket {

	int TicketID;
	int ScreenNumber;
	double TicketPrice;
	boolean OnlineBookingStatus;
	int ViewerAge;
	int NumberOfTickets;
	long ContactNumber;
	double GSTAmount;
	
	public static void main(String[] args) {
		
		MovieTicket m=new MovieTicket();
		System.out.println(" TicketID : "+ (m.TicketID=1));
		System.out.println(" ScreenNumber : "+ (m.ScreenNumber=1));
		System.out.println(" TicketPrice : "+ (m.TicketPrice= 540.7));
		System.out.println(" OnlineBookingStatus : "+ (m.OnlineBookingStatus =true));
		System.out.println(" ViewerAge : "+ (m.ViewerAge=21));
		System.out.println(" NumberOfTickets : "+ (m.NumberOfTickets=2));
		System.out.println(" ContactNumber : "+ (m.ContactNumber=9100893023L));
		System.out.println(" GSTAmount : "+ (m.GSTAmount= m.TicketPrice * 0.18));
		
	}

}
