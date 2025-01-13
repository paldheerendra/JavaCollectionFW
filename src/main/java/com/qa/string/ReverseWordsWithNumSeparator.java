package com.qa.string;

import java.util.Arrays;

public class ReverseWordsWithNumSeparator {

	/*
	 * Pro:1 I/p: demo Output: deemmmoooo Pro2: I/p: test12pop90java989proj
	 * O/p:tset12pop90avaj989jorp
	 */

	public static void repeateChars(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= i; j++)
				System.out.print(str.charAt(i));
		}

	}

	public static void reverseWordsWithDigits(String str) {
		// String words[] = str.split("[0-9]");
		// String nums[] = str.split("[a-zA-z]");
		String[] words = Arrays.stream(str.split("[0-9]")).filter(x -> !x.isEmpty()).toArray(String[]::new);
		String[] nums = Arrays.stream(str.split("[a-zA-z]")).filter(x -> !x.isEmpty()).toArray(String[]::new);
		for (int i = 0; i < words.length; i++) {
			for (int j = words[i].length() - 1; j >= 0; j--) {
				System.out.print(words[i].charAt(j));
			}
			if (i < nums.length)
				System.out.print(nums[i]);
		}

	}

	public static void main(String[] args) {
		// repeateChars("demo");
		reverseWordsWithDigits("test12pop90java989proj");

	}

}
