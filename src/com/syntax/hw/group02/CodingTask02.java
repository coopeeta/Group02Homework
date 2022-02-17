package com.syntax.hw.group02;

public class CodingTask02 {
	public static void main(String[] args) {
		
// Create a 2D array of integer values. Print the sum of all numbers.
		
		int[][] numbers={
			{2, 5, 45, -4},
			{11, -6, 0},
			{54, -34, 2, 6, 15, 3},
			{7, -9}
		};
		int sum=0;
		for(int[] number:numbers) {
			for(int num:number) {
				sum+=num;
			}
		}
		System.out.println("The sum of all numbers in the array equals to "+sum);
	}
}
