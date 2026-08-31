package com.oops.HospitalManagementSystem;

import java.util.Scanner;

public class Person implements PersonOperations {
	static Scanner sc = new Scanner(System.in);

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		System.out.println("Enter your age");

		int age = sc.nextInt();

		return age;
	}

	@Override
	public boolean isPhoneValid() {
		// TODO Auto-generated method stub
		System.out.println("Enter your phone number");

		String phone = sc.next();

		return phone.matches("[6-9][0-9]{9}");
	}

	@Override
	public boolean isIdValid() {
		// TODO Auto-generated method stub
		System.out.println("Enter your ID");

		String id = sc.next();

		return id.matches("[0-9]{4,10}");
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Hospital Person");

	}

}
