package com.programming.string;

public class PrintChars {

	public static void toChars(String str) {

		long startTime = System.currentTimeMillis();

		for (Character ch : str.toCharArray()) {
			System.out.print(ch + " ");
		}

		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);

	}

	public static void toLength(String str) {

		long startTime = System.currentTimeMillis();

		for (int i = 0 ; i < str.length() ; i++) {
			System.out.print(str.charAt(i) + " ");
		}

		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);

	}

	public static void main(String[] args) {

		//toChars("this is fastest way to print characters from string"); //this is fastest way to print characters from string
		toLength("this is fastest way to print characters from string");
	}

}
