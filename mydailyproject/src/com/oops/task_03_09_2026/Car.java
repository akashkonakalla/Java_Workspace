package com.oops.task_03_09_2026;

public class Car extends Vehicle {

	int speed = 100;

	public void display() {
		System.out.println("Car driving" + speed);
	}

	public static void main(String[] args) {
		Vehicle v = new Car();
		v.display();
		System.out.println("Speed is : " + v.speed);
	}
}
