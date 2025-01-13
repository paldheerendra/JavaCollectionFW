package com.programming.leetcode;

public class ReverseInteger {

	/*
	 * Given a signed 32-bit integer x, return x with its digits reversed. If
	 * reversing x causes the value to go outside the signed 32-bit integer range
	 * [-231, 231 - 1], then return 0.
	 * 
	 * Example 1:
	 * Input: x = 123 Output: 321 
	 * 
	 * Example 2:
	 * Input: x = -123 Output: -321 
	 * Example 3: 
	 * Input: x = 120 Output: 21
	 */

	public static int reverse(int x) {

		int temp = 0;
		while (x != 0) {

			int remainder = x % 10;

			if (temp > Integer.MAX_VALUE / 10)// || (temp == Integer.MAX_VALUE / 10 && remainder > 7))
				return 0;
			if (temp < Integer.MIN_VALUE / 10)// || (temp == Integer.MIN_VALUE / 10 && remainder < -8))
				return 0;

			temp = temp * 10 + remainder;
			x = x / 10;
		}

		return temp;

	}

	public static void main(String[] args) {
		System.out.println(reverse(153423646));

	}

}
