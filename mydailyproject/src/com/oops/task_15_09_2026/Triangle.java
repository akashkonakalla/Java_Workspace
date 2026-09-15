package com.oops.task_15_09_2026;

public class Triangle extends Shape {

	double b;
	double h;

	public Triangle(double b, double h) {
		this.b = b;
		this.h = h;

	}

	@Override
	public void area() {

		System.out.println("Area of Rectangle : " + (0.5 * h * b));
	}

}
