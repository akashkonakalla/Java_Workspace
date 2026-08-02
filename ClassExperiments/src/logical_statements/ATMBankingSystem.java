package logical_statements;

import java.util.Scanner;

public class ATMBankingSystem {
	
	 static int attempts = 3;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int pin = 1234;
		double balance = 10000;
		
		String miniStatement = "";

		System.out.println("=================================");
		System.out.println("      WELCOME TO ABC BANK");
		System.out.println("=================================");

		while (attempts > 0) {

			System.out.print("\nEnter ATM PIN: ");
			int enteredPin = sc.nextInt();

			if (enteredPin == pin) {

				System.out.println("\nLogin Successful!");

				boolean exit = false;

				while (!exit) {

					System.out.println("\n========= ATM MENU =========");
					System.out.println("1. Balance Inquiry");
					System.out.println("2. Deposit");
					System.out.println("3. Withdraw");
					System.out.println("4. Mini Statement");
					System.out.println("5. Change PIN");
					System.out.println("6. Exit");
					System.out.print("Enter your choice: ");
					int choice = sc.nextInt();

					if (choice == 1) {

						System.out.println("Current Balance : ₹" + balance);

					}

					else if (choice == 2) {

						System.out.print("Enter Deposit Amount : ");
						double amount = sc.nextDouble();

						if (amount > 0) {
							balance += amount;
							miniStatement += "Deposited : ₹" + amount + "\n";
							System.out.println("Deposit Successful.");
							System.out.println("Updated Balance : ₹" + balance);
						} else {
							System.out.println("Invalid Amount.");
						}

					}

					else if (choice == 3) {

						System.out.print("Enter Withdrawal Amount : ");
						double amount = sc.nextDouble();

						if (amount <= 0) {
							System.out.println("Invalid Amount.");
						}

						else if (amount > balance) {
							System.out.println("Insufficient Balance.");
						}

						else {
							balance -= amount;
							miniStatement += "Withdrawn : ₹" + amount + "\n";
							System.out.println("Please Collect Your Cash.");
							System.out.println("Remaining Balance : ₹" + balance);
						}

					}

					else if (choice == 4) {

						System.out.println("\n------ MINI STATEMENT ------");

						if (miniStatement.equals("")) {
							System.out.println("No Transactions Yet.");
						} else {
							System.out.println(miniStatement);
						}

						System.out.println("Current Balance : ₹" + balance);

					}

					else if (choice == 5) {

						System.out.print("Enter Current PIN : ");
						int currentPin = sc.nextInt();

						if (currentPin == pin) {

							System.out.print("Enter New PIN : ");
							int newPin = sc.nextInt();

							System.out.print("Confirm New PIN : ");
							int confirmPin = sc.nextInt();

							if (newPin == confirmPin) {
								pin = newPin;
								System.out.println("PIN Changed Successfully.");
							} else {
								System.out.println("PIN Mismatch.");
							}

						} else {
							System.out.println("Incorrect Current PIN.");
						}

					}

					else if (choice == 6) {

						System.out.println("\nThank You For Banking With Us.");
						exit = true;

					}

					else {

						System.out.println("Invalid Choice.");

					}

				}

				break;

			}

			else {

				attempts--;

				if (attempts > 0) {
					System.out.println("Incorrect PIN.");
					System.out.println("Attempts Left : " + attempts);
				} else {
					System.out.println("Card Blocked.");
					System.out.println("Please Contact Your Bank.");
				}

			}

		}

		sc.close();
	}

}
