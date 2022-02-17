package com.syntax.hw.group02;

public class CodingTask05 {

	public static void main(String[] args) {

// Write a program to swap 2 numbers without a temporary variable?

		int x = 5;
		int y = 10;

		x = x + y; // x=5+10---> 15=5+10---->x=15
		y = x - y; // y=15-10----> 5=15-10----->Now y=5
		x = x - y; // x=15-5----> 10=15-5---->Now x=10

		System.out.println(x);
		System.out.println(y);
	}
}
