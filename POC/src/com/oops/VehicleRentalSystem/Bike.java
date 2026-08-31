package com.oops.VehicleRentalSystem;

public class Bike extends Vehicle {

	private int engineCC;
	private boolean helmetAvailable;

	@Override
	public double calculateRent(int days) {

		double dailyRent;

		if (engineCC <= 150) {

			dailyRent = 500;

		} else if (engineCC <= 300) {

			dailyRent = 800;

		} else {

			dailyRent = 1200;
		}

		return dailyRent * days;
	}

	public boolean isHelmetAvailable() {

		return helmetAvailable;
	}

	@Override
	public void displayVehicleDetails() {

		System.out.println("\n========== BIKE DETAILS ==========");

		System.out.println("Engine CC        : " + engineCC);

		System.out.println("Helmet Available : " + helmetAvailable);
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Bike Rental System");

		Bike b = new Bike();

		System.out.println("Enter engine CC");

		b.engineCC = sc.nextInt();

		System.out.println("Is helmet available? (true/false)");

		b.helmetAvailable = sc.nextBoolean();

		System.out.println("Enter rental period in days");

		int days = sc.nextInt();

		if (b.engineCC >= 100 && b.engineCC <= 1000 && days > 0) {

			System.out.println("Basic information is valid.");

			if (b.isVehicleAvailable()) {

				if (b.isLicenseValid()) {

					if (b.isHelmetAvailable()) {

						System.out.println("Vehicle is available.");

						System.out.println("Rental Amount : ₹" + b.calculateRent(days));

						b.displayVehicleDetails();

					} else {

						System.out.println("Helmet is required for rental.");
					}

				} else {

					System.out.println("Invalid driving license.");
				}

			} else {

				System.out.println("Vehicle is currently unavailable.");
			}

		} else {

			System.out.println("Invalid bike details.");
		}
	}
}