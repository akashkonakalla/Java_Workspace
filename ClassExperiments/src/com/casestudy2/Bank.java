package com.casestudy2;

import java.util.Scanner;

public class Bank {

	static double balance = 10000;
	static double totalDep = 0;
	static double totalWith = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean exit = false;

		while (!exit) {

			System.out.println("\nEnter your choice");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Balance");
			System.out.println("4. Exit");

			int ch = sc.nextInt();

			switch (ch) {

			case 1 -> {
				System.out.println("Enter amount to deposit:");

				double depAmt = sc.nextDouble();

				if (depAmt > 0) {
					balance += depAmt;
					totalDep += depAmt;

					System.out.println("Deposit successful");
				} else {
					System.out.println("Enter valid amount");
				}
			}

			case 2 -> {
				System.out.println("Enter amount to withdraw:");

				double with = sc.nextDouble();

				if (balance >= with && with > 0) {
					balance -= with;
					totalWith += with;

					System.out.println("Withdraw successful");
				} else {
					System.out.println("Insufficient Balance");
				}
			}

			case 3 -> {
				System.out.println("Current Balance: " + balance);
			}

			case 4 -> {
				System.out.println("Thank You :)");
				exit = true;
			}

			default -> {
				System.out.println("Invalid choice");
			}
			}
		}

		System.out.println("\nFinal Balance: " + balance);
		System.out.println("Total Deposited: " + totalDep);
		System.out.println("Total Withdraw: " + totalWith);

		sc.close();
	}
}