package com.oops.BankAccountManagementSystem;

import java.util.Scanner;

public class Account implements AccountOperations {

	static Scanner sc = new Scanner(System.in);

	public boolean deposit(double amount) {

		return true;
	}

	public boolean withdraw(double amount) {

		return true;
	}

	@Override
	public double calculateInterest() {

		double interestRate = 3.0;

		return interestRate;
	}

	@Override
	public boolean isAccountNumberValid() {

		System.out.println("Enter your account number");

		String accountNumber = sc.next();

		return accountNumber.matches("[0-9]{10,16}");
	}

	@Override
	public boolean isPhoneValid() {

		System.out.println("Enter your phone number");

		String phone = sc.next();

		return phone.matches("[6-9][0-9]{9}");
	}

	public double getBalance() {

		System.out.println("Enter your balance");

		double balance = sc.nextDouble();

		return balance;
	}

}
