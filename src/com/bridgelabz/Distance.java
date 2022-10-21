package com.bridgelabz;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		System.out.println("Enter the value of X: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		System.out.println("Enter the value of Y: ");
		int y = sc.nextInt();

		double result = Math.sqrt(x * x + y * y);
		System.out.println("The total distance is: " + result);
	}
}
