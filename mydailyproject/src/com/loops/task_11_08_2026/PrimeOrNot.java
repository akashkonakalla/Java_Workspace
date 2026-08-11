package com.loops.task_11_08_2026;

import java.util.Scanner;

/*
 * Today's Assignment
Java
1.write a java program to print given number is prime or not.

2.write a java program to print prime numbers between range 1to 50.
 */
public class PrimeOrNot {
	static boolean isPrime(int n){
		boolean prime=true;
		if(n==0 || n ==1)
			return false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
			{
				prime=false;
				break;
			}
		}
		return prime;
	}
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check Prime or not");
		int n=sc.nextInt();
 
		if(isPrime(n)==false)
		System.out.println(n+ " is a not an prime number");
		else
			System.out.println(n+ " is a prime number");
		
		
	}
}
