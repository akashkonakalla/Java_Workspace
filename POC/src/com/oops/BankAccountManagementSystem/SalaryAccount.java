package com.oops.BankAccountManagementSystem;

public class SalaryAccount extends Account {

	@Override
	public double calculateInterest() {

		double interestRate = 3.5;

		return interestRate;
	}

	public boolean isSalaryEligible(double salary) {

		return salary >= 25000;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Salary Account Banking");

		SalaryAccount s1 = new SalaryAccount();

		System.out.println("Enter your salary");

		double salary = sc.nextDouble();

		if (s1.isSalaryEligible(salary)) {

			System.out.println("You are eligible for Salary Account");

			System.out.println("Checking account details...");

			if (s1.isAccountNumberValid() && s1.isPhoneValid()) {

				System.out.println("Account details are valid");

				System.out.println("Salary : ₹" + salary);

				System.out.println("Salary Account Interest Rate : " + s1.calculateInterest() + "%");

			} else {

				System.out.println("Invalid account details");
			}

		} else {

			System.out.println("You are not eligible for Salary Account");
		}
	}
}