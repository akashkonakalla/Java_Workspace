package com.loops;

import java.util.Scanner;

public class Palindrome {
	
	private static int revNumber(int n) {
		// TODO Auto-generated method stub
		int rev=0;
		while(n>0) {
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		return rev;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check Palindrome or not");
		int n=sc.nextInt();
		int rev= revNumber(n);
		isPalindrome(rev, n);
	}
	private static void isPalindrome(int rev, int n) {
		// TODO Auto-generated method stub
		 if(rev==n)
			 System.out.println(n + " is a Palindrome number");
		 else
			 System.out.println(n + " is not Palindrome number");
		
	}
}
