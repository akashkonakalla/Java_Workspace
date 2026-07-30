package com.operators.task_30_07_2026;

import java.util.Scanner;

/*
 * Java Question:
1.Write a Java program to create a simple calculator using the ternary operator. The program should accept two numbers and an operator. 
If the operator is '+', perform addition; otherwise, perform subtraction.

Sample Input 1:
Enter first number: 10
Enter second number: 5
Enter operator (+ or -): +
Sample Output 1:
Result: 15

Sample Input 2:
Enter first number: 20
Enter second number: 8
Enter operator (+ or -): -
Sample Output 2:
Result: 12
 */

public class AdditionOrSubtract{

	static double add(double a, double b) {
		
		return a+b;
	}
	
	static double sub(double a, double b) {
		return a-b;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		double a,b;
		System.out.println("enter the value of a ");
		a=sc.nextDouble();
		System.out.println("enter the value of b ");
		b=sc.nextDouble();
		System.out.println("enter operator ");
		char o=sc.next().charAt(0);
		double res=(o=='+')?add(a,b):sub(a, b);
		
		System.out.println("Result : "+res);
		
		
		
	}

}
