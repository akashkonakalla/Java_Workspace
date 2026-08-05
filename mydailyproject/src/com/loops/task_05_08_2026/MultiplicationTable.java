package com.loops.task_05_08_2026;
/*
 * Today Task 
Java
1.Print the Multiplication Table of a Number
Question:
Write a Java program to print the multiplication table of a given number from 1 to 10.

 */
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("enter the table number : ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(a+" x "+i+" = "+a*i);
		}
	}
}
