package com.oops.BankAccountManagementSystem;

public class CurrentAccount extends Account {

	@Override
	public double calculateInterest() {

		double interestRate = 2.0;

		return interestRate;
	}

	@Override
	public boolean withdraw(double amount) {

		double balance = getBalance();

		double overdraftLimit = 50000;

		if (amount <= balance + overdraftLimit) {

			System.out.println("Withdrawal approved");

			return true;

		} else {

			System.out.println("Withdrawal exceeds overdraft limit");

			return false;
		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Current Account Banking");

		CurrentAccount c1 = new CurrentAccount();

		System.out.println("Checking account details...");

		if (c1.isAccountNumberValid() && c1.isPhoneValid()) {

			System.out.println("Account details are valid");

			double balance = c1.getBalance();

			System.out.println("Current Balance : ₹" + balance);

			System.out.println("Current Account Interest Rate : " + c1.calculateInterest() + "%");

			System.out.println("Enter amount to withdraw");

			double amount = sc.nextDouble();

			c1.withdraw(amount);

		} else {

			System.out.println("Invalid account details");
		}
	}
}