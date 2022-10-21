package com.bridgelabz;

import java.util.Scanner;

public class SpringSeason {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month: ");
		int m = sc.nextInt();
		System.out.println("Enter the day: ");
		int d = sc.nextInt();

		if (m == 3 && d >= 20) {
			System.out.println("True");
		} else if (m == 4 && d >= 30) {
			System.out.println("True");
		} else if (m == 5 && d >= 31) {
			System.out.println("True");
		} else if (m == 6 && d >= 20) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
