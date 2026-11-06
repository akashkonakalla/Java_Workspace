package com.string;

public class StringPool {
	public static void main(String[] args) {
		System.out.println("String pool normal string vs object string");
		String s1="akash";
		
		String s2= new String("akash");
		String s3=s2.intern();
		System.out.println(s1==s3);
	}
}
