package com.oops.VehicleRentalSystem;

public class Truck extends Vehicle {

	private double loadCapacity;
	private int numberOfWheels;

	@Override
	public double calculateRent(int days) {

		double dailyRent;

		if (loadCapacity <= 5) {

			dailyRent = 3000;

		} else if (loadCapacity <= 10) {

			dailyRent = 5000;

		} else {

			dailyRent = 8000;
		}

		return dailyRent * days;
	}

	public double calculateExtraCharge() {

		if (loadCapacity > 10) {

			return 5000;

		} else {

			return 2000;
		}
	}

	@Override
	public void displayVehicleDetails() {

		System.out.println("\n========== TRUCK DETAILS ==========");

		System.out.println("Load Capacity : " + loadCapacity + " tons");

		System.out.println("Number of Wheels : " + numberOfWheels);

		System.out.println("Extra Charge : ₹" + calculateExtraCharge());
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Truck Rental System");

		Truck t = new Truck();

		System.out.println("Enter load capacity in tons");

		t.loadCapacity = sc.nextDouble();

		System.out.println("Enter number of wheels");

		t.numberOfWheels = sc.nextInt();

		System.out.println("Enter rental period in days");

		int days = sc.nextInt();

		if (t.loadCapacity > 0 && t.loadCapacity <= 20 && t.numberOfWheels >= 4 && days > 0) {

			System.out.println("Basic information is valid.");

			if (t.isVehicleAvailable()) {

				if (t.isLicenseValid()) {

					System.out.println("Truck is available.");

					System.out.println("Rental Amount : ₹" + t.calculateRent(days));

					System.out.println("Extra Charge : ₹" + t.calculateExtraCharge());

					t.displayVehicleDetails();

				} else {

					System.out.println("Invalid driving license.");
				}

			} else {

				System.out.println("Truck is currently unavailable.");
			}

		} else {

			System.out.println("Invalid truck details.");
		}
	}
}