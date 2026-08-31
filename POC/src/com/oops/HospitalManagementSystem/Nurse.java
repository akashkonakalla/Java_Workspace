package com.oops.HospitalManagementSystem;

public class Nurse extends Person {

	private String department;
	private int experience;
	private double salary;

	public boolean isNurseEligible(int age, int experience) {

		return age >= 21 && experience >= 1;
	}

	public double calculateSalary() {

		if (experience >= 10) {

			salary = 60000;

		} else if (experience >= 5) {

			salary = 45000;

		} else {

			salary = 30000;
		}

		return salary;
	}

	@Override
	public void displayDetails() {

		System.out.println("\n========== NURSE DETAILS ==========");

		System.out.println("Department : " + department);

		System.out.println("Experience : " + experience + " years");

		System.out.println("Salary     : ₹" + calculateSalary());
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Nurse Registration");

		Nurse n = new Nurse();

		int age = n.getAge();

		System.out.println("Enter your experience in years");

		int experience = sc.nextInt();

		System.out.println("Enter your department");

		n.department = sc.next();

		if (n.isNurseEligible(age, experience)) {

			System.out.println("Basic information is valid.");

			if (n.isIdValid() && n.isPhoneValid()) {

				n.experience = experience;

				System.out.println("Nurse registration successful!");

				n.displayDetails();

			} else {

				System.out.println("Invalid ID or phone number.");
			}

		} else {

			System.out.println("Nurse is not eligible for registration.");
		}
	}
}