package com.operators.task_29_07_2026;

/*
 * Java
1.Check whether a number is positive or negative using the ternary operator.
 */
import java.util.Scanner;
public class PositiveOrNegative {
	static Scanner sc=new Scanner(System.in);
	
	void PositiveOrNegative(int a) {
//		System.out.println("Method to check whether a number is positive or negative");
		System.out.println((a>=0)?"positive":"negative");
		
	}
	

	public static void main(String[] args) {

		PositiveOrNegative p=new PositiveOrNegative();
		System.out.println("enter a number");
		
		int a=sc.nextInt();
		
		p.PositiveOrNegative(a);
		 sc.close();
	}

}
