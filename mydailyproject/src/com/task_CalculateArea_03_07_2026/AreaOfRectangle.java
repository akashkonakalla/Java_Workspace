package com.task_CalculateArea_03_07_2026;


/*
Today's Assignment
Batch 75
Java 
1. Write a Java program to create a class "Rectangle" with a method "calculateArea()". 
The method should take no arguments and return no value. 
Initialize the length and breadth inside the method, calculate the area of the rectangle, and display the result.
*/

public class AreaOfRectangle {

	void calculateArea() {
		int length=2;
		int breadth=4;
		int area= length*breadth;
		
		System.out.println("Area of rectangle is : "+ area);

	}
	public static void main(String []args) {
		
		
		new AreaOfRectangle().calculateArea();
	}
}
