package com.oops.task_02_09_2026;

import java.util.Scanner;

public class Student extends Person {

	String collegeName;

	@Override
	public void collegeName() {
		System.out.println("Student college : " + collegeName);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("Enter the name of the college");
		s1.collegeName = sc.nextLine();
		System.out.println("Enter the age of student");
		s1.setAge(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter the name of student");
		s1.setName(sc.nextLine());

		System.out.println("The college name is : " + s1.collegeName);
		System.out.println("The name of student is : " + s1.getName());
		System.out.println("The age of the student is : " + s1.getAge());
	}
}
