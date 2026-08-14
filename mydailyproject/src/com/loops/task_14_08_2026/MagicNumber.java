package com.loops.task_14_08_2026;

import java.util.Scanner;

/*
 * *Today's Assignment*
Java - 
1.Write a Java program to check whether a given number is a Magic Number.
definition - A Magic Number is a number whose repeated sum of digits becomes 1.
Input - 1729=> 1 + 7 + 2 + 9 = 19
                           1 + 9 = 10
                           1 + 0 = 1
output - Magic Number

2.Write a Java program to check whether a given number is a Happy Number.
definition - A Happy Number is a number where the repeated sum of the squares of its digits eventually becomes 1.
Input - 19 =>1² + 9² = 82
         8² + 2² = 68
         6² + 8² = 100
         1² + 0² + 0² = 1
Output - Happy Number

SQL -
1. All employees with their department details, and Departments that currently have no employees.
 */

public class MagicNumber {
	
	static void magicNumber(int n) {
		
		if(n==1) {
			System.out.println("Magic number");
		}
		else if(n>=10) {
			int sum=0;
			while(n>0) {
				sum+=n%10;
				n/=10;
			}
			magicNumber(sum);
		}
		else
			System.out.println("Not Magic number");
		 
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		magicNumber(n);
	}

}
