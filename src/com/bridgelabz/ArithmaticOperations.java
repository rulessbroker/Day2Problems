package com.bridgelabz;

import java.util.Scanner;

public class ArithmaticOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st Number : ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd Number : ");
		int b = sc.nextInt();
		System.out.println("Enter 3rd Number : ");
		int c = sc.nextInt();

		int operation1 = a + b * c;
		int operation2 = c + a / b;
		int operation3 = a % b + c;
		int operation4 = a * b + c;

		int max = Math.max(Math.max(operation1, operation2), Math.max(operation3, operation4));

		if (operation1 == max) {
			System.out.println("operation1 is maximum = " + operation1);
		} else if (operation2 == max) {
			System.out.println("operation2 is maximum = " + operation2);
		} else if (operation3 == max) {
			System.out.println("operation3 is maximum = " + operation3);
		} else
			System.out.println("operation4 is maximum = " + operation4);

		int min = Math.min(Math.min(operation1, operation2), Math.min(operation3, operation4));

		if (operation1 == min) {
			System.out.println("operation1 is minimum = " + operation1);
		} else if (operation2 == min) {
			System.out.println("operation2 is minimum = " + operation2);
		} else if (operation3 == min) {
			System.out.println("operation3 is minimum = " + operation3);
		} else
			System.out.println("operation4 is minimum = " + operation4);
	}
}
