package com.syntax.hw.group02;

public class CodingTask04 {

	public static void main(String[] args) {
// Create a 2D array of integers.
// Develop a program which will calculate the sum of 
// even and odd numbers for that array.
		
		int[][] numbers={
				{2, 5, 45, -4},
				{11, -6, 0},
				{54, -34, 2, 6, 15, 3},
				{7, -9}
				};
		int odd=0;
		int even=0;
		
		for (int[] number : numbers) {
			for (int num : number) {
					if (num % 2 == 0)
						even+=num;
					else
						odd+=num;
			}
		}
		System.out.println("The sum of odd numbers is "+odd);
		System.out.println("The sum of even numbers is "+even);
	}

}
