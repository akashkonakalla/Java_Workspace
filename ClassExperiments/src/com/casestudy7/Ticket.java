package com.casestudy7;

public abstract class Ticket {

	int ticketId;
	String movieName;
	String seatNumber;
	double basePrice;
	String ticketType;

	public Ticket(int ticketId, String movieName, String seatNumber, double basePrice, String ticketType) {
		super();
		this.ticketId = ticketId;
		this.movieName = movieName;
		this.seatNumber = seatNumber;
		this.basePrice = basePrice;
		this.ticketType = ticketType;
	}

	abstract double calculatePrice();

	void displayTicket() {
		System.out.println("Ticket ID    : " + ticketId);
		System.out.println("Movie Name   : " + movieName);
		System.out.println("Seat Number  : " + seatNumber);
		System.out.println("Ticket Type  : " + ticketType);
		System.out.println("Base Price   : " + basePrice);
		System.out.println("Final Price  : " + calculatePrice());
	}

}
