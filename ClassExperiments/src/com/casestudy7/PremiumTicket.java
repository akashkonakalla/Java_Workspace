package com.casestudy7;

public class PremiumTicket extends Ticket {

	PremiumTicket(int ticketId, String movieName, String seatNumber, double basePrice) {

		super(ticketId, movieName, seatNumber, basePrice, "Premium");
	}

	@Override
	double calculatePrice() {

		return basePrice + 100;
	}
}
