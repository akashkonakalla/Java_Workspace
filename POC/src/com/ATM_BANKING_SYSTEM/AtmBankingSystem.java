package com.ATM_BANKING_SYSTEM;

import java.util.Scanner;

public class AtmBankingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double balance = 44444.0;
		boolean exit = false;
		while (!exit) {
			System.out.println("\nenter your choice");
			System.out.println("1. Check Balance\r\n" + "2. Deposit\r\n" + "3. Withdraw\r\n" + "4. Exit");
			int ch = sc.nextInt();
			switch (ch) {
			case 1 -> {

				System.out.println("Your current balance is : " + balance);
				break;
			}
			case 2 -> {
				System.out.println("enter amount to deposit");
				float dep = sc.nextFloat();
				if(dep>=0) {

					balance = balance + dep;
					System.out.println("deposit successfully " + dep);
				}
				else System.out.println("enter valid amount to deposit");
				break;
			}
			case 3 -> {
				System.out.println("enter amount to withdraw");
				float with = sc.nextFloat();
				if (balance >= with) {

					balance = balance - with;
					System.out.println("withdraw successfully " + with);
				} else
					System.out.println("Insufficient balance");
				break;

			}
			case 4 -> {
				System.out.println("Thank You for banking with us :)");
				exit = true;
				break;
			}
			default -> System.out.println("invalid choice");
			}
		}

	}

}
