package com.oops.task_16_09_2026;

public class UPI extends Payment {

	@Override
	public void pay(double amount) {
		this.transactionFee = 0;
		this.amount = amount;

		System.out.println("UPI Payment\n");
		displayPayment();
	}

}
