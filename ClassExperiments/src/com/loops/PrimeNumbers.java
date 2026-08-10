package com.loops;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter upto where prime numbers need to be printed");
		int n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(isPrime(i)==true)
				System.out.print(i + " ");
		}
	}

	private static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

}
