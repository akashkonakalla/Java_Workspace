package com.casestudy4;

import java.util.Scanner;

public class HospitalTemperature {

	// Method to read temperatures
	static void readTemperatures(double[] temp, Scanner sc) {
		for (int i = 0; i < temp.length; i++) {
			System.out.print("Enter temperature of patient " + (i + 1) + ": ");
			temp[i] = sc.nextDouble();
		}
	}

	// Method to find highest temperature
	static double findHighest(double[] temp) {
		double highest = temp[0];

		for (int i = 1; i < temp.length; i++) {
			if (temp[i] > highest) {
				highest = temp[i];
			}
		}

		return highest;
	}

	// Method to find lowest temperature
	static double findLowest(double[] temp) {
		double lowest = temp[0];

		for (int i = 1; i < temp.length; i++) {
			if (temp[i] < lowest) {
				lowest = temp[i];
			}
		}

		return lowest;
	}

	// Method to count fever patients
	static int countFeverPatients(double[] temp) {
		int count = 0;

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] >= 100.4) {
				count++;
			}
		}

		return count;
	}

	// Method to calculate average
	static double calculateAverage(double[] temp) {
		double sum = 0;

		for (int i = 0; i < temp.length; i++) {
			sum += temp[i];
		}

		return sum / temp.length;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of patients: ");
		int n = sc.nextInt();

		double[] temperatures = new double[n];

		readTemperatures(temperatures, sc);

		double highest = findHighest(temperatures);
		double lowest = findLowest(temperatures);
		int feverPatients = countFeverPatients(temperatures);
		double average = calculateAverage(temperatures);

		System.out.println("\n--- Temperature Analysis ---");
		System.out.println("Highest Temperature : " + highest + "°F");
		System.out.println("Lowest Temperature  : " + lowest + "°F");
		System.out.println("Fever Patients      : " + feverPatients);
		System.out.println("Average Temperature : " + average + "°F");

		sc.close();
	}
}