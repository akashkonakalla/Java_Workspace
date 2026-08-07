package com.TGH;

import java.util.Scanner;

////
//// DECRYPT THE ENCODED SERVER LOG
//// Problem statement
//// A server compresses Its log Sting
//
//public class Exam {
// public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter the encoded server log");
//	String s=sc.nextLine();
//	String news="";
//	for(int i=s.length() ; i>0;i--)
//	{
//		if(s.charAt(i)==']')
//		while(s.charAt(i)=='[') {
//			news+=s.charAt(i);
//			i--;
//		}
//		else if (s.charAt(i)!='[' && s.charAt(i)!=']') {
//			int index= String.parseInt(s.charAt(i));
//			
//			
//		}
//		
//		
//	}
//  }
//}

public class DecodeString {

    static int index = 0;

    public static String decode(String s) {

        StringBuilder result = new StringBuilder();
        int number = 0;

        while (index < s.length()) {

            char ch = s.charAt(index);

            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
                index++;
            }

            else if (ch == '[') {
                index++;

                String temp = decode(s);

                for (int i = 0; i < number; i++) {
                    result.append(temp);
                }

                number = 0;
            }

            else if (ch == ']') {
                index++;
                return result.toString();
            }

            else {
                result.append(ch);
                index++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "3[a2[c]]";

        System.out.println(decode(s));
    }
}