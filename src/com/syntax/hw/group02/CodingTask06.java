package com.syntax.hw.group02;

import java.util.Scanner;

public class CodingTask06 {

	public static void main(String[] args) {

// Write a java program to check whether a given number is prime or not?

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = input.nextInt();
		int i;
		int count = 0;
		for (i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0 && num != 1) {
			System.out.print(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}
	}

}
