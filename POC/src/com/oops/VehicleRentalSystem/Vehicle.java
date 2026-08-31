package com.oops.VehicleRentalSystem;

import java.util.Scanner;

public class Vehicle implements RentalOperations {

	static Scanner sc = new Scanner(System.in);

	public double calculateRent(int days) {

		double baseRent = 1000;

		return baseRent * days;
	}

	public boolean isVehicleAvailable() {

		System.out.println("Is the vehicle available? (yes/no)");

		String availability = sc.next();

		return availability.equalsIgnoreCase("yes");
	}

	public boolean isLicenseValid() {

		System.out.println("Enter your driving license number");

		String license = sc.next();

		return license.matches("[A-Z0-9]{10,16}");
	}

	public void displayVehicleDetails() {

		System.out.println("This is a general vehicle.");
	}
}