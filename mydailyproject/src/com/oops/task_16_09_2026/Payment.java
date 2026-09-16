package com.oops.task_16_09_2026;

/*
 * *Today's Assignment* 16/09/2026

*Java*-

1.Create an abstract class Payment with fields amount and transactionFee.
Create an abstract method pay(double amount).
Create child classes CreditCard, UPI, and NetBanking that calculate 
transaction fees (2%, 0%, and ₹10 respectively).
Calculate and display the transaction fee and total amount to be paid.
Print "Payment Successful" after completing the payment.

PL/SQL-
1.Create an explicit cursor to fetch employees with salary greater than 50000.
Fetch one record at a time.
Display employee name and salary.
 */
public abstract class Payment {

	double amount;
	double transactionFee;

	public abstract void pay(double amount);

	void displayPayment() {
		System.out.println("Transaction Fee: ₹" + transactionFee);
		System.out.println("Total Amount to be Paid: ₹" + (amount + transactionFee));
		System.out.println("Payment Successful\n");
	}
}
