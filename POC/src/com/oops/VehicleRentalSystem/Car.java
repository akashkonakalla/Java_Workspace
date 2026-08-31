package com.oops.VehicleRentalSystem;

public class Car extends Vehicle {

	private int numberOfSeats;
	private boolean isAC;

	@Override
	public double calculateRent(int days) {

		double dailyRent;

		if (isAC) {

			dailyRent = 2000;

		} else {

			dailyRent = 1500;
		}

		return dailyRent * days;
	}

	public double calculateSecurityDeposit() {

		if (isAC) {

			return 10000;

		} else {

			return 7000;
		}
	}

	@Override
	public void displayVehicleDetails() {

		System.out.println("\n========== CAR DETAILS ==========");

		System.out.println("Number of Seats : " + numberOfSeats);

		System.out.println("AC              : " + isAC);

		System.out.println("Security Deposit: ₹" + calculateSecurityDeposit());
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Car Rental System");

		Car c = new Car();

		System.out.println("Enter number of seats");

		c.numberOfSeats = sc.nextInt();

		System.out.println("Do you need AC? (true/false)");

		c.isAC = sc.nextBoolean();

		System.out.println("Enter rental period in days");

		int days = sc.nextInt();

		if (c.numberOfSeats >= 2 && c.numberOfSeats <= 8 && days > 0) {

			System.out.println("Basic information is valid.");

			if (c.isVehicleAvailable()) {

				if (c.isLicenseValid()) {

					System.out.println("Vehicle is available.");

					System.out.println("Rental Amount : ₹" + c.calculateRent(days));

					c.displayVehicleDetails();

				} else {

					System.out.println("Invalid driving license.");
				}

			} else {

				System.out.println("Vehicle is currently unavailable.");
			}

		} else {

			System.out.println("Invalid car details.");
		}
	}
}