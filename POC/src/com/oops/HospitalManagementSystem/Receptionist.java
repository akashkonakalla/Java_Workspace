package com.oops.HospitalManagementSystem;

public class Receptionist extends Person {

	private String shift;
	private int experience;
	private double salary;

	public boolean isReceptionistEligible(int age, int experience) {

		return age >= 18 && experience >= 0;
	}

	public boolean isShiftValid() {

		return shift.equalsIgnoreCase("Morning") || shift.equalsIgnoreCase("Evening")
				|| shift.equalsIgnoreCase("Night");
	}

	public double calculateSalary() {

		if (experience >= 5) {

			salary = 35000;

		} else if (experience >= 2) {

			salary = 28000;

		} else {

			salary = 22000;
		}

		return salary;
	}

	@Override
	public void displayDetails() {

		System.out.println("\n========== RECEPTIONIST DETAILS ==========");

		System.out.println("Shift      : " + shift);

		System.out.println("Experience : " + experience + " years");

		System.out.println("Salary     : ₹" + calculateSalary());
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Receptionist Registration");

		Receptionist r = new Receptionist();

		int age = r.getAge();

		System.out.println("Enter your experience in years");

		int experience = sc.nextInt();

		System.out.println("Enter your shift");

		r.shift = sc.next();

		if (r.isReceptionistEligible(age, experience)) {

			System.out.println("Basic information is valid.");

			if (r.isShiftValid()) {

				if (r.isIdValid() && r.isPhoneValid()) {

					r.experience = experience;

					System.out.println("Receptionist registration successful!");

					r.displayDetails();

				} else {

					System.out.println("Invalid ID or phone number.");
				}

			} else {

				System.out.println("Invalid shift.");
			}

		} else {

			System.out.println("Receptionist is not eligible.");
		}
	}
}