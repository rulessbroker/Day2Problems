package com.bridgelabz;

import java.util.Scanner;

public class PalindromeProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number here : ");
		int num = sc.nextInt();
		int number = num;
		int reverse = 0;

		for (; number != 0;) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number = number / 10;
		}
		if (number == reverse) {
			System.out.println("Number is palindrome");

		} else {
			System.out.println("Number is not Plindrome");
		}
	}
}
