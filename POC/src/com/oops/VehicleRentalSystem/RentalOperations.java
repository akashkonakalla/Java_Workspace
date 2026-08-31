package com.oops.VehicleRentalSystem;

public interface RentalOperations {

	public abstract double calculateRent(int days);

	public abstract boolean isVehicleAvailable();

	public abstract boolean isLicenseValid();

	public abstract void displayVehicleDetails();
}