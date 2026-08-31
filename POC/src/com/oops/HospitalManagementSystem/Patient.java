package com.oops.HospitalManagementSystem;

public class Patient extends Person {

	private String disease;
	private String bloodGroup;
	private String emergencyContact;

	public boolean isPatientEligible(int age) {

		return age >= 0;
	}

	public boolean isEmergencyContactValid() {

		return emergencyContact.matches("[6-9][0-9]{9}");
	}

	@Override
	public void displayDetails() {

		System.out.println("\n========== PATIENT DETAILS ==========");

		System.out.println("Disease       : " + disease);

		System.out.println("Blood Group   : " + bloodGroup);

		System.out.println("Emergency No. : " + emergencyContact);
	}

	public static void main(String[] args) {

		System.out.println("Welcome to Patient Registration");

		Patient p = new Patient();

		int age = p.getAge();

		System.out.println("Enter your disease");

		p.disease = sc.next();

		System.out.println("Enter your blood group");

		p.bloodGroup = sc.next();

		System.out.println("Enter emergency contact number");

		p.emergencyContact = sc.next();

		if (p.isPatientEligible(age)) {

			System.out.println("Patient information is valid.");

			if (p.isIdValid() && p.isPhoneValid() && p.isEmergencyContactValid()) {

				System.out.println("Patient registration successful!");

				p.displayDetails();

			} else {

				System.out.println("Invalid patient details.");
			}

		} else {

			System.out.println("Invalid patient age.");
		}
	}
}