package com.arrays.task_18_08_2026;

import java.util.Scanner;

/*
 * *Today's Assignment*

*Java*-

1.Check if a Number is an Automorphic Number.
Definition:
A number is called an Automorphic Number if the square of the number ends with the same number.
Input:25 =>25 × 25 = 625
                   625 ends with 25
Output : Automorphic Number
1. Find the Second Largest Digit in a Number.
Definition:
Given a number, find the second largest distinct digit present in it.
Input : 987654
Output : 8

*SQL*-

1. Display employee number, employee name, salary, grade, and department name
2. Display department-wise highest paid employee
 */
public class Automorphic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");	
	 int n=sc.nextInt();
	 automorphic(n);
	}

	private static void automorphic(int n) {

		int temp=n;
		boolean auto=true;
		temp = Math.powExact(temp, 2);
		while(n>0) {
			int rN=n%10;
			int rT=temp%10;
			if(rN!=rT) {
				auto=false;
				break;
			}
			n=n/10;
			temp=temp/10;
		}
		if(auto)
			System.out.println("The given number is Automorphic");
		else
			System.out.println("The given number is not Automorphic");
		
	}
}
