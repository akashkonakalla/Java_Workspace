package com.collections.task_05_11_2026;

import java.util.Scanner;

/*
 * *Today's Assignment*

*Java*-

1.Convert integer to Roman  and Roman to Integer vice versa.
// integer to Roman
Input: 58
Output: "LVIII"
// Roman to Integer
Input: "LVIII"
Output: 58
 */
public class IntegerToRoman {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to convert into roman number");
		int n = sc.nextInt();

		System.out.println(intToRoman(n));

	}

	private static String intToRoman(int n) {
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

		String symbols[] = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		StringBuilder res = new StringBuilder();

		for (int i = 0; i < values.length; i++) {

			while (n >= values[i]) {
				res.append(symbols[i]);
				n -= values[i];
			}
		}

		return res.toString();
	}

}
