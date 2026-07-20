package com.Methods.task_20_07_2026;

import java.util.Scanner;

/*
 * Java Task: Calculator Using Methods and Scanner
Problem:
1.Create a Java program that performs basic calculator operations using methods.
Requirements:
1.Read two numbers using Scanner.
2.Create the following methods:
add(a, b)
subtract(a, b)
multiply( a, b)
divide(a, b)
3.Call all four methods from the main() method.
Each method should print its results

Sample Input
Enter first number: 20
Enter second number: 10
Sample Output
Addition = 30
Subtraction = 10
Multiplication = 200
Division = 2
5.Note: Assume the second number is not 0, so no condition is required to handle division by zero.
 */
public class Calculator {
	
	void add(int a,int b) {
		System.out.println("Addition of "+a +" and "+b+ " is : "+(a+b));
	}
	
	void multiply(double  a,double b)
	{
		System.out.println("Multiplication of "+a+" and "+b+ " is : "+(a*b));
	}
	void divide(double a, float b) {
		System.out.printf("Division of %.3f \n \n", (a/b));
		System.out.println("division is \n"+ String.format("%.2f", (a/b)));
	}
	double subtract(double a,double b) {
		
		return a-b;
	}
	 void main(String[] args) {
		System.out.println("Enter values of a and b");
		Scanner sc=new Scanner (System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		add((int)a,(int)b);
		multiply(a,b);
		divide(a,(float)b);
		System.out.println("Subtraction of "+a +" and "+b+ " is "+ (subtract(a,b)));
		
		
	}

}
