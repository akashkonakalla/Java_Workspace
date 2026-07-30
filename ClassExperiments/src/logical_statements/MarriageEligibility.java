package logical_statements;

import java.util.Scanner;

public class MarriageEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int a = sc.nextInt();

		if (a >= 25)
			System.out.println("eligible for marriage");
		else
			System.out.println("not eligible for marriage");
	}

}
