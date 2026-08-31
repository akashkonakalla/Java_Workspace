package com.oops.HospitalManagementSystem;

public class Doctor extends Person {

	private String specialization;
	private int experience;
	private double consultationFee;

	public boolean isDoctorEligible(int age, int experience) {

		return age >= 25 && experience >= 1;
	}

	public double calculateConsultationFee() {

		if (experience >= 10) {

			consultationFee = 1000;

		} else if (experience >= 5) {

			consultationFee = 750;

		} else {

			consultationFee = 500;
		}

		return consultationFee;
	}

	@Override
	public void displayDetails() {

		System.out.println("\n========== DOCTOR DETAILS ==========");

		System.out.println("Specialization : " + specialization);

		System.out.println("Experience     : " + experience + " years");

		System.out.println("Consultation Fee : ₹" + calculateConsultationFee());
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Doctor Registration");

		Doctor d = new Doctor();

		int age = d.getAge();

		System.out.println("Enter your experience in years");

		int experience = sc.nextInt();

		System.out.println("Enter your specialization");

		d.specialization = sc.next();

		if (d.isDoctorEligible(age, experience)) {

			System.out.println("Basic information is valid.");

			if (d.isIdValid() && d.isPhoneValid()) {

				d.experience = experience;

				System.out.println("Doctor registration successful!");

				d.displayDetails();

			} else {

				System.out.println("Invalid ID or phone number.");
			}

		} else {

			System.out.println("Doctor is not eligible for registration.");
		}
	}
}