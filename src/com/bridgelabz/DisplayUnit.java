package com.bridgelabz;

import java.util.Scanner;

public class DisplayUnit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int num = sc.nextInt();

		if (num < 10) {
			System.out.println("number's unit is ones");
		} else if (num < 100) {
			System.out.println("number's unit is tens");
		} else if (num < 1000) {
			System.out.println("number's unit is hundred");
		} else if (num < 10000) {
			System.out.println("number's unit is thousands");
		} else {
			System.out.println("Try Again");
		}
	}
}
