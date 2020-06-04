package com.programming.basics;

public class VowelOrConsonant {

	public static void checkVowelOrConsonent(char ch) {

		ch = Character.toLowerCase(ch);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is a vowel");
		} else
			System.out.println(ch + " is a consonant");
	}

	public static void isVowel(char ch) {
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(ch + " is a vowel");
			break;

		default:
			System.out.println(ch + " is a consonant");
		}

	}

	public static void main(String[] args) {

		checkVowelOrConsonent('b');
		isVowel('A');

	}

}
