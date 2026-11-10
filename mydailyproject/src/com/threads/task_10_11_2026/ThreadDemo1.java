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

class TestThread extends Thread {

	public void run() {

		System.out.println("Hello thread");

	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {

		TestThread t = new TestThread();
		t.start();
		t.start();

	}

}
