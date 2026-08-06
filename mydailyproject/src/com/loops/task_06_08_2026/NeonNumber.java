package com.loops.task_06_08_2026;

import java.util.Scanner;

/*
 * Java Task
Question:
1.Write a Java program to check whether a given number is a Neon Number.
A Neon Number is a number where the sum of the digits of its square is equal to the original number.
Sample Input 1
Enter a number: 9
Sample Output 1
9 is a Neon Number.
Explanation:
9² = 81
8 + 1 = 9
Sample Input 2
Enter a number: 10
Sample Output 2
10 is not a Neon Number.
Explanation:
10² = 100
1 + 0 + 0 = 1 ≠ 10
 */
public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number to check neon or not");
		int n=sc.nextInt();
		
		if(sumDigits(n)==n)
		{
			System.out.println("Then given number is Neon");
		}
		else {
			System.out.println("The given number is not neon");
		}

	}

	private static int sumDigits(int n) {
		// TODO Auto-generated method stub
		int pow= (int) Math.pow(n, 2);
		int c=0;
		while(pow>0) {
			int rem=pow%10;
			pow/=10;
			c+=rem;
		}
		System.out.println("The value of pow is "+ pow);
//		for(int i=pow)
		return c;
	}

}
