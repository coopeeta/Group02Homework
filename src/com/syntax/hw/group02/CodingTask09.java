package com.syntax.hw.group02;

public class CodingTask09 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?

		int[] array = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };

		int largest = 0;
		int secondLargest = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				secondLargest = largest;
				largest = array[i];
			} else if (array[i] > secondLargest && array[i] < largest) {
				secondLargest = array[i];
			}
		}
		System.out.println("The second largest number in the array is " + secondLargest);

	}

}
