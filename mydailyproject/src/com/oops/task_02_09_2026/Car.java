package com.oops.task_02_09_2026;

public class Car extends Vehicle {

	@Override
	void drive() {

		System.out.println("Car is driving");
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.drive();
		
		Vehicle v =new Vehicle();
		v.start();
		v.drive();
		
		Vehicle v1 = new Car();
		v1.start();
		v1.drive();
	}

}
