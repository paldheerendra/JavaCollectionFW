package com.programming.integers;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void swapWithoutThirdVar(int a, int b) {

		System.out.println("Before Swap: " + "a = " + a + " b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swap: " + "a = " + a + " b = " + b);
	}

	public static void swapWithMulti(int a, int b) {

		System.out.println("Before Swap: " + "a = " + a + " b = " + b);
		a = a * b;
		b = a / b;
		a = a / b;

		System.out.println("After Swap: " + "a = " + a + " b = " + b);
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter two numbers: ");
		//swapWithoutThirdVar(scanner.nextInt(), scanner.nextInt());
		swapWithMulti(scanner.nextInt(), scanner.nextInt());
	}

}
