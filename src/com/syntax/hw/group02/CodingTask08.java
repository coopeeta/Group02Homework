package com.syntax.hw.group02;

public class CodingTask08 {

	public static void main(String[] args) {

// Maximum and minimum number in the array?

		int[] array8 = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };
		int max = array8[0];
		for (int i = 1; i < array8.length; i++) {
			if (array8[i] > max) {
				max = array8[i];
			}
		}
		int min = array8[0];
		for (int j = 1; j < array8.length; j++) {
			if (array8[j] < min) {
				min = array8[j];
			}
		}
		System.out.println("Maximum number: " + max);
		System.out.println("Minimum number: " + min);

	}

}
