package com.threads.task_09_11_2026;

/*
 * *Today's Assignment* 

*Java*-

1.Create a class that extends Thread.
Create three student threads.
Each thread should display its student name and attendance percentage.
Execute all three threads simultaneously.
 */

class Student extends Thread {

	String name;
	double attendance;

	Student(String n, double attendance) {
		this.name = n;
		this.attendance = attendance;
	}

	@Override
	public void run() {
		System.out.println("Name : " + name);
		System.out.println("Atendance : " + attendance);
	}

}

public class ThreadDemo1 {
	public static void main(String[] args) {
		System.out.println("main method started");

		Student s1 = new Student("Student 1", 84.99);
		Student s2 = new Student("Student 2", 99);
		Student s3 = new Student("Student 3", 80);

		s1.start();
		s2.start();
		s3.start();

		System.out.println("main method ended");
	}
}
