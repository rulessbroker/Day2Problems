package com.bridgelabz;
import java.util.Scanner;

public class ReadAndWriteDigitNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter digit : ");
		int number = sc.nextInt();
		if (number == 0) {
			System.out.println("Number is Zero");
		} else if (number == 1) {
			System.out.println("Number is One");
		} else if (number == 2) {
			System.out.println("Number is Two");
		} else if (number == 3) {
			System.out.println("Number is Three");
		} else if (number == 4) {
			System.out.println("Number is Four");
		} else if (number == 5) {
			System.out.println("Number is Five");
		} else if (number == 6) {
			System.out.println("Number is Six");
		} else if (number == 7) {
			System.out.println("Number is Seven");
		} else if (number == 8) {
			System.out.println("Number is Eight");
		} else if (number == 9) {
			System.out.println("Number is Nine");
		} else if (number == 10) {
			System.out.println("Number is Ten");
		} else {
			System.out.println("Please enter value Between 0 to 10");
		}

	}
}
