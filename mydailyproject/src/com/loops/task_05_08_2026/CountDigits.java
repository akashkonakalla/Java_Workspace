package com.loops.task_05_08_2026;

/*
 * Today Task
Java 
1.Count the digits in a number.
Input
Enter a number: 12345
Output
Number of Digits: 5
2.Find the sum of digits of a number.

Input
Enter a number: 1234
Output
Sum of Digits: 10
 */
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
	int sumofDigits(int n){
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum+=rem;
			n/=10;
		}
		
		return sum;
		
	}

	public  void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to find digits");
		int a=sc.nextInt();
		System.out.println("The number of digits in a given number is : "+ countDigits(a));
		System.out.println("The number of sum of digits in a given number is : "+ sumofDigits(a));
		

	}

}
