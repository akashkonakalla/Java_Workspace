package com.loops;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print Fibonacci series");
		int n=sc.nextInt();
		Fibonacci f=new Fibonacci();
				
		f.fibonacci(n);
		System.out.println("main method ended");
		
	}
	void fibonacci(int n){
		int a=0;
		int b=1;
		System.out.print(a + " "+ b+ " ");
		for(int i=1;i<=n-2;i++) {
			int sum=a+b;
			System.out.print(sum + " ");
			a=b;
			b=sum;
		}
		
	}
}
