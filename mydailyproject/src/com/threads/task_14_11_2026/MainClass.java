package com.threads.task_14_11_2026;

/*
 * *Today's Assignment* 

*Java*-

1.Create a Java program to simulate a traffic signal using multithreading.
 Display Red (5 sec), Yellow (2 sec), and Green (5 sec) in sequence by 
 using the Thread.sleep() method. Print each signal before pausing for 
 its specified duration.

Jsp-
1.Create a JSP page using scriptlet tags to store a user's role 
(Admin/User/Guest) and display different welcome messages based on the 
role.
 */

class TrafficSignal extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("RED Signal - STOP");
			Thread.sleep(5000);

			System.out.println("YELLOW Signal - WAIT");
			Thread.sleep(2000);

			System.out.println("GREEN Signal - GO");
			Thread.sleep(5000);

		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}

public class MainClass {
	public static void main(String[] args) {

		TrafficSignal t = new TrafficSignal();
		t.start();
	}
}