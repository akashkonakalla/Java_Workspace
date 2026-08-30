package com.oops.LoanBankingSystem;

public class GoldLoan extends Loan {

	@Override
	public double getCalculateROI(int cibil) {
		double roi = 7;
		if (cibil > 900) {
			System.out.println("Something Went wrong ! Enter proper cibil score");
		} else if (cibil >= 300 && cibil <= 549) {
			System.out.println(" Poor score – High credit risk; loan approvals very unlikely.");
			roi = roi + 2.5;
		} else if (cibil >= 550 && cibil <= 649) {
			System.out.println("Fair score – Some credit concerns; approvals possible but at high interest rates");
			roi = roi + 2.0;
		} else if (cibil >= 650 && cibil <= 749) {
			System.out.println("Good score – Responsible credit behaviour; moderate approval chances.");
			roi = roi + 1.5;
		} else if (cibil >= 750 && cibil <= 900) {
			System.out.println(
					"Excellent score – Excellent financial discipline; best interest rates and premium credit products.");
			roi = roi + 0.5;
		} else {
			System.out.println(
					"Strict Terms if Approved: If a loan is disbursed, expect higher interest rates (20–30% or more), smaller loan amounts, shorter repayment tenures, and stringent collateral or co-signer requirements");
			roi = roi + 20;
		}

		return roi;

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Gold Loan Banking");

		System.out.println("Enter you Cibil Score");
		int cibil = sc.nextInt();

		GoldLoan g = new GoldLoan();

		double roi = g.getCalculateROI(cibil);
		int age = g.getAge();

		System.out.println("Enter the weight of your gold in grams");
		double gold = sc.nextDouble();

		System.out.println("Enter the value of your gold");
		double valueG = sc.nextDouble();

		if (valueG >= 50000 && gold >= 10 && age >= 20 && (cibil >= 300 && cibil <= 900)) {
			System.out.println("Basic information is validated. Checking the personal details");

			if (g.isAadhaarValid() && g.isPanValid() && g.isPhoneValid()) {
				System.out.println("Personal details are verified. Gold Loan is approved");
				System.out.println("Gold Value : " + valueG);
				System.out.println("Gold Weight : " + gold);
				System.out.println("Your Loan ROI is : " + roi);
			} else {
				System.out.println("Something went wrong! Verification failed");
			}
		} else {
			System.out.println("You are not elligible for Gold Loan, your request is rejected");
		}

	}
}
