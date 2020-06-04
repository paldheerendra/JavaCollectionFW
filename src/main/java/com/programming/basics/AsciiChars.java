package com.programming.basics;

import java.util.Scanner;

public class AsciiChars {
	
	public static void printAscii(char c) {
	
		int ascii = c;
		
		int AsciiVal = (int)c;
		System.out.println("Ascii value of " + c + " is: " + ascii);
		System.out.println("Ascii value of " + c + " is: " + AsciiVal);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character to find Ascii Value: ");
		
		printAscii(scanner.nextLine().charAt(0));
	}

}
