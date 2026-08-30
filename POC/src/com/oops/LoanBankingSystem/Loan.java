package com.oops.LoanBankingSystem;

import java.util.Scanner;

public class Loan implements LoanOperations {

	static Scanner sc = new Scanner(System.in);

	public double getCalculateROI(int cibil) {

		double roi = 8.5;
		if (cibil > 900) {
			System.out.println("Something Went wrong ! Enter proper cibil score");
		} else if (cibil >= 300 && cibil <= 549) {
			System.out.println(" Poor score – High credit risk; loan approvals very unlikely.");
			roi = roi + 3.5;
		} else if (cibil >= 550 && cibil <= 649) {
			System.out.println("Fair score – Some credit concerns; approvals possible but at high interest rates");
			roi = roi + 3.0;
		} else if (cibil >= 650 && cibil <= 749) {
			System.out.println("Good score – Responsible credit behaviour; moderate approval chances.");
			roi = roi + 2.5;
		} else if (cibil >= 750 && cibil <= 900) {
			System.out.println(
					"Excellent score – Excellent financial discipline; best interest rates and premium credit products.");
			roi = roi + 1;
		} else {
			System.out.println(
					"Strict Terms if Approved: If a loan is disbursed, expect higher interest rates (20–30% or more), smaller loan amounts, shorter repayment tenures, and stringent collateral or co-signer requirements");
			roi = roi + 20;
		}

		return roi;

	}

	public int getAge() {
		System.out.println("Enter your age");
		int age = sc.nextInt();

		return age;
	}

	public double getSalary() {
		System.out.println("Enter your salary");
		double sal = sc.nextDouble();

		return sal;

	}

	public boolean isAadhaarValid() {
		System.out.println("Enter your aadhaar number");
		String aadhaar = sc.next();

		return aadhaar.matches("[1-9][0-9]{11}");
	}

	public boolean isPanValid() {
		System.out.println("Enter your pan number");
		String pan = sc.next();

		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}

	public boolean isPhoneValid() {
		System.out.println("Enter you mobile number");
		String mobile = sc.next();

		return mobile.matches("[6-9][0-9]{9}");
	}

}
