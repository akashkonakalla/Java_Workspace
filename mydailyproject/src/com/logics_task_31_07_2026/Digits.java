package com.logics_task_31_07_2026;

import java.util.Scanner;

/*
 * Java
Question:
1.Write a Java program to check whether a given number is a two-digit, three-digit, or more than three digits using if-else if statements.
1.The program should:
Accept an integer as input.
Display:
2.Two-Digit Number if the number has 2 digits.
3.Three-Digit Number if the number has 3 digits.
4.More Than Three Digits if the number has more than 3 digits.
5.Less Than Two Digits if the number has only 1 digit.
 */
public class Digits {

	public static void main(String[] args) {
		System.out.println("enter a number");
	   Scanner sc =new Scanner(System.in);
	   int a = sc. nextInt();
	   if(a>=0 && a<=9)
		   System.out.println("1 digit number");
	   else if(a>=10 && a<=99)
		   System.out.println("2 digit number");
	   else if(a>=100 && a<=999)
		   System.out.println("3 digit number");
	   else 
		   System.out.println("more than 3 digit number");
	   
	}
}
