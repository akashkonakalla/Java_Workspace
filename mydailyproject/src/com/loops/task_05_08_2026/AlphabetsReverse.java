package com.loops.task_05_08_2026;

/*
 * 2.Print Alphabets in Reverse Order
Question:
Write a Java program to print uppercase alphabets from Z to A using a for loop.
Output
Z Y X W V U T S R Q P O N M L K J I H G F E D C B A
 */
public class AlphabetsReverse {
	public static void main(String[] args) {
		for (char a = 'Z'; a >= 'A'; a--) {
			System.out.print(a + " ");
		}
		System.out.println();
		//using the int number in condition
		for (char a = 'Z'; a >= 65; a--) {
			System.out.print(a + " ");
		}
	}
}
