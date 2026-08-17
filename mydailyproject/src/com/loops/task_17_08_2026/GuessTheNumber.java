package com.loops.task_17_08_2026;

import java.util.Random;
import java.util.Scanner;

/*
 * Today's Assignment
Java
1.Write a Java program that generates a random number between 1 and 10. The user gets 3 chances to guess the number.

If the user guesses correctly, display "You Won!" and stop the game.
If all 3 attempts are wrong, display "You Lost!" and show the random number.

MYSQL:
1.Display employee name, manager name, employee salary, manager salary, and salary grade of the employee.

2.Display employees who have a higher salary grade than their manager, showing employee name, manager name, employee grade, and manager grade.
 */
public class GuessTheNumber {

	static int chances = 3;

	public static void main(String[] args) {

		Random r = new Random();
		int a = r.nextInt(10);
//		System.out.println("Random Number is : " + a);
		guess(a);

	}

	private static void guess(int a) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (chances > 0) {
			chances--;
			System.out.println("Enter the guess number between 0 to 9");
			int n = sc.nextInt();
			if (a == n) {
				System.out.println("Congrats !! You guessed correctly");
				break;
			} else if (chances > 0) {
				System.out.printf("\nTry again, you have %d chances left\n", chances);
			} else {
				System.out.println("Game ended, better luck next time");
				System.out.println("The Correct number is " + a);
			}

		}
	}
}
