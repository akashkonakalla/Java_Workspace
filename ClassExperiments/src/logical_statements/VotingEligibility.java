package logical_statements;

import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int a = sc.nextInt();

		if (a >= 18)
			System.out.println("eligible for voting");
		else
			System.out.println("not eligible for voting");

	}

}
