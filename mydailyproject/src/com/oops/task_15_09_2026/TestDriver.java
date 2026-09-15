package com.oops.task_15_09_2026;

public class TestDriver {
	public static void main(String[] args) {

		Shape circle = new Circle(5);
		Shape rectangle = new Rectangle(10, 5);
		Shape triangle = new Triangle(8, 6);

		circle.area();
		rectangle.area();
		triangle.area();
	}
}
 