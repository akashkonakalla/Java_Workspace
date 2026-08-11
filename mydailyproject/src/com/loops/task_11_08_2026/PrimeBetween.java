package com.loops.task_11_08_2026;

import java.util.Scanner;

public class PrimeBetween {
	static boolean isPrime(int n){
	boolean prime=true;
	if(n==0 || n ==1)
		return false;
	for(int i=2;i<=n/2;i++) {
		if(n%2==0)
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
    for(int i=1;i<=n;i++) {
	if(isPrime(i)==true)
	System.out.print(i + " ");
    }
	}
}
