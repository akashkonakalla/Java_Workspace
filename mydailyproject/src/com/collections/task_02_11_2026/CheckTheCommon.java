package com.collections.task_02_11_2026;

import java.util.HashSet;
import java.util.Set;

/*
 **Today's Assignment*

*Java*-

1.Write a Java program to check whether two given strings are anagrams or not using ArrayList.
Input:   listen
             silent
Output:
Anagrams
2.Write a Java program to find all common elements in three sorted arrays using a Set.
Input: [1, 5, 10], [1, 4, 10], [1, 6, 10] Output: [1, 10]

*React*-
1.Develop a React application that implements CRUD (Create, Read, Update, Delete) operations. 
 */

public class CheckTheCommon {
	public static void main(String[] args) {
		int arr1[] = { 1, 5, 10 };
		int arr2[] = { 1, 4, 10 };
		int arr3[] = { 1, 8, 10 };

		commonElements(arr1, arr2, arr3);
	}

	public static void commonElements(int arr1[], int arr2[], int arr3[]) {

		int len1 = arr1.length;
//		int len2 = arr2.length;
//		int len3 = arr3.length;

		Set<Integer> set2 = new HashSet();
		Set<Integer> set3 = new HashSet();
		
		Set<Integer> common = new HashSet<Integer>();
		
	
		for (int i : arr2) {

			set2.add(i);
		}
		for (int i : arr3) {

			set3.add(i);
		}
		
		for(int i: arr1) {
			if(set2.contains(i) && set3.contains(i))
		    common.add(i);
		}
		
		System.out.println("All the common elements : "+ common);

	}
}
