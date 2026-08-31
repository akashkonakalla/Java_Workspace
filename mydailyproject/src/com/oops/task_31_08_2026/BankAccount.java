package com.oops.task_31_08_2026;

/*
 * *Today's Assignment*
Batch 75-
Java-
1.Create a BankAccount class using Encapsulation.
Declare accountNumber, holderName, and balance as private.
Initialize the balance with ₹5000 using a constructor or directly.
Create a deposit(double amount) method to add money to the account.
Create a withdraw(double amount) method that allows withdrawal only if the balance is sufficient.
In main(), create an object, perform deposit and withdrawal operations, and display the final balance.

Sql-
1.Using a CTE, find the total salary of each department and display departments whose total salary is greater than 5000.
2. Using a CTE, find the employees who have the second-lowest salary in their respective departments.
 */
public class BankAccount {

	private String accountNumber;
	private String holderName;
	private double balance;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {

		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit successful : " + amount);
		} else {
			System.out.println("Deposit failed, enter the correct amount");
		}

	}

	public void withdraw(double amount) {

		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdraw successful : " + amount);
		} else if(amount < 0){
			System.out.println("Withdraw failed, enter the correct amount");
		}
		else if(amount > balance) {
			System.out.println("Insufficient Balance");
		}

	}

}
