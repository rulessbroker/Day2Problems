package com.bridgelabz;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A: ");
		double a = sc.nextDouble();
		System.out.println("Enter the value of B: ");
		double b = sc.nextDouble();
		System.out.println("Enter the value of C: ");
		double c = sc.nextDouble();
		double root1 = 0;
		double root2 = 0;
		double d = b * b - 4 * a * c;

		if (d < 0) {
			System.out.println("Roots are imaginary.");
		} else if (d == 0) {
			System.out.println("Roots are equal.");
			root1 = (-b + Math.sqrt(d)) / (2 * a);
			root2 = (-b - Math.sqrt(d)) / (2 * a);
		} else if (d > 0) {
			System.out.println("Roots are uneqaul");
			root1 = (-b + Math.sqrt(d)) / (2 * a);
			root2 = (-b - Math.sqrt(d)) / (2 * a);
		}
		System.out.println("Root of the Quadratic equations are: ");
		System.out.println("Root 1 = " + root1 + " & Root 2 = " + root2);
	}
}
