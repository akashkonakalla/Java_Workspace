package casestudy1;

import java.util.Scanner;

public class Bonus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee rating");
		double rating = sc.nextDouble();
		if(rating >=4 && rating <=5)
			System.out.println("eligible for bonus");
		else
			System.out.println("not eligible for bonus");
	}
}
