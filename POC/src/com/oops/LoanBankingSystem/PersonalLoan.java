package com.oops.LoanBankingSystem;

public class PersonalLoan extends Loan {

	public static void main(String[] args) {
		System.out.println("Welcome to Personal Loan Banking");

		System.out.println("Enter your Cibil Score");
		int cibil = sc.nextInt();

		PersonalLoan l1 = new PersonalLoan();

		double roi = l1.getCalculateROI(cibil);
		double salary = l1.getSalary();
		int age = l1.getAge();
		if (salary >= 900000 && age >= 26 && (cibil >= 300 && cibil <= 900)) {
			System.out.println("Basic information is validated.Checking personal details");
			if (l1.isAadhaarValid() && l1.isPanValid() && l1.isPhoneValid()) {
				System.out.println("Details are verified and Loan is approved");
				System.out.println("Your Loan ROI is : " + roi);
			} else {
				System.out.println("Something went wrong!");
			}
		} else {
			System.out.println("You are not elligible for Personal Loan, your request is rejected");
		}

	}

}
