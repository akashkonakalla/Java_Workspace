package casestudy1;

import java.util.Scanner;

public class TernaryBonus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee rating");
		double rating = sc.nextDouble();
		String s=(rating >= 4 && rating <= 5)?"eligible for bonus":"not eligible for bonus";
		System.out.println(s);
	}

}
