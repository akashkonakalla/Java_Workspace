package com.oops.StudentScholarship;

import java.util.Scanner;

public class Student implements ScholarshipOperations {

	static Scanner sc = new Scanner(System.in);

	private int studentId;
	private String name;
	private int age;
	private String phone;
	private String email;
	private double marks;

	@Override
	public boolean isEligible() {

		return age >= 17 && marks >= 40;
	}

	@Override
	public double calculateScholarship() {

		return 0;
	}

	@Override
	public boolean isPhoneValid() {

		System.out.println("Enter your phone number");

		phone = sc.next();

		return phone.matches("[6-9][0-9]{9}");
	}

	@Override
	public boolean isEmailValid() {

		System.out.println("Enter your email");

		email = sc.next();

		return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
	}

	@Override
	public void displayDetails() {

		System.out.println("\n========== STUDENT DETAILS ==========");

		System.out.println("Student ID : " + studentId);

		System.out.println("Name       : " + name);

		System.out.println("Age        : " + age);

		System.out.println("Marks      : " + marks);

		System.out.println("Phone      : " + phone);

		System.out.println("Email      : " + email);
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
}