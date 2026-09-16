package com.oops.task_16_09_2026;

public class CreditCard extends Payment {

	@Override
	public void pay(double amount) {
		transactionFee = 0.02 * amount;
		this.amount = amount;
		System.out.println("Credit Card Payment\n");
		displayPayment();
	}

}
