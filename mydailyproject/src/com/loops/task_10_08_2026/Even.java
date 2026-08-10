package com.loops.task_10_08_2026;
/*
 * Today's Assignment
Java
1.write a java program to print even numbers between 1 to 100.
2.write a java program to Find the sum of numbers from 1 to 100.
Output: 5050

Mysql:
1.Display employees who are working in the DALLAS location.

2.Display employee names along with their department names.
 */
public class Even {
	public static void main(String[] args) {
		
		// using for with increment +2
		System.out.println("Using the increment +2");
		for(int i=2;i<=100;i+=2) {
			System.out.println(i);
		}
		//using if condition
		System.out.println("\nUsing the if condition");
		for(int i=1;i<=100;i++)
		{
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		
	}

}
