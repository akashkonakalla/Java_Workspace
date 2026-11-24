package com.strings.task_24_11_2026;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * *Today's Assignment* 

 *Java* 

1.Remove All Duplicate Characters From a String
       Input:  "programming"   Output: "progamin"

2.Arrange Words Based on Numbers in the Sentence
Example: Input: "going3 to2 Hyderabad5 i1 am2" → Output: "i am to going Hyderabad"
 */
public class StringNoDuplicates {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String st = sc.nextLine();
		String res = "";
		for (char ch : st.toCharArray()) {
			if (!res.contains(ch + "")) {
				res = res + ch;
			}
		}

		System.out.println(res);

	}

}
