package com.oops.task_16_09_2026;

public class TestDriver {

	public static void main(String[] args) {

		Payment credit = new CreditCard();
		Payment upi = new UPI();
		Payment Net = new NetBanking();

		credit.pay(1000);
		upi.pay(1000);
		Net.pay(1000);
	}

}
