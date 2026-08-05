package com.loops.task_05_08_2026;

import java.util.Scanner;

public class CountDigits {
	
	int countDigits(int n){
		if(n==0)
			return 1;
		int c=0;
		while(n>0) {
			n=n/10;
			c++;
		}
		return c;
	}

	public  void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to find digits");
		int a=sc.nextInt();
		System.out.println("The number of digits in a given number is : "+ countDigits(a));
		

	}

}
