package com.oops.task_15_09_2026;

public class Circle extends Shape {

	double r;

	public Circle(int r) {
		this.r = r;
	}

	public void area() {
		System.out.println("Area of Circle : " + (Math.PI * r * r));

	}
}
