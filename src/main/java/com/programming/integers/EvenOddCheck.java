package com.programming.integers;

import java.util.Scanner;

public class EvenOddCheck {
	
	static void checkEvenOdd(int num) {
		
		if(num % 2 == 0) {
			System.out.println(num + " : is an even number");
		}
		else
			System.out.println(num + " : is an odd number");

	}

	public static void main(String[] args) {

		System.out.println("Enter a number:");
		Scanner scanner = new Scanner(System.in);
		
		
		checkEvenOdd(scanner.nextInt());
	}

}
