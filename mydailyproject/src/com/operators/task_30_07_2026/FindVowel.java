package com.operators.task_30_07_2026;

import java.util.Scanner;

public class FindVowel {

	
	
	public static void main(String[] args) {
		
		char a;
		System.out.println("enter character");
		Scanner sc=new Scanner (System.in);
		a=sc.next().charAt(0);
		
		String s=(a == 'a' || a== 'A' ||a== 'e' ||a=='E' || a=='i' || a=='I'|| a=='o'|| a=='O' || a=='U' || a=='u')?"Vowel": "consonant";
		System.out.println(s);
		
		
	}

}
