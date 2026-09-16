package com.oops.task_16_09_2026;

public class NetBanking extends Payment {

	@Override
	public void pay(double amount) {
		this.transactionFee = 10;
		this.amount = amount;

		System.out.println("NetBanking Payment\n");
		displayPayment();
	}
}
