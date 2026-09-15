package com.oops.task_15_09_2026;

public class Rectangle extends Shape {

	double l;
	double b;

	public Rectangle(double l, double b) {
		this.l = l;
		this.b = b;
	}

	@Override
	public void area() {

		System.out.println("Area of Rectangle: " + (l * b));
	}

}
