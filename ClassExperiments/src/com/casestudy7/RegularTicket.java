package com.casestudy7;

public class RegularTicket extends Ticket {

	RegularTicket(int ticketId, String movieName, String seatNumber, double basePrice) {

		super(ticketId, movieName, seatNumber, basePrice, "Regular");
	}

	@Override
	double calculatePrice() {

		return basePrice;
	}
}
