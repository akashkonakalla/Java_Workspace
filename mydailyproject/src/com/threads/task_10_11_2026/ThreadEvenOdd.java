package com.threads.task_10_11_2026;

/*
 * *Today's Assignment* 

*Java*-
1.Create a class named TestThread extending Thread.
Override the run() method.
Create one object.
Call start() two times on the same object.
Observe the output.
Identify the exception generated.
Explain why the same thread object cannot be started twice.
2.Create two threads:
Thread 1 prints even numbers from 2 to 20.
Thread 2 prints odd numbers from 1 to 19.

*Servlets*-
1.Develop a web application using Java Servlets, JDBC, HTML, CSS, and MySQL. The application should implement complete CRUD operations with user-friendly navigation.
 */

class Odd implements Runnable {

	public void run() {
		for (int i = 1; i <= 20; i += 2) {
			System.out.println("Odd : " + i);
		}
	}

}

class Even implements Runnable {

	public void run() {
		for (int i = 0; i <= 20; i += 2) {
			System.out.println("Even : " + i);
		}
	}

}

public class ThreadEvenOdd {

	public static void main(String[] args) {

		Odd o = new Odd();
		Object e = new Even();

		Thread t1 = new Thread(o);
		Thread t2 = new Thread((Runnable) e);

		t1.start();
		t2.start();

	}

}
