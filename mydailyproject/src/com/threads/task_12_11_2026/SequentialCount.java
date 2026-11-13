package com.threads.task_12_11_2026;

/*
 * 2.Create 2 threads using wait() and notify().
Thread 1 prints odd numbers.
Thread 2 prints even numbers.
Output must be 1 to 20 sequentially.

 */

class OddThread extends Thread {

	Thread t;

	public OddThread() {

	}

	public OddThread(Thread t) {
		this.t = t;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 20; i += 2) {
			System.out.println(i);

			t = new EvenThread(Thread.currentThread());
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class EvenThread extends Thread {

	Thread t;

	public EvenThread(Thread t) {

		this.t = t;
	}

	public EvenThread() {

	}

	@Override
	public void run() {
		for (int i = 2; i <= 20; i += 2) {
			System.out.println(i);

			t = new OddThread(Thread.currentThread());
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}

public class SequentialCount {

	public static void main(String[] args) {

		OddThread o = new OddThread();
		EvenThread e = new EvenThread();

		o.start();
		e.start();

	}
}
