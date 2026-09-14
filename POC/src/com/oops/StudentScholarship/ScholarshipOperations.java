package com.oops.StudentScholarship;

public interface ScholarshipOperations {

	public abstract boolean isEligible();

	public abstract double calculateScholarship();

	public abstract boolean isPhoneValid();

	public abstract boolean isEmailValid();

	public abstract void displayDetails();
}