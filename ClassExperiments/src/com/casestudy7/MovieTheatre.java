package com.casestudy7;

public class MovieTheatre {

	public static void main(String[] args) {

		Ticket t1 = new RegularTicket(101, "Avengers", "A10", 200);

		Ticket t2 = new PremiumTicket(102, "Avengers", "B15", 200);

		Ticket t3 = new VIPTicket(103, "Avengers", "C20", 200);

		t1.displayTicket();
		t2.displayTicket();
		t3.displayTicket();
	}
}