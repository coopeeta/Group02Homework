package com.syntax.hw.group02;

public class CodingTask03 {
	public static void main(String[] args) {

// Create a 2D array or integer type where you will store odd and even numbers.
// Develop a program which will identify/print the even numbers only.

		int[][] numbers = { { 22, 45, 452, -432, -71 }, { 11, -6, 0 }, { 54, -34, 2, 6, 15, 30, 8 }, { 7, -9 } };
		System.out.print("Even numbers: ");

		for (int[] number : numbers) {
			for (int num : number) {
				if (num % 2 == 0)
					System.out.print(num + ", ");
			}
		}
	}
}
