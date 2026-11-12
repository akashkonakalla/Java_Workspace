package com.threads.task_12_11_2026;
/*
 * *Today's Assignment* 

*Java*-
1.Create 2 threads accessing a shared counter.
Each thread increments the counter 1000 times.
Final output must be 2000.

2.Create 2 threads using wait() and notify().
Thread 1 prints odd numbers.
Thread 2 prints even numbers.
Output must be 1 to 20 sequentially.

Servlets-
1.Develop a web application using Java Servlets, JDBC, HTML, CSS, and MySQL. The application should implement complete CRUD operations with user-friendly navigation.
 */

class Resource {
	int count = 0;

	public synchronized void count() {
		System.out.println(count++);
	}
}

class Thread1 extends Thread {

	Resource rs;

	Thread1(Resource rs) {
		this.rs = rs;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++)
			rs.count();
	}
}

class Thread2 extends Thread {

	Resource rs;

	Thread2(Resource rs) {
		this.rs = rs;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 1000; i++)
			rs.count();
	}

}

public class CountThreads {

	public static void main(String[] args) throws InterruptedException {

		Resource r = new Resource();

		Thread1 t1 = new Thread1(r);
		Thread2 t2 = new Thread2(r);
		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("final count is : " + r.count);
	}
}
