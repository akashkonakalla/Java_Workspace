package com.loops;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		isArmstrong(n);

	}

	private static void isArmstrong(int n) {
		// TODO Auto-generated method stub
		String s=Integer.toString(n);
		int digits = s.length();
		int temp=n;
		int sum=0;
		while(temp>0) {
			int rem=temp%10;
			sum+=Math.powExact(rem, digits);
			temp/=10;
		}
		if (n==sum) {
			System.out.println(n+" is an Armstrong number ");
		}
		else
			System.out.println(n+" is not an Armstrong number");
		
		
	}
}
