package logical_statements;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a year");
		int a = sc.nextInt();

		if (a % 400 == 0)
			System.out.println("Leap year");
		else if (a % 100 == 0)
			System.out.println("not Leap year");
		else if (a%4==0)
			System.out.println("Leap year");
		else
			System.out.println("not Leap year");

	}

}
