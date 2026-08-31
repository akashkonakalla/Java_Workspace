package com.oops.task_31_08_2026;

import java.util.Scanner;

public class Main extends BankAccount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Current balance : ");
		double curr = sc.nextDouble();

		Main m = new Main();
		m.setBalance(curr);

		while (true) {
			System.out.println("\nEnter \n1.Deposit \n" + "2.Withdraw \n" + "3.Current Balance \n" + "4.close \n");
			int a = sc.nextInt();

			switch (a) {
			case 1 -> {
				System.out.println("Enter the amount to deposit : ");
				double amount = sc.nextDouble();
				m.deposit(amount);
			}
			case 2 -> {
				System.out.println("Enter the amount to withdraw : ");
				double amount = sc.nextDouble();
				m.withdraw(amount);
			}
			case 3 -> {
				System.out.println("The current balance is : " + m.getBalance());
			}
			case 4 -> {
				System.out.println("Thank you for Banking with us :) , exiting");
				return;
			}
			}
		}
	}
}
