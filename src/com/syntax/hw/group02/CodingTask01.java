package com.syntax.hw.group02;

import java.util.Scanner;

public class CodingTask01 {

	public static void main(String[] args) {

// Create an int array using a scanner and calculate the sum of all
// stored elements in that array.

		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to store: ");
		n = input.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		int sum = 0;
		for (int elements : array) {
			sum += elements;
		}
		System.out.println("Sum of array elements is: " + sum);

	}

}
