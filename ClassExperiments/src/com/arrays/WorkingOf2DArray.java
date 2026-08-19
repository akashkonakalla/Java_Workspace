package com.arrays;

public class WorkingOf2DArray {
	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		System.out.println("The location of arr at start is : " + arr);
		arr = new int[][] { { 1, 2 }, { 2 ,3}, { 3, 4, 5, 6, 7 } };
		System.out.println("The location of arr after new creation is : " + arr);
		System.out.println("_______________________________________________________________________________________");
		for (int[] row : arr) {
			System.out.println("\nHexcode of row is " + row);
			for (int i : row)
				System.out.print("\tcolumn value : \t" + i);
			System.out.println();

		}
		System.out.println("_______________________________________________________________________________________\n");
		System.out.println("Length of the row 0 is " + arr[0].length);
		System.out.println("Length of the row 1 is " + arr[1].length);
		System.out.println("Length of the row 2 is " + arr[2].length);
		System.out.println("_______________________________________________________________________________________");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("\nHex code of row " + i+" is " +  arr[i]);
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("\t column value :\t " + arr[i][j]);
				
			}
			System.out.println();
		}
	}
}
