package com.connectionJDBC.task_13_10_2026;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class StudentsList {

	public static void main(String[] args) {

		Collection<String> list = new ArrayList<String>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of names you want to store");
		int n = s.nextInt();
		s.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the name : ");
			list.add(s.nextLine());
		}

		System.out.println("All the stored name list : " + list);
	}

}
