package com.oops.BankAccountManagementSystem;

public class SavingsAccount extends Account {

	@Override
	public double calculateInterest() {

		double interestRate = 4.0;

		return interestRate;
	}

	@Override
	public boolean withdraw(double amount) {

		double balance = getBalance();

		if (balance - amount >= 1000) {

			System.out.println("Withdrawal successful");

			return true;

		} else {

			System.out.println("Minimum balance of ₹1000 must be maintained");

			return false;
		}
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Savings Account Banking");

		SavingsAccount s1 = new SavingsAccount();

		System.out.println("Checking account number...");

		if (s1.isAccountNumberValid() && s1.isPhoneValid()) {

			System.out.println("Account details are valid");

			double balance = s1.getBalance();

			System.out.println("Current Balance : ₹" + balance);

			System.out.println("Savings Account Interest Rate : " + s1.calculateInterest() + "%");

			System.out.println("Enter amount to withdraw");

			double amount = sc.nextDouble();

			s1.withdraw(amount);

		} else {

			System.out.println("Invalid account details");
		}
	}
}