package com.casestudy7;

public class VIPTicket extends Ticket {

	VIPTicket(int ticketId, String movieName, String seatNumber, double basePrice) {

		super(ticketId, movieName, seatNumber, basePrice, "VIP");
	}

	@Override
	double calculatePrice() {

		return basePrice + 250;
	}
}
