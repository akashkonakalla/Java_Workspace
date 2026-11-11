package com.threads.bookmyshow;

class BookMyShow {

	int tickets = 10;

	synchronized public void buyTickets(int t, String name) {
		if (tickets >= t) {
			System.out.println(t + " tickets purchased successfully by " + name);
			tickets -= t;
			System.out.println("Name : " + name + " Remaining tickets are " + tickets);
		} else {
			System.out.println("sold out!");
			System.out.println("The number of tickets left : " + tickets);
		}
	}
}

class BuyTickets extends Thread {

	BookMyShow bm;
	int tickets;
	String name;

	BuyTickets(BookMyShow bm, int tickets, String name) {
		this.bm = bm;
		this.tickets = tickets;
		this.name = name;
	}

	 public void run() {
		bm.buyTickets(tickets, name);
	}
}

public class TicketClass {

	public static void main(String[] args) {

		System.out.println("Welcome to book my show");
		BookMyShow bm = new BookMyShow();
		BuyTickets t1 = new BuyTickets(bm, 4, "ak");
		BuyTickets t2 = new BuyTickets(bm, 4, "sh");
		BuyTickets t3 = new BuyTickets(bm, 4, "ka");

		t1.start();
		t2.start();
		t3.start();
	}

}
