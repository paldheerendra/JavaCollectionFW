package com.programming.leetcode;

public class PalindromeNumber {

	public static boolean isPalindrome(int x) {
		int num = x;
		if (x < 0)
			return false;
		int temp = 0;
		while (x != 0) {

			temp = temp * 10 + x % 10;
			x = x / 10;
		}

		if (num == temp)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(1221));
		System.out.println(isPalindrome(-1221));

	}

}
