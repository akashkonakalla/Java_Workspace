package com.threads.task_09_11_2026;

class Student1 extends Thread implements Runnable {

	String name;
	double attendance;

	Student1(String n, double attendance) {
		this.name = n;
		this.attendance = attendance;
	}

	@Override
	public void run() {
		System.out.println("Name : " + name);
		System.out.println("Atendance : " + attendance);
	}

}

public class ThreadRunnableDemo extends Thread {
	public static void main(String[] args) {
		System.out.println("main method started");

		Student1 s1 = new Student1("Student 1", 84.99);
		Student1 s2 = new Student1("Student 2", 99);
		Student1 s3 = new Student1("Student 3", 80);

		Thread t1 = new Thread(s1);

		t1.start();
		s2.start();
		s3.start();

		System.out.println("main method ended");
	}
}
